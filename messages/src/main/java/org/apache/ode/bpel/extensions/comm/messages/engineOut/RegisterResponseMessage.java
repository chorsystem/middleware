package org.apache.ode.bpel.extensions.comm.messages.engineOut;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

public class RegisterResponseMessage extends MessageBase {

	private static final long serialVersionUID = 85646221L;

	private Boolean registered;

	private Long ReplyToMsgID;

	// somebody already is blocking events on global level
	private List globalConflicts;

	// somebody is already blocking some events on the process model level
	private List processModelConflicts;

	// somebody is already blocking some events on the process instance level
	private List processInstanceConflicts;

	public void addProcessModelConflict(String event, QName name, Long vers) {
		processModelConflict tmp = new processModelConflict();
		tmp.event = event;
		tmp.processName = name;
		tmp.version = vers;
		processModelConflicts.add(tmp);
	}

	public void addProcessInstanceConflict(String event, QName name, Long vers,
			Long id) {
		processInstanceConflict tmp = new processInstanceConflict();
		tmp.event = event;
		tmp.processName = name;
		tmp.version = vers;
		tmp.instanceID = id;
		processInstanceConflicts.add(tmp);
	}

	public RegisterResponseMessage() {
		super();
		globalConflicts = new LinkedList<String>();
		processModelConflicts = new LinkedList<processModelConflict>();
		processInstanceConflicts = new LinkedList<processInstanceConflict>();
	}

	public Boolean getRegistered() {
		return registered;
	}

	public Long getReplyToMsgID() {
		return ReplyToMsgID;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}

	public void setReplyToMsgID(Long replyToMsgID) {
		ReplyToMsgID = replyToMsgID;
	}

	public List getGlobalConflicts() {
		return globalConflicts;
	}

	public List getProcessModelConflicts() {
		return processModelConflicts;
	}

	public List getProcessInstanceConflicts() {
		return processInstanceConflicts;
	}

	public class processModelConflict implements Serializable {
		private static final long serialVersionUID = 45677451L;

		private QName processName;
		private Long version;
		private String event;

		public QName getProcessName() {
			return processName;
		}

		public Long getVersion() {
			return version;
		}

		public String getEvent() {
			return event;
		}

		public void setProcessName(QName processName) {
			this.processName = processName;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public void setEvent(String event) {
			this.event = event;
		}

	}

	public class processInstanceConflict implements Serializable {
		private static final long serialVersionUID = 42157687L;

		private QName processName;
		private Long version;
		private String event;
		private Long instanceID;

		public QName getProcessName() {
			return processName;
		}

		public Long getVersion() {
			return version;
		}

		public String getEvent() {
			return event;
		}

		public Long getInstanceID() {
			return instanceID;
		}

		public void setProcessName(QName processName) {
			this.processName = processName;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public void setEvent(String event) {
			this.event = event;
		}

		public void setInstanceID(Long instanceID) {
			this.instanceID = instanceID;
		}

	}

}
