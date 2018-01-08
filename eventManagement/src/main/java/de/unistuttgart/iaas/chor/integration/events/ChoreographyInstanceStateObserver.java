package de.unistuttgart.iaas.chor.integration.events;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.Chromaticity;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.ActivityEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Complete;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Dead_Path;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Executed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Executing;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Join_Failure;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Ready;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Completed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Running;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Suspended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.ProcessEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Instantiated;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.pbd.Activity;

import de.unistuttgart.iaas.chor.commons.messaging.EventMessageProducer;
import de.unistuttgart.iaas.chor.commons.util.Utils;
import de.unistuttgart.iaas.chor.event.messages.ChorInstanceEvent;
import de.unistuttgart.iaas.chor.event.messages.ChorInstanceStateChangeEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.InstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;

public class ChoreographyInstanceStateObserver implements EventObserver {

	private final EventRegistry eventRegistry;
	private final EventMessageProducer eventMessageProducer;
	
	private Map<Long, Map<String, InstanceStateEnum>> currentProcessInstanceStates = new HashMap<Long, Map<String, InstanceStateEnum>>();
	private Map<Long, Map<InstanceStateEnum, Integer>> numProcessesInState = new HashMap<Long, Map<InstanceStateEnum, Integer>>();
	
	private ChoreographyInstanceStateObserver(EventRegistry eventRegistry, EventMessageProducer eventMessageProducer) {
		this.eventRegistry = eventRegistry;		
		this.eventMessageProducer = eventMessageProducer;
	}
	
	public static void attach(EventManager manager, EventRegistry eventRegistry, EventMessageProducer eventMessageProducer) {
		ChoreographyInstanceStateObserver observer = new ChoreographyInstanceStateObserver(eventRegistry, eventMessageProducer);
		observer.init(manager);
	}
	
	public void init(EventManager manager) {		
		manager.registerObserverForEvent(this, Process_Instantiated.class);
		manager.registerObserverForEvent(this, Instance_Running.class);
		manager.registerObserverForEvent(this, Instance_Suspended.class);
		manager.registerObserverForEvent(this, Instance_Terminated.class);
		manager.registerObserverForEvent(this, Instance_Faulted.class);
		manager.registerObserverForEvent(this, Instance_Completed.class);
	}
	
	@Override
	public void onEvent(InstanceEventMessage evt) {		
	
		handleProcessEventMessages(evt);
		
		
		
	}
	
	private void initMaps(Long chorID) {
		currentProcessInstanceStates.put(chorID, new HashMap<String, InstanceStateEnum>());
		numProcessesInState.put(chorID, new HashMap<InstanceStateEnum, Integer>());
		numProcessesInState.get(chorID).put(InstanceStateEnum.Instance_Initializing, 0);
		numProcessesInState.get(chorID).put(InstanceStateEnum.Instance_Running, 0);
		numProcessesInState.get(chorID).put(InstanceStateEnum.Instance_Suspended, 0);
		numProcessesInState.get(chorID).put(InstanceStateEnum.Instance_Terminated, 0);
		numProcessesInState.get(chorID).put(InstanceStateEnum.Instance_Faulted, 0);
		numProcessesInState.get(chorID).put(InstanceStateEnum.Instance_Completed, 0);
	}
	
	private void decrementStateCount(Long chorID, InstanceStateEnum state) {
		numProcessesInState.get(chorID).put(state, numProcessesInState.get(chorID).get(state)-1);
	}
	
	private void incrementStateCount(Long chorID, InstanceStateEnum state) {
		numProcessesInState.get(chorID).put(state, numProcessesInState.get(chorID).get(state)+1);
	}
	
