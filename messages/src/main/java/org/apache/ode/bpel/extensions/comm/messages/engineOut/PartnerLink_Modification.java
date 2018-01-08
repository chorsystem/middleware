package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class PartnerLink_Modification extends InstanceEventMessage {

	private static final long serialVersionUID = 356457246741L;

	private Long scopeID;

	private String scopeXPath;

	private String activityXPath;

	private String plName;

	private String plXPath;

	private String plValue;

	private Boolean changed_from_outside;

	public PartnerLink_Modification() {
		super();
		changed_from_outside = false;
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

	public String getPlName() {
		return plName;
	}

	public String getPlXPath() {
		return plXPath;
	}

	public String getPlValue() {
		return plValue;
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

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public void setPlXPath(String plXPath) {
		this.plXPath = plXPath;
	}

	public void setPlValue(String plValue) {
		this.plValue = plValue;
	}

	public Boolean getChanged_from_outside() {
		return changed_from_outside;
	}

	public void setChanged_from_outside(Boolean changed_from_outside) {
		this.changed_from_outside = changed_from_outside;
	}

}
