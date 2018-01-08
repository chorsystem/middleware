package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class LinkEventMessage extends InstanceEventMessage {

	private static final long serialVersionUID = 8564881L;

	private Long scopeID;

	private String scopeXPath;

	private String linkName;

	private String linkXPath;

	public LinkEventMessage() {
		super();
	}

	public Long getScopeID() {
		return scopeID;
	}

	public String getScopeXPath() {
		return scopeXPath;
	}

	public String getLinkName() {
		return linkName;
	}

	public String getLinkXPath() {
		return linkXPath;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public void setScopeXPath(String scopeXPath) {
		this.scopeXPath = scopeXPath;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public void setLinkXPath(String linkXPath) {
		this.linkXPath = linkXPath;
	}

}
