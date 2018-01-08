package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class ActivityEventMessage extends InstanceEventMessage {

	private static final long serialVersionUID = 9574501L;

	private Long scopeID;

	private String scopeXPath;

	private Long activityID;

	private String activityXPath;
	
	private String elementModelID;

	// @haupt
	private String activityName;

	public ActivityEventMessage() {
		super();
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String getScopeXPath() {
		return scopeXPath;
	}

	public Long getActivityID() {
		return activityID;
	}

	public String getActivityXPath() {
		return activityXPath;
	}

	// @haupt
	public String getActivityName() {
		return activityName;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setScopeXPath(String scopeXPath) {
		this.scopeXPath = scopeXPath;
	}

	public void setActivityID(Long activityID) {
		this.activityID = activityID;
	}

	public void setActivityXPath(String activityXPath) {
		this.activityXPath = activityXPath;
	}

	// @haupt
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getElementModelID() {
		return elementModelID;
	}

	public void setElementModelID(String elementModelID) {
		this.elementModelID = elementModelID;
	}
	
}
