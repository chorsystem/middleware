package de.unistuttgart.iaas.chor.instance.management;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.xml.ws.Holder;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Headers;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.jms.JmsConstants;
import org.apache.camel.component.jms.JmsMessage;
import org.apache.camel.impl.DefaultMessage;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.ode.bpel.extensions.comm.messages.engineIn.IncomingMessageBase;
import org.apache.ode.bpel.extensions.comm.messages.engineIn.RegisterRequestMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineIn.Write_Variable;
import org.apache.ode.pmapi.types._2006._08._02.TVariableRefList;
import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.impl.SequenceImpl;
import org.w3c.dom.Element;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.messaging.MessageProducer;
import de.unistuttgart.iaas.chor.commons.util.EMFUtils;
import de.unistuttgart.iaas.chor.event.messages.ChangeVariableValueMessage;
import de.unistuttgart.iaas.chor.event.messages.ChorRegisterRequestMessage;
import de.unistuttgart.iaas.chor.event.messages.IncomingEvent;
import de.unistuttgart.iaas.chor.event.messages.MessageLinkInstanceStateChangeEvent;
import de.unistuttgart.iaas.chor.event.messages.MessageLink_Evaluating;
import de.unistuttgart.iaas.chor.event.messages.MessageLink_Set_False;
import de.unistuttgart.iaas.chor.event.messages.MessageLink_Set_True;
import de.unistuttgart.iaas.chor.instance.management.util.XMLFactory;
import de.unistuttgart.iaas.chor.instance.repetition.ChorInstanceGraphEventMapper;
import de.unistuttgart.iaas.chor.instance.repetition.RepetitionManager;
import de.unistuttgart.iaas.chor.instance.repetition.util.Result;
import de.unistuttgart.iaas.chor.instance.repetition.util.ResultEntry;
import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.Iteration;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.RepetitionMethodEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.util.Tuple;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.ServiceEndpointData;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.Service;
import de.unistuttgart.iaas.chor.messages.ChorControlMessage;
import de.unistuttgart.iaas.chor.messages.ChorInstanceInformation;
import de.unistuttgart.iaas.chor.messages.ChorIterationControlMessage;
import de.unistuttgart.iaas.chor.messages.ChorStartMessage;
import de.unistuttgart.iaas.chor.messages.ChorStartReturnMessage;
import de.unistuttgart.iaas.chor.messages.ChoreographyInstanceStates;
import de.unistuttgart.iaas.chor.messages.CurrentStateType;
import de.unistuttgart.iaas.chor.messages.EndpointDataType;
import de.unistuttgart.iaas.chor.messages.EventType;
import de.unistuttgart.iaas.chor.messages.GetChorInstanceHistoryMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstanceHistoryReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstancesMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstancesReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstanceHistoryMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstanceHistoryReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstancesMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstancesReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetSnapshotVariablesMessage;
import de.unistuttgart.iaas.chor.messages.GetSnapshotsMessage;
import de.unistuttgart.iaas.chor.messages.IterateChorInstanceMessage;
import de.unistuttgart.iaas.chor.messages.MessageLinkInstanceEventType;
import de.unistuttgart.iaas.chor.messages.MessageLinkInstanceInformation;
import de.unistuttgart.iaas.chor.messages.ProcessInstanceHistoryOfChorInstance;
import de.unistuttgart.iaas.chor.messages.ProcessInstanceInformation;
import de.unistuttgart.iaas.chor.messages.StartParticipantType;

public class InstanceManager {

	private MessageProducer messageProducer;

	private ServiceRegistry serviceRegistry;

	private EventRegistry eventRegistry;

	private ManagementRegistry managementRegistry;

	private ArtifactRegistry artifactRegistry;
	
	 private static int invoked = 0;

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public ManagementRegistry getManagementRegistry() {
		return managementRegistry;
	}

	public void setManagementRegistry(ManagementRegistry managementRegistry) {
		this.managementRegistry = managementRegistry;
	}

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public ArtifactRegistry getArtifactRegistry() {
		return artifactRegistry;
	}

	public void setArtifactRegistry(ArtifactRegistry artifactRegistry) {
		this.artifactRegistry = artifactRegistry;
	}

