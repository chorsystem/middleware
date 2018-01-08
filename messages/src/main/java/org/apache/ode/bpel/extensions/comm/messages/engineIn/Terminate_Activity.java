package org.apache.ode.bpel.extensions.comm.messages.engineIn;

public class Terminate_Activity extends IncomingMessageBase {

	private static final long serialVersionUID = 6757571L;

	private Long processID;

	private Long scopeID;

	private String act_Xpath;

	public Terminate_Activity() {
		super();
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String getAct_Xpath() {
		return act_Xpath;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setAct_Xpath(String act_Xpath) {
		this.act_Xpath = act_Xpath;
	}

}
