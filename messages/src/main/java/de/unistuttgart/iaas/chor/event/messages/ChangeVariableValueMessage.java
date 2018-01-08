package de.unistuttgart.iaas.chor.event.messages;

import java.io.Serializable;

import org.apache.ode.bpel.extensions.comm.messages.engineIn.Write_Variable;

public class ChangeVariableValueMessage implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8273860956364844641L;
	
	
	private String choreographyModelID;
	private long choreographyInstanceID;
	private String processInstanceID;
	private Write_Variable variable;
	
	public String getChoreographyModelID() {
		return choreographyModelID;
	}
	
	public void setChoreographyModelID(String choreographyModelID) {
		this.choreographyModelID = choreographyModelID;
	}
	
	public long getChoreographyInstanceID() {
		return choreographyInstanceID;
	}
	
	public void setChoreographyInstanceID(long choreographyInstanceID) {
		this.choreographyInstanceID = choreographyInstanceID;
	}
	
	public String getProcessInstanceID() {
		return processInstanceID;
	}

	public void setProcessInstanceID(String processInstanceID) {
		this.processInstanceID = processInstanceID;
	}

	public Write_Variable getVariable() {
		return variable;
	}
	
	public void setVariable(Write_Variable variable) {
		this.variable = variable;
	}
	
	
	

	
	
	
}
