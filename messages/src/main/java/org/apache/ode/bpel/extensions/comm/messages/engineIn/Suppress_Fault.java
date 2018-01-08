package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Suppress_Fault extends IncomingMessageBase {

	private static final long serialVersionUID = 6366666344441L;

	private Long replyToMsgID;

	public Suppress_Fault() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}
}
