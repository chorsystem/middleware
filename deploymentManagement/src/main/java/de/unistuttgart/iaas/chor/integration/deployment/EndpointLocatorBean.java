package de.unistuttgart.iaas.chor.integration.deployment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.apache.camel.Body;
import org.apache.camel.Headers;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.messaging.MessageProducer;
import de.unistuttgart.iaas.chor.event.messages.RegisterDeploymentSCEInstanceIDs;
import de.unistuttgart.iaas.chor.event.messages.RegisterUndeploymentSCEInstanceIDs;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModelSCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceTypeEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.ServiceEndpointData;
import de.unistuttgart.iaas.chor.messages.ChorUndeploymentMessage;
import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;
import de.unistuttgart.iaas.marshalling.MarshallingUtils;

public class EndpointLocatorBean {

	private ManagementRegistry managementRegistry;
	private EventRegistry eventRegistry;
	
	private MessageProducer messageProducer;

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
	
	public String determineEndpoints(@Headers Map<String, Object> headers, @Body String input) {

		ProcessBundleType processBundleType = (ProcessBundleType) MarshallingUtils.unmarshalNonRootElements(input);

		if (processBundleType.getEndpoint() != null && !processBundleType.getEndpoint().isEmpty()) {

			determineTranslators(headers, processBundleType);

		} else {

			determineTranslators(headers, processBundleType.getProcessModelID());
		}

		String message = MarshallingUtils.marshalNonRootElements(processBundleType);

		return message;
	}
	
	public String determineEndpoints(@Headers Map<String, Object> headers, @Body ProcessBundleResultType input) {
		
		determineTranslators(headers, input);

		return MarshallingUtils.marshalNonRootElements(input);
	}

	private void determineTranslators(Map<String, Object> headers, ProcessBundleType processBundleType) {

		
		Set<String> translatorEndpoints = new HashSet<String>();

		StringBuffer engineEndpoints = new StringBuffer();
		
		ArrayList<String> sceInstanceIDs = new ArrayList<String>();
		
		for (String endpoint : processBundleType.getEndpoint()) {

			SCEInstance sceInstance = managementRegistry.getSceInstanceByEndpointBaseURL(endpoint);
			
			if(sceInstance == null){
				throw new IllegalStateException("The DB does not contain any SCE instance corresponding to the specifyied endpoint: " + endpoint);
			}
			
			
			if (sceInstance.getSceInstanceType().equals(SCEInstanceTypeEnum.APACHE_ODE)) {

				translatorEndpoints.add(Constants.TRANSLATOR_ODE_QUEUE);
				engineEndpoints.append(Constants.ENGINE_APACHE_ODE+ "=" + getDeploymentService(sceInstance)+",");
				sceInstanceIDs.add(sceInstance.getSceInstanceId());
				
				
//				if (engineEndpoints.containsKey(Constants.ENGINE_APACHE_ODE)) {
//
//					List<String> apacheODEEndpoints = engineEndpoints.get(Constants.ENGINE_APACHE_ODE);
//					apacheODEEndpoints.add(getDeploymentService(sceInstance));
//				} else {
//
//					List<String> apacheODEEndpoints = new ArrayList<String>();
//					apacheODEEndpoints.add(getDeploymentService(sceInstance));
//					engineEndpoints.put(Constants.ENGINE_APACHE_ODE, apacheODEEndpoints);
//				}

			} else {
				translatorEndpoints.add(Constants.TRANSLATOR_DEADLETTER_QUEUE);
			}

		}

		headers.put(Constants.ENGINE_ENDPOINTS_HEADER, engineEndpoints.toString());
		headers.put(Constants.TRANSLATOR_ENDPOINTS_HEADER, new ArrayList<String>(translatorEndpoints));
		
		
		RegisterDeploymentSCEInstanceIDs deploymentSCEInstanceIDs = new RegisterDeploymentSCEInstanceIDs(processBundleType.getProcessModelID(), sceInstanceIDs);
		
		messageProducer.sendObject(deploymentSCEInstanceIDs, UUID.randomUUID().toString(), Constants.EVENT_OBJECT_QUEUE);
		
	}