	public Object startChoreographyInstance(@Headers Map<String, Object> headers, @Body ChorStartMessage chorStartMessage) {
		
		Long choreographyInstanceId = createChoreographyInstanceID();
		Long instanceWaitingTime = chorStartMessage.getInstanceWaitingTime();
		
		eventRegistry.getOrCreateChoreographyInstance(chorStartMessage.getChoreographyModelId(), choreographyInstanceId, instanceWaitingTime);

		
		
		
		List<DefaultMessage> answer = new ArrayList<DefaultMessage>();

		for (StartParticipantType startParticipantType : chorStartMessage.getStartParticipants()) {
			EndpointDataType endpoint = startParticipantType.getEndpoint();

			Service service = serviceRegistry.getService(endpoint.getService(), endpoint.getPortType(), endpoint.getPort());

			DefaultMessage message = new DefaultMessage();

			message.setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());
			message.setHeader(CxfConstants.OPERATION_NAME, "Invoke");
			message.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://camel.apache.org/cxf/jaxws/dispatch");
			message.setHeader("SOAPAction", startParticipantType.getName().getNamespaceURI() + "/" + endpoint.getMethod());

			message.setHeader("choreographyInstanceID", choreographyInstanceId);
			message.setHeader("metaData", startParticipantType.getHeaderMetaData());
			
			if(instanceWaitingTime != null){
				
				message.setHeader("instanceWatingTime", instanceWaitingTime);
				
			}
			
			
			message = configureMessagePayload(message, startParticipantType.getPayload());

			answer.add(message);

		}

		ChorStartReturnMessage returnMessage = new ChorStartReturnMessage();
		returnMessage.setChoreographyModelID(chorStartMessage.getChoreographyModelId());

		ChorInstanceInformation chorInstanceInformation = new ChorInstanceInformation();
		chorInstanceInformation.setChoreographyModelID(chorStartMessage.getChoreographyModelId());
		chorInstanceInformation.setChoreographyInstanceID(choreographyInstanceId.toString());
		chorInstanceInformation.setState(ChoreographyInstanceStates.CHOREOGRAPHY_INSTANCE_INITIALIZING);
		returnMessage.setChorInstance(chorInstanceInformation);

		messageProducer.sendMessage(returnMessage, (String) headers.get("JMSCorrelationID"), (String) headers.get("returnQueue"));

