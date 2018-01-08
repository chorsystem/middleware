package de.unistuttgart.iaas.chor.integration.management.registry;

import java.util.Collection;

import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceStatusEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceTypeEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.ServiceEndpointData;


public interface ManagementRegistry {

	
	/**
	 * Creates a new SCE instance entity and assigns the SCE instance to the
	 * given SCE component.
	 * 
	 * @param sceInstanceId
	 *            The UUID of the SCE instance.
	 *            
	 * @param endpointBaseUrl
	 * 			The base url of the endpoint where the SCE is reachable, i.e., host name and port           
	 * 
	 * @return managed entity of type <code>SCEInstance</code>, null if no
	 *         entity was created
	 * 
	 * @throws IllegalArgumentException
	 *             if entity of type <code>SCEComponent </code> is not in
	 *             managed state.
	 */
	public SCEInstance registerSceInstance(String sceInstanceId, SCEInstanceTypeEnum sceInstanceType, String endpointBaseUrl, String managementQueueEndpoint);

	/**
	 * Gets a {@link SCEInstance} entity by id.
	 * 
	 * @param sceInstanceId
	 *            the SCE instance UUID
	 * @return managed entity of type <code>SCEInstance</code>,
	 *         <code>null</code> if entity was not found.
	 */
	public SCEInstance getSceInstance(String sceInstanceId);
	
	public SCEInstance getSceInstanceByEndpointBaseURL(String endpointBaseUrl);
	
	/**
	 * Provides a collection of all {@link SCEInstance} entities with status="ACTIVE".
	 * 
	 * @return collection of managed entities of type
	 *         <code>SCEInstance</code>
	 */
	public Collection<SCEInstance> getActiveSceInstances();
	
	/**
	 * Provides a collection of ids of all SCE instances with status="ACTIVE".
	 * 
	 * @return collection of SCE instance ids.
	 */
	public Collection<String> getActiveSceInstanceIds();
	
	
	
	/**
	 * Removes a {@link SCEInstance} entity. Also removes all attached objects
	 * like {@link ServiceEndpointData}.
	 * 
	 * @param instance
	 *            the managed SCE instance entity.
	 * 
	 * @throws IllegalArgumentException
	 *             if entity of type <code>SCEInstance</code> is not in managed
	 *             state.
	 */
	public void unregisterSceInstance(SCEInstance instance)
			throws IllegalArgumentException;
	
	/**
	 * Creates a new {@link ServiceEndpointData} entity and assigns it to the
	 * referenced SCEInstance entity.
	 * 
	 * @param instance
	 *            The SCE instance to which the {@link ServiceEndpointData}
	 *            entity should be attached.
	 * @param namespace
	 *            The namespace URL of the service.
	 * @param serviceName
	 *            The name of the service.
	 * @param endpointName
	 *            The endpoint name of the service.
	 * @param endpointURL
	 *            The URL of the service endpoint.
	 * 
	 * @return managed entity of type <code>ServiceEndpointData</code>, null if
	 *         no entity was created
	 * 
	 * @throws IllegalArgumentException
	 *             if entity of type <code>SCEInstance</code> is not in managed
	 *             state.
	 */
	public ServiceEndpointData registerSceServiceEndpoint(SCEInstance instance,
			String namespace, String serviceName, String endpointName,
			String endpointURL) throws IllegalArgumentException;

	/**
	 * Updates the status flag of a persisted SCE instance
	 * 
	 * @param sceInstanceId of the SCE instance to change status
	 * @param status to set
	 */
	public void updateSCEInstanceStatus(String sceInstanceId,
			SCEInstanceStatusEnum status);
	
	public Collection<ServiceEndpointData> getServiceEndpointData(SCEInstance sceInstance);
	
	

}
