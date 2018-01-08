package de.unistuttgart.iaas.chor.event.messages;

import java.io.Serializable;

public class ChorInstanceEvent implements Serializable{

	/**
	 * @weissas
	 */
	private static final long serialVersionUID = 1L;
	
	private String choreographyInstanceID;
	
	private Long eventId;
	
	private Long timestamp;

	private String eventType;

	public String getChoreographyInstanceID() {
		return choreographyInstanceID;
	}
	
	public void setChoreographyInstanceID(String choreographyInstanceID) {
		this.choreographyInstanceID = choreographyInstanceID;
	}
	
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
