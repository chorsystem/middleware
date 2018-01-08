package de.unistuttgart.iaas.chor.integration.event.registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.xml.namespace.QName;

import org.springframework.transaction.annotation.Transactional;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstancePK;
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
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstancePK;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModelSCEInstanceRef;
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
 * Default implementation for the Event Registry. (Changed implementation to
 * enabled deployment in ServiceMix as a spring bundle.)
 * 
 * @author hahnml
 * @author weissas
 * 
 */
@Transactional
public class EventRegistryService implements EventRegistry {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public SCEInstanceRef getOrCreateSCEInstanceRef(String sceInstanceId) {
		SCEInstanceRef sceInstance = em.find(SCEInstanceRef.class, sceInstanceId);

		if (sceInstance == null) {
			sceInstance = new SCEInstanceRef();
			sceInstance.setSceInstanceId(sceInstanceId);
			em.persist(sceInstance);
		}

		return sceInstance;
	}

	public ChoreographyInstance getOrCreateChoreographyInstance(String choreographyModelID, Long choreographyInstanceId, Long instanceWaitingTime) {
		ChoreographyInstance chorInstance = em.find(ChoreographyInstance.class, choreographyInstanceId);

		ChoreographyModel choreographyModel = em.find(ChoreographyModel.class, choreographyModelID);

		if (chorInstance == null && choreographyModel != null) {
			chorInstance = new ChoreographyInstance();
			chorInstance.setChoreographyInstanceID(choreographyInstanceId);
			chorInstance.setChoreographyModel(choreographyModel);
			chorInstance.setCreationTime(System.currentTimeMillis());
			chorInstance.setInstanceWaitingTime(instanceWaitingTime);
			em.persist(chorInstance);

			choreographyModel.getChoreographyInstances().add(chorInstance);
			em.persist(choreographyModel);

		}

		return chorInstance;
	}

	public ChoreographyInstance getOrCreateChoreographyInstance(Long choreographyInstanceId) {
		ChoreographyInstance chorInstance = em.find(ChoreographyInstance.class, choreographyInstanceId);

		if (chorInstance == null) {
			chorInstance = new ChoreographyInstance();
			chorInstance.setChoreographyInstanceID(choreographyInstanceId);
			em.persist(chorInstance);
		}

		return chorInstance;
	}

	public SCEInstanceRef getSCEInstanceRef(String sceInstanceId) {
		SCEInstanceRef sceInstance = null;

		if (sceInstanceId != null) {
			sceInstance = em.find(SCEInstanceRef.class, sceInstanceId);
		}

		return sceInstance;
	}

	public ChoreographyInstance getChoreographyInstance(Long choreographyInstanceId) {
		ChoreographyInstance chorInstance = null;

		if (choreographyInstanceId != null) {
			chorInstance = em.find(ChoreographyInstance.class, choreographyInstanceId);
		}

		return chorInstance;
	}

	public SCEInstanceRef removeSCEInstanceRef(String sceInstanceId) {
		SCEInstanceRef sceInstance = getSCEInstanceRef(sceInstanceId);

		return removeSCEInstanceRef(sceInstance);
	}

	public SCEInstanceRef removeSCEInstanceRef(SCEInstanceRef sceInstance) {
		if (sceInstance != null) {
			em.remove(sceInstance);
		}

		return sceInstance;
	}

	public ProcessModel getOrCreateProcessModel(String modelId, QName modelQName) {
		ProcessModel processModel = em.find(ProcessModel.class, modelId);

		if (processModel == null) {
			processModel = new ProcessModel();
			processModel.setModelId(modelId);
			processModel.setModelQName(modelQName);
			processModel.setProcessState(ProcessStateEnum.Process_Undeployed);

			em.persist(processModel);
		}

		return processModel;
	}

	public ProcessModel getProcessModel(String modelId) {
		ProcessModel processModel = null;

		if (modelId != null) {
			processModel = em.find(ProcessModel.class, modelId);
		}

		return processModel;
	}

	public void assignProcessModel(SCEInstanceRef sceInstance, ProcessModel model) {
		if (sceInstance == null || model == null) {
			throw new IllegalArgumentException();
		}

		// Attach the entity to the current session by reloading it
		sceInstance = em.find(SCEInstanceRef.class, sceInstance.getSceInstanceId());
		// Attach the entity to the current session by reloading it
		model = em.find(ProcessModel.class, model.getModelId());

		if (model != null && sceInstance != null) {
			// Check if the SCE instance and the process model are already
			// referenced

			List<ProcessModelSCEInstanceRef> processModelSCEInstanceRefs = model.getProcessModelSCEInstanceRefs();

			boolean assigned = false;
			for (ProcessModelSCEInstanceRef ref : processModelSCEInstanceRefs) {

				if (ref.getSceInstanceRef() != null && ref.getSceInstanceRef().equals(sceInstance)) {

					assigned = true;
					break;
				}

			}
			if (!assigned) {

				ProcessModelSCEInstanceRef ref = new ProcessModelSCEInstanceRef();
				ref.setProcessModel(model);
				ref.setSceInstanceRef(sceInstance);

				sceInstance.getProcessModelSCEInstanceRefs().add(ref);
				model.getProcessModelSCEInstanceRefs().add(ref);

			}
		}
	}

	public void assignProcessModel(SCEInstanceRef sceInstance, ProcessModel model, QName odePackageName) {
		if (sceInstance == null || model == null) {
			throw new IllegalArgumentException();
		}

		// Attach the entity to the current session by reloading it
		sceInstance = em.find(SCEInstanceRef.class, sceInstance.getSceInstanceId());
		// Attach the entity to the current session by reloading it
		model = em.find(ProcessModel.class, model.getModelId());

		if (model != null && sceInstance != null) {
			// Check if the SCE instance and the process model are already
			// referenced

			List<ProcessModelSCEInstanceRef> processModelSCEInstanceRefs = model.getProcessModelSCEInstanceRefs();

			boolean assigned = false;
			for (ProcessModelSCEInstanceRef ref : processModelSCEInstanceRefs) {

				if (ref.getSceInstanceRef() != null && ref.getSceInstanceRef().equals(sceInstance)) {
					ref.setOdePackageName(odePackageName.getLocalPart());
					assigned = true;
					break;
				}

			}
			if (!assigned) {

				ProcessModelSCEInstanceRef ref = new ProcessModelSCEInstanceRef();
				ref.setProcessModel(model);
				ref.setSceInstanceRef(sceInstance);
				ref.setOdePackageName(odePackageName.getLocalPart());

				sceInstance.getProcessModelSCEInstanceRefs().add(ref);
				model.getProcessModelSCEInstanceRefs().add(ref);

			}
		}
	}

	@Override
	public void unassignProcessModel(String sceInstanceId, String modelId) {
		if (sceInstanceId == null || modelId == null) {
			throw new IllegalArgumentException();
		}

		// Attach the entity to the current session by reloading it
		SCEInstanceRef sceInstance = em.find(SCEInstanceRef.class, sceInstanceId);
		// Attach the entity to the current session by reloading it
		ProcessModel model = em.find(ProcessModel.class, modelId);

		// Check if the SCE instance and the process model are already
		// de-referenced
		// if (sceInstance.getProcessModels().contains(model)) {
		// sceInstance.getProcessModels().remove(model);
		// model.getSceInstanceRefs().remove(sceInstance);
		// }

		if (model != null) {
			// Remove also all references between any process instances of the
			// model
			// and the SCE instance
			for (ProcessInstance instance : model.getProcessInstances()) {
				if (instance.getSceInstanceRef().equals(sceInstance)) {
					unassignProcessInstance(sceInstanceId, instance);
				}
			}
		}
	}

