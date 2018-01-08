package org.apache.ode.bpel.extensions.comm.messages.engineIn;

/**
 * Event to read the content of a partner link.
 * 
 * @author sonntamo
 */
public class Read_PartnerLink extends IncomingMessageBase {

	private static final long serialVersionUID = 565566666611L;

	private String partnerLinkName;

	private Long processID;

	private Long scopeID;

	public Read_PartnerLink() {
		super();
	}

	public String getPartnerLinkName() {
		return partnerLinkName;
	}

	public Long getProcessID() {
		return processID;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public void setPartnerLinkName(String partnerLinkName) {
		this.partnerLinkName = partnerLinkName;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

}
