package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class CorrelationSet_Modification extends InstanceEventMessage {

	private static final long serialVersionUID = 7457457L;

	private String[] values;

	private String cSet_xpath;

	private String activityXPath;

	private Long scopeID;

	private Boolean changed_from_outside;

	public Boolean getChanged_from_outside() {
		return changed_from_outside;
	}

	public void setChanged_from_outside(Boolean changed_from_outside) {
		this.changed_from_outside = changed_from_outside;
	}

	public CorrelationSet_Modification() {
		super();
		changed_from_outside = false;
	}

	public String[] getValues() {
		return values;
	}

	public String getCSet_xpath() {
		return cSet_xpath;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	public void setCSet_xpath(String set_xpath) {
		cSet_xpath = set_xpath;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public String getActivityXPath() {
		return activityXPath;
	}

	public void setActivityXPath(String activityXPath) {
		this.activityXPath = activityXPath;
	}
}
