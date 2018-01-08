package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import javax.xml.namespace.QName;

public class Instance_Faulted extends InstanceEventMessage {

	private static final long serialVersionUID = 18568222L;

	private QName faultName;

	private QName elementType;

	private QName messageType;

	private String faultMsg;

	public Instance_Faulted() {
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
