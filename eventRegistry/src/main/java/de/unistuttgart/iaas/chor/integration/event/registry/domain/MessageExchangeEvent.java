package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;

@Entity
public class MessageExchangeEvent extends ActivityInstanceEvent {

	private String messageID;
	private String direction;
	
	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	

}
