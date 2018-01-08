package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class MessageLinkInstanceEvent {
	
	private Long eventId;
	private String choreographyInstanceID;
	private String elementModelID;
	private String messageID;
	private Long timestamp;
	private MessageLinkInstanceStateEnum state;
	
	private MessageLinkInstance messageLinkInstance;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "instanceID", referencedColumnName = "instanceID") })
	public MessageLinkInstance getMessageLinkInstance() {
		return messageLinkInstance;
	}

	public void setMessageLinkInstance(MessageLinkInstance messageLinkInstance) {
		this.messageLinkInstance = messageLinkInstance;
	}
	
	public String getChoreographyInstanceID() {
		return choreographyInstanceID;
	}
	
	public void setChoreographyInstanceID(String choreographyInstanceID) {
		this.choreographyInstanceID = choreographyInstanceID;
	}
	
	public String getElementModelID() {
		return elementModelID;
	}
	public void setElementModelID(String elementModelID) {
		this.elementModelID = elementModelID;
	}
	
	public String getMessageID() {
		return messageID;
	}
	
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public MessageLinkInstanceStateEnum getState() {
		return state;
	}

	public void setState(MessageLinkInstanceStateEnum state) {
		this.state = state;
	}
}
