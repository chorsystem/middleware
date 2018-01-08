package de.unistuttgart.iaas.chor.integration.events;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.ActivityEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Complete;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Dead_Path;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Executed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Executing;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Join_Failure;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Ready;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Evaluating_TransitionCondition_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Completed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Context_Migrated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Iteration_Prepared;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Reexecution_Prepared;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Running;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Suspended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Terminated_After_Rewinding;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Evaluated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Ready;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Set_False;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Set_True;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Loop_Condition_False;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Loop_Condition_True;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Loop_Iteration_Complete;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Message_Received;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Message_Sent;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.PartnerLink_Modification;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Instantiated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Compensated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Compensating;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Complete_With_Fault;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Event_Handling_Ended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Event;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Fault;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Termination;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Variable_Modification;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Variable_Modification_At_Assign;

import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.Iteration;

public class InstanceEventStorer implements EventObserver {

private final EventRegistry eventRegistry;
	
	private InstanceEventStorer(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}
	
	public static void attach(EventManager manager, EventRegistry eventRegistry) {
		InstanceEventStorer storer = new InstanceEventStorer(eventRegistry);
		storer.init(manager);
	}
	
	public void init(EventManager manager) {		
		
		///// Process Event Messages /////
//		manager.registerObserverForEvent(this, Process_Active.class);
//		manager.registerObserverForEvent(this, Process_Deployed.class);
//		manager.registerObserverForEvent(this, Process_Disabled.class);
//		manager.registerObserverForEvent(this, Process_Retired.class);
//		manager.registerObserverForEvent(this, Process_Undeployed.class);
		
		///// Instance Event Messages /////		
		manager.registerObserverForEvent(this, Instance_Completed.class);	
		manager.registerObserverForEvent(this, Instance_Faulted.class);
		manager.registerObserverForEvent(this, Instance_Iteration_Prepared.class);
		manager.registerObserverForEvent(this, Instance_Terminated_After_Rewinding.class);
		manager.registerObserverForEvent(this, Instance_Context_Migrated.class);
//		manager.registerObserverForEvent(this, Instance_JumpTo_Prepared.class);
		manager.registerObserverForEvent(this, Instance_Reexecution_Prepared.class);
		manager.registerObserverForEvent(this, Instance_Running.class);
		manager.registerObserverForEvent(this, Instance_Suspended.class);
		manager.registerObserverForEvent(this, Instance_Terminated.class);
		
		manager.registerObserverForEvent(this, PartnerLink_Modification.class);		
		manager.registerObserverForEvent(this, Process_Instantiated.class);
		manager.registerObserverForEvent(this, Variable_Modification.class);
		
		///// Activity Event Messages /////
		manager.registerObserverForEvent(this, Activity_Complete.class);
		manager.registerObserverForEvent(this, Activity_Dead_Path.class);
		manager.registerObserverForEvent(this, Activity_Executed.class);
		manager.registerObserverForEvent(this, Activity_Executing.class);
		manager.registerObserverForEvent(this, Activity_Faulted.class);
		manager.registerObserverForEvent(this, Activity_Join_Failure.class);
		manager.registerObserverForEvent(this, Activity_Ready.class);
		manager.registerObserverForEvent(this, Activity_Terminated.class);
		
		manager.registerObserverForEvent(this, Evaluating_TransitionCondition_Faulted.class);
		manager.registerObserverForEvent(this, Loop_Condition_False.class);
		manager.registerObserverForEvent(this, Loop_Condition_True.class);
		manager.registerObserverForEvent(this, Loop_Iteration_Complete.class);
		
		
		manager.registerObserverForEvent(this, Scope_Compensated.class);
		manager.registerObserverForEvent(this, Scope_Compensating.class);
		manager.registerObserverForEvent(this, Scope_Complete_With_Fault.class);
		manager.registerObserverForEvent(this, Scope_Event_Handling_Ended.class);
		manager.registerObserverForEvent(this, Scope_Handling_Event.class);
		manager.registerObserverForEvent(this, Scope_Handling_Fault.class);
		manager.registerObserverForEvent(this, Scope_Handling_Termination.class);
		
		
		///// Link Event Messages /////
		manager.registerObserverForEvent(this, Link_Evaluated.class);
		manager.registerObserverForEvent(this, Link_Ready.class);
		manager.registerObserverForEvent(this, Link_Set_False.class);
		manager.registerObserverForEvent(this, Link_Set_True.class);
		
		///// Variable Modification Messages /////
		manager.registerObserverForEvent(this, Variable_Modification.class);
		manager.registerObserverForEvent(this, Variable_Modification_At_Assign.class);
		
	    ///// Message Exchange Event Messages /////
		manager.registerObserverForEvent(this, Message_Sent.class);
		manager.registerObserverForEvent(this, Message_Received.class);
	}

