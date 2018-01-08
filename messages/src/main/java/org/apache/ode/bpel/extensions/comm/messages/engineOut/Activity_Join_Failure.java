package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import javax.xml.namespace.QName;

public class Activity_Join_Failure extends ActivityEventMessage {

	private static final long serialVersionUID = 5747571L;

	private QName faultName;

	private QName elementType;

	private QName messageType;

	private String faultMsg;

	private Boolean suppressJoinFailure;

	public Activity_Join_Failure() {
		super();
	}

	public QName getFaultName() {
		return faultName;
	}

	public QName getElementType() {
		return elementType;
	}

	public QName getMessageType() {
		return messageType;
	}

	public String getFaultMsg() {
		return faultMsg;
	}

	public Boolean getSuppressJoinFailure() {
		return suppressJoinFailure;
	}

	public void setFaultName(QName faultName) {
		this.faultName = faultName;
	}

	public void setElementType(QName elementType) {
		this.elementType = elementType;
	}

	public void setMessageType(QName messageType) {
		this.messageType = messageType;
	}

	public void setFaultMsg(String faultMsg) {
		this.faultMsg = faultMsg;
	}

	public void setSuppressJoinFailure(Boolean suppressJoinFailure) {
		this.suppressJoinFailure = suppressJoinFailure;
	}

}