		return answer;
	}

	public Object controlChoreographyInstance(@Headers Map<String, Object> headers, @Body ChorControlMessage chorControlMessage) {

		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(chorControlMessage.getChoreographyInstanceID()));

		List<ProcessInstance> processInstances = eventRegistry.getParticipantsFromChoreographyInstance(choreographyInstance);

		List<DefaultMessage> answer = new ArrayList<DefaultMessage>();

		for (ProcessInstance processInstance : processInstances) {

			SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
			Collection<ServiceEndpointData> serviceEndpointDataList = managementRegistry.getServiceEndpointData(sceInstance);

			ServiceEndpointData serviceEndpointData = getInstanceManagmentServiceEndpoint(serviceEndpointDataList);

			DefaultMessage message = new DefaultMessage();

			message = configureMessageHeader(message, serviceEndpointData);
			message = configureMessagePayload(message, chorControlMessage.getMethod(), processInstance.getOdeProcessInstanceID().toString());
			answer.add(message);
		}

		return answer;
	}

	public GetChorInstancesReturnMessage getChoreographyInstances(@Headers Map<String, Object> headers, @Body GetChorInstancesMessage getChorInstancesMessage) {

		ChoreographyModel choreographyModel = eventRegistry.getChoreographyModel(getChorInstancesMessage.getChoreographyModelID());
		List<ChoreographyInstance> choreographyInstances = eventRegistry.getChoreographyInstances(choreographyModel);

		GetChorInstancesReturnMessage returnMessage = new GetChorInstancesReturnMessage();
		returnMessage.setChoreographyModelID(getChorInstancesMessage.getChoreographyModelID());

		for (ChoreographyInstance choreographyInstance : choreographyInstances) {

			ChorInstanceInformation information = new ChorInstanceInformation();
			information.setChoreographyModelID(getChorInstancesMessage.getChoreographyModelID());
			information.setChoreographyInstanceID(choreographyInstance.getChoreographyInstanceID().toString());
			information.setChoreographyModelName(choreographyModel.getModelQName());

			String s = choreographyInstance.getState().toString();
			information.setState(ChoreographyInstanceStates.fromValue(s));
			information.setTimestamp(choreographyInstance.getCreationTime().toString());
			returnMessage.getChorInstances().add(information);
		}

		return returnMessage;
	}
	
	// @yussupvr: get instance history for the given choreography 
	public GetChorInstanceHistoryReturnMessage getChoreographyInstanceHistory(@Headers Map<String, Object> headers, @Body GetChorInstanceHistoryMessage getChorInstanceHistoryMessage) {
		
		String chorInstanceID = getChorInstanceHistoryMessage.getChoreographyInstanceID();
		ChoreographyInstance chorInstance = eventRegistry.getChoreographyInstance(Long.parseLong(chorInstanceID));
		List<ProcessInstance> chorInstanceProcesses = eventRegistry.getParticipantsFromChoreographyInstance(chorInstance);
		List<MessageLinkInstance> msgLinksInstances = chorInstance.getMessageLinkInstances(); 
		
		GetChorInstanceHistoryReturnMessage returnMessage = new GetChorInstanceHistoryReturnMessage();
		returnMessage.setChorInstanceID(chorInstanceID);
		
		// get corresponding process instances
		for (ProcessInstance processInstance : chorInstanceProcesses) {
			ProcessInstanceHistoryOfChorInstance p = new ProcessInstanceHistoryOfChorInstance();
			p.setProcessInstanceID(processInstance.getCompositePrimaryKey().getProcessInstanceID());
			p.setProcessName(processInstance.getProcessModel().getModelQName());
			
			List<ProcessInstanceEvent> events = eventRegistry.getProcessInstanceEvents(processInstance);
			
			for (ProcessInstanceEvent event : events) {
				EventType eventType = new EventType();
				eventType.setEventID(event.getEventId());
				eventType.setEventType(event.getEventType());
				eventType.setState(event.getElementState());
				eventType.setSource(event.getElementXPath());
				eventType.setTimestamp(event.getTimestamp());
				eventType.setEventMessage(event.getEventMessageByteArray());
				p.getEvents().add(eventType);
			}
			
			returnMessage.getProcessInstance().add(p);
		}
		
		// get corresponding messageLink instances
		for (MessageLinkInstance msgLinkInstance : msgLinksInstances) {
			MessageLinkInstanceInformation ml = new MessageLinkInstanceInformation();
			ml.setChoreographyInstanceID(chorInstanceID);
			ml.setMessageLinkInstanceID(msgLinkInstance.getInstanceID());
			
			List<MessageLinkInstanceEvent> mlEvents = eventRegistry.getMessageLinkInstanceEvents(msgLinkInstance);
			for (MessageLinkInstanceEvent event: mlEvents) {
				MessageLinkInstanceEventType e = new MessageLinkInstanceEventType();
				e.setEventID(event.getEventId());
				e.setElementModelID(event.getElementModelID());
				e.setMessageID(event.getMessageID());
				
				String state = mapMessageLinkState(event.getState());
				e.setState(state);
				
				e.setTimestamp(event.getTimestamp());
				
				ml.getEvents().add(e);
				
			}
			
			returnMessage.getMessageLinkInstance().add(ml);
			
		}
		
		return returnMessage;
	} 

	public GetProcessInstancesReturnMessage getProcessInstances(@Headers Map<String, Object> headers, @Body GetProcessInstancesMessage getProcessInstancesMessage) {

		ProcessModel processModel = eventRegistry.getProcessModel(getProcessInstancesMessage.getProcessModelID());
		List<ProcessInstance> processInstances = eventRegistry.getProcessInstances(processModel);

		GetProcessInstancesReturnMessage returnMessage = new GetProcessInstancesReturnMessage();
		returnMessage.setProcessModelID(getProcessInstancesMessage.getProcessModelID());

		for (ProcessInstance processInstance : processInstances) {

			ProcessInstanceInformation information = new ProcessInstanceInformation();

			ChoreographyInstance choreographyInstance = processInstance.getChoreographyInstance();
			information.setChoreographyInstanceID(choreographyInstance.getChoreographyInstanceID().toString());
			ChoreographyModel choreographyModel = eventRegistry.getChoreographyModelOfChoreographyInstance(choreographyInstance);
			information.setProcessName(processModel.getModelQName());
			information.setChoreographyModelID(choreographyModel.getChoreographyModelId());
			information.setChoreographyModelName(choreographyModel.getModelQName());
			information.setProcessInstanceID(processInstance.getCompositePrimaryKey().getProcessInstanceID());
			information.setProcessModelID(getProcessInstancesMessage.getProcessModelID());
			information.setState(processInstance.getInstanceState().toString());
			information.setTimestamp(processInstance.getCreationTimestamp());
			information.setOdeProcessInstanceID(processInstance.getOdeProcessInstanceID());

			returnMessage.getProcessInstances().add(information);
		}

		return returnMessage;
	}

	public GetProcessInstanceHistoryReturnMessage getProcessInstanceHistory(@Headers Map<String, Object> headers, @Body GetProcessInstanceHistoryMessage getProcessInstanceHistoryMessage) {

		ProcessInstance processInstance = eventRegistry.getProcessInstance(getProcessInstanceHistoryMessage.getProcessInstanceID());
		ProcessModel processModel = eventRegistry.getProcessModelOfProcessInstance(processInstance);

		List<ProcessInstanceEvent> events = eventRegistry.getProcessInstanceEvents(processInstance);

		GetProcessInstanceHistoryReturnMessage returnMessage = new GetProcessInstanceHistoryReturnMessage();

		Set<String> ids = new HashSet<String>();

		returnMessage.setProcessInstanceID(getProcessInstanceHistoryMessage.getProcessInstanceID());
		returnMessage.setProcessName(processModel.getModelQName());

		for (ProcessInstanceEvent event : events) {

			if (event.getElementState() != null) {
				if (event instanceof ActivityInstanceEvent) {

					ActivityInstanceEvent activityInstanceEvent = (ActivityInstanceEvent) event;

					if (!ids.contains(activityInstanceEvent.getActivityInstance().getCompositePrimaryKey().getActivityInstanceID())) {
						ids.add(activityInstanceEvent.getActivityInstance().getCompositePrimaryKey().getActivityInstanceID());

						CurrentStateType currentStatesType = new CurrentStateType();

						currentStatesType.setInstanceID(activityInstanceEvent.getActivityInstance().getCompositePrimaryKey().getActivityInstanceID());
						currentStatesType.setState(activityInstanceEvent.getActivityInstance().getActivityState().name());
						returnMessage.getCurrentStates().add(currentStatesType);

					}

				}
				EventType eventType = new EventType();
				eventType.setEventID(event.getEventId());
				eventType.setEventType(event.getEventType());
				eventType.setState(event.getElementState());
				eventType.setSource(event.getElementXPath());
				eventType.setTimestamp(event.getTimestamp());
				eventType.setEventMessage(event.getEventMessageByteArray());

				returnMessage.getEvents().add(eventType);

				
			}
			else {
				
				if(event instanceof ProcessInstanceEvent){
					
					
					EventType eventType = new EventType();
					eventType.setEventID(event.getEventId());
					eventType.setEventType(event.getEventType());
					eventType.setState(event.getElementState());
					eventType.setSource(event.getElementXPath());
					eventType.setTimestamp(event.getTimestamp());
					eventType.setEventMessage(event.getEventMessageByteArray());

					returnMessage.getEvents().add(eventType);
					
					
				}
				
			}
			
			


		}

		return returnMessage;
	}

	public Object prepareChoreographyInstanceForIteration(@Body IterateChorInstanceMessage iterateChorInstanceMessage) {
		
		RepetitionManager repetitionManager = new RepetitionManager();
		ChorInstanceGraphEventMapper mapper = new ChorInstanceGraphEventMapper(eventRegistry);
		RepetitionMethodEnum repetitionMethod = null;
 
		byte[] choreographyModelFile = artifactRegistry.getChoreographyModelGraph(iterateChorInstanceMessage.getChoreographyModelID());
		Choreography choreography = EMFUtils.getChoreographyModel(choreographyModelFile);
		
		// @yussupvr: if iteration was triggered from the process level of view
		// prepare the iteration using the refined process model
		String currentView = iterateChorInstanceMessage.getView();
		if (currentView.equals(Constants.VIEW_LEVEL_PROCESS)) {
			
			// update the process model within the choreography
			
			String startParticipant = iterateChorInstanceMessage.getInitialStartParticipant();
			ProcessInstance processInstance = eventRegistry.getProcessInstance(startParticipant);
			ProcessModel processMId = eventRegistry.getProcessModelOfProcessInstance(processInstance);
			de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ProcessModel refinedProcessModel = artifactRegistry.getProcessModel(processMId.getModelId());
			byte[] refinedProcessModelFile = refinedProcessModel.getProcessModelFile();
			Process refinedProcess = EMFUtils.getRefinedProcess(refinedProcessModelFile);
			SequenceImpl main = null;
			if (refinedProcess.getActivity() instanceof SequenceImpl) {
				main = (SequenceImpl) refinedProcess.getActivity();
			}
			
			
			for (CParticipant participant : choreography.getParticipants()) {
				Process p = participant.getProcess();				
				if (p.getId().equals(refinedProcess.getId())) {
					participant.setProcess(refinedProcess);
					for (CMessageLink ml : choreography.getMessageLinks()) {
						Activity sendActivity = (Activity) ml.getSendActivity();
						Activity receiveActivity = (Activity) ml.getReceiveActivity();
						if (main != null) {
							for (Activity a : main.getActivity()) {
								String currentID = a.getId(); 
								if (currentID != null) {
									if (currentID.equals(sendActivity.getId())) {
										ml.setSendActivity((CLinkable) a);
									}
									if (currentID.equals(receiveActivity.getId())) {
										ml.setReceiveActivity((CLinkable) a);
									}									
								}								
							}
						}
					}
				}
			}
			
			for (CParticipantSet participantSet : choreography.getParticipantSets()) {
				if (participantSet.getProcess().getId().equals(refinedProcess.getId())) {
					participantSet.setProcess(refinedProcess);
				}
			}
		}
		
		
		choreography = mapper.fillChoreographyInstanceGraph(choreography, iterateChorInstanceMessage.getChoreographyInstanceID(), iterateChorInstanceMessage.getInitialStartParticipant(),
				iterateChorInstanceMessage.getInitialRewindingPoint());

		Result result = new Result();

		result = repetitionManager.determineRewindingPoints(choreography, mapper.getInitialParticipant(), mapper.getInitialRewindingPoint(), result);

		List<DefaultMessage> answer = new ArrayList<DefaultMessage>();
		Map<ProcessInstance, Tuple> rewindingPoints = new HashMap<ProcessInstance, Tuple>();

		for (Entry<String, ResultEntry> entry : result.getRewindingPointMap().entrySet()) {

			// TODO: does this work ?
			ProcessInstance processInstance = mapper.getProcessInstance(entry.getValue().getProcessInstance(), entry.getKey());

			List<ActivityInstance> activityInstances = new ArrayList<ActivityInstance>();

			for (Entry<Activity, String> activityInstanceEntry : entry.getValue().getActivityInstances().entrySet()) {

				ActivityInstance activityInstance = mapper.getActivityInstance(activityInstanceEntry.getKey().getId(), entry.getKey(), activityInstanceEntry.getValue());
				activityInstances.add(activityInstance);

			}

			Tuple tuple = new Tuple();
			tuple.setActivityInstances(activityInstances);
			tuple.setCompleteRewind(entry.getValue().isCompleteRewind());

			rewindingPoints.put(processInstance, tuple);

			SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
			Collection<ServiceEndpointData> serviceEndpointDataList = managementRegistry.getServiceEndpointData(sceInstance);

			ServiceEndpointData serviceEndpointData = getInstanceManagmentServiceEndpoint(serviceEndpointDataList);

			DefaultMessage message = new DefaultMessage();
			message = configureMessageHeader(message, serviceEndpointData);

			if (entry.getValue().isCompleteRewind() && iterateChorInstanceMessage.getMethod().equals(Constants.METHOD_PREPARE_ITERATE)) {
				message = configureMessagePayload(message, processInstance.getOdeProcessInstanceID(), activityInstances.get(0).getActivityXPath(), null,0, null, Constants.METHOD_RESET_AND_TERMINATE);
				repetitionMethod = RepetitionMethodEnum.Iteration;
			}
			else if(iterateChorInstanceMessage.getMethod().equals(Constants.METHOD_PREPARE_ITERATE)){
				message = configureMessagePayload(message, processInstance.getOdeProcessInstanceID(), activityInstances.get(0).getActivityXPath(), null,0, null, Constants.METHOD_PREPARE_ITERATE);
				repetitionMethod = RepetitionMethodEnum.Iteration;
			}

			else if (iterateChorInstanceMessage.getMethod().equals(Constants.METHOD_PREPARE_ITERATE_EXT)) {
				message = configureMessagePayload(message, processInstance.getOdeProcessInstanceID(), activityInstances.get(0).getActivityXPath(), iterateChorInstanceMessage.getSnapshotXPath(),Long.valueOf(iterateChorInstanceMessage.getSnapshotVersion()), iterateChorInstanceMessage.getVariables(), Constants.METHOD_PREPARE_ITERATE_EXT);
				repetitionMethod = RepetitionMethodEnum.IterationExt;			
			} else if (iterateChorInstanceMessage.getMethod().equals(Constants.METHOD_PREPARE_REEXECUTE)) {
				message = configureMessagePayload(message, processInstance.getOdeProcessInstanceID(), activityInstances.get(0).getActivityXPath(), iterateChorInstanceMessage.getSnapshotXPath(),Long.valueOf(iterateChorInstanceMessage.getSnapshotVersion()), null, Constants.METHOD_PREPARE_REEXECUTE);
				repetitionMethod = RepetitionMethodEnum.Reexecution;
			}
			else if(iterateChorInstanceMessage.getMethod().equals(Constants.METHOD_PREPARE_REEXECUTE_EXT)){
				message = configureMessagePayload(message, processInstance.getOdeProcessInstanceID(), activityInstances.get(0).getActivityXPath(), iterateChorInstanceMessage.getSnapshotXPath(),Long.valueOf(iterateChorInstanceMessage.getSnapshotVersion()), iterateChorInstanceMessage.getVariables(), Constants.METHOD_PREPARE_REEXECUTE);
				repetitionMethod = RepetitionMethodEnum.ReexecutionExt;
				
				
			}
			

			answer.add(message);
		}

		// Create and save iteration 
		//TODO: rename concept into repetition
		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(iterateChorInstanceMessage.getChoreographyInstanceID()));

		Process process = mapper.getInitialParticipant();
		ProcessInstance intialParticipant = mapper.getProcessInstance(process, process.getInstanceID());
		Activity activity = mapper.getInitialRewindingPoint();
		ActivityInstance initialRewindingPoint = mapper.getActivityInstance(activity.getId(), process.getInstanceID(), activity.getInstanceID());

		List<MessageLinkInstance> messageLinkInstances = new ArrayList<MessageLinkInstance>();

		for (Entry<CMessageLink, List<String>> entry : result.getMessageLinkInstances().entrySet()) {

			for (String instanceID : entry.getValue()) {

				MessageLinkInstance messageLinkInstance = mapper.getMessageLinkInstance(entry.getKey(), instanceID);
				messageLinkInstances.add(messageLinkInstance);
			}

		}

		eventRegistry.createIteration(UUID.randomUUID().toString(), repetitionMethod, initialRewindingPoint, intialParticipant, rewindingPoints, messageLinkInstances, choreographyInstance, currentView);

		return answer;
			
	}

	public Object resumeChoreographyInstanceForIteration(@Headers Map<String, Object> headers, @Body ChorIterationControlMessage chorIterationControlMessage) {
		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(chorIterationControlMessage.getChoreographyInstanceID()));

		Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);

		ProcessInstance processInstance = iteration.getInitialStartParticipant();

		SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
		SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
		Collection<ServiceEndpointData> serviceEndpointDataList = managementRegistry.getServiceEndpointData(sceInstance);

		ServiceEndpointData serviceEndpointData = getInstanceManagmentServiceEndpoint(serviceEndpointDataList);

		List<Element> elements = XMLFactory.instance().createXMLElementsList(Constants.METHOD_RESUME, processInstance.getOdeProcessInstanceID().toString());

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);

		headers.put(Exchange.DESTINATION_OVERRIDE_URL, serviceEndpointData.getEndpointURL());
		headers.put(CxfConstants.OPERATION_NAME, "Invoke");
		headers.put(CxfConstants.OPERATION_NAMESPACE, "http://camel.apache.org/cxf/jaxws/dispatch");
		headers.put("SOAPAction", "");

		return cxfPayload;

	}

	public Object getSnapshots(@Headers Map<String, Object> headers, @Body GetSnapshotsMessage getSnapshotsMessage) {

		ProcessInstance processInstance = eventRegistry.getProcessInstance(getSnapshotsMessage.getProcessInstanceID());
		
		DefaultMessage message = new DefaultMessage();
		SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
		SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
		Collection<ServiceEndpointData> serviceEndpointDataList = managementRegistry.getServiceEndpointData(sceInstance);

		ServiceEndpointData serviceEndpointData = getInstanceManagmentServiceEndpoint(serviceEndpointDataList);

		headers.put(Exchange.DESTINATION_OVERRIDE_URL, serviceEndpointData.getEndpointURL());
		message.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.apache.org/ode/pmapi");
		message.setHeader(CxfConstants.OPERATION_NAME, "getSnapshots");
		
		
		if(getSnapshotsMessage.getActivityXPath() == null){
			ActivityInstance activityInstance = eventRegistry.getActivityInstanceByElementModelID(getSnapshotsMessage.getElementModelID());
			getSnapshotsMessage.setActivityXPath(activityInstance.getActivityXPath());
			
		}
	
		List<Element> elements = XMLFactory.instance().createXMLElementsList(Constants.METHOD_GET_SNAPSHOTS, processInstance.getOdeProcessInstanceID(), getSnapshotsMessage.getActivityXPath());

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);

		
		return cxfPayload;
	}

	public Object getSnapshotVariables(@Headers Map<String, Object> headers, @Body GetSnapshotVariablesMessage getSnapshotVariablesMessage) {

		ProcessInstance processInstance = eventRegistry.getProcessInstance(getSnapshotVariablesMessage.getProcessInstanceID());
		
		DefaultMessage message = new DefaultMessage();
		SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
		SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
		Collection<ServiceEndpointData> serviceEndpointDataList = managementRegistry.getServiceEndpointData(sceInstance);

		ServiceEndpointData serviceEndpointData = getInstanceManagmentServiceEndpoint(serviceEndpointDataList);

		headers.put(Exchange.DESTINATION_OVERRIDE_URL, serviceEndpointData.getEndpointURL());
		message.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.apache.org/ode/pmapi");
		message.setHeader(CxfConstants.OPERATION_NAME, "getSnapshotVariables");
		
		
	
		List<Element> elements = XMLFactory.instance().createXMLElementsList(Constants.METHOD_GET_SNAPSHOT_VARIABLES, processInstance.getOdeProcessInstanceID(), getSnapshotVariablesMessage.getSnapshotID());

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);

		
		return cxfPayload;
	}
	
	