	private ChoreographyInstanceStateEnum calculateChoreographyInstanceState(Long chorID) {		
		boolean initializingEmpty = numProcessesInState.get(chorID).get(InstanceStateEnum.Instance_Initializing) == 0;
		boolean runningEmpty      = numProcessesInState.get(chorID).get(InstanceStateEnum.Instance_Running) == 0;
		boolean suspendedEmpty    = numProcessesInState.get(chorID).get(InstanceStateEnum.Instance_Suspended) == 0;
		boolean completedEmpty    = numProcessesInState.get(chorID).get(InstanceStateEnum.Instance_Completed) == 0;
		boolean faultedEmpty      = numProcessesInState.get(chorID).get(InstanceStateEnum.Instance_Faulted) == 0;
		boolean terminatedEmpty   = numProcessesInState.get(chorID).get(InstanceStateEnum.Instance_Terminated) == 0;
		
		//Alle Prozessinstanzen Initializing -> Initializing
		if (!initializingEmpty && runningEmpty && suspendedEmpty && completedEmpty && faultedEmpty && terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Initializing;
		//Mindestens eine Prozessinstanz Running -> Running_with...
		if (!runningEmpty) {
			if ( completedEmpty &&  faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running;
			if (!completedEmpty &&  faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Completed;
			if ( completedEmpty && !faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Faulted;
			if ( completedEmpty &&  faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Terminated;
			if (!completedEmpty && !faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Completed_and_Faulted;
			if (!completedEmpty &&  faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Completed_and_Terminated;
			if ( completedEmpty && !faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Faulted_and_Terminated;
			if (!completedEmpty && !faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Running_with_Completed_and_Faulted_and_Terminated;
		}
		
		//Mindestens eine Prozessinstanz Suspended -> Suspended_with...
		//Remark: Only global suspension of a choreography is allowed, i.e. a single process instance
		//cannot be suspended while other participants are in a running state.
		//This assumption is made in the state model, but is currently not enforced in the implementation,
		//in which instances are held in suspended state instead of completing.
		if (!suspendedEmpty) {
			if ( completedEmpty &&  faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended;
			if (!completedEmpty &&  faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Completed;
			if ( completedEmpty && !faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Faulted;
			if ( completedEmpty &&  faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Terminated;
			if (!completedEmpty && !faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Completed_and_Faulted;
			if (!completedEmpty &&  faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Completed_and_Terminated;
			if ( completedEmpty && !faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Faulted_and_Terminated;
			if (!completedEmpty && !faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Suspended_with_Completed_and_Faulted_and_Terminated;
		}
		
		//Keine Prozessinstanzen mehr Running oder Suspended -> Endzustand der Choreographie
		if (runningEmpty && suspendedEmpty) {
			if (!completedEmpty &&  faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Completed;
			if ( completedEmpty && !faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Faulted;
			if ( completedEmpty &&  faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Terminated;
			if (!completedEmpty && !faultedEmpty &&  terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Completed_with_Faulted;
			if (!completedEmpty &&  faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Completed_with_Terminated;
			if ( completedEmpty && !faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Faulted_with_Terminated;
			if (!completedEmpty && !faultedEmpty && !terminatedEmpty) return ChoreographyInstanceStateEnum.ChoreographyInstance_Completed_with_Faulted_and_Terminated;
		}
		
		return null;
	}
	
	private void handleProcessEventMessages(InstanceEventMessage evt){
		
		ChoreographyInstance chorInstance = eventRegistry.getOrCreateChoreographyInstance(evt.getChorId());
		
		if (evt instanceof Process_Instantiated) {
			//if (chorInstance == null) {
				//chorInstance = eventRegistry.getOrCreateChoreographyInstance(evt.getChorId());
				initMaps(evt.getChorId());		
			//}			
			
			ProcessInstance procInstance = eventRegistry.getOrCreateProcessInstance(evt.getSceInstanceId(), evt.getProcessModelId(),evt.getProcessID(),evt.getTimeStamp());
			eventRegistry.addParticipantToChoreographyInstance(procInstance, chorInstance);
		}
		
		String processInstanceKey = Utils.createProcessInstanceKey(evt.getSceInstanceId(), evt.getProcessModelId(), evt.getProcessID());
		
		
		//TODO: persist hashmaps
		// This does not work if osgi bundle is restarted
		InstanceStateEnum oldProcessState = currentProcessInstanceStates.get(evt.getChorId()).get(processInstanceKey);
		InstanceStateEnum newProcessState = null;
		if (evt instanceof Process_Instantiated) newProcessState = InstanceStateEnum.Instance_Initializing;
		if (evt instanceof Instance_Running) newProcessState = InstanceStateEnum.Instance_Running;
		if (evt instanceof Instance_Suspended) newProcessState = InstanceStateEnum.Instance_Suspended;
		if (evt instanceof Instance_Terminated) newProcessState = InstanceStateEnum.Instance_Terminated;
		if (evt instanceof Instance_Faulted) newProcessState = InstanceStateEnum.Instance_Faulted;
		if (evt instanceof Instance_Completed) newProcessState = InstanceStateEnum.Instance_Completed;	 
		
		
		currentProcessInstanceStates.get(evt.getChorId()).put(processInstanceKey, newProcessState);
		incrementStateCount(evt.getChorId(), newProcessState);
		if (oldProcessState != null) {
			decrementStateCount(evt.getChorId(), oldProcessState);
		}
		
		ChoreographyInstanceStateEnum newChorState = calculateChoreographyInstanceState(evt.getChorId());
		
		ChoreographyInstanceEvent choreographyInstanceEvent = eventRegistry.registerChoreographyInstanceEvent(chorInstance, newChorState.toString(), evt.getTimeStamp(), 
				numProcessesInState.get(evt.getChorId()).get(InstanceStateEnum.Instance_Initializing), 
				numProcessesInState.get(evt.getChorId()).get(InstanceStateEnum.Instance_Running), 
				numProcessesInState.get(evt.getChorId()).get(InstanceStateEnum.Instance_Suspended), 
				numProcessesInState.get(evt.getChorId()).get(InstanceStateEnum.Instance_Terminated), 
				numProcessesInState.get(evt.getChorId()).get(InstanceStateEnum.Instance_Faulted), 
				numProcessesInState.get(evt.getChorId()).get(InstanceStateEnum.Instance_Completed));
		
		eventRegistry.changeChoreographyInstanceStatus(evt.getChorId(), newChorState);
		
		eventMessageProducer.sendMessage(convertEvent(choreographyInstanceEvent, newChorState,  evt.getChorId()),"Object");
		
	}
	
	private ChorInstanceEvent convertEvent(ChoreographyInstanceEvent event, ChoreographyInstanceStateEnum newChorState, Long choreographyInstanceID){
		
		ChorInstanceStateChangeEvent chorInstanceEvent = new ChorInstanceStateChangeEvent();
		chorInstanceEvent.setChoreographyInstanceID(choreographyInstanceID.toString());
		chorInstanceEvent.setState(newChorState.name());
		//chorInstanceEvent.setChoreographyModelID(choreographyModelID);
		chorInstanceEvent.setEventId(event.getEventId());
		chorInstanceEvent.setEventType(event.getEventType());
		chorInstanceEvent.setTimestamp(event.getTimestamp());
		chorInstanceEvent.setNumCompleted(event.getNumCompleted());
		chorInstanceEvent.setNumFaulted(event.getNumFaulted());
		chorInstanceEvent.setNumInitializing(event.getNumInitializing());
		chorInstanceEvent.setNumRunning(event.getNumRunning());
		chorInstanceEvent.setNumSuspended(event.getNumSuspended());
		chorInstanceEvent.setNumTerminated(event.getNumTerminated());
		
		return chorInstanceEvent;
		
	}
	
	
	
}
