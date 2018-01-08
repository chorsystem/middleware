package de.unistuttgart.iaas.chor.event.messages;

public class MessageLinkInstanceStateChangeEvent extends ChorInstanceEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String elementModelID;
	
	private String instanceID;
	
	private String messageID;
	
	public String getElementModelID() {
		return elementModelID;
	}
	public void setElementModelID(String elementModelID) {
		this.elementModelID = elementModelID;
	}
	
	public String getInstanceID() {
		return instanceID;
	}
	
	public void setInstanceID(String instanceID) {
		this.instanceID = instanceID;
	}
	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	


}