//	public Object registerBreakpoints(@Headers Map<String, Object> headers, @Body ChorRegisterRequestMessage chorRegisterRequestMessage){
//	
//		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(chorRegisterRequestMessage.getChoreographyInstanceID()));
//
//		List<ProcessInstance> processInstances = eventRegistry.getParticipantsFromChoreographyInstance(choreographyInstance);
//
//		List<DefaultMessage> answer = new ArrayList<DefaultMessage>();
//
//		for (ProcessInstance processInstance : processInstances) {
//
//			
//			SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
//			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
//		
//			DefaultMessage message = new DefaultMessage();
//			
//			RegisterRequestMessage registerRequestMessage = chorRegisterRequestMessage.getMessages().get(processInstance.getCompositePrimaryKey().getProcessInstanceID());
//
//			message.setBody(registerRequestMessage);
//		
//			answer.add(message);
//			message.setHeader(Constants.MANAGEMENT_QUEUE_HEADER, sceInstance.getManagementQueueEndpoint());
//			
//		}
//		
//		return answer;
//	}
	
	
	public Write_Variable transformChangeVariableValueMessage(@Headers Map<String, Object> headers, @Body ChangeVariableValueMessage changeVariableValueMessage){
		
		headers.put(Constants.PROCESS_INSTANCE_ID, changeVariableValueMessage.getProcessInstanceID());
		
		return changeVariableValueMessage.getVariable();
		
		
	}
	
	
	public Object splitChorRegisterRequestMessage(@Headers Map<String, Object> headers, @Body ChorRegisterRequestMessage chorRegisterRequestMessage){

		List<DefaultMessage> list = new ArrayList<DefaultMessage>();

		for(Entry<String, RegisterRequestMessage> entry : chorRegisterRequestMessage.getMessages().entrySet()){
			
		
			//TODO: set reply to
			
			DefaultMessage message = new DefaultMessage();
			
			
			message.setBody(entry.getValue(), RegisterRequestMessage.class);
			
			message.setHeader(Constants.PROCESS_INSTANCE_ID, entry.getKey());
			message.setHeader(Constants.NUMBER_OF_INVOCATIONS, (Integer)chorRegisterRequestMessage.getMessages().size());
			
			list.add(message);
			
		}
	
		return list;
	}
		
	public IncomingMessageBase transformIncomingEvent(@Headers Map<String, Object> headers, @Body IncomingEvent incomingEvent){


		headers.put(Constants.PROCESS_INSTANCE_ID, incomingEvent.getProcessInstanceID());
		return incomingEvent.getMessage();
	}
	
	
	
	public String getEventQueue(@Headers Map<String, Object> headers, @Header(Exchange.SLIP_ENDPOINT) String previous){
		
		if(previous == null){

			ProcessInstance processInstance = eventRegistry.getProcessInstance((String)headers.get(Constants.PROCESS_INSTANCE_ID));
			SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
			
			String eventQueueEndpoint = "activemq:queue:" + sceInstance.getManagementQueueEndpoint();
			
			return eventQueueEndpoint;
		}
		return null;
		
		
	}
	
	public String getEventQueue2(@Headers Map<String, Object> headers){
		
		invoked++;
		
		int numberOfInvocations = (Integer) headers.get(Constants.NUMBER_OF_INVOCATIONS);
	
		if(invoked <= numberOfInvocations){

			ProcessInstance processInstance = eventRegistry.getProcessInstance((String)headers.get(Constants.PROCESS_INSTANCE_ID));
			SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();
			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceRef.getSceInstanceId());
			
			String eventQueueEndpoint = "activemq:queue:" + sceInstance.getManagementQueueEndpoint();
			
			return eventQueueEndpoint;
		}
		
		invoked = 0;
		return null;
		
		
	}
	
	private Long createChoreographyInstanceID() {

		Random random = new Random();

		long choreographyInstanceId = 0L;

		while (choreographyInstanceId <= 0) {

			choreographyInstanceId = random.nextLong();
		}
		return Long.valueOf(choreographyInstanceId);

	}

	private ServiceEndpointData getInstanceManagmentServiceEndpoint(Collection<ServiceEndpointData> serviceEndpointDataList) {

		Iterator<ServiceEndpointData> iter = serviceEndpointDataList.iterator();

		while (iter.hasNext()) {

			ServiceEndpointData serviceEndpointData = iter.next();

			if (serviceEndpointData.getServiceName().equals(Constants.SERVICE_INSTANCE_MANAGEMENT)) {
				return serviceEndpointData;
			}

		}

		return null;
	}

	private DefaultMessage configureMessageHeader(DefaultMessage message, ServiceEndpointData serviceEndpointData) {

		message.setHeader(Exchange.DESTINATION_OVERRIDE_URL, serviceEndpointData.getEndpointURL());
		message.setHeader(CxfConstants.OPERATION_NAME, "Invoke");
		message.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://camel.apache.org/cxf/jaxws/dispatch");
		message.setHeader("SOAPAction", "");

		return message;
	}

	private DefaultMessage configureMessagePayload(DefaultMessage message, String method, String content) {

		List<Element> elements = XMLFactory.instance().createXMLElementsList(method, content);

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);
		message.setBody(cxfPayload, CxfPayload.class);

		return message;

	}

	private DefaultMessage configureMessagePayload(DefaultMessage message, long iid, String xpath, String snapshotXPath, long version, TVariableRefList list,  String method) {

		List<Element> elements = XMLFactory.instance().createXMLElementsListForRepetition(iid, xpath, snapshotXPath, version, list, method);

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);
		message.setBody(cxfPayload, CxfPayload.class);

		return message;

	}

	private DefaultMessage configureMessagePayload(DefaultMessage message, String content) {

		List<Element> elements = XMLFactory.instance().createXMLElementsList(content);

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);
		
		message.setBody(cxfPayload, CxfPayload.class);

		return message;

	}
	
	
	// @yussupvr: map MessageLinkInstanceStateEnum to a string value which will  be used
	// for for further processing in the ChorDesigner
	private String mapMessageLinkState(MessageLinkInstanceStateEnum stateEnum) {
		
		MessageLinkInstanceStateChangeEvent stateChangeEvent = null;
		
		if(stateEnum.equals(MessageLinkInstanceStateEnum.True)){
			stateChangeEvent = new MessageLink_Set_True();
		}
		else if(stateEnum.equals(MessageLinkInstanceStateEnum.False)){
			stateChangeEvent = new MessageLink_Set_False();
		}
		else if(stateEnum.equals(MessageLinkInstanceStateEnum.Evaluating)){
			stateChangeEvent = new MessageLink_Evaluating();
		}
		
		if (stateChangeEvent != null) {
			return stateChangeEvent.getClass().getSimpleName();
		}
		else 
			return "MessageLink_Unknown";
	}
	

}
