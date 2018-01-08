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
public class ChoreographyInstanceEvent {
	
	private Long eventId;
	private String eventType;
	private Long timestamp;
	
	private int numInitializing;
	private int numRunning;
	private int numSuspended;
	private int numTerminated;
	private int numFaulted;
	private int numCompleted;
	
	private ChoreographyInstance chorInstance;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "choreographyInstanceId", referencedColumnName = "choreographyInstanceID") })
	public ChoreographyInstance getChorInstance() {
		return chorInstance;
	}

	public void setChorInstance(ChoreographyInstance chorInstance) {
		this.chorInstance = chorInstance;
	}

	public int getNumInitializing() {
		return numInitializing;
	}

	public void setNumInitializing(int numInitializing) {
		this.numInitializing = numInitializing;
	}

	public int getNumRunning() {
		return numRunning;
	}

	public void setNumRunning(int numRunning) {
		this.numRunning = numRunning;
	}

	public int getNumSuspended() {
		return numSuspended;
	}

	public void setNumSuspended(int numSuspended) {
		this.numSuspended = numSuspended;
	}

	public int getNumTerminated() {
		return numTerminated;
	}

	public void setNumTerminated(int numTerminated) {
		this.numTerminated = numTerminated;
	}

	public int getNumFaulted() {
		return numFaulted;
	}

	public void setNumFaulted(int numFaulted) {
		this.numFaulted = numFaulted;
	}

	public int getNumCompleted() {
		return numCompleted;
	}

	public void setNumCompleted(int numCompleted) {
		this.numCompleted = numCompleted;
	}
}
