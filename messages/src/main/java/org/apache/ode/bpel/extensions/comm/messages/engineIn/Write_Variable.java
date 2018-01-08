package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Write_Variable extends IncomingMessageBase {

	private static final long serialVersionUID = 5636466661L;

	private String variableName;

	private Long processID;

	private Long scopeID;

	private String changes;

	public Write_Variable() {
		super();
	}

	public String getVariableName() {
		return variableName;
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String getChanges() {
		return changes;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}
}
