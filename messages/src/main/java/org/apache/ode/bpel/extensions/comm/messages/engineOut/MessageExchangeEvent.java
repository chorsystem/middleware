package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class MessageExchangeEvent extends ActivityEventMessage{

	private static final long serialVersionUID = -6229503919660952593L;
	
	private String messageExhangeID;
	
	
	public String getMessageExhangeID() {
		return messageExhangeID;
	}
	public void setMessageExhangeID(String messageExhangeID) {
		this.messageExhangeID = messageExhangeID;
	}
	
}
