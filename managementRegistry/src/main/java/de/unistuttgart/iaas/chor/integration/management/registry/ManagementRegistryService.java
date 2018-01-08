package de.unistuttgart.iaas.chor.integration.management.registry;

import java.util.Collection;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceStatusEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceTypeEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.ServiceEndpointData;

@Transactional
public class ManagementRegistryService implements ManagementRegistry {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public SCEInstance registerSceInstance(String sceInstanceId, SCEInstanceTypeEnum sceInstanceType, String endpointBaseUrl, String managementQueueEndpoint) {

		SCEInstance instance = new SCEInstance();
		instance.setSceInstanceId(sceInstanceId);
		instance.setSceInstanceType(sceInstanceType);
		instance.setManagementQueueEndpoint(managementQueueEndpoint);
		
		
		instance.setEndpointBaseUrl(endpointBaseUrl);
		instance.setStatus(SCEInstanceStatusEnum.UNKNOWN);
		
		try {

			em.persist(instance);
		} catch (EntityExistsException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return instance;
	}

	@Override
	public SCEInstance getSceInstance(String sceInstanceId) {

		return em.find(SCEInstance.class, sceInstanceId);
	}
	
	@Override
	public SCEInstance getSceInstanceByEndpointBaseURL(String endpointBaseUrl) {
		
		TypedQuery<SCEInstance> query = em.createQuery("SELECT i FROM SCEInstance i " + "WHERE i.endpointBaseUrl = :endpointBaseUrl", SCEInstance.class);
		query.setParameter("endpointBaseUrl", endpointBaseUrl);
		
		if(!query.getResultList().isEmpty()){
			return query.getResultList().get(0);
		}
		return null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<SCEInstance> getActiveSceInstances() {
		Query query = em.createQuery("SELECT i FROM SCEInstance i " + "WHERE i.status = :status");
		query.setParameter("status", SCEInstanceStatusEnum.ACTIVE);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<String> getActiveSceInstanceIds() {
		Query query = em.createQuery("SELECT i.sceInstanceId FROM SCEInstance i " + "WHERE i.status = :status");
		query.setParameter("status", SCEInstanceStatusEnum.ACTIVE);

		return query.getResultList();
	}

	@Override
	public void unregisterSceInstance(SCEInstance instance) throws IllegalArgumentException {
		instance = em.find(SCEInstance.class, instance.getSceInstanceId());

		// Remove all referenced ServiceEndpointData entities
		for (ServiceEndpointData data : instance.getManagementServiceEndpoints()) {
			em.remove(data);
		}

		// Remove the SCE instance
		em.remove(instance);
	}

	@Override
	public ServiceEndpointData registerSceServiceEndpoint(SCEInstance instance, String namespace, String serviceName, String endpointName, String endpointURL) throws IllegalArgumentException {
		if (!Preconditions.check(instance)) {
			throw new IllegalArgumentException();
		}

		instance = em.find(SCEInstance.class, instance.getSceInstanceId());

		ServiceEndpointData endpoint = new ServiceEndpointData();
		endpoint.setEndpointName(endpointName);
		endpoint.setEndpointURL(endpointURL);
		endpoint.setNamespace(namespace);
		endpoint.setServiceName(serviceName);

		try {
			// Set references
			endpoint.setSceInstance(instance);
			instance.getManagementServiceEndpoints().add(endpoint);

			em.persist(endpoint);
		} catch (EntityExistsException e) {
			return null;
		}

		return endpoint;
	}

	@Override
	public void updateSCEInstanceStatus(String sceInstanceId, SCEInstanceStatusEnum status) {
		SCEInstance instance = em.find(SCEInstance.class, sceInstanceId);

		instance.setStatus(status);

	}

	@Override
	public Collection<ServiceEndpointData> getServiceEndpointData(SCEInstance sceInstance) {
				
		Query query = em.createQuery("SELECT data FROM ServiceEndpointData data " + "WHERE data.sceInstance.sceInstanceId = :id");
		query.setParameter("id", sceInstance.getSceInstanceId());
		
		
		return  query.getResultList();
	}



}
