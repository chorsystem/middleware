package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Write_CorrelationSet extends IncomingMessageBase {

	private static final long serialVersionUID = 574754781L;

	private String corrSetName;

	private Long processID;

	private Long scopeID;

	private String[] newValues;

	public Write_CorrelationSet() {
		super();
	}

	public String getCorrSetName() {
		return corrSetName;
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String[] getNewValues() {
		return newValues;
	}

	public void setCorrSetName(String corrSetName) {
		this.corrSetName = corrSetName;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setNewValues(String[] newValues) {
		this.newValues = newValues;
	}

}
