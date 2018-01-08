package de.unistuttgart.iaas.scemanager.messages;

import java.io.Serializable;

/**
 * Base class for all SCE Manager messages.
 * 
 * @author hahnml
 *
 */
public class SceMessageBase implements Serializable {

	private static final long serialVersionUID = -8838281901545092105L;

	private Long messageID;

	private Long timestamp;

	private String sceInstanceId;

	public Long getMessageID() {
		return messageID;
	}

	public Long getTimeStamp() {
		return timestamp;
	}

	public void setMessageID(Long messageID) {
		this.messageID = messageID;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timestamp = timeStamp;
	}

	public void setSceInstanceId(String sceInstanceId) {
		this.sceInstanceId = sceInstanceId;
	}

	public String getSceInstanceId() {
		return sceInstanceId;
	}


}
