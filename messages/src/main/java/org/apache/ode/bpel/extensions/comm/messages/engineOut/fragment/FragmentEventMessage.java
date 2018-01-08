package org.apache.ode.bpel.extensions.comm.messages.engineOut.fragment;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;

public class FragmentEventMessage extends InstanceEventMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8943641503088449309L;
	
	private String parentActivityXPath = null;
	
	private String fragmentName = null;
	
	public String getParentActivityXPath() {
		return parentActivityXPath;
	}

	public void setParentActivityXPath(String parentActivityXPath) {
		this.parentActivityXPath = parentActivityXPath;
	}

	public String getFragmentName() {
		return fragmentName;
	}

	public void setFragmentName(String fragmentName) {
		this.fragmentName = fragmentName;
	}

}
