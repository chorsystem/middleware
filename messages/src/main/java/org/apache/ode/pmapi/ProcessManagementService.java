package org.apache.ode.pmapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.9
 * 2017-08-24T14:09:35.344+02:00
 * Generated source version: 3.0.9
 * 
 */
@WebServiceClient(name = "ProcessManagementService", 
                  wsdlLocation = "file:/C:/Users/weissas/workspaces/integrationsystem_dev/messages/src/main/resources/wsdl/pmapi.wsdl",
                  targetNamespace = "http://www.apache.org/ode/pmapi") 
public class ProcessManagementService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.apache.org/ode/pmapi", "ProcessManagementService");
    public final static QName ProcessManagementPort = new QName("http://www.apache.org/ode/pmapi", "ProcessManagementPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/weissas/workspaces/integrationsystem_dev/messages/src/main/resources/wsdl/pmapi.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProcessManagementService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/weissas/workspaces/integrationsystem_dev/messages/src/main/resources/wsdl/pmapi.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProcessManagementService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProcessManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProcessManagementService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ProcessManagementPortType
     */
    @WebEndpoint(name = "ProcessManagementPort")
    public ProcessManagementPortType getProcessManagementPort() {
        return super.getPort(ProcessManagementPort, ProcessManagementPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProcessManagementPortType
     */
    @WebEndpoint(name = "ProcessManagementPort")
    public ProcessManagementPortType getProcessManagementPort(WebServiceFeature... features) {
        return super.getPort(ProcessManagementPort, ProcessManagementPortType.class, features);
    }

}
