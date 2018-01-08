package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

public class RegistrationInformationMessage extends MessageBase {

	private static final long serialVersionUID = 735555531L;

	private List deployedProcessList;

	private List activeProcessList;

	private Long ReplyToMsgID;

	public RegistrationInformationMessage() {
		super();
		deployedProcessList = new LinkedList<DeployedProcess>();
		activeProcessList = new LinkedList<ActiveProcess>();
	}

	public List getDeployedProcessList() {
		return deployedProcessList;
	}

	public void addDeployedProcess(QName name, File bpel, List<File> wsdls,
			Long ver) {
		DeployedProcess depProc = new DeployedProcess();
		depProc.processName = name;
		depProc.bpelFile = bpel;
		depProc.version = ver;

		Iterator<File> itr = wsdls.iterator();
		while (itr.hasNext()) {
			File tmp = itr.next();
			depProc.addWSDLFile(tmp);
		}

		deployedProcessList.add(depProc);
	}

	public List getActiveProcessList() {
		return activeProcessList;
	}

	public void addActiveProcess(QName name, Long id, Long ver) {
		ActiveProcess actProc = new ActiveProcess();
		actProc.processName = name;
		actProc.ID = id;
		actProc.version = ver;

		activeProcessList.add(actProc);
	}

	public Long getReplyToMsgID() {
		return ReplyToMsgID;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		ReplyToMsgID = replyToMsgID;
	}

	public class DeployedProcess implements Serializable {
		private static final long serialVersionUID = 54647471L;

		private File bpelFile;
		private QName processName;
		private List wsdlFiles = new LinkedList<File>();
		private Long version;

		public void addWSDLFile(File file) {
			wsdlFiles.add(file);
		}

		public File getBpelFile() {
			return bpelFile;
		}

		public QName getProcessName() {
			return processName;
		}

		public List getWsdlFiles() {
			return wsdlFiles;
		}

		public Long getVersion() {
			return version;
		}

		public void setBpelFile(File bpelFile) {
			this.bpelFile = bpelFile;
		}

		public void setProcessName(QName processName) {
			this.processName = processName;
		}

		public void setWsdlFiles(List wsdlFiles) {
			this.wsdlFiles = wsdlFiles;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

	}

	public class ActiveProcess implements Serializable {
		private static final long serialVersionUID = 5475471L;

		private QName processName;
		private Long ID;
		private Long version;

		public QName getProcessName() {
			return processName;
		}

		public Long getID() {
			return ID;
		}

		public Long getVersion() {
			return version;
		}

		public void setProcessName(QName processName) {
			this.processName = processName;
		}

		public void setID(Long id) {
			ID = id;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

	}

}
