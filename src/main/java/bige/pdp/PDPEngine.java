package bige.pdp;

import bige.model.Request;
import bige.model.Response;
import bige.pap.PolicyManager;
import bige.pip.AttributeManager;

/**
 * The interface that applications use to make policy queries
 * @author bige
 *
 */
public class PDPEngine {

	private AttributeManager attributeManager = null;
	private PolicyManager policyManager = null;
	
	/**
	 * Init PDPEngine
	 */
	public PDPEngine() {
		
	}
	
	public void init() {
		
	}
	
	/**
	 * Process request
	 * Note: update params to Response decide(Request pepRequest)
	 */
	public Response decide(Request pepRequest) {
		/*
		 * Iterate over all of the individual decision requests and process them, 
		 * combining them into the final response
		 */	
		Response response = new Response();
		this.processRequest();
		
		return response;
	}
	
	/**
	 * Note: update to Result processRequest(EvaluationContext evaluationContext)
	 */
	protected void processRequest() {
		
	}
}
