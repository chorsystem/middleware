package org.apache.ode.bpel.extensions.comm.messages.engineOut;

public class Link_Evaluated extends LinkEventMessage {

	private static final long serialVersionUID = 236577541L;

	private Boolean value;

	public Link_Evaluated() {
		super();
	}

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

}
