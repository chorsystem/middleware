package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Complete_Activity extends IncomingMessageBase {

	private static final long serialVersionUID = 463341L;

	private Long replyToMsgID;

	public Complete_Activity() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}
}
