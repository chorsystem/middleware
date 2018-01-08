package de.unistuttgart.iaas.chor.commons.datastructures;

import javax.xml.namespace.QName;

public class QNameTriple {

	private QName service;
	private QName port;
	private QName portType;
	public QName getService() {
		return service;
	}
	public void setService(QName service) {
		this.service = service;
	}
	public QName getPort() {
		return port;
	}
	public void setPort(QName port) {
		this.port = port;
	}
	public QName getPortType() {
		return portType;
	}
	public void setPortType(QName portType) {
		this.portType = portType;
	}
	
	
	
	
	
}
