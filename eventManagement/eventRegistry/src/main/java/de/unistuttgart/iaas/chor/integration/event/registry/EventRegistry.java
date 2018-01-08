package de.unistuttgart.iaas.chor.integration.event.registry;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityTypeEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.InstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageExchangeEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.Correlation;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSet;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSetInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.Iteration;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.IterationEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.RepetitionMethodEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.RewindingPoints;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.RewindingPointsEntry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.util.Tuple;

/**
 * This EJB interface defines methods that have to be implemented by a Event
 * Registry. The Access Layer relies on this interface. An other Event Registry
 * can be integrated by substituting the implementation of this interface.
 * 
 * @author Michael Hahn
 * @author weissas
 * 
 */
public interface EventRegistry {

	public SCEInstanceRef getOrCreateSCEInstanceRef(String sceInstanceId);

	public SCEInstanceRef getSCEInstanceRef(String sceInstanceId);

	public ProcessModel getOrCreateProcessModel(String modelId, QName modelQName);
	public ProcessInstance getOrCreateProcessInstance(String sceInstanceID, String processModelID, Long processInstanceID, Long creationTimestamp);
	public ActivityInstance getOrCreateActivityInstance(SCEInstanceRef sceInstanceRef, ProcessInstance processInstanceID, String processModelID, Long scopeID, String scopeXPath, Long activityID, String activityXPath, Long timestamp, String elementModelID);
	public ChoreographyModel getOrCreateChoreographyModel(String choreographyModelId, QName modelQName);
	public ChoreographyInstance getOrCreateChoreographyInstance(String choreographyModelID, Long choreographyInstanceId);
	
	public ChoreographyInstance getOrCreateChoreographyInstance(Long choreographyInstanceId);
	
	public ProcessModel getProcessModel(String modelId);
	public ProcessInstance getProcessInstance(String instanceId);	
	public ChoreographyModel getChoreographyModel(String choreographyModelId);
	public ChoreographyInstance getChoreographyInstance(Long choreographyInstanceId);
	public List<ChoreographyInstance> getChoreographyInstances(ChoreographyModel choreographyModel);
	public List<ProcessInstance> getProcessInstances(ProcessModel processModel);
	
	
	public ChoreographyModel createChoreographyModel(String choreographyModelId, QName modelQName);
	public ChoreographyModel getChoreographyModelOfChoreographyInstance(ChoreographyInstance choreographyInstance);
	
	public MessageLink createMessageLink(String messageLinkID, String messageLinkName, String sendingProcessModelID, String receivingProcessModelID, String sendingActivityModelID, ActivityTypeEnum sendingActivityType, String receivingActivity, ActivityTypeEnum receivingActivityType );
	public void assignMessageLinkToChoreographyModel(ChoreographyModel choreographyModel, MessageLink messageLink);
	public List<MessageLink> getMessageLinks(String choreographyModelID, String activityModelID);
	public MessageLink getMessageLinkOfMessageLinkInstance(MessageLinkInstance messageLinkInstance);
	public MessageLink getOutgoingMessageLink(String choreographyModelID, String activityModelID);
	public MessageLink getIncomingMessageLink(String choreographyModelID, String activityModelID);
	
	
	
	public MessageLinkInstance getMessageLinkInstanceBySendingActivityInstance(ChoreographyInstance choreographyInstance, ActivityInstance sendingActivityInstance);
	public MessageLinkInstance getMessageLinkInstanceByReceivingActivityInstance(ChoreographyInstance choreographyInstance, ActivityInstance receivingActivityInstance);
	public List<MessageLinkInstance> getMessageLinkInstances(ChoreographyInstance choreographyInstance, ActivityInstance activityInstance);
	public MessageLinkInstance updateMessageLinkInstance(MessageLinkInstance messageLinkInstance, ProcessInstance sender, ProcessInstance receiver, ActivityInstance sendingActivityInstance, ActivityInstance receivingActivityInstance, MessageLinkInstanceStateEnum state);
	public MessageLinkInstance updateMessageLinkInstance(MessageLinkInstance messageLinkInstance);
	public MessageLinkInstance getMessageLinkInstanceByMessageID(ChoreographyInstance choreographyInstance, String messageID);
	public  List<MessageLinkInstance> getMessageLinkInstancesOfChoreographyModel(ChoreographyInstance choreographyInstance);
	
	
	public void assignMessageLinkInstanceToChoreographyInstance(ChoreographyInstance choreographyInstance, MessageLinkInstance messageLinkInstance);
	
	public MessageLinkInstance createMessageLinkInstance(MessageLink messageLink, ProcessInstance sender, ProcessInstance receiver, ActivityInstance sendingActivityInstance, ActivityInstance receivingActivityInstance, String messageID, MessageLinkInstanceStateEnum state);
	
	public SCEInstanceRef removeSCEInstanceRef(SCEInstanceRef sceInstance);
	public SCEInstanceRef removeSCEInstanceRef(String sceInstanceId);
	public ProcessModel removeProcessModel(String modelId);

	public ProcessModel removeProcessModel(ProcessModel processModel);
	public ProcessInstance removeProcessInstance(String instanceId);
	public ProcessInstance removeProcessInstance(ProcessInstance processInstance);
	public ChoreographyModel removeChoreographyModel(ChoreographyModel choreographyModel);
	public ChoreographyModel removeChoreographyModel(String choreographyModelId);
		