	private void determineTranslators(Map<String, Object> headers, String processModelID) {

		List<String> translatorEndpoints = new ArrayList<String>();
		ArrayList<String> sceInstanceIDs = new ArrayList<String>();

		String choreographyModelId = (String) headers.get(Constants.CHOR_MODEL_ID_HEADER);

		// get active instances
		Collection<SCEInstance> activeInstances = managementRegistry.getActiveSceInstances();

		if (activeInstances.isEmpty()) {

			throw new IllegalStateException("There are no active SCE instances for deployment!");
		}

		// get instances that already have one process model of the choreography
		// model deployed
		Collection<String> instancesOfChorModel = eventRegistry.getSCEInstanceOfChoreographyModel(choreographyModelId);

		Iterator<SCEInstance> activeIter = activeInstances.iterator();

		SCEInstance deploymentInstance = null;

		// iterate over active instances
//		while (activeIter.hasNext()) {
//			SCEInstance instance = activeIter.next();
//
//			if (!instancesOfChorModel.contains(instance.getSceInstanceId())) {
//
//				deploymentInstance = instance;
//
//			}
//		}

		// if there is no instance where no process model of the choreography
		// model is deployed,
		// choose a random one
		if (deploymentInstance == null) {

			int index = myRandom(0, activeInstances.size() );
			Object[] activeInstancesArray = activeInstances.toArray();
			deploymentInstance = (SCEInstance) activeInstancesArray[index];

		}

		StringBuffer engineEndpoints = new StringBuffer();
		
		//Map<String, List<String>> engineEndpoints = new HashMap<String, List<String>>();
		if (deploymentInstance.getSceInstanceType().equals(SCEInstanceTypeEnum.APACHE_ODE)) {
	
			translatorEndpoints.add(Constants.TRANSLATOR_ODE_QUEUE);
			
			engineEndpoints.append(Constants.ENGINE_APACHE_ODE+ "=" + getDeploymentService(deploymentInstance)+",");
			sceInstanceIDs.add(deploymentInstance.getSceInstanceId());
			
			
//			if (engineEndpoints.containsKey(Constants.ENGINE_APACHE_ODE)) {
//
//				List<String> apacheODEEndpoints = engineEndpoints.get(Constants.ENGINE_APACHE_ODE);
//				apacheODEEndpoints.add(getDeploymentService(deploymentInstance));
//			} else {
//
//				List<String> apacheODEEndpoints = new ArrayList<String>();
//				apacheODEEndpoints.add(getDeploymentService(deploymentInstance));
//				engineEndpoints.put(Constants.ENGINE_APACHE_ODE, apacheODEEndpoints);
//			}
			
			

		} else {
			translatorEndpoints.add(Constants.TRANSLATOR_DEADLETTER_QUEUE);
		}

		
		
		headers.put(Constants.ENGINE_ENDPOINTS_HEADER, engineEndpoints.toString());
		headers.put(Constants.TRANSLATOR_ENDPOINTS_HEADER, translatorEndpoints);
		
		RegisterDeploymentSCEInstanceIDs deploymentSCEInstanceIDs = new RegisterDeploymentSCEInstanceIDs(processModelID, sceInstanceIDs);
		
		messageProducer.sendObject(deploymentSCEInstanceIDs, UUID.randomUUID().toString(), Constants.EVENT_OBJECT_QUEUE);
	}

	private void determineTranslators(Map<String, Object> headers, ProcessBundleResultType processBundleResultType) {

		
		Set<String> translatorEndpoints = new HashSet<String>();

		StringBuffer engineEndpoints = new StringBuffer();
		
		//ArrayList<String> sceInstanceIDs = new ArrayList<String>();
		
		
		Collection<String> sceInstanceIDs = eventRegistry.getSCEInstanceOfProcessModel(processBundleResultType.getProcessModelID());
		ArrayList<String> sceInstanceIDsList = new ArrayList<String>();
		sceInstanceIDsList.addAll(sceInstanceIDs);
		
		for(String sceInstanceID: sceInstanceIDs){
			
			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceID);
			
			if(sceInstance == null){
				throw new IllegalStateException("The DB does not contain any SCE instance corresponding for the specifyied processModelID: " + processBundleResultType.getProcessModelID());
			}
			
			if (sceInstance.getSceInstanceType().equals(SCEInstanceTypeEnum.APACHE_ODE)) {

				translatorEndpoints.add(Constants.TRANSLATOR_ODE_UNDEPLOYMENT_QUEUE);
				engineEndpoints.append(Constants.ENGINE_APACHE_ODE+ "=" + getDeploymentService(sceInstance)+",");
				
				ProcessModelSCEInstanceRef ref = eventRegistry.getProcessModelSCEInstanceRef(processBundleResultType.getProcessModelID(), sceInstanceID);
				processBundleResultType.setPackageName(ref.getOdePackageName());
				
			} else {
				translatorEndpoints.add(Constants.TRANSLATOR_DEADLETTER_QUEUE);
			}
			
				
		}
		
		headers.put(Constants.ENGINE_ENDPOINTS_HEADER, engineEndpoints.toString());
		headers.put(Constants.TRANSLATOR_ENDPOINTS_HEADER, new ArrayList<String>(translatorEndpoints));
		
		RegisterUndeploymentSCEInstanceIDs deploymentSCEInstanceIDs = new RegisterUndeploymentSCEInstanceIDs(processBundleResultType.getProcessModelID(), sceInstanceIDsList);
		
		messageProducer.sendObject(deploymentSCEInstanceIDs, UUID.randomUUID().toString(), Constants.EVENT_OBJECT_QUEUE);
		
		
	}
	
	private String getDeploymentService(SCEInstance deploymentInstance) {

		Collection<ServiceEndpointData> endpoints = managementRegistry.getServiceEndpointData(deploymentInstance);

		Iterator<ServiceEndpointData> endpointIter = endpoints.iterator();

		while (endpointIter.hasNext()) {

			ServiceEndpointData endpointData = endpointIter.next();
			String serviceName = endpointData.getServiceName();

			if (serviceName != null && serviceName.equals(Constants.SERVICE_DEPLOYMENT)) {
				return endpointData.getEndpointURL();
			}
		}
		return null;
	}

	private int myRandom(int low, int high) {
		return (int) (Math.random() * (high - low) + low);
	}

	public ManagementRegistry getManagementRegistry() {
		return managementRegistry;
	}

	public void setManagementRegistry(ManagementRegistry managementRegistry) {
		this.managementRegistry = managementRegistry;
	}

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}

}
