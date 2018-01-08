package org.apache.ode.bpel.extensions.comm.messages.engineOut.fragment;

public class Fragment_Deployed extends FragmentEventMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7146075728144716334L;

	private String fragmentXML = null;

	public String getFragmentXML() {
		return fragmentXML;
	}

	public void setFragmentXML(String fragmentXML) {
		this.fragmentXML = fragmentXML;
	}
}
