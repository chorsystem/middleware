package org.apache.ode.bpel.extensions.comm.messages.engineIn;

import java.io.Serializable;

public class IncomingMessageBase implements Serializable {

	private static final long serialVersionUID = 776577571L;

	private Long msgID;

	public Long getMsgID() {
		return msgID;
	}

	public void setMsgID(Long msgID) {
		this.msgID = msgID;
	}

}
