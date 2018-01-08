package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Set_Link_State extends IncomingMessageBase {

	private static final long serialVersionUID = 1L;

	private Long replyToMsgID;

	private Boolean value;

	public Set_Link_State() {
		super();
	}

	public Long getReplyToMsgID() {
		return replyToMsgID;
	}

	public Boolean getValue() {
		return value;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		this.replyToMsgID = replyToMsgID;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

}