	public ProcessModel removeProcessModel(String modelId) {
		ProcessModel processModel = getProcessModel(modelId);

		return removeProcessModel(processModel);
	}

	public ProcessModel removeProcessModel(ProcessModel processModel) {

		if (processModel != null) {
			// Attach the entity to the current session by reloading it
			processModel = em.find(ProcessModel.class, processModel.getModelId());

			if (processModel != null) {
				em.remove(processModel);
			}
		}

		return processModel;
	}

	public ProcessInstance getOrCreateProcessInstance(String sceInstanceID, String processModelID, Long odeProcessInstanceID, Long creationTimestamp) {

		try {

			// SCEInstanceRef instanceRef = em.find(SCEInstanceRef.class,
			// sceInstanceID);
			// ProcessModel processModel = em.find(ProcessModel.class,
			// processModelID);
			//
			ProcessInstancePK pk = new ProcessInstancePK(sceInstanceID, processModelID, odeProcessInstanceID);

			// ProcessInstancePK pk = new ProcessInstancePK(sceInstanceID,
			// processModelID, processInstanceID);
			ProcessInstance processInstance = em.find(ProcessInstance.class, pk);

			if (processInstance == null) {
				processInstance = new ProcessInstance();
				processInstance.setCompositePrimaryKey(pk);
				processInstance.setInstanceState(InstanceStateEnum.Instance_Initializing);
				processInstance.setCreationTimestamp(creationTimestamp);
				processInstance.setOdeProcessInstanceID(odeProcessInstanceID);
				em.persist(processInstance);
			}
			return processInstance;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ProcessInstance getProcessInstance(String instanceId) {
		ProcessInstance processInstance = null;

		ProcessInstancePK pk = new ProcessInstancePK();
		pk.setProcessInstanceID(instanceId);
		processInstance = em.find(ProcessInstance.class, pk);

		return processInstance;
	}

	public void assignProcessInstance(SCEInstanceRef sceInstance, ProcessModel model, ProcessInstance instance) {
		if (sceInstance == null || model == null || instance == null) {
			throw new IllegalArgumentException();
		}

		// Attach the entity to the current session by reloading it
		sceInstance = em.find(SCEInstanceRef.class, sceInstance.getSceInstanceId());
		// Attach the entity to the current session by reloading it
		model = em.find(ProcessModel.class, model.getModelId());
		// Attach the entity to the current session by reloading it
		instance = em.find(ProcessInstance.class, instance.getCompositePrimaryKey());

		if (model != null && instance != null) {
			// Assign the process instance to the process model
			model.getProcessInstances().add(instance);
			instance.setProcessModel(model);
		}

		if (instance != null) {
			// Assign the process instance to the SCE instance
			sceInstance.getProcessInstances().add(instance);
			instance.setSceInstanceRef(sceInstance);
		}
	}

	@Override
	public void unassignProcessInstance(String sceInstanceId, ProcessInstance processInstance) {
		if (sceInstanceId == null || processInstance == null) {
			throw new IllegalArgumentException();
		}

		// Attach the entity to the current session by reloading it
		SCEInstanceRef sceInstance = em.find(SCEInstanceRef.class, sceInstanceId);
		// Attach the entity to the current session by reloading it
		ProcessInstance instance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());

		if (instance != null) {
			// Unassign the process instance from the SCE instance
			sceInstance.getProcessInstances().remove(instance);
			instance.setSceInstanceRef(null);
		}
	}

	public ProcessInstance removeProcessInstance(String instanceId) {
		ProcessInstance processInstance = getProcessInstance(instanceId);

		return removeProcessInstance(processInstance);
	}

	public ProcessInstance removeProcessInstance(ProcessInstance processInstance) {

		if (processInstance != null) {
			// Attach the entity to the current session by reloading it
			processInstance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());

			if (processInstance != null) {
				em.remove(processInstance);
			}
		}

		return processInstance;
	}

	//
	// public ActivityInstance
	// getOrCreateActivityInstanceByCompositeKey(ProcessInstance
	// processInstance, Long scopeID, String scopeXPath, Long activityID, String
	// activityXPath) {
	// TypedQuery<ActivityInstance> q1 =
	// em.createQuery("SELECT a FROM ActivityInstance a WHERE (a.processInstance = :procInstance) AND (a.scopeID = :scopeID OR a.scopeID IS NULL) AND (a.scopeXPath = :scopeXPath OR a.scopeXPath IS NULL) AND (a.activityID = :activityID OR a.activityID IS NULL) AND (a.activityXPath = :activityXPath OR a.activityXPath IS NULL)",
	// ActivityInstance.class);
	// q1.setParameter("procInstance", processInstance);
	// q1.setParameter("scopeID", scopeID);
	// q1.setParameter("scopeXPath", scopeXPath);
	// q1.setParameter("activityID", activityID);
	// q1.setParameter("activityXPath", activityXPath);
	//
	// List<ActivityInstance> results = q1.getResultList();
	// ActivityInstance activityInstance = null;
	// if (!results.isEmpty()) {
	// activityInstance = results.get(0);
	// } else {
	// activityInstance = new ActivityInstance();
	// activityInstance.setScopeID(scopeID);
	// activityInstance.setScopeXPath(scopeXPath);
	// activityInstance.setActivityID(activityID);
	// activityInstance.setActivityXPath(activityXPath);
	// activityInstance.setProcessInstance(processInstance);
	// em.persist(activityInstance);
	// }
	//
	// return activityInstance;
	// }

	// public ActivityInstance getOrCreateActivityInstance(SCEInstanceRef
	// sceInstanceRef, ProcessInstance processInstance, String processModelID,
	// Long scopeID, String scopeXPath, Long activityID, String activityXPath) {
	//
	// ProcessModel processModel = em.find(ProcessModel.class, processModelID);
	//
	// ActivityInstancePK activityInstancePK = new
	// ActivityInstancePK(sceInstanceRef, processModel, processInstance,
	// activityID);
	//
	// ActivityInstance activityInstance = em.find(ActivityInstance.class,
	// activityInstancePK);
	//
	// if(activityInstance == null){
	//
	// activityInstance = new ActivityInstance();
	// activityInstance.setCompositePrimaryKey(activityInstancePK);
	// activityInstance.setScopeID(scopeID);
	// activityInstance.setScopeXPath(scopeXPath);
	// activityInstance.setActivityID(activityID);
	// activityInstance.setActivityXPath(activityXPath);
	// em.persist(activityInstance);
	//
	// }
	// return activityInstance;
	// }

