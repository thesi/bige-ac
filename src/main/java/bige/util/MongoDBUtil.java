package bige.util;

import java.util.Iterator;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

/**
 * Utility to access to mongoDB data
 * @author bige
 *
 */
public class MongoDBUtil {

	Mongo m = null;
	DB db = null;

	/**
	 * Init MongoDBUtil
	 * @param host
	 * @param port
	 * @throws Exception
	 */
	public MongoDBUtil(String host, int port) throws Exception {
		this.m = new Mongo(host, port);
	}

	/**
	 * Get value of a document
	 * @param database
	 * @param collection
	 * @param rowKey
	 * @param columnKey
	 * @return
	 */
	public String get(String database, String collection, String rowKey, String columnKey) {
		String value = null;
		this.db = m.getDB(database);
		DBCollection coll = db.getCollection(collection);
		DBCursor cursor = coll.find();

		Iterator<DBObject> docIter = cursor.iterator();
		while (docIter.hasNext()) {
			DBObject myDoc = docIter.next();
			// Assumes that each document has a field with the name = rowKey
			if (myDoc.containsField(rowKey)) {
				System.out.println(myDoc);
				value = (String) myDoc.get(columnKey);
			}
		}
		return value;
	}

	/**
	 * Put value for a document
	 * @param database
	 * @param collection
	 * @param rowKey
	 * @param columnKey
	 * @param value
	 * @throws Exception
	 */
	public void put(String database, String collection, String rowKey, String columnKey, String value)
			throws Exception {
		this.db = m.getDB(database);
		DBCollection coll = db.getCollection(collection);
		DBCursor cursor = coll.find();
		Iterator<DBObject> docIter = cursor.iterator();
		boolean documentPresent = false;
		while (docIter.hasNext()) {
			DBObject myDoc = docIter.next();
			// Assumes that each document has a field with the name = rowKey
			if (myDoc.containsField(rowKey)) {
				documentPresent = true;
				System.out.println(myDoc);
				coll.remove(myDoc);
				myDoc.put(rowKey, rowKey);
				myDoc.put(columnKey, value);
				coll.insert(myDoc);
				break;
			}
		}
		if (!documentPresent) {
			BasicDBObject myDoc = new BasicDBObject();
			myDoc.put(rowKey, rowKey);
			myDoc.put(columnKey, value);
			coll.insert(myDoc);
		}
	}

	/**
	 * Drop a database
	 * @param database
	 * @throws Exception
	 */
	public void clean(String database) throws Exception {
		this.db = m.getDB(database);
		db.dropDatabase();
	}
}