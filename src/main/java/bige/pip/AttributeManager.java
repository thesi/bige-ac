package bige.pip;

/**
 * 
 * @author bige
 *	Singleton class for managing Attribute
 */
public class AttributeManager {

	private static AttributeManager instance = null;

	private AttributeManager() {
	}

	public static AttributeManager getInstance() {
		if (instance == null) {
			instance = new AttributeManager();
		}
		return instance;
	}

	/**
	 * Get attribute of a subject
	 * @param params
	 */
	public void getSubjectAttribute(String params) {

	}

	/**
	 * Get attribute of a resource
	 * @param params
	 */
	public void getResourceAttribute(String params) {

	}

	/**
	 * Get attribute of environment
	 * @param params
	 */
	public void getEnvironmentAttribute(String params) {

	}

	/**
	 * Get value of a data path
	 * @param dataPath
	 */
	public void getData(String dataPath) {

	}

	/**
	 * Execute a mongoDB function
	 * @param functionName
	 * @param params
	 */
	public void execFucntion(String functionName, String params) {

	}

	/**
	 * Get data from mongoDB
	 */
	private void getDataFromMongoDB() {
		
	}
}
