package de.unistuttgart.iaas.chor.integration.service.registry;

import java.util.Collection;

import javax.xml.namespace.QName;

import de.unistuttgart.iaas.chor.integration.service.registry.domain.Port;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.PortType;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.Service;


public interface ServiceRegistry {

    public Service registerService(QName serviceQName, QName portQName, QName portTypeQName, String modelId);
    
    public Service registerService(QName serviceQName, QName portQName, QName portTypeQName);
    
    public Service getService(QName serviceQName);
    
    public Service getService(QName service, QName portType, QName port, String modelId);
    
    public Service getService(QName service, QName portType, QName port);
    
    public Service getService(QName service, QName portType, QName port, String modelId, String sceInstanceID);
     
    public Collection<Service> getServices(String modelId);

    public void assignEndpointURL(String modelId, String sceInstanceID, String endpointURL);
    
    public void assignEndpointURL(QName service, String endpointURL);
   
    public void unregisterService(Service service);

    public void unregisterServices(String modelId);
 
    public Collection<Port> getPorts(Service service);
    
    public Collection<PortType> getPortTypes(Service service);
    
    public PortType getPortType(QName portTypeQName);
    
    public Port getPort(QName portQName);
  
    
}
