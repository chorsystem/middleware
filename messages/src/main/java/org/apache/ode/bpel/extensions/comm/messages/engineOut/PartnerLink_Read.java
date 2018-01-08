package org.apache.ode.bpel.extensions.comm.messages.engineOut;

/**
 * 
 * @author sonntamo
 */
public class PartnerLink_Read extends MessageBase {

	private static final long serialVersionUID = 85463611L;

	private Long ReplyToMsgID;

	private String value;

	public PartnerLink_Read() {
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
