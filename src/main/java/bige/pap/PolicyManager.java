package bige.pap;

import bige.database.DatabaseAccessorFactory;
import bige.database.DatabaseInterface;
import bige.pip.AttributeManager;

/**
 * Control the access to policy
 * @author bige
 *
 */
public class PolicyManager {

	private static PolicyManager instance = null;
	private DatabaseInterface db = null;

	/**
	 * Init PolicyManager
	 */
	private PolicyManager() {
		db = DatabaseAccessorFactory.getInstance().getDatabase("MongoDB", "configFile");
	}
	
	public static PolicyManager getInstance() {
		if (instance == null) {
			instance = new PolicyManager();
		}
		return instance;
	}	
	
	/**
	 * Get applied policy for a request
	 */
	public void getAppliedPolicy() {
		
	}
	
	public void insertPolicy() {
		
	}
	
	public void deletePolicy() {
		
	}
}
