package de.unistuttgart.iaas.chor.event.messages;

public class ChorInstanceStateChangeEvent extends ChorInstanceEvent{


	private static final long serialVersionUID = 677728722347188567L;

	private int numInitializing;
	private int numRunning;
	private int numSuspended;
	private int numTerminated;
	private int numFaulted;
	private int numCompleted;
	private String eventType;
	
	private String state;
	
	
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
