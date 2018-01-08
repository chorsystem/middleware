package de.unistuttgart.iaas.chor.integration.deployment.management;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.apache.camel.Body;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.impl.DefaultMessage;
import org.apache.ode.deployapi.DeployUnit;
import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.Invoke;
import org.eclipse.bpel4chor.model.pbd.Pick;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.Receive;
import org.eclipse.bpel4chor.model.pbd.Reply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.util.EMFUtils;
import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityTypeEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessStateEnum;
import de.unistuttgart.iaas.chor.integration.events.EventManager;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.Service;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentEventMessage;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentMessage;
import de.unistuttgart.iaas.chor.messages.ChorUndeploymentMessage;
import de.unistuttgart.iaas.chor.messages.CorrelationSetType;
import de.unistuttgart.iaas.chor.messages.CorrelationType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;
import de.unistuttgart.iaas.chor.messages.ServiceType;
import de.unistuttgart.iaas.marshalling.DeploymentNamespaceFilter;

/**
 * 
 * @author weissas
 * 
 */
public class DeploymentManager {

	private static DeploymentManager _instance = null;

	private Logger logger = null;

	private EventRegistry eventRegistry;

	private ArtifactRegistry artifactRegistry;

	private ServiceRegistry serviceRegistry;

	private DeploymentManager() {
		logger = LoggerFactory.getLogger(DeploymentManager.class);

	}

	public static DeploymentManager getInstance() {
		if (_instance == null) {
			_instance = new DeploymentManager();
		}

		return _instance;
	}

	public void startup(EventRegistry eventRegistry, ArtifactRegistry artifactRegistry, ServiceRegistry serviceRegistry) {
		this.eventRegistry = eventRegistry;
		this.artifactRegistry = artifactRegistry;
		this.serviceRegistry = serviceRegistry;
	}

	public void shutdown() {
		this.eventRegistry = null;
		this.artifactRegistry = null;
		this.serviceRegistry = null;
		_instance = null;
	}

	public ChorDeploymentMessage checkDeployment(Map<String, Object> headers, ChorDeploymentMessage chorDeploymentMessage) {

		checkDeployment(chorDeploymentMessage);
		boolean isAllDeployed = isAllDeployed(chorDeploymentMessage);

		setDeploymentHeader(headers, isAllDeployed);

		return chorDeploymentMessage;

	}

