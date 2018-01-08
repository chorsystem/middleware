package de.unistuttgart.iaas.chor.event.messages;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.ode.bpel.extensions.comm.messages.engineIn.RegisterRequestMessage;

public class ChorRegisterRequestMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9203184116601626635L;
	
	
	private String choreographyModelID;
	private Map<String, RegisterRequestMessage> messages = new HashMap<String, RegisterRequestMessage>();
	
	
	public String getChoreographyModelID() {
		return choreographyModelID;
	}
	public void setChoreographyModelID(String choreographyModelID) {
		this.choreographyModelID = choreographyModelID;
	}
	public Map<String, RegisterRequestMessage> getMessages() {
		return messages;
	}
	public void setMessages(Map<String, RegisterRequestMessage> messages) {
		this.messages = messages;
	}
	

	
	
	
}
