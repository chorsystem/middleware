package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class InstanceEventMessage extends ProcessEventMessage {

	private static final long serialVersionUID = 65134423L;

	private Long processID;
	private Long chorId;

	private String details;

	public InstanceEventMessage() {
		super();
	}

	public Long getProcessID() {
		return processID;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
		
	public Long getChorId() {
		return chorId;
	}
	
	public void setChorId(Long id) {
		chorId = id;
	}	
}
