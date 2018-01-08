package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import java.io.Serializable;

//@stmz: base class for all outgoing messages
public class MessageBase implements Serializable {

	private static final long serialVersionUID = -1075592551376260168L;

	private Long MessageID;

	private Long TimeStamp;

	private Long GenericControllerID;

	private Boolean blocking;
	
	private String sceInstanceId;
	
	private String modelId;

	public Long getMessageID() {
		return MessageID;
	}

	public Long getTimeStamp() {
		return TimeStamp;
	}

	public Long getGenericControllerID() {
		return GenericControllerID;
	}

	public Boolean getBlocking() {
		return blocking;
	}

	public void setMessageID(Long messageID) {
		MessageID = messageID;
	}

	public void setTimeStamp(Long timeStamp) {
		TimeStamp = timeStamp;
	}

	public void setGenericControllerID(Long genericControllerID) {
		GenericControllerID = genericControllerID;
	}

	public void setBlocking(Boolean blocking) {
		this.blocking = blocking;
	}

	public String getSceInstanceId() {
		return sceInstanceId;
	}

	public void setSceInstanceId(String sceInstanceId) {
		this.sceInstanceId = sceInstanceId;
	}

	public String getProcessModelId() {
		return modelId;
	}

	public void setProcessModelId(String modelId) {
		this.modelId = modelId;
	}

	
}
