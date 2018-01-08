package de.unistuttgart.iaas.chor.event.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RegisterDeploymentSCEInstanceIDs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5447621499476571239L;

	private String processModelID;
	
	private List<String> sceInstanceIDs = new ArrayList<String>();
	
	public RegisterDeploymentSCEInstanceIDs(String processModelID, List<String> sceInstanceIDs){
		
		this.processModelID = processModelID;
		this.sceInstanceIDs = sceInstanceIDs;
	}

	public String getProcessModelID() {
		return processModelID;
	}

	public List<String> getSceInstanceIDs() {
		return sceInstanceIDs;
	}
	
}
