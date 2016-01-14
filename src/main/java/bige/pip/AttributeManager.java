package bige.pip;

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

	public void getSubjectAttribute(String params) {

	}

	public void getResourceAttribute(String params) {

	}

	public void getEnvironmentAttribute(String params) {

	}

	public void getData(String dataPath) {

	}

	public void execFucntion(String functionName, String params) {

	}
}