	@Override
	public void onEvent(InstanceEventMessage evt) {
		
		
		if (evt instanceof ActivityEventMessage) {
			handleActivityEventMessage((ActivityEventMessage)evt);
		}
		else if(evt instanceof Instance_Iteration_Prepared){
			handleInstanceIterationPreparedEvent(evt);
		}
		else if(evt instanceof Instance_Reexecution_Prepared){
			handleInstanceIterationPreparedEvent(evt);
		}
		
		
		else { //no ActivityEvent
			handleInstanceEventMessage((InstanceEventMessage)evt);
		}
	}
	
	public void handleInstanceEventMessage(InstanceEventMessage evt) {
		ProcessInstance processInstance = eventRegistry.getOrCreateProcessInstance(evt.getSceInstanceId(), evt.getProcessModelId(),evt.getProcessID(),evt.getTimeStamp());
		SCEInstanceRef sceInstance = eventRegistry.getOrCreateSCEInstanceRef(evt.getSceInstanceId().toString());
		
		eventRegistry.registerProcessInstanceEvent(sceInstance, evt.getClass().getSimpleName(), evt.getMessageID(), evt, evt.getTimeStamp(), processInstance, evt.getDetails());	
	}
	
	public void handleActivityEventMessage(ActivityEventMessage evt) {
		ProcessInstance processInstance = eventRegistry.getOrCreateProcessInstance(evt.getSceInstanceId(), evt.getProcessModelId(),evt.getProcessID(),evt.getTimeStamp());
		SCEInstanceRef sceInstance = eventRegistry.getOrCreateSCEInstanceRef(evt.getSceInstanceId().toString());
		ActivityInstance activityInstance = eventRegistry.getOrCreateActivityInstance(sceInstance, processInstance, evt.getProcessModelId(), evt.getScopeID(), evt.getScopeXPath(), evt.getActivityID(), evt.getActivityXPath(), evt.getTimeStamp(), evt.getElementModelID());
		
		BPELStates state =  StateMachine.computeNewActivityState(evt);
		if(evt instanceof Message_Sent){
			Message_Sent message_sent = (Message_Sent)evt;
			eventRegistry.registerMessageExchangeEvent(sceInstance, evt.getClass().getSimpleName(), evt.getMessageID(), evt, evt.getTimeStamp(), evt.getActivityXPath(), state.name(), processInstance, evt.getDetails(), activityInstance, message_sent.getMessageExhangeID(), "sent");
		}
		else if(evt instanceof Message_Received){
			Message_Received message_received = (Message_Received) evt;
			eventRegistry.registerMessageExchangeEvent(sceInstance, evt.getClass().getSimpleName(), evt.getMessageID(), evt, evt.getTimeStamp(), evt.getActivityXPath(), state.name(), processInstance, evt.getDetails(), activityInstance, message_received.getMessageExhangeID(), "received");
		}
		else{
			
		
			eventRegistry.registerActivityInstanceEvent(sceInstance, evt.getClass().getSimpleName(), evt.getMessageID(), evt, evt.getTimeStamp(), evt.getActivityXPath(), state.name(), processInstance, evt.getDetails(), activityInstance);
		}
		
		
	}
	
	public void handleInstanceIterationPreparedEvent(InstanceEventMessage evt){
		
		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(evt.getChorId());
		Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);
		SCEInstanceRef sceInstance = eventRegistry.getSCEInstanceRef(evt.getSceInstanceId());
		ProcessInstance processInstance = eventRegistry.getOrCreateProcessInstance(evt.getSceInstanceId(), evt.getProcessModelId(),evt.getProcessID(),evt.getTimeStamp());
		
		eventRegistry.registerIterationEvent(iteration, sceInstance, processInstance, evt.getClass().getSimpleName(), evt.getMessageID(), evt, evt.getTimeStamp(), evt.getDetails());
	
	}
	
	
}
