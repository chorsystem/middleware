package de.unistuttgart.iaas.chor.integration.events;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.apache.ode.bpel.extensions.comm.messages.engineIn.RegisterRequestMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineIn.RegisterRequestMessage.InstanceEventBlocking;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Completed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Running;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Suspended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Terminated_After_Rewinding;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Instantiated;

import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.InstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;

/**
 * Reacts to the process instance lifecycle events and updates the process instance status
 * in the event registry accordingly. Creates a new process instance DAO on process instantiation
 * if none to the given id exists yet.
 * 
 * @author vonstepk
 *
 */
public class ProcessInstanceStateObserver implements EventObserver {
	
	private final EventRegistry eventRegistry;
	private EventManager eventManager;
	
	
	private ProcessInstanceStateObserver(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}
	
	public static void attach(EventManager manager, EventRegistry eventRegistry) {
		ProcessInstanceStateObserver observer = new ProcessInstanceStateObserver(eventRegistry);
		
		observer.init(manager);
	}
	
	public void init(EventManager manager) {		
		
		eventManager = manager;
		manager.registerObserverForEvent(this, Process_Instantiated.class);
		manager.registerObserverForEvent(this, Instance_Running.class);
		manager.registerObserverForEvent(this, Instance_Suspended.class);
		manager.registerObserverForEvent(this, Instance_Terminated.class);
		manager.registerObserverForEvent(this, Instance_Faulted.class);
		manager.registerObserverForEvent(this, Instance_Completed.class);	
		manager.registerObserverForEvent(this, Instance_Terminated_After_Rewinding.class);
	}

	@Override
	public void onEvent(InstanceEventMessage evt) {		
		if (evt instanceof Process_Instantiated) handle((Process_Instantiated)evt);
		if (evt instanceof Instance_Running) handle((Instance_Running) evt);
		if (evt instanceof Instance_Suspended) handle((Instance_Suspended) evt);
		if (evt instanceof Instance_Terminated) handle((Instance_Terminated) evt);
		if (evt instanceof Instance_Faulted) handle((Instance_Faulted) evt);
		if (evt instanceof Instance_Completed) handle((Instance_Completed) evt);
		if (evt instanceof Instance_Terminated_After_Rewinding) handle((Instance_Terminated_After_Rewinding) evt);
	}

	private void handle(Process_Instantiated evt) {
	
		// Create new process instance if necessary or get reference to existing one
		ProcessInstance instance = eventRegistry.getOrCreateProcessInstance(evt.getSceInstanceId(), evt.getProcessModelId(),evt.getProcessID(),evt.getTimeStamp());
		
		// Assign the process instance with its model and the SCE instance by which it is executed
		ProcessModel model = eventRegistry.getProcessModel(evt.getProcessModelId());
		SCEInstanceRef sceRef = eventRegistry.getSCEInstanceRef(evt.getSceInstanceId());
		eventRegistry.assignProcessInstance(sceRef, model, instance);
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Initializing);
		
		sendBreakpointInformation(evt, model, instance);
		
	}
	
	private void handle(Instance_Running evt) {
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Running);
	}
	
	private void handle(Instance_Suspended evt) {
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Suspended);
	}
	
	private void handle(Instance_Terminated evt) {
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Terminated);
	}
	
	private void handle(Instance_Faulted evt) {
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Faulted);
	}
	
	private void handle(Instance_Completed evt) {
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Completed);
	}
	private void handle(Instance_Terminated_After_Rewinding evt) {
		eventRegistry.changeProcessInstanceStatus(evt.getSceInstanceId(),evt.getProcessModelId(), evt.getProcessID(), InstanceStateEnum.Instance_Terminated);
	}
	
	private void sendBreakpointInformation(Process_Instantiated evt, ProcessModel processModel, ProcessInstance processInstance){
		
		byte[] breakpointInformationByteArray = processModel.getBreakpointInformationByteArray();
		
		if(breakpointInformationByteArray != null){
			RegisterRequestMessage message = getMessage(breakpointInformationByteArray);
			
			if(message != null){
				
				for(Object obj: message.getProcessInstanceEventBlockings()){
					
					if(obj instanceof InstanceEventBlocking){
						((InstanceEventBlocking)obj).setProcessID(processInstance.getOdeProcessInstanceID());
					}
					
				}
				
				eventManager.notifyViaObjectMessage(message, processInstance);
			}
		}	
	}
	
	private RegisterRequestMessage getMessage(byte[] breakpointInformationByteArray){
		
		ByteArrayInputStream bis = new ByteArrayInputStream(breakpointInformationByteArray);
		ObjectInput in = null;

		Object breakpointInformation = null;
		try {
			in = new ObjectInputStream(bis);
			breakpointInformation = in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return (RegisterRequestMessage)breakpointInformation;
		
	}
	
}
