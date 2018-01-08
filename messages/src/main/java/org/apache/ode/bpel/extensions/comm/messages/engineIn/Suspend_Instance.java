package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Suspend_Instance extends IncomingMessageBase {

	private static final long serialVersionUID = 34535631L;

	private Long processID;

	public Suspend_Instance() {
		super();
	}

	public Long getProcessID() {
		return processID;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}
}