	private ChorDeploymentMessage checkDeployment(ChorDeploymentMessage chorDeploymentMessage) {

		String choreographyModelId = chorDeploymentMessage.getChoreographyBundle().getChoreographyModelID();
		QName modelQName = chorDeploymentMessage.getChoreographyBundle().getName();

		ChoreographyModel choreographyModel = eventRegistry.getChoreographyModel(choreographyModelId);

		List<ProcessBundleType> processBundleTypes = chorDeploymentMessage.getChoreographyBundle().getProcessBundles();

		// If there exists no choreography model with the given id
		if (choreographyModel == null) {

			choreographyModel = eventRegistry.createChoreographyModel(choreographyModelId, modelQName);

			for (ProcessBundleType processBundleType : processBundleTypes) {

				ProcessModel processModel = eventRegistry.getProcessModel(processBundleType.getProcessModelID());

				// If there exists a process model in the event db
				if (processModel != null) {

					// if the process is already active or deployed
					if (processModel.getProcessState().equals(ProcessStateEnum.Process_Active) || processModel.getProcessState().equals(ProcessStateEnum.Process_Deployed)) {

						eventRegistry.assignProcessModelToChoreographyModel(choreographyModel, processModel);
						processBundleType.setDeployed(Boolean.TRUE);

					} else if (processModel.getProcessState().equals(ProcessStateEnum.Process_Undeployed)) {
						eventRegistry.assignProcessModelToChoreographyModel(choreographyModel, processModel);
						processBundleType.setDeployed(Boolean.FALSE);
					}

				} else {

					processModel = eventRegistry.getOrCreateProcessModel(processBundleType.getProcessModelID(), processBundleType.getName());
					eventRegistry.assignProcessModelToChoreographyModel(choreographyModel, processModel);
					processBundleType.setDeployed(Boolean.FALSE);
				}
			}
			// create message link representations in db

			// Retrieve choreography model
			Choreography choreography = getChoreographyModel(chorDeploymentMessage);

			for (CMessageLink cMessageLink : choreography.getMessageLinks()) {

				Process sendingProcess = getProcessFromParticipantOrParticipantSet(cMessageLink.getSender());
				Process receivingProcess = getProcessFromParticipantOrParticipantSet(cMessageLink.getReceiver());

				ProcessBundleType senderBundle = getProcessBundleTypeByQName(chorDeploymentMessage.getChoreographyBundle().getProcessBundles(), new QName(sendingProcess.getTargetNamespace(),
						sendingProcess.getName()));
				ProcessBundleType receiverBundle = getProcessBundleTypeByQName(chorDeploymentMessage.getChoreographyBundle().getProcessBundles(), new QName(receivingProcess.getTargetNamespace(),
						receivingProcess.getName()));

				String sendingProcessID = senderBundle.getProcessModelID();
				String receivingProcessID = receiverBundle.getProcessModelID();

				String sendingActivityID = ((ExtensibleElements) cMessageLink.getSendActivity()).getId();
				String receivingActivityID = ((ExtensibleElements) cMessageLink.getReceiveActivity()).getId();

				ActivityTypeEnum sendingActivityType = getActivityType((ExtensibleElements) cMessageLink.getSendActivity());
				ActivityTypeEnum receivingActivityType = getActivityType((ExtensibleElements) cMessageLink.getReceiveActivity());

				MessageLink messageLink = eventRegistry.createMessageLink(cMessageLink.getId(), cMessageLink.getName(), sendingProcessID, receivingProcessID, sendingActivityID, sendingActivityType,
						receivingActivityID, receivingActivityType);

				eventRegistry.assignMessageLinkToChoreographyModel(choreographyModel, messageLink);

			}

			// create correlation representations in the db

			// checkCorrelation(choreography, chorDeploymentMessage);

		}
		// If there exists already a choreography model with the same id
		else {

			Collection<ProcessModel> processModels = eventRegistry.getProcessModelsOfChoreographyModel(choreographyModelId);

			for (ProcessBundleType processBundleType : processBundleTypes) {

				Iterator<ProcessModel> iter = processModels.iterator();

				boolean found = false;

				while (iter.hasNext()) {

					ProcessModel processModel = iter.next();

					if (processBundleType.getProcessModelID().equals(processModel.getModelId())) {

						if (processModel.getProcessState() != null
								&& (processModel.getProcessState().equals(ProcessStateEnum.Process_Active) || processModel.getProcessState().equals(ProcessStateEnum.Process_Deployed))) {
							processBundleType.setDeployed(Boolean.TRUE);
							found = true;

						} else if (processModel.getProcessState() != null && processModel.getProcessState().equals(ProcessStateEnum.Process_Undeployed)) {
							processBundleType.setDeployed(Boolean.FALSE);
							found = true;
						}

						break;

					}

				}

				// If a corresponding process model does not exists in the event
				// db
				if (!found) {

					ProcessModel processModel = eventRegistry.getOrCreateProcessModel(processBundleType.getProcessModelID(), processBundleType.getName());
					eventRegistry.assignProcessModelToChoreographyModel(choreographyModel, processModel);
					processBundleType.setDeployed(Boolean.FALSE);

				}

			}

		}

		// check if non-process services have to be registered
		checkServiceDeployment(chorDeploymentMessage);

		return chorDeploymentMessage;
	}

	private boolean isAllDeployed(ChorDeploymentMessage chorDeploymentMessage) {

		for (ProcessBundleType processBundleType : chorDeploymentMessage.getChoreographyBundle().getProcessBundles()) {

			if (!processBundleType.isDeployed()) {
				return false;
			}
		}

		return true;
	}

	public void notifyEditor(ChorDeploymentMessage chorDeploymentMessage) {

		ChorDeploymentEventMessage eventMessage = new ChorDeploymentEventMessage();
		eventMessage.setChoreographyModelID(chorDeploymentMessage.getChoreographyBundle().getChoreographyModelID());

		EventManager.getInstance().notifyViaTextMessage(eventMessage);
	}

	private void setDeploymentHeader(Map<String, Object> headers, boolean isAllDeployed) {

		if (!isAllDeployed) {
			headers.put(Constants.DEPLOYED_HEADER, String.valueOf(false));
		} else {
			headers.put(Constants.DEPLOYED_HEADER, String.valueOf(true));
		}

	}

	private Choreography getChoreographyModel(ChorDeploymentMessage chorDeploymentMessage) {

		de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ChoreographyModel choreographyModel = artifactRegistry.getChoreographyModel(chorDeploymentMessage.getChoreographyBundle()
				.getChoreographyModelID());

		return EMFUtils.getChoreographyModel(choreographyModel.getChoreographyModelFile());
	}

