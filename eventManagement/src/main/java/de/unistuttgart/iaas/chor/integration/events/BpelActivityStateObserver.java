package de.unistuttgart.iaas.chor.integration.events;

import java.util.List;

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
import org.apache.ode.bpel.extensions.comm.messages.engineOut.MessageExchangeEvent;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Message_Received;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Message_Sent;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Compensated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Compensating;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Complete_With_Fault;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Event_Handling_Ended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Event;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Fault;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Termination;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.messaging.EventMessageProducer;
import de.unistuttgart.iaas.chor.commons.messaging.MessageProducer;
import de.unistuttgart.iaas.chor.event.messages.MessageLinkInstanceStateChangeEvent;
import de.unistuttgart.iaas.chor.event.messages.MessageLink_Evaluating;
import de.unistuttgart.iaas.chor.event.messages.MessageLink_Set_False;
import de.unistuttgart.iaas.chor.event.messages.MessageLink_Set_True;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;

public class BpelActivityStateObserver implements EventObserver {

	private final EventRegistry eventRegistry;
	private final EventMessageProducer eventMessageProducer;
	private final MessageProducer messageProducer;

	private BpelActivityStateObserver(EventRegistry eventRegistry, EventMessageProducer eventMessageProducer, MessageProducer messageProducer) {
		this.eventRegistry = eventRegistry;
		this.eventMessageProducer = eventMessageProducer;
		this.messageProducer = messageProducer;
	}

	public static void attach(EventManager manager, EventRegistry eventRegistry, EventMessageProducer producer, MessageProducer messageProducer) {
		BpelActivityStateObserver observer = new BpelActivityStateObserver(eventRegistry, producer, messageProducer);
		observer.init(manager);
	}

	public void init(EventManager manager) {
		// /// Activity Event Messages /////
		manager.registerObserverForEvent(this, Activity_Complete.class);
		manager.registerObserverForEvent(this, Activity_Dead_Path.class);
		manager.registerObserverForEvent(this, Activity_Executed.class);
		manager.registerObserverForEvent(this, Activity_Executing.class);
		manager.registerObserverForEvent(this, Activity_Faulted.class);
		manager.registerObserverForEvent(this, Activity_Join_Failure.class);
		manager.registerObserverForEvent(this, Activity_Ready.class);
		manager.registerObserverForEvent(this, Activity_Terminated.class);

		/*
		 * manager.registerObserverForEvent(this,
		 * Evaluating_TransitionCondition_Faulted.class);
		 * manager.registerObserverForEvent(this, Loop_Condition_False.class);
		 * manager.registerObserverForEvent(this, Loop_Condition_True.class);
		 * manager.registerObserverForEvent(this,
		 * Loop_Iteration_Complete.class);
		 */

		manager.registerObserverForEvent(this, Scope_Compensated.class);
		manager.registerObserverForEvent(this, Scope_Compensating.class);
		manager.registerObserverForEvent(this, Scope_Complete_With_Fault.class);
		manager.registerObserverForEvent(this, Scope_Event_Handling_Ended.class);
		manager.registerObserverForEvent(this, Scope_Handling_Event.class);
		manager.registerObserverForEvent(this, Scope_Handling_Fault.class);
		manager.registerObserverForEvent(this, Scope_Handling_Termination.class);

		/*
		 * ///// Link Event Messages /////
		 * manager.registerObserverForEvent(this, Link_Evaluated.class);
		 * manager.registerObserverForEvent(this, Link_Ready.class);
		 * manager.registerObserverForEvent(this, Link_Set_False.class);
		 * manager.registerObserverForEvent(this, Link_Set_True.class);
		 * 
		 * ///// Variable Modification Messages /////
		 * manager.registerObserverForEvent(this, Variable_Modification.class);
		 * manager.registerObserverForEvent(this,
		 * Variable_Modification_At_Assign.class);
		 */

		manager.registerObserverForEvent(this, Message_Sent.class);
		manager.registerObserverForEvent(this, Message_Received.class);
	}

	@Override
	public void onEvent(InstanceEventMessage evt) {

		if (evt instanceof ActivityEventMessage) {
			handleActivityEventMessage((ActivityEventMessage) evt);
		}

	}

