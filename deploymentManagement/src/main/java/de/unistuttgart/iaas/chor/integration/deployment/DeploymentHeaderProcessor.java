package de.unistuttgart.iaas.chor.integration.deployment;

import java.util.Collection;
import java.util.Iterator;

import javax.xml.ws.Holder;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.ServiceEndpointData;

public class DeploymentHeaderProcessor implements Processor {

	private ManagementRegistry managementRegistry;
	private EventRegistry eventRegistry;

	@Override
	public void process(Exchange exchange) throws Exception {

		exchange.getIn().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.apache.org/ode/deployapi");
		exchange.getIn().setHeader(CxfConstants.OPERATION_NAME, "deploy");

		Object[] obj = (Object[]) exchange.getIn().getBody();

		String name = ((Holder<String>) obj[0]).value;

		// get choreography model id
		String choreographyModelId = exchange.getIn().getHeader(Constants.CHOR_MODEL_ID_HEADER, String.class);

		// get active instances
		Collection<SCEInstance> activeInstances = managementRegistry.getActiveSceInstances();

		if(activeInstances.isEmpty()){
			
			throw new IllegalStateException("There are no active SCE instances for deployment!");
			
		}
		
		
		// get instances that already have one process model of the choreography model deployed
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
		
		// if there is no instance where no process model of the choreography model is deployed,
		// choose a random one
		if(deploymentInstance == null){
			
			int index = myRandom(0, activeInstances.size()-1);
			Object[] activeInstancesArray =  activeInstances.toArray();
			deploymentInstance = (SCEInstance)activeInstancesArray[index];
			
		}
		
	
		Collection<ServiceEndpointData> endpoints = managementRegistry.getServiceEndpointData(deploymentInstance);

		Iterator<ServiceEndpointData> endpointIter = endpoints.iterator();

		while (endpointIter.hasNext()) {

			ServiceEndpointData endpointData = endpointIter.next();
			String serviceName = endpointData.getServiceName();

			if (serviceName != null && serviceName.equals("DeploymentService")) {

				exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, endpointData.getEndpointURL());
			}

		}

		
		

	}
	
	private  int myRandom(int low, int high) {
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
