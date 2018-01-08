package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Finish_Loop_Execution extends IncomingMessageBase {

	private static final long serialVersionUID = 346366661L;

	private Long replyToMsgID;

	public Finish_Loop_Execution() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}
}