	private void handleActivityEventMessage(ActivityEventMessage evt) {

		ProcessInstance processInstance = eventRegistry.getOrCreateProcessInstance(evt.getSceInstanceId(), evt.getProcessModelId(), evt.getProcessID(), evt.getTimeStamp());
		SCEInstanceRef sceInstanceRef = eventRegistry.getOrCreateSCEInstanceRef(evt.getSceInstanceId());
		ActivityInstance activityInstance = eventRegistry.getOrCreateActivityInstance(sceInstanceRef, processInstance, evt.getProcessModelId(), evt.getScopeID(), evt.getScopeXPath(),
				evt.getActivityID(), evt.getActivityXPath(), evt.getTimeStamp(), evt.getElementModelID());

		if (evt instanceof Activity_Complete) {
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Complete);
			checkMessageLinkInstanceStateChange(activityInstance, evt);

		}
		if (evt instanceof Activity_Dead_Path)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Dead_Path);
		if (evt instanceof Activity_Executed) {
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Executed);
			checkMessageLinkInstanceStateChange(activityInstance, evt);
		}
		if (evt instanceof Activity_Executing) {
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Executing);
			checkMessageLinkInstanceStateChange(activityInstance, evt);
		}
		if (evt instanceof Activity_Faulted) {
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Faulted);
			checkMessageLinkInstanceStateChange(activityInstance, evt);
		}
		if (evt instanceof Activity_Join_Failure)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Join_Failure);
		if (evt instanceof Activity_Ready)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Ready);
		if (evt instanceof Activity_Terminated) {
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Activity_Terminated);
			checkMessageLinkInstanceStateChange(activityInstance, evt);
		}

		if (evt instanceof Scope_Compensated)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Compensated);
		if (evt instanceof Scope_Compensating)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Compensating);
		if (evt instanceof Scope_Complete_With_Fault)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Complete_With_Fault);
		if (evt instanceof Scope_Event_Handling_Ended)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Event_Handling_Ended);
		if (evt instanceof Scope_Handling_Event)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Handling_Event);
		if (evt instanceof Scope_Handling_Fault)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Handling_Fault);
		if (evt instanceof Scope_Handling_Termination)
			changeActivityInstanceStatus(activityInstance, ActivityInstanceStateEnum.Scope_Handling_Termination);

		if (evt instanceof MessageExchangeEvent) {
			handleMessageExchangeEvent(sceInstanceRef, processInstance, activityInstance, (MessageExchangeEvent) evt);
		}

	}

	private void changeActivityInstanceStatus(ActivityInstance activityInstance, ActivityInstanceStateEnum state) {

		eventRegistry.changeActivityInstanceStatus(activityInstance, state);
	}

	


	private void handleMessageExchangeEvent(SCEInstanceRef sceInstanceRef, ProcessInstance processInstance, ActivityInstance activityInstance, MessageExchangeEvent evt) {

		if (evt.getElementModelID() != null) {

			ChoreographyInstance chorInstance = eventRegistry.getOrCreateChoreographyInstance(evt.getChorId());
			ChoreographyModel choreographyModel = eventRegistry.getChoreographyModelOfChoreographyInstance(chorInstance);
			MessageLinkInstance messageLinkInstance = eventRegistry.getMessageLinkInstanceByMessageID(chorInstance, evt.getMessageExhangeID());

			if (evt instanceof Message_Sent) {

				Message_Sent msevt = (Message_Sent) evt;
				handleMessageSentEvent(choreographyModel, chorInstance, processInstance, messageLinkInstance, activityInstance, msevt);
				
				//TODO: check if it is really not needed
				//notifyServiceRoute(msevt);
				

			} else if (evt instanceof Message_Received) {
				Message_Received mrevt = (Message_Received) evt;
				handleMessageReceivedEvent(choreographyModel, chorInstance, processInstance, messageLinkInstance, activityInstance, mrevt);
			}

		}

//		if (evt instanceof Message_Sent) {
//
//			System.out.println("===============================================");
//			System.out.println("Sent");
//
//		} else if (evt instanceof Message_Received) {
//			System.out.println("===============================================");
//			System.out.println("Received");
//
//		}
//
//		System.out.println("ActivityInstanceID: " + evt.getActivityID());
//		System.out.println("ElementModelID: " + evt.getElementModelID());
//		System.out.println("MessageExhangeID: " + evt.getMessageExhangeID());

	}

	private void notifyServiceRoute(Message_Sent evt){
		
		messageProducer.sendObject(evt, evt.getMessageExhangeID(), Constants.SERVICE_ROUTE_SYNC_QUEUE);
	}
	
	private void handleMessageSentEvent(ChoreographyModel choreographyModel, ChoreographyInstance choreographyInstance, ProcessInstance processInstance, MessageLinkInstance messageLinkInstance,
			ActivityInstance activityInstance, Message_Sent evt) {

		MessageLink messageLink = eventRegistry.getOutgoingMessageLink(choreographyModel.getChoreographyModelId(), evt.getElementModelID());

		if (messageLink == null) {
			return;
		}

		if (messageLinkInstance == null) {

			messageLinkInstance = eventRegistry.createMessageLinkInstance(messageLink, processInstance, null, activityInstance, null, evt.getMessageExhangeID(),null);
			eventRegistry.assignMessageLinkInstanceToChoreographyInstance(choreographyInstance, messageLinkInstance);
		} else {

			messageLinkInstance.setSendingActivityInstance(activityInstance);
			messageLinkInstance.setSendingProcessInstance(processInstance);
//			MessageLinkInstanceStateEnum state = calculateMessageLinkInstanceState(messageLinkInstance, evt);
//			messageLinkInstance.setState(state);
			eventRegistry.updateMessageLinkInstance(messageLinkInstance);
			checkMessageLinkInstanceStateChange(messageLinkInstance, activityInstance, evt);

		}

	}

	private void handleMessageReceivedEvent(ChoreographyModel choreographyModel, ChoreographyInstance choreographyInstance, ProcessInstance processInstance, MessageLinkInstance messageLinkInstance,
			ActivityInstance activityInstance, Message_Received evt) {

		MessageLink messageLink = eventRegistry.getIncomingMessageLink(choreographyModel.getChoreographyModelId(), evt.getElementModelID());

		if (messageLink == null) {
			return;
		}

		if (messageLinkInstance == null) {

			messageLinkInstance = eventRegistry.createMessageLinkInstance(messageLink, null, processInstance, null, activityInstance, evt.getMessageExhangeID(),
					null);
			eventRegistry.assignMessageLinkInstanceToChoreographyInstance(choreographyInstance, messageLinkInstance);
		} else {

			messageLinkInstance.setReceivingActivityInstance(activityInstance);
			messageLinkInstance.setReceivingProcessInstance(processInstance);
			// MessageLinkInstanceStateEnum state =
			// calculateMessageLinkInstanceState(messageLinkInstance, evt);
			// messageLinkInstance.setState(state);
			 
			eventRegistry.updateMessageLinkInstance(messageLinkInstance);
			checkMessageLinkInstanceStateChange(messageLinkInstance, activityInstance, evt);
		}

	}

	private void checkMessageLinkInstanceStateChange(ActivityInstance activityInstance, ActivityEventMessage evt) {

		if (evt.getElementModelID() == null) {
			return;
		}

		ChoreographyInstance chorInstance = eventRegistry.getOrCreateChoreographyInstance(evt.getChorId());
		List<MessageLinkInstance> messageLinkInstances = eventRegistry.getMessageLinkInstances(chorInstance, activityInstance);

	
		for(MessageLinkInstance messageLinkInstance: messageLinkInstances){
				checkMessageLinkInstanceStateChange(messageLinkInstance, activityInstance, evt);
			
		}
	}

	private void checkMessageLinkInstanceStateChange(MessageLinkInstance messageLinkInstance, ActivityInstance activityInstance, ActivityEventMessage evt) {

		MessageLinkInstanceStateEnum oldState = messageLinkInstance.getState();

		MessageLinkInstanceStateEnum newState = MessageLinkInstanceStateMachine.calculateMessageLinkInstanceState(messageLinkInstance, evt);

		if (oldState == null || (oldState != null  && !oldState.equals(newState)) ) {
			messageLinkInstance.setState(newState);
			eventRegistry.updateMessageLinkInstance(messageLinkInstance);
			MessageLink messageLink = eventRegistry.getMessageLinkOfMessageLinkInstance(messageLinkInstance);

			MessageLinkInstanceStateChangeEvent message = mapStateToEvents(newState, evt);
			
			if (message != null){
				message.setChoreographyInstanceID(evt.getChorId().toString());
				message.setElementModelID(messageLink.getMessageLinkID());
				message.setInstanceID(messageLinkInstance.getInstanceID());
				message.setMessageID(messageLinkInstance.getMessageID());
				message.setTimestamp(messageLinkInstance.getTimestamp());
				eventMessageProducer.sendMessage(message, "Object");
				
				// @yussupvr: persist MessageLinkInstanceStateChangeEvent
				eventRegistry.registerMessageLinkInstanceStateChangeEvent(evt.getChorId().toString(), messageLink.getMessageLinkID(), messageLinkInstance);
				
			}	
		}

	}

	private MessageLinkInstanceStateChangeEvent mapStateToEvents(MessageLinkInstanceStateEnum state, ActivityEventMessage evt){
		
		MessageLinkInstanceStateChangeEvent messagelinkEvt = null;
		
		if(state.equals(MessageLinkInstanceStateEnum.True)){
			messagelinkEvt = new MessageLink_Set_True();
		}
		else if(state.equals(MessageLinkInstanceStateEnum.False)){
			messagelinkEvt = new MessageLink_Set_False();
		}
		else if(state.equals(MessageLinkInstanceStateEnum.Evaluating)){
			messagelinkEvt = new MessageLink_Evaluating();
		}
		return messagelinkEvt;
	}

}
