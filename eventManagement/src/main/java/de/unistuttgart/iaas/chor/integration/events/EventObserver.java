package de.unistuttgart.iaas.chor.integration.events;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;

public interface EventObserver {
	public void onEvent(InstanceEventMessage evt);
}
