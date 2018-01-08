package de.unistuttgart.iaas.chor.event.messages;

public class ChorInstanceResetEvent extends ChorInstanceEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4262150317278708354L;

	private String iterationID;

	public String getIterationID() {
		return iterationID;
	}

	public void setIterationID(String iterationID) {
		this.iterationID = iterationID;
	}
	
	
	
	
}
