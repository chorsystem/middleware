package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class Variable_Read extends MessageBase {

	private static final long serialVersionUID = 8546361L;

	private Long ReplyToMsgID;

	private String value;

	public Variable_Read() {
		super();
	}

	public Long getReplyToMsgID() {
		return ReplyToMsgID;
	}

	public String getValue() {
		return value;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		ReplyToMsgID = replyToMsgID;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
