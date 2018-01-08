package de.unistuttgart.iaas.chor.event.messages;

public class ResetElementEvent extends ChorInstanceEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2411568381006266081L;
	
	private String processInstanceID;
	private String elementModelID;
	private String elementInstanceID;
	private String elementModelXPath;
	
	public String getProcessInstanceID() {
		return processInstanceID;
	}
	public void setProcessInstanceID(String processInstanceID) {
		this.processInstanceID = processInstanceID;
	}
	public String getElementModelID() {
		return elementModelID;
	}
	public void setElementModelID(String elementModelID) {
		this.elementModelID = elementModelID;
	}
	public String getElementInstanceID() {
		return elementInstanceID;
	}
	public void setElementInstanceID(String elementInstanceID) {
		this.elementInstanceID = elementInstanceID;
	}
	public String getElementModelXPath() {
		return elementModelXPath;
	}
	public void setElementModelXPath(String xpath) {
		this.elementModelXPath = xpath;
	}
	
	

}
