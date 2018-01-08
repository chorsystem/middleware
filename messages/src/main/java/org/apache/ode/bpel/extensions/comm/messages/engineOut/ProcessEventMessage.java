package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import javax.xml.namespace.QName;

public class ProcessEventMessage extends MessageBase {

	private static final long serialVersionUID = 14646421L;

	private QName processName;

	// @hahnml: The version should be available for all ProcessEventMessages
	private Long version;
	
	// @hahnml: The ip address of the machine which hosts ODE should be available for all ProcessEventMessages
	private String odeHostIP;

	public ProcessEventMessage() {
		super();
	}

	public QName getProcessName() {
		return processName;
	}

	public void setProcessName(QName processName) {
		this.processName = processName;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getVersion() {
		return version;
	}

	public String getODEHostIP() {
		return odeHostIP;
	}

	public void setODEHostIP(String odeHostIP) {
		this.odeHostIP = odeHostIP;
	}

}
