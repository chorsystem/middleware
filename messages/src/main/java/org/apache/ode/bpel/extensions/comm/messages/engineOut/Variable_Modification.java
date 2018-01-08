package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class Variable_Modification extends InstanceEventMessage {

	private static final long serialVersionUID = 65347731L;

	private Long scopeID;

	private String scopeXPath;

	private String activityXPath;

	private String variableName;

	private String variableXPath;

	private String value;

	private Boolean changed_from_outside;

	public Variable_Modification() {
		super();
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String getScopeXPath() {
		return scopeXPath;
	}

	public String getActivityXPath() {
		return activityXPath;
	}

	public String getVariableName() {
		return variableName;
	}

	public String getVariableXPath() {
		return variableXPath;
	}

	public String getValue() {
		return value;
	}

	public Boolean getChanged_from_outside() {
		return changed_from_outside;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setScopeXPath(String scopeXPath) {
		this.scopeXPath = scopeXPath;
	}

	public void setActivityXPath(String activityXPath) {
		this.activityXPath = activityXPath;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public void setVariableXPath(String variableXPath) {
		this.variableXPath = variableXPath;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setChanged_from_outside(Boolean changed_from_outside) {
		this.changed_from_outside = changed_from_outside;
	}

}