	public ActivityInstance getOrCreateActivityInstance(SCEInstanceRef sceInstanceRef, ProcessInstance processInstance, String processModelID, Long scopeID, String scopeXPath, Long activityID,
			String activityXPath, Long timestamp, String elementModelID) {

		// ProcessModel processModel = em.find(ProcessModel.class,
		// processModelID);

		ActivityInstancePK activityInstancePK = new ActivityInstancePK(sceInstanceRef.getSceInstanceId(), processModelID, processInstance.getCompositePrimaryKey().getProcessInstanceID(), activityID);

		ActivityInstance activityInstance = em.find(ActivityInstance.class, activityInstancePK);

		if (activityInstance == null) {

			activityInstance = new ActivityInstance();
			activityInstance.setCompositePrimaryKey(activityInstancePK);

			activityInstance.setSceInstanceRef(sceInstanceRef);
			activityInstance.setProcessInstance(processInstance);

			activityInstance.setTimestamp(timestamp);
			activityInstance.setScopeID(scopeID);
			activityInstance.setScopeXPath(scopeXPath);
			activityInstance.setOdeActivityInstanceID(activityID);
			activityInstance.setActivityXPath(activityXPath);
			activityInstance.setElementModelID(elementModelID);

			em.persist(activityInstance);

		}
		return activityInstance;
	}

	private void fillSCEEvent(SCEEvent evt, SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp) {
		sceInstance = em.find(SCEInstanceRef.class, sceInstance.getSceInstanceId());
		evt.setSceInstanceRef(sceInstance);

		evt.setEventType(eventType);
		evt.setEventMessageId(eventMessageId);
		evt.setEventMessage(eventMessage);
		evt.setTimestamp(timestamp);
	}

	private void fillProcessEvent(ProcessEvent evt, ProcessModel processModel, Long processVersion) {
		processModel = em.find(ProcessModel.class, processModel);
		evt.setProcessModel(processModel);

		evt.setVersion(processVersion);
	}

	private void fillProcessInstanceEvent(ProcessInstanceEvent evt, ProcessInstance processInstance, String messageDetails) {

		try {

			evt.setProcessInstance(processInstance);
			evt.setDetails(messageDetails);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void fillActivityInstanceEvent(ActivityInstanceEvent evt, ActivityInstance activityInstance, String elementXPath, String state) {

		evt.setElementState(state);
		evt.setElementXPath(elementXPath);

		evt.setActivityInstance(activityInstance);
	}

	public ProcessEvent registerProcessEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, ProcessModel processModel, Long processVersion) {
		ProcessEvent evt = new ProcessEvent();

		fillSCEEvent(evt, sceInstance, eventType, eventMessageId, eventMessage, timestamp);
		fillProcessEvent(evt, processModel, processVersion);

		em.persist(evt);

		return evt;
	}

	@Override
	public ChoreographyInstanceEvent registerChoreographyInstanceEvent(ChoreographyInstance chorInstance, String eventType, Long timestamp, int numInitializing, int numRunning, int numSuspended,
			int numTerminated, int numFaulted, int numCompleted) {
		ChoreographyInstanceEvent evt = new ChoreographyInstanceEvent();

		chorInstance = em.find(ChoreographyInstance.class, chorInstance.getChoreographyInstanceID());
		evt.setChorInstance(chorInstance);

		evt.setEventType(eventType);
		evt.setTimestamp(timestamp);

		evt.setNumInitializing(numInitializing);
		evt.setNumRunning(numRunning);
		evt.setNumSuspended(numSuspended);
		evt.setNumTerminated(numTerminated);
		evt.setNumFaulted(numFaulted);
		evt.setNumCompleted(numCompleted);

		em.persist(evt);

		return evt;
	}

	@Override
	public ProcessInstanceEvent registerProcessInstanceEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, ProcessInstance processInstance,
			String details) {

		ProcessInstanceEvent evt = new ProcessInstanceEvent();
		fillSCEEvent(evt, sceInstance, eventType, eventMessageId, eventMessage, timestamp);
		fillProcessInstanceEvent(evt, processInstance, details);

		em.persist(evt);

		return evt;
	}
	
	@Override
	public MessageLinkInstanceEvent registerMessageLinkInstanceStateChangeEvent(String chorInstanceID, String elementModelID, MessageLinkInstance messageLinkInstance) {
		
		MessageLinkInstanceEvent evt = new MessageLinkInstanceEvent();
		evt.setMessageLinkInstance(messageLinkInstance);
		evt.setChoreographyInstanceID(chorInstanceID);
		evt.setElementModelID(elementModelID);
		evt.setMessageID(messageLinkInstance.getMessageID());
		evt.setTimestamp(messageLinkInstance.getTimestamp());
		evt.setState(messageLinkInstance.getState());
		em.persist(evt);
		
		return evt;
	}
	
	@Override
	public List<MessageLinkInstanceEvent> getMessageLinkInstanceEvents(MessageLinkInstance messageLinkInstance) {
		
		TypedQuery<MessageLinkInstanceEvent> q1 = em.createQuery("SELECT m FROM MessageLinkInstanceEvent m WHERE (m.messageLinkInstance.instanceID = :id)", MessageLinkInstanceEvent.class);
		q1.setParameter("id", messageLinkInstance.getInstanceID());
		List<MessageLinkInstanceEvent> result = q1.getResultList();
		
		return result;
	}


