package bige.pdp;

/**
 * The interface that applications use to make policy queries
 * @author bige
 *
 */
public class PDPEngine {

	/**
	 * Init PDPEngine
	 */
	public PDPEngine() {
		
	}
	
	/**
	 * Process request
	 * Note: update params to Response decide(Request pepRequest)
	 */
	public void decide() {
		/*
		 * Iterate over all of the individual decision requests and process them, 
		 * combining them into the final response
		 */	
		this.processRequest();
	}
	
	/**
	 * Note: update to Result processRequest(EvaluationContext evaluationContext)
	 */
	protected void processRequest() {
		
	}
}
