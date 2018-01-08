package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Write_PartnerLink extends IncomingMessageBase {

	private static final long serialVersionUID = 123525255L;

	private String plName;

	private Long processID;

	private Long scopeID;

	private String newEPR;

	public Write_PartnerLink() {
		super();
	}

	public String getPlName() {
		return plName;
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String getNewEPR() {
		return newEPR;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setNewEPR(String newEPR) {
		this.newEPR = newEPR;
	}

}
