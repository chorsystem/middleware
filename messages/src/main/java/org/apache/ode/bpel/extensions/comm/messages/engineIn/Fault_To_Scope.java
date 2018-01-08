package org.apache.ode.bpel.extensions.comm.messages.engineIn;

import javax.xml.namespace.QName;

public class Fault_To_Scope extends IncomingMessageBase {

	private static final long serialVersionUID = 4774771L;

	private Long processID;

	private Long scopeID;

	private QName faultName;

	private QName elementType;

	private QName messageType;

	private String faultMsg;

	public Fault_To_Scope() {
		super();
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
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

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
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
