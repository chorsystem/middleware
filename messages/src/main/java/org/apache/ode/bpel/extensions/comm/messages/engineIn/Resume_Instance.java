package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Resume_Instance extends IncomingMessageBase {

	private static final long serialVersionUID = 1L;

	private Long processID;

	public Resume_Instance() {
		super();
	}

	public Long getProcessID() {
		return processID;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}
}
