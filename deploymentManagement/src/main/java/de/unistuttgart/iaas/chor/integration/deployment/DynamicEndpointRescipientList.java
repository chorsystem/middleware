package de.unistuttgart.iaas.chor.integration.deployment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.RecipientList;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceTypeEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.ServiceEndpointData;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;
import de.unistuttgart.iaas.marshalling.MarshallingUtils;

public class DynamicEndpointRescipientList {

	private ManagementRegistry managementRegistry;
	private EventRegistry eventRegistry;

	@RecipientList
	public List<String> route(@Headers Map<String, Object> headers, @Body String input) {

		ProcessBundleType processBundleType = (ProcessBundleType) MarshallingUtils.unmarshalNonRootElements(input);
		
		List<String> translatorEndpoints = new ArrayList<String>();
		
		if(processBundleType.getEndpoint()!= null && !processBundleType.getEndpoint().isEmpty()){
			
			translatorEndpoints = chooseTranslator(headers, processBundleType);
			
		}
		else{
			
			translatorEndpoints = chooseTranslator(headers);	
		}

		return translatorEndpoints;
	}


	private List<String> chooseTranslator(Map<String, Object> headers, ProcessBundleType processBundleType){
		
	
		
		Set<String> endpoints = new HashSet<String>();	
		ArrayList<String> endpointsHeader = new ArrayList<String>();
		
		for(String endpoint: processBundleType.getEndpoint()){
		
			SCEInstance sceInstance = managementRegistry.getSceInstanceByEndpointBaseURL(endpoint);
			if(sceInstance.getSceInstanceType().equals(SCEInstanceTypeEnum.APACHE_ODE)){
				
				endpoints.add(Constants.TRANSLATOR_ODE_QUEUE);
				endpointsHeader.add(endpoint);

			}
			else{
				endpoints.add(Constants.TRANSLATOR_DEADLETTER_QUEUE);
			}
			
		}
		
		headers.put(Constants.ENGINE_ENDPOINTS_HEADER, endpointsHeader);
		
		return new ArrayList<String>(endpoints);
	}
	
	private List<String> chooseTranslator(Map<String, Object> headers){
		
		List<String> translatorEndpoints = new ArrayList<String>();
		
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
		while (activeIter.hasNext()) {
			SCEInstance instance = activeIter.next();

			if (!instancesOfChorModel.contains(instance.getSceInstanceId())) {

				deploymentInstance = instance;

			}
		}

		// if there is no instance where no process model of the choreography
		// model is deployed,
		// choose a random one
		if (deploymentInstance == null) {

			int index = myRandom(0, activeInstances.size() - 1);
			Object[] activeInstancesArray = activeInstances.toArray();
			deploymentInstance = (SCEInstance) activeInstancesArray[index];
			

		}
		
		Collection<ServiceEndpointData> endpoints = managementRegistry.getServiceEndpointData(deploymentInstance);

		Iterator<ServiceEndpointData> endpointIter = endpoints.iterator();

		while (endpointIter.hasNext()) {

			ServiceEndpointData endpointData = endpointIter.next();
			String serviceName = endpointData.getServiceName();

			if (serviceName != null && serviceName.equals("DeploymentService")) {

				List<String> endpointHeaderURLs = new ArrayList<String>();
				endpointHeaderURLs.add(endpointData.getEndpointURL());
				headers.put(Constants.ENGINE_ENDPOINTS_HEADER, endpointHeaderURLs);
		
			}
		}

		if(deploymentInstance.getSceInstanceType().equals(SCEInstanceTypeEnum.APACHE_ODE)){
			translatorEndpoints.add(Constants.TRANSLATOR_ODE_QUEUE);
		}
		else{
			translatorEndpoints.add(Constants.TRANSLATOR_DEADLETTER_QUEUE);
		}
		
		return translatorEndpoints;
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
