package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Start_Activity extends IncomingMessageBase {

	private static final long serialVersionUID = 52351L;

	private Long replyToMsgID;

	public Start_Activity() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}
}
