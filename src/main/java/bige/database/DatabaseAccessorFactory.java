package bige.database;

import bige.pip.AttributeManager;

public class DatabaseAccessorFactory {
	
	private static DatabaseAccessorFactory instance = null;

	private DatabaseAccessorFactory() {
	}

	public static DatabaseAccessorFactory getInstance() {
		if (instance == null) {
			instance = new DatabaseAccessorFactory();
		}
		return instance;
	}
	
	public DatabaseInterface getDatabase(String dbName, String configFile) {
		DatabaseInterface db = null;
		if(dbName.equalsIgnoreCase("MongoDB")) {
			db = new MongoDBDatabaseAccessor();
		} else if(dbName.equalsIgnoreCase("MySQL")) {
			db = new MySQLDatabaseAccessor();
		} else if(dbName.equalsIgnoreCase("Json")) {
			db = new JsonDatabaseAccessor();
		}
		return null;		
	}
}
