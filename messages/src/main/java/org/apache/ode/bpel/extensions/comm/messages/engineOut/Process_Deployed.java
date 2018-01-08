package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

public class Process_Deployed extends ProcessEventMessage {

	private static final long serialVersionUID = 1543456L;

	private File bpelFile;

	private LinkedList wsdlFiles;
	
	private QName deploymentUnit;

	public Process_Deployed() {
		super();
		wsdlFiles = new LinkedList<File>();
	}

	public void addWSDLFile(File wsdlFile) {
		wsdlFiles.add(wsdlFile);
	}

	public void addWSDLFiles(List<File> files) {
		Iterator<File> itr = files.iterator();
		while (itr.hasNext()) {
			File tmp = itr.next();
			addWSDLFile(tmp);
		}
	}

	public File getBpelFile() {
		return bpelFile;
	}

	public LinkedList getWsdlFiles() {
		return wsdlFiles;
	}

	public void setBpelFile(File bpelFile) {
		this.bpelFile = bpelFile;
	}

	public void setWsdlFiles(LinkedList wsdlFiles) {
		this.wsdlFiles = wsdlFiles;
	}

	public QName getDeploymentUnit() {
		return deploymentUnit;
	}

	public void setDeploymentUnit(QName deploymentUnit) {
		this.deploymentUnit = deploymentUnit;
	}

	
	
}