	@Override
	public ActivityInstanceEvent registerActivityInstanceEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, String elementXPath,
			String state, ProcessInstance processInstance, String details, ActivityInstance activityInstance) {
		ActivityInstanceEvent evt = new ActivityInstanceEvent();

		fillSCEEvent(evt, sceInstance, eventType, eventMessageId, eventMessage, timestamp);
		fillProcessInstanceEvent(evt, processInstance, details);
		fillActivityInstanceEvent(evt, activityInstance, elementXPath, state);

		em.persist(evt);

		return evt;
	}

	@Override
	public MessageExchangeEvent registerMessageExchangeEvent(SCEInstanceRef sceInstance, String eventType, Long eventMessageId, Object eventMessage, Long timestamp, String elementXPath, String state,
			ProcessInstance processInstance, String details, ActivityInstance activityInstance, String messageID, String direction) {
		MessageExchangeEvent evt = new MessageExchangeEvent();

		fillSCEEvent(evt, sceInstance, eventType, eventMessageId, eventMessage, timestamp);
		fillProcessInstanceEvent(evt, processInstance, details);
		fillActivityInstanceEvent(evt, activityInstance, elementXPath, state);

		evt.setMessageID(messageID);
		evt.setDirection(direction);

		em.persist(evt);

		return evt;
	}

	public Collection<SCEEvent> getSCEEvents(SCEInstanceRef sceInstance) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public void changeProcessModelStatus(String modelId, ProcessStateEnum state) {
		ProcessModel processModel = null;

		if (modelId != null) {
			processModel = em.find(ProcessModel.class, modelId);
		}

		if (processModel != null)
			processModel.setProcessState(state);

		em.persist(processModel);
	}

	@Override
	public void changeProcessInstanceStatus(String sceInstanceID, String processModelID, Long processInstanceID, InstanceStateEnum state) {

		// SCEInstanceRef instanceRef = em.find(SCEInstanceRef.class,
		// sceInstanceID);
		// ProcessModel processModel = em.find(ProcessModel.class,
		// processModelID);

		ProcessInstancePK pk = new ProcessInstancePK(sceInstanceID, processModelID, processInstanceID);

		ProcessInstance processInstance = em.find(ProcessInstance.class, pk);

		if (processInstance != null)
			processInstance.setInstanceState(state);

		em.persist(processInstance);
	}

	@Override
	public void changeActivityInstanceStatus(ActivityInstance activityInstance, ActivityInstanceStateEnum state) {

		try {
			activityInstance = em.find(ActivityInstance.class, activityInstance.getCompositePrimaryKey());

			if (activityInstance != null) {
				activityInstance.setActivityState(state);
			}

			em.persist(activityInstance);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void changeChoreographyInstanceStatus(Long choreographyInstanceId, ChoreographyInstanceStateEnum state) {
		ChoreographyInstance chorInstance = null;

		if (choreographyInstanceId != null) {
			chorInstance = em.find(ChoreographyInstance.class, choreographyInstanceId);
		}

		if (chorInstance != null) {
			chorInstance.setState(state);
		}

		em.persist(chorInstance);
	}

	@Override
	public String getSCEInstanceOfProcessInstance(String instanceId) {
		String sceInstanceId = null;

		if (instanceId != null) {
			ProcessInstancePK pk = new ProcessInstancePK();
			pk.setProcessInstanceID(instanceId);

			ProcessInstance processInstance = em.find(ProcessInstance.class, pk);

			if (processInstance != null) {
				SCEInstanceRef instance = processInstance.getSceInstanceRef();

				if (instance != null) {
					sceInstanceId = instance.getSceInstanceId();
				}
			}
		}

		return sceInstanceId;
	}

	@Override
	public Collection<String> getSCEInstanceOfProcessModel(String modelId) {
		Collection<String> sceInstanceIds = new ArrayList<String>();

		if (modelId != null) {
			ProcessModel processModel = em.find(ProcessModel.class, modelId);

			if (processModel != null) {
				Collection<ProcessModelSCEInstanceRef> refs = processModel.getProcessModelSCEInstanceRefs();

				if (refs != null) {
					for (ProcessModelSCEInstanceRef ref : refs) {
						sceInstanceIds.add(ref.getSceInstanceRef().getSceInstanceId());
					}
				}
			}
		}

		return sceInstanceIds;
	}

	@Override
	public ChoreographyModel getOrCreateChoreographyModel(String choreographyModelId, QName modelQName) {

		ChoreographyModel choreographyModel = em.find(ChoreographyModel.class, choreographyModelId);

		if (choreographyModel == null) {
			choreographyModel = new ChoreographyModel();
			choreographyModel.setChoreographyModelId(choreographyModelId);
			choreographyModel.setModelQName(modelQName);

			em.persist(choreographyModel);
		}

		return choreographyModel;
	}

	@Override
	public ChoreographyModel createChoreographyModel(String choreographyModelId, QName modelQName) {
		ChoreographyModel choreographyModel = new ChoreographyModel();
		choreographyModel.setChoreographyModelId(choreographyModelId);
		choreographyModel.setModelQName(modelQName);

		em.persist(choreographyModel);

		return choreographyModel;
	}

	@Override
	public ChoreographyModel getChoreographyModel(String choreographyModelId) {
		ChoreographyModel choreographyModel = null;

		if (choreographyModelId != null) {
			choreographyModel = em.find(ChoreographyModel.class, choreographyModelId);
		}

		return choreographyModel;
	}

	@Override
	public ChoreographyModel removeChoreographyModel(String choreographyModelId) {
		ChoreographyModel choreographyModel = getChoreographyModel(choreographyModelId);

		return removeChoreographyModel(choreographyModel);

	}

	@Override
	public ChoreographyModel removeChoreographyModel(ChoreographyModel choreographyModel) {
		if (choreographyModel != null) {
			// Attach the entity to the current session by reloading it
			choreographyModel = em.find(ChoreographyModel.class, choreographyModel.getChoreographyModelId());

			if (choreographyModel != null) {
				em.remove(choreographyModel);
			}
		}

		return choreographyModel;

	}

	@Override
	public Collection<ProcessModel> getProcessModelsOfChoreographyModel(String choreographyModelId) {

		ChoreographyModel choreographyModel = null;

		if (choreographyModelId != null) {
			choreographyModel = em.find(ChoreographyModel.class, choreographyModelId);

		}

		Collection<ProcessModel> processModels = new ArrayList<ProcessModel>();

		if (choreographyModel != null) {

			processModels.addAll(choreographyModel.getProcessModels());

		}

		return processModels;
	}

	@Override
	public void changeChoreographyModelStatus(String choreographyModelId, ChoreographyStateEnum state) {

		ChoreographyModel choreographyModel = null;

		if (choreographyModelId != null) {
			choreographyModel = em.find(ChoreographyModel.class, choreographyModelId);
		}

		if (choreographyModel != null) {

			choreographyModel.setChoreographyState(state);
		}

	}

	@Override
	public void assignProcessModelToChoreographyModel(ChoreographyModel choreographyModel, ProcessModel processModel) {

		choreographyModel = em.find(ChoreographyModel.class, choreographyModel.getChoreographyModelId());
		processModel = em.find(ProcessModel.class, processModel.getModelId());

		choreographyModel.getProcessModels().add(processModel);

	}

	@Override
	public Collection<String> getSCEInstanceOfChoreographyModel(String choreographyModelId) {
		Collection<String> sceInstanceIds = new ArrayList<String>();

		if (choreographyModelId != null) {

			Collection<ProcessModel> processModels = getProcessModelsOfChoreographyModel(choreographyModelId);

			Iterator<ProcessModel> iter = processModels.iterator();

			while (iter.hasNext()) {

				ProcessModel processModel = em.find(ProcessModel.class, ((ProcessModel) iter.next()).getModelId());

				if (processModel != null) {
					Collection<ProcessModelSCEInstanceRef> refs = processModel.getProcessModelSCEInstanceRefs();

					if (refs != null) {
						for (ProcessModelSCEInstanceRef ref : refs) {
							sceInstanceIds.add(ref.getSceInstanceRef().getSceInstanceId());
						}
					}
				}
			}

		}

		return sceInstanceIds;
	}

	public void addParticipantToChoreographyInstance(ProcessInstance processInstance, ChoreographyInstance chorInstance) {
		processInstance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());
		chorInstance = em.find(ChoreographyInstance.class, chorInstance.getChoreographyInstanceID());

		chorInstance.getParticipants().add(processInstance);
		processInstance.setChoreographyInstance(chorInstance);

		em.persist(chorInstance);
	}

	@Override
	public Collection<ChoreographyModel> getChoreographyModelsOfProcessModel(ProcessModel processModel) {

		//
		// Query query =
		// em.createQuery("SELECT chor FROM ChoreographyModel chor JOIN chor.processModels p WHERE p.modelId = :processModelId");
		// query.setParameter("processModelId", processModel.getModelId());

		processModel = em.find(ProcessModel.class, processModel.getModelId());

		Collection<ChoreographyModel> result = new ArrayList<ChoreographyModel>();
		// result.addAll(query.getResultList());
		result.addAll(processModel.getChoreographyModels());

		return result;

	}

	@Override
	public ActivityInstanceStateEnum getActivityStateByUUID(String uuid) {

		TypedQuery<ActivityInstance> q1 = em.createQuery("SELECT a FROM ActivityInstance a WHERE (a.uuid = :uuid)", ActivityInstance.class);
		q1.setParameter("uuid", uuid);
		List<ActivityInstance> results = q1.getResultList();
		ActivityInstance activityInstance = null;
		if (!results.isEmpty()) {
			activityInstance = results.get(0);
		}

		return activityInstance.getActivityState();

		// TODO
		// return ActivityInstanceStateEnum.Activity_Complete;
	}

	@Override
	public List<ProcessInstance> getParticipantsFromChoreographyInstance(ChoreographyInstance chorInstance) {

		chorInstance = em.find(ChoreographyInstance.class, chorInstance.getChoreographyInstanceID());

		List<ProcessInstance> result = new ArrayList<ProcessInstance>();
		result.addAll(chorInstance.getParticipants());
		return result;
	}

	@Override
	public List<ChoreographyInstance> getChoreographyInstances(ChoreographyModel choreographyModel) {

		choreographyModel = em.find(ChoreographyModel.class, choreographyModel.getChoreographyModelId());

		List<ChoreographyInstance> result = new ArrayList<ChoreographyInstance>();
		result.addAll(choreographyModel.getChoreographyInstances());
		return result;

	}

	@Override
	public List<ProcessInstance> getProcessInstances(ProcessModel processModel) {

		processModel = em.find(ProcessModel.class, processModel.getModelId());

		List<ProcessInstance> result = new ArrayList<ProcessInstance>();
		result.addAll(processModel.getProcessInstances());
		return result;

	}

	@Override
	public MessageLink createMessageLink(String messageLinkID, String messageLinkName, String sendingProcessModelID, String receivingProcessModelID, String sendingActivityModelID,
			ActivityTypeEnum sendingActivityType, String receivingActivityModelID, ActivityTypeEnum receivingActivityType) {

		MessageLink messageLink = null;

		ProcessModel sendingProcess = em.find(ProcessModel.class, sendingProcessModelID);
		ProcessModel receivingProcess = em.find(ProcessModel.class, receivingProcessModelID);

		if (sendingProcess != null && receivingProcess != null) {

			messageLink = new MessageLink();
			messageLink.setMessageLinkID(messageLinkID);
			messageLink.setName(messageLinkName);
			messageLink.setSender(sendingProcess);
			messageLink.setReceiver(receivingProcess);
			messageLink.setSendingActivityModelID(sendingActivityModelID);
			messageLink.setSendingActivityType(sendingActivityType);
			messageLink.setReceivingActivityModelID(receivingActivityModelID);
			messageLink.setReceivingActivityType(receivingActivityType);

			em.persist(messageLink);
		}

		return messageLink;
	}

	@Override
	public void assignMessageLinkToChoreographyModel(ChoreographyModel choreographyModel, MessageLink messageLink) {

		choreographyModel = em.find(ChoreographyModel.class, choreographyModel.getChoreographyModelId());
		messageLink = em.find(MessageLink.class, messageLink.getMessageLinkID());
		choreographyModel.getMessageLinks().add(messageLink);
		messageLink.setChoreographyModel(choreographyModel);
		em.persist(choreographyModel);
		em.persist(messageLink);
	}

	@Override
	public List<MessageLink> getMessageLinks(String choreographyModelID, String activityModelID) {

		TypedQuery<MessageLink> q1 = em.createQuery("SELECT m FROM MessageLink m WHERE m.choreographyModel.choreographyModelId = :choreographyModelID AND "
				+ "(m.sendingActivityModelID = :activityModelID OR m.receivingActivityModelID = :activityModelID)", MessageLink.class);
		q1.setParameter("choreographyModelID", choreographyModelID);
		q1.setParameter("activityModelID", activityModelID);
		List<MessageLink> results = q1.getResultList();

		return results;

	}

	@Override
	public ChoreographyModel getChoreographyModelOfChoreographyInstance(ChoreographyInstance choreographyInstance) {

		choreographyInstance = em.find(ChoreographyInstance.class, choreographyInstance.getChoreographyInstanceID());
		ChoreographyModel choreographyModel = choreographyInstance.getChoreographyModel();

		return choreographyModel;
	}

	@Override
	public MessageLinkInstance getMessageLinkInstanceBySendingActivityInstance(ChoreographyInstance choreographyInstance, ActivityInstance sendingActivityInstance) {

		TypedQuery<MessageLinkInstance> q1 = em.createQuery("SELECT mi FROM MessageLinkInstance mi WHERE mi.choreographyInstance.choreographyInstanceID = :choreographyInstanceID AND "
				+ "mi.sendingActivityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID ", MessageLinkInstance.class);
		q1.setParameter("choreographyInstanceID", choreographyInstance.getChoreographyInstanceID());
		q1.setParameter("activityInstanceID", sendingActivityInstance.getCompositePrimaryKey().getActivityInstanceID());

		List<MessageLinkInstance> results = q1.getResultList();
		if (!results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}

	@Override
	public MessageLinkInstance getMessageLinkInstanceByReceivingActivityInstance(ChoreographyInstance choreographyInstance, ActivityInstance receivingActivityInstance) {

		TypedQuery<MessageLinkInstance> q1 = em.createQuery("SELECT mi FROM MessageLinkInstance mi WHERE mi.choreographyInstance.choreographyInstanceID = :choreographyInstanceID AND "
				+ "mi.receivingActivityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID ", MessageLinkInstance.class);
		q1.setParameter("choreographyInstanceID", choreographyInstance.getChoreographyInstanceID());
		q1.setParameter("activityInstanceID", receivingActivityInstance.getCompositePrimaryKey().getActivityInstanceID());

		List<MessageLinkInstance> results = q1.getResultList();
		if (!results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}

	@Override
	public List<MessageLinkInstance> getMessageLinkInstances(ChoreographyInstance choreographyInstance, ActivityInstance activityInstance) {

		TypedQuery<MessageLinkInstance> q1 = em
				.createQuery(
						"SELECT mi FROM MessageLinkInstance mi WHERE mi.choreographyInstance.choreographyInstanceID = :choreographyInstanceID AND "
								+ "(mi.sendingActivityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID OR mi.receivingActivityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID)",
						MessageLinkInstance.class);
		q1.setParameter("choreographyInstanceID", choreographyInstance.getChoreographyInstanceID());
		q1.setParameter("activityInstanceID", activityInstance.getCompositePrimaryKey().getActivityInstanceID());

		List<MessageLinkInstance> results = q1.getResultList();

		return results;
	}

	@Override
	public MessageLinkInstance createMessageLinkInstance(MessageLink messageLink, ProcessInstance sender, ProcessInstance receiver, ActivityInstance sendingActivityInstance,
			ActivityInstance receivingActivityInstance, String messageID, MessageLinkInstanceStateEnum state) {

		MessageLinkInstance messageLinkInstance = new MessageLinkInstance();
		messageLinkInstance.setInstanceID(UUID.randomUUID().toString());
		messageLinkInstance.setTimestamp(System.currentTimeMillis());

		messageLinkInstance.setMessageLink(messageLink);
		messageLinkInstance.setSendingProcessInstance(sender);
		messageLinkInstance.setReceivingProcessInstance(receiver);
		messageLinkInstance.setSendingActivityInstance(sendingActivityInstance);
		messageLinkInstance.setReceivingActivityInstance(receivingActivityInstance);
		messageLinkInstance.setMessageID(messageID);
		messageLinkInstance.setState(state);

		em.persist(messageLinkInstance);

		return messageLinkInstance;
	}

	@Override
	public MessageLinkInstance updateMessageLinkInstance(MessageLinkInstance messageLinkInstance, ProcessInstance sender, ProcessInstance receiver, ActivityInstance sendingActivityInstance,
			ActivityInstance receivingActivityInstance, MessageLinkInstanceStateEnum state) {

		messageLinkInstance = em.find(MessageLinkInstance.class, messageLinkInstance.getInstanceID());

		if (sender != null) {
			messageLinkInstance.setSendingProcessInstance(sender);
		}
		if (receiver != null) {
			messageLinkInstance.setReceivingProcessInstance(receiver);
		}
		if (sendingActivityInstance != null) {
			messageLinkInstance.setSendingActivityInstance(sendingActivityInstance);
		}
		if (receivingActivityInstance != null) {
			messageLinkInstance.setReceivingActivityInstance(receivingActivityInstance);
		}

		messageLinkInstance.setState(state);

		return messageLinkInstance;
	}

	@Override
	public void assignMessageLinkInstanceToChoreographyInstance(ChoreographyInstance choreographyInstance, MessageLinkInstance messageLinkInstance) {

		choreographyInstance = em.find(ChoreographyInstance.class, choreographyInstance.getChoreographyInstanceID());
		messageLinkInstance = em.find(MessageLinkInstance.class, messageLinkInstance.getInstanceID());
		choreographyInstance.getMessageLinkInstances().add(messageLinkInstance);
		messageLinkInstance.setChoreographyInstance(choreographyInstance);

		em.persist(choreographyInstance);
		em.persist(messageLinkInstance);

	}

	@Override
	public MessageLinkInstance updateMessageLinkInstance(MessageLinkInstance messageLinkInstance) {

		em.merge(messageLinkInstance);

		return messageLinkInstance;
	}

	@Override
	public MessageLinkInstance getMessageLinkInstanceByMessageID(ChoreographyInstance choreographyInstance, String messageID) {
		TypedQuery<MessageLinkInstance> q1 = em.createQuery("SELECT mi FROM MessageLinkInstance mi WHERE mi.choreographyInstance.choreographyInstanceID = :choreographyInstanceID AND "
				+ "mi.messageID = :messageID", MessageLinkInstance.class);
		q1.setParameter("choreographyInstanceID", choreographyInstance.getChoreographyInstanceID());
		q1.setParameter("messageID", messageID);

		List<MessageLinkInstance> results = q1.getResultList();
		if (!results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}

	@Override
	public MessageLink getOutgoingMessageLink(String choreographyModelID, String activityModelID) {
		TypedQuery<MessageLink> q1 = em.createQuery("SELECT m FROM MessageLink m WHERE m.choreographyModel.choreographyModelId = :choreographyModelID AND "
				+ "m.sendingActivityModelID = :activityModelID", MessageLink.class);
		q1.setParameter("choreographyModelID", choreographyModelID);
		q1.setParameter("activityModelID", activityModelID);
		List<MessageLink> results = q1.getResultList();
		if (!results.isEmpty()) {
			return results.get(0);
		}

		return null;

	}

	@Override
	public MessageLink getIncomingMessageLink(String choreographyModelID, String activityModelID) {

		TypedQuery<MessageLink> q1 = em.createQuery("SELECT m FROM MessageLink m WHERE m.choreographyModel.choreographyModelId = :choreographyModelID AND "
				+ "m.receivingActivityModelID = :activityModelID", MessageLink.class);
		q1.setParameter("choreographyModelID", choreographyModelID);
		q1.setParameter("activityModelID", activityModelID);
		List<MessageLink> results = q1.getResultList();

		if (!results.isEmpty()) {
			return results.get(0);
		}
		return null;
	}

	@Override
	public MessageLink getMessageLinkOfMessageLinkInstance(MessageLinkInstance messageLinkInstance) {

		messageLinkInstance = em.find(MessageLinkInstance.class, messageLinkInstance.getInstanceID());

		return messageLinkInstance.getMessageLink();
	}

	@Override
	public List<ActivityInstance> getActivityInstancesOfProcessInstance(ProcessInstance processInstance) {

		processInstance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());

		List<ActivityInstance> activityInstances = (List<ActivityInstance>) processInstance.getActivityInstances();
		return activityInstances;
	}

	@Override
	public ProcessModel getProcessModelOfProcessInstance(ProcessInstance processInstance) {

		processInstance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());

		ProcessModel processModel = processInstance.getProcessModel();

		return processModel;
	}

	@Override
	public List<MessageLinkInstance> getMessageLinkInstancesOfChoreographyModel(ChoreographyInstance choreographyInstance) {

		TypedQuery<MessageLinkInstance> q1 = em.createQuery("SELECT m FROM MessageLinkInstance m WHERE m.choreographyInstance.choreographyInstanceID = :choreographyInstanceID",
				MessageLinkInstance.class);
		q1.setParameter("choreographyInstanceID", choreographyInstance.getChoreographyInstanceID());

		return q1.getResultList();
	}

	@Override
	public Iteration createIteration(String iterationID, RepetitionMethodEnum repetitionMethod, ActivityInstance initialRewindingPoint, ProcessInstance initialStartParticipant,
			Map<ProcessInstance, Tuple> rewindingPointMap, List<MessageLinkInstance> messageLinkInstances, ChoreographyInstance choreographyInstance, String view) {

		Iteration iteration = new Iteration();
		iteration.setIterationID(iterationID);
		iteration.setRepetitionMethod(repetitionMethod);
		iteration.setInitialRewindingPoint(initialRewindingPoint);
		iteration.setInitialStartParticipant(initialStartParticipant);
		iteration.setMessageLinkInstances(messageLinkInstances);
		iteration.setView(view);
		
		RewindingPoints rewindingPoints = createRewindingPoints(rewindingPointMap);
		rewindingPoints.setIteration(iteration);
		iteration.setRewindingPoints(rewindingPoints);

		iteration.setChoreographyInstance(choreographyInstance);
		iteration.setTimestamp(System.currentTimeMillis());

		em.persist(iteration);
		em.persist(rewindingPoints);

		for (RewindingPointsEntry entry : rewindingPoints.getEntries()) {
			em.persist(entry);
			for (ActivityInstance activityInstance : entry.getActivityInstances()) {
				em.merge(activityInstance);
			}

		}

		return iteration;

	}

	private RewindingPoints createRewindingPoints(Map<ProcessInstance, Tuple> rewindingPointMap) {

		RewindingPoints rewindingPoints = new RewindingPoints();
		rewindingPoints.setRewindingPointsID(UUID.randomUUID().toString());

		for (Entry<ProcessInstance, Tuple> entry : rewindingPointMap.entrySet()) {

			RewindingPointsEntry rewindingPointsEntry = new RewindingPointsEntry();
			rewindingPointsEntry.setRewindingPointsEntryID(UUID.randomUUID().toString());
			rewindingPointsEntry.setProcessInstance(entry.getKey());
			rewindingPointsEntry.setActivityInstances(entry.getValue().getActivityInstances());
			rewindingPointsEntry.setCompleteRewind(entry.getValue().isCompleteRewind());
			rewindingPointsEntry.setRewindingPoints(rewindingPoints);
			rewindingPoints.getEntries().add(rewindingPointsEntry);

			for (ActivityInstance activityInstance : entry.getValue().getActivityInstances()) {
				activityInstance.setRewindingPointsEntry(rewindingPointsEntry);
			}

		}

		return rewindingPoints;
	}

	@Override
	public Iteration getLastestIteration(ChoreographyInstance choreographyInstance) {

		TypedQuery<Iteration> q1 = em.createQuery("SELECT i FROM Iteration i WHERE i.choreographyInstance.choreographyInstanceID = :choreographyInstanceID "
				+ "AND i.timestamp = (SELECT MAX(i.timestamp) FROM Iteration i WHERE i.choreographyInstance.choreographyInstanceID = :choreographyInstanceID)", Iteration.class);
		q1.setParameter("choreographyInstanceID", choreographyInstance.getChoreographyInstanceID());

		List<Iteration> results = q1.getResultList();

		if (!results.isEmpty()) {
			return results.get(0);
		}
		return null;

	}

	@Override
	public boolean allParticipantInstancesPreparedForIteration(ChoreographyInstance choreographyInstance) {

		Iteration iteration = getLastestIteration(choreographyInstance);

		List<RewindingPointsEntry> entries = getRewindingPointEntries(iteration.getRewindingPoints());

		if (iteration.getIterationEvents().size() == entries.size()) {
			return true;
		}

		return false;
	}

	@Override
	public IterationEvent registerIterationEvent(Iteration iteration, SCEInstanceRef sceInstance, ProcessInstance processInstance, String eventType, Long eventMessageId, Object eventMessage,
			Long timestamp, String details) {

		iteration = em.find(Iteration.class, iteration.getIterationID());

		IterationEvent iterationEvent = new IterationEvent();
		iterationEvent.setProcessInstance(processInstance);
		iterationEvent.setDetails(details);
		iterationEvent.setEventMessage(eventMessage);
		iterationEvent.setTimestamp(timestamp);
		iterationEvent.setEventType(eventType);
		iterationEvent.setEventMessageId(eventMessageId);
		iterationEvent.setSceInstanceRef(sceInstance);
		iterationEvent.setIteration(iteration);
		iteration.getIterationEvents().add(iterationEvent);

		return iterationEvent;
	}

	@Override
	public List<RewindingPointsEntry> getRewindingPointEntries(RewindingPoints rewindingPoints) {

		TypedQuery<RewindingPointsEntry> q1 = em.createQuery("SELECT e FROM RewindingPointsEntry e WHERE e.rewindingPoints.rewindingPointsID = :rewindingPointsID", RewindingPointsEntry.class);
		q1.setParameter("rewindingPointsID", rewindingPoints.getRewindingPointsID());

		return q1.getResultList();
	}

	@Override
	public ProcessInstance getOldestUnRepeatedProcessInstance(ProcessModel processModel, RewindingPoints rewindingPoints) {

		TypedQuery<ProcessInstance> q1 = em
				.createQuery(
						"SELECT p FROM ProcessInstance p WHERE p.creationTimestamp = (SELECT MAX(p.creationTimestamp) FROM ProcessInstance p WHERE p.compositePrimaryKey.processInstanceID IN (SELECT e.processInstance.compositePrimaryKey.processInstanceID "
								+ "FROM RewindingPointsEntry e WHERE e.processInstance.processModel.modelId = :modelID AND e.repeated = 'false' AND e.rewindingPoints.rewindingPointsID = :rewindingPointsID))",
						ProcessInstance.class);
		q1.setParameter("modelID", processModel.getModelId());
		q1.setParameter("rewindingPointsID", rewindingPoints.getRewindingPointsID());

		if (!q1.getResultList().isEmpty()) {
			return q1.getResultList().get(0);
		}

		return null;
	}

	@Override
	public void updateIteration(Iteration iteration, ProcessInstance processInstance) {

		List<RewindingPointsEntry> rewindingPointsEntries = iteration.getRewindingPoints().getEntries();

		for (RewindingPointsEntry entry : rewindingPointsEntries) {

			if (entry.getProcessInstance().getCompositePrimaryKey().equals(processInstance.getCompositePrimaryKey())) {
				entry.setRepeated(true);
				em.merge(entry);
			}

		}

	}

	@Override
	public CorrelationSet createCorrelationSet(ProcessModel processModel, String name, List<String> properties) {

		processModel = em.find(ProcessModel.class, processModel.getModelId());

		CorrelationSet correlationSet = new CorrelationSet();
		correlationSet.setName(name);
		StringBuffer buffer = new StringBuffer();

		for (String s : properties) {
			buffer.append(s + " ");
		}

		correlationSet.setProperties(buffer.toString());

		correlationSet.setProcessModel(processModel);
		processModel.getCorrelationSets().add(correlationSet);

		em.persist(correlationSet);
		em.persist(processModel);
		return correlationSet;

	}

	@Override
	public Correlation createCorrelation(CorrelationSet correlationSet, String activityModelID, String initiate, String pattern, QName messageType, String part, String query) {

		correlationSet = em.find(CorrelationSet.class, correlationSet.getCorrelationSetID());

		Correlation correlation = new Correlation();
		correlation.setActivityModelID(activityModelID);
		correlation.setInitiate(initiate);
		correlation.setPattern(pattern);
		correlation.setMessageType(messageType);
		correlation.setPart(part);
		correlation.setQuery(query);

		correlation.setCorrelationSet(correlationSet);
		correlationSet.getCorrelations().add(correlation);

		em.persist(correlationSet);
		em.persist(correlation);

		return correlation;

	}

	@Override
	public MessageExchangeEvent getMessageExchangeEvent(String messageID, String direction) {

		TypedQuery<MessageExchangeEvent> query = em.createQuery("SELECT e FROM MessageExchangeEvent e WHERE e.messageID = :messageID AND e.direction = :direction", MessageExchangeEvent.class);
		query.setParameter("messageID", messageID);
		query.setParameter("direction", direction);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList().get(0);
		}

		return null;
	}

	@Override
	public Correlation getCorrelation(String activityModelID) {
		TypedQuery<Correlation> query = em.createQuery("SELECT c FROM Correlation c WHERE c.activityModelID = :activityModelID", Correlation.class);
		query.setParameter("activityModelID", activityModelID);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList().get(0);
		}

		return null;
	}

	@Override
	public Correlation getCorrelation(QName message) {
		TypedQuery<Correlation> query = em.createQuery("SELECT c FROM Correlation c WHERE c.messageType = :messageType", Correlation.class);
		query.setParameter("messageType", message);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList().get(0);
		}

		return null;
	}

	// @Override
	// public CorrelationInstance getOrCreateCorrelationInstance(Correlation
	// correlation, String propertyValue, ActivityInstance activityInstance,
	// ProcessInstance processInstance) {
	//
	//
	// TypedQuery<CorrelationInstance> query =
	// em.createQuery("SELECT ci FROM CorrelationInstance ci WHERE ci.correlation.correlationID = :correlationID "
	// +
	// "AND ci.propertyValue = :propertyValue" , CorrelationInstance.class);
	// query.setParameter("correlationID", correlation.getCorrelationID());
	// query.setParameter("propertyValue", propertyValue);
	//
	// CorrelationInstance correlationInstance = null;
	//
	// if(!query.getResultList().isEmpty()){
	// correlationInstance = query.getResultList().get(0);
	// }
	// else{
	// correlationInstance = new CorrelationInstance();
	// correlationInstance.setPropertyValue(propertyValue);
	// correlationInstance.setActivityInstance(activityInstance);
	// correlationInstance.setProcessInstance(processInstance);
	// //processInstance.getCorrelationInstances().add(correlationInstance);
	//
	// em.persist(correlationInstance);
	// em.persist(processInstance);
	// }
	//
	//
	//
	// return correlationInstance;
	// }

	@Override
	public CorrelationSetInstance getOrCreateCorrelationSetInstance(CorrelationSet correlationSet, String propertyValue, ProcessInstance processInstance) {

		TypedQuery<CorrelationSetInstance> query = em.createQuery("SELECT csi FROM CorrelationSetInstance csi WHERE csi.correlationSet.correlationSetID = :correlationSetID "
				+ "AND csi.processInstance.compositePrimaryKey.processInstanceID = :processInstanceID " + "AND csi.propertyValue = :propertyValue", CorrelationSetInstance.class);

		query.setParameter("correlationSetID", correlationSet.getCorrelationSetID());
		query.setParameter("processInstanceID", processInstance.getCompositePrimaryKey().getProcessInstanceID());
		query.setParameter("propertyValue", propertyValue);

		CorrelationSetInstance correlationSetInstance = null;

		if (!query.getResultList().isEmpty()) {
			correlationSetInstance = query.getResultList().get(0);
		} else {

			correlationSet = em.find(CorrelationSet.class, correlationSet.getCorrelationSetID());
			processInstance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());

			correlationSetInstance = new CorrelationSetInstance();
			correlationSetInstance.setPropertyValue(propertyValue);
			correlationSetInstance.setCorrelationSet(correlationSet);

			correlationSetInstance.setProcessInstance(processInstance);
			processInstance.getCorrelationSetInstances().add(correlationSetInstance);
			correlationSet.getCorrelationSetInstances().add(correlationSetInstance);

			em.persist(correlationSetInstance);
			em.persist(processInstance);
			em.persist(correlationSet);

		}

		return correlationSetInstance;
	}

	@Override
	public CorrelationSetInstance getCorrelationSetInstance(CorrelationSet correlationSet, String propertyValue) {

		TypedQuery<CorrelationSetInstance> query = em.createQuery("SELECT csi FROM CorrelationSetInstance csi WHERE csi.correlationSet.correlationSetID = :correlationSetID "
				+ "AND csi.propertyValue = :propertyValue", CorrelationSetInstance.class);

		query.setParameter("correlationSetID", correlationSet.getCorrelationSetID());
		query.setParameter("propertyValue", propertyValue);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList().get(0);
		}

		return null;
	}

	@Override
	public List<ActivityInstanceEvent> getLoopIterationCompleteEvents(String activityInstanceID, boolean ordered) {

		String queryString;

		if (ordered) {
			queryString = "SELECT e FROM ActivityInstanceEvent e WHERE e.activityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID "
					+ "AND e.eventType = 'Loop_Iteration_Complete' ORDER BY e.timestamp ASC";

		} else {
			queryString = "SELECT e FROM ActivityInstanceEvent e WHERE e.activityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID "
					+ "AND e.eventType = 'Loop_Iteration_Complete'";
		}

		TypedQuery<ActivityInstanceEvent> query = em.createQuery(queryString, ActivityInstanceEvent.class);

		query.setParameter("activityInstanceID", activityInstanceID);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList();
		}

		return null;
	}

	@Override
	public Long countLoopIterationCompleteEvents(String activityInstanceID) {

		TypedQuery<Long> query = em.createQuery("SELECT COUNT(e) FROM ActivityInstanceEvent e WHERE e.activityInstance.compositePrimaryKey.activityInstanceID = :activityInstanceID "
				+ "AND e.eventType = 'Loop_Iteration_Complete'", Long.class);

		query.setParameter("activityInstanceID", activityInstanceID);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList().get(0);
		}

		return null;
	}

	@Override
	public List<ProcessInstanceEvent> getProcessInstanceEvents(ProcessInstance processInstance) {

		processInstance = em.find(ProcessInstance.class, processInstance.getCompositePrimaryKey());
		List<ProcessInstanceEvent> result = new ArrayList<ProcessInstanceEvent>();
		result.addAll(processInstance.getProcessInstanceEvents());

		return result;

	}

	@Override
	public void registerBreakpointInformation(String processModelID, Object breakpointInformation) {

		ProcessModel processModel = em.find(ProcessModel.class, processModelID);

		if (processModel != null) {
			processModel.setBreakpointInformation(breakpointInformation);
		}
		em.persist(processModel);
	}

	@Override
	public Object getBreakpointInformation(String processModelID) {

		ProcessModel processModel = em.find(ProcessModel.class, processModelID);

		if (processModel != null) {
			return processModel.getBreakpointInformation();
		}

		return null;
	}

	@Override
	public void updateBreakpointInformation(String processModelID, Object breakpointInformation) {

		ProcessModel processModel = em.find(ProcessModel.class, processModelID);

		if (processModel != null) {

			processModel.setBreakpointInformation(breakpointInformation);
			em.persist(processModel);
		}
	}

	@Override
	public ProcessModelSCEInstanceRef getProcessModelSCEInstanceRef(String processModelID, String sceInstanceID) {
	
		TypedQuery<ProcessModelSCEInstanceRef> query = em.createQuery("SELECT p FROM ProcessModelSCEInstanceRef p WHERE p.processModel.modelId = :processModelID " +
				"AND p.sceInstanceRef.sceInstanceId = :sceInstanceID", ProcessModelSCEInstanceRef.class);

		query.setParameter("processModelID", processModelID);
		query.setParameter("sceInstanceID", sceInstanceID);

		if (!query.getResultList().isEmpty()) {
			return query.getResultList().get(0);
		}

		return null;
		
	}

	@Override
	public Collection<ChoreographyModel> getChoreographyModels() {
		//TODO
		TypedQuery<ChoreographyModel> q1 = em.createQuery("SELECT c FROM ChoreographyModel c", ChoreographyModel.class);
		//("SELECT e FROM RewindingPointsEntry e", ChoreographyModel.class);
		return q1.getResultList();
	}

	@Override
	public ActivityInstance getActivityInstanceByElementModelID(String elementModelID) {
		
		TypedQuery<ActivityInstance> q1 = em.createQuery("SELECT a FROM ActivityInstance a WHERE (a.elementModelID = :elementModelID)", ActivityInstance.class);
		q1.setParameter("elementModelID", elementModelID);
		List<ActivityInstance> results = q1.getResultList();
		ActivityInstance activityInstance = null;
		if (!results.isEmpty()) {
			activityInstance = results.get(0);
		}

		return activityInstance;

	}

}
