package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Continue_Loop extends IncomingMessageBase {

	private static final long serialVersionUID = 6346444441L;

	private Long replyToMsgID;

	public Continue_Loop() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}
}
