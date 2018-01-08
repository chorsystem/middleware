package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import javax.xml.namespace.QName;

public class Scope_Handling_Fault extends ActivityEventMessage {

	private static final long serialVersionUID = 1111134566464L;

	private QName faultName;

	private QName elementType;

	private QName messageType;

	private String faultMsg;

	public Scope_Handling_Fault() {
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
}
