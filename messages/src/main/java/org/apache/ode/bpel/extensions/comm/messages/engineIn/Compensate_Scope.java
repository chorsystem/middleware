package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Compensate_Scope extends IncomingMessageBase {

	private static final long serialVersionUID = 6646471L;

	private Long processID;

	private Long scopeID;

	public Compensate_Scope() {
		super();
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}
}