	private ProcessBundleType getProcessBundleTypeByQName(List<ProcessBundleType> processBundleTypes, QName processQName) {

		for (ProcessBundleType processBundleType : processBundleTypes) {

			if (processQName != null && processBundleType.getName() != null && processBundleType.getName().equals(processQName)) {
				return processBundleType;
			}

		}

		return null;
	}

	private ActivityTypeEnum getActivityType(ExtensibleElements activity) {

		if (activity instanceof Invoke) {
			return ActivityTypeEnum.INVOKE;
		} else if (activity instanceof Receive) {
			return ActivityTypeEnum.RECEIVE;
		} else if (activity instanceof Reply) {
			return ActivityTypeEnum.REPLY;
		} else if (activity instanceof Pick) {
			return ActivityTypeEnum.ONMESSAGE;
		}

		return null;
	}

	private Process getProcessFromParticipantOrParticipantSet(CParticipant cParticipant) {

		if (cParticipant.getProcess() != null) {
			return cParticipant.getProcess();
		} else {
			if (cParticipant.eContainer() instanceof CParticipantSet) {
				CParticipantSet cParticipantSet = (CParticipantSet) cParticipant.eContainer();

				if (cParticipantSet.getProcess() != null) {
					return cParticipantSet.getProcess();
				}
			}

		}

		return null;

	}

	/**
	 * Method for checking if there exist correlation information in the
	 * participants
	 * 
	 * 
	 * @param choreography
	 * @param chorDeploymentMessage
	 */
	private void checkCorrelation(Choreography choreography, ChorDeploymentMessage chorDeploymentMessage) {

		for (ProcessBundleType bundle : chorDeploymentMessage.getChoreographyBundle().getProcessBundles()) {

			List<CorrelationSetType> correlationSets = bundle.getCorrelationInformation();

			for (CorrelationSetType correlationSetType : correlationSets) {

				ProcessModel processModel = eventRegistry.getProcessModel(bundle.getProcessModelID());
				de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSet set = eventRegistry.createCorrelationSet(processModel, correlationSetType.getName(),
						correlationSetType.getProperties());

				for (CorrelationType correlation : correlationSetType.getCorrelations()) {

					eventRegistry.createCorrelation(set, correlation.getActivityModelID(), correlation.getInitiate(), correlation.getPattern(), correlation.getMessageType(), correlation.getPart(),
							correlation.getQuery());

				}

			}

		}

	}

	private void checkServiceDeployment(ChorDeploymentMessage chorDeploymentMessage) {

		for (ServiceType serviceType : chorDeploymentMessage.getChoreographyBundle().getServices()) {

			if (serviceRegistry == null) {
				throw new IllegalStateException("Service Registry has not be initialized correctly for the deployment manager");

			}

			Service service = serviceRegistry.getService(serviceType.getService(), serviceType.getPortType(), serviceType.getPort());

			if (service == null) {

				service = serviceRegistry.registerService(serviceType.getService(), serviceType.getPort(), serviceType.getPortType());
			}
			// db refine
			serviceRegistry.assignEndpointURL(serviceType.getService(), serviceType.getEndpoint().get(0));

		}
	}

	public ChorUndeploymentMessage prepareUndeployment(ChorUndeploymentMessage chorUndeploymentMessage) {

		Collection<ProcessModel> processModels = eventRegistry.getProcessModelsOfChoreographyModel(chorUndeploymentMessage.getChoreographyModelID());

		for (ProcessModel processModel : processModels) {

			ProcessBundleResultType processBundleResultType = new ProcessBundleResultType();
			processBundleResultType.setProcessModelID(processModel.getModelId());
			
			processBundleResultType.setName(processModel.getModelQName());

			
			
			chorUndeploymentMessage.getProcessModels().add(processBundleResultType);

		}

		return chorUndeploymentMessage;

	}

	public void finishDeployment(Map<String, Object> headers, CxfPayload payload) {
		List<Element> elements = payload.getBody();

		String choreographyModelID = (String) headers.get(Constants.CHOR_MODEL_ID_HEADER);
		String processModelID = (String) headers.get(Constants.PROCESS_MODEL_ID_HEADER);

		Node nameNode = elements.get(0).getFirstChild().getFirstChild().getFirstChild();
		String name = nameNode.getTextContent();
		
	
		

	}

}
