package de.unistuttgart.iaas.chor.event.messages;

import java.io.Serializable;

import org.apache.ode.bpel.extensions.comm.messages.engineIn.IncomingMessageBase;

public class IncomingEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8028922953895235754L;
	
	private IncomingMessageBase message;
	private String processInstanceID;
	
	public IncomingMessageBase getMessage() {
		return message;
	}

	public void setMessage(IncomingMessageBase message) {
		this.message = message;
	}

	public String getProcessInstanceID() {
		return processInstanceID;
	}

	public void setProcessInstanceID(String processInstanceID) {
		this.processInstanceID = processInstanceID;
	}
	
	
	
	

}
