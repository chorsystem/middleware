package de.unistuttgart.iaas.chor.integration.service.registry;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.xml.namespace.QName;

import org.springframework.transaction.annotation.Transactional;

import de.unistuttgart.iaas.chor.integration.service.registry.domain.Port;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.PortPK;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.PortType;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.PortTypePK;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.Service;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.ServicePK;

@Transactional
public class ServiceRegistryService implements ServiceRegistry {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Service registerService(QName serviceQName, QName portQName, QName portTypeQName, String modelId) {

		Service service = getService(serviceQName);

		if (service == null) {
			service = new Service();
			ServicePK servicePK = new ServicePK(serviceQName.getLocalPart(), serviceQName.getNamespaceURI());
			service.setCompositePrimaryKey(servicePK);
		
		}
		service.setModelId(modelId);
		
		PortType portType = getPortType(portTypeQName);

		if (portType == null) {

			portType = new PortType();
			PortTypePK portTypePK = new PortTypePK(portTypeQName.getLocalPart(), portTypeQName.getNamespaceURI());
			portType.setCompositePrimaryKey(portTypePK);

		}

		Port port = getPort(portQName);

		if (port == null) {

			port = new Port();
			PortPK portPK = new PortPK(portQName.getLocalPart(), portQName.getNamespaceURI());
			port.setCompositePrimaryKey(portPK);
			port.setService(service);
			service.getPorts().add(port);

			port.setPortType(portType);
			portType.getPorts().add(port);

		}

		em.persist(portType);
		em.persist(service);
		em.persist(port);

		return service;
	}

	@Override
	public Service getService(QName serviceQName) {

		return em.find(Service.class, new ServicePK(serviceQName.getLocalPart(), serviceQName.getNamespaceURI()));

	}

	@Override
	public Collection<Service> getServices(String modelId) {
		Query query = em.createQuery("SELECT s FROM Service s " + "WHERE s.modelId = :modelId");
		query.setParameter("modelId", modelId);

		return query.getResultList();
	}

	@Override
	public void assignEndpointURL(String modelId, String sceInstanceID, String endpointURL) {

		Collection<Service> services = getServices(modelId);

		for (Service service : services) {

			String completeUrl = endpointURL + service.getCompositePrimaryKey().getName();
			service.setEndpointURL(completeUrl);
			service.setSceInstanceID(sceInstanceID);

			em.persist(service);

		}

	}
	
	@Override
	public void assignEndpointURL(QName serviceName, String endpointURL) {

			Service service = getService(serviceName);
			
			if(service != null){
			
				service.setEndpointURL(endpointURL);
			
				em.persist(service);

			}
		
			
	}
	

	@Override
	public void unregisterService(Service service) {

		service = em.find(Service.class, service.getCompositePrimaryKey());

		for (Port port : service.getPorts()) {
			em.remove(port);
		}

		em.remove(service);

	}

	@Override
	public void unregisterServices(String modelId) {

		Collection<Service> services = getServices(modelId);

		for (Service service : services) {
			unregisterService(service);
		}

	}

	@Override
	public Collection<Port> getPorts(Service service) {
		Query query = em.createQuery("SELECT port FROM Port port " + "WHERE port.service.compositePrimaryKey = :compositePrimaryKey");
		query.setParameter("compositePrimaryKey", service.getCompositePrimaryKey());

		return query.getResultList();
	}

	@Override
	public Collection<PortType> getPortTypes(Service service) {
		Query query = em.createQuery("SELECT pt FROM PortType pt " + "WHERE pt.ports IN ( SELECT s.ports FROM Service s WHERE s.compositePrimaryKey = :compositePrimaryKey )");

		query.setParameter("compositePrimaryKey", service.getCompositePrimaryKey());

		return query.getResultList();
	}

	@Override
	public Service getService(QName serviceQName, QName portTypeQName, QName portQName, String modelId) {

		Service service = getService(serviceQName);
		PortType portType = getPortType(portTypeQName);

		Port port = getPort(portQName);

		if (port.getService().equals(service) && port.getPortType().equals(portType)&& service.getModelId().equals(modelId)) {

			return service;
		}


		return null;

	}
	
	@Override
	public Service getService(QName service, QName portType, QName port, String modelId, String sceInstanceID) {
		
		
		TypedQuery<Service> q1 = em.createQuery("SELECT s FROM Service s WHERE s.compositePrimaryKey.name =:serviceName AND s.compositePrimaryKey.namespace = :serviceNamespace AND" +
				" s.sceInstanceID = :sceInstanceID" , Service.class);
		q1.setParameter("serviceName", service.getLocalPart());
		q1.setParameter("serviceNamespace", service.getNamespaceURI());
		
		// TODO: also use modelId as parameter
		// currently it is not sent with the request
		//q1.setParameter("modelId", modelId);
		q1.setParameter("sceInstanceID", sceInstanceID);
		
		
		if(!q1.getResultList().isEmpty()){
			return q1.getResultList().get(0);
		}
	
		return null;
	}
	
	@Override
	public Service getService(QName serviceQName, QName portTypeQName, QName portQName) {

		Service service = getService(serviceQName);
		PortType portType = getPortType(portTypeQName);
		Port port = getPort(portQName);

		
		if(service == null || port == null || portType == null){
			return null;
		}
		
		
		if (port.getService().equals(service) && port.getPortType().equals(portType)) {

			return service;
		}

		return null;

	}

	@Override
	public PortType getPortType(QName portTypeQName) {

		// Query query =
		// em.createQuery("SELECT pt FROM PortType pt WHERE  pt.compositePrimaryKey.name = :portTypeName AND pt.compositePrimaryKey.namespace = :portTypeNamespace");
		// query.setParameter("portTypeName", portType.getLocalPart());
		// query.setParameter("portTypeNamespace", portType.getNamespaceURI());
		//
		return em.find(PortType.class, new PortTypePK(portTypeQName.getLocalPart(), portTypeQName.getNamespaceURI()));

		// return (PortType)query.getSingleResult();
	}

	@Override
	public Port getPort(QName portQName) {
		// TODO Auto-generated method stub
		return em.find(Port.class, new PortPK(portQName.getLocalPart(), portQName.getNamespaceURI()));

	}

	@Override
	public Service registerService(QName serviceQName, QName portQName, QName portTypeQName) {
		
		return registerService(serviceQName, portQName, portTypeQName, "");
	}

	

}