	public void assignProcessModel(SCEInstanceRef sceInstance, ProcessModel model);
	public void assignPackageNameToProcessModel(QName modelQName, String packageName);
	public void assignProcessInstance(SCEInstanceRef sceInstance, ProcessModel model, ProcessInstance instance);

	public void unassignProcessModel(String sceInstanceId, String modelId);
	public void unassignProcessInstance(String sceInstanceId, ProcessInstance processInstance);

	public ProcessEvent registerProcessEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, ProcessModel processModel, Long processVersion);
	public ProcessInstanceEvent registerProcessInstanceEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, ProcessInstance processInstance, String details);
	public ActivityInstanceEvent registerActivityInstanceEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, String elementXPath, String state, ProcessInstance processInstance, String details, ActivityInstance activityInstance);
	public ChoreographyInstanceEvent registerChoreographyInstanceEvent(ChoreographyInstance chorInstance, String eventType, Long timestamp, int numInitializing, int numRunning, int numSuspended, int numTerminated, int numFaulted, int numCompleted);
	public MessageExchangeEvent registerMessageExchangeEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, String elementXPath, String state, ProcessInstance processInstance, String details, ActivityInstance activityInstance, String messageID, String direction);
	
	public void changeProcessModelStatus(String modelId, ProcessStateEnum state);

	public void changeProcessInstanceStatus(String sceInstanceID, String processModelID, Long processInstanceID, InstanceStateEnum state);
	public void changeActivityInstanceStatus(ActivityInstance activityInstance, ActivityInstanceStateEnum state);
	public void changeChoreographyModelStatus(String choreographyModelId, ChoreographyStateEnum state);
	public void changeChoreographyInstanceStatus(Long choreographyInstanceId, ChoreographyInstanceStateEnum state);
	
	public String getSCEInstanceOfProcessInstance(String instanceId);
	
	public Collection<String> getSCEInstanceOfProcessModel(String modelId);
	
	public Collection<ChoreographyModel> getChoreographyModelsOfProcessModel(ProcessModel processModel);
	
	public Collection<ProcessModel> getProcessModelsOfChoreographyModel(String choreographyModelId);

	public void assignProcessModelToChoreographyModel(ChoreographyModel choreographyModel, ProcessModel processModel);
	
	public Collection<String> getSCEInstanceOfChoreographyModel(String choreographyModelId);
	
	public Collection<SCEEvent> getSCEEvents(SCEInstanceRef sceInstance);
	
	public void addParticipantToChoreographyInstance(ProcessInstance processInstance, ChoreographyInstance chorInstance);
	
	public List<ProcessInstance> getParticipantsFromChoreographyInstance(ChoreographyInstance chorInstance);
	
	public ActivityInstanceStateEnum getActivityStateByUUID(String uuid);
	
	public List<ActivityInstance> getActivityInstancesOfProcessInstance(ProcessInstance processInstance);
	
	public ProcessModel getProcessModelOfProcessInstance(ProcessInstance processInstance);
	
	public Collection<ProcessInstanceEvent> getProcessInstanceEvents(ProcessInstance processInstance);
	

	//=========================================================================================================
	// Iteration related methods
	//=========================================================================================================
	
	public Iteration createIteration(String iterationID, RepetitionMethodEnum repetitionMethod, ActivityInstance initialRewindingPoint, ProcessInstance initialStartParticipant, Map<ProcessInstance, Tuple> rewindingPointMap, List<MessageLinkInstance> messageLinkInstances, ChoreographyInstance choreographyInstance);
	
	public Iteration getLastestIteration(ChoreographyInstance choreographyInstance);
	
	public boolean allParticipantInstancesPreparedForIteration(ChoreographyInstance choreographyInstance);
	
	public IterationEvent registerIterationEvent(Iteration iteration, SCEInstanceRef sceInstance, ProcessInstance processInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, String details);
		
	public List<RewindingPointsEntry> getRewindingPointEntries(RewindingPoints rewindingPoints);
	
	public ProcessInstance getOldestUnRepeatedProcessInstance(ProcessModel processModel, RewindingPoints rewindingPoints);
	
	public void updateIteration(Iteration iteration, ProcessInstance processInstance);
	
	//=========================================================================================================
	// Correlation related methods
	//=========================================================================================================
	
	public CorrelationSet createCorrelationSet(ProcessModel processModel, String name, List<String> properties);
	
	public Correlation createCorrelation(CorrelationSet correlationSet, String activityModelID, String initiate, String pattern, QName messageType, String part, String query);
	
	public MessageExchangeEvent getMessageExchangeEvent(String messageID, String direction);
	
	public Correlation getCorrelation(String activityModelID);
	
	public Correlation getCorrelation(QName message);
	
//	public CorrelationInstance getOrCreateCorrelationInstance(Correlation correlation, String propertyValue, ActivityInstance activityInstance, ProcessInstance processInstance);
//	
//	public CorrelationInstance getCorrelationInstance(Correlation correlation, String propertyValue);
	
	public CorrelationSetInstance getOrCreateCorrelationSetInstance(CorrelationSet correlationSet, String propertyValue, ProcessInstance processInstance);
	
	public CorrelationSetInstance getCorrelationSetInstance(CorrelationSet correlationSet, String propertyValue);
	
	
	//=========================================================================================================
	// Loop iteration related methods
	//=========================================================================================================
	
	public List<ActivityInstanceEvent> getLoopIterationCompleteEvents(String activityInstanceID, boolean ordered);
	
	public Long countLoopIterationCompleteEvents(String activityInstanceID);
	
}
