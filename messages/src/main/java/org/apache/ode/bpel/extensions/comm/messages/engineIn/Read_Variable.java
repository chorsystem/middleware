package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Read_Variable extends IncomingMessageBase {

	private static final long serialVersionUID = 56556666661L;

	private String variableName;

	private Long processID;

	private Long scopeID;

	public Read_Variable() {
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

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

}
