package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Continue extends IncomingMessageBase {

	private static final long serialVersionUID = 457777771L;

	private Long replyToMsgID;

	public Continue() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}
}
