package org.apache.ode.deployapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.9
 * 2018-01-08T22:45:25.769+01:00
 * Generated source version: 3.0.9
 * 
 */
@WebServiceClient(name = "DeploymentService", 
                  wsdlLocation = "file:/C:/Users/weissas/workspaces/integrationsystem_dev/messages/src/main/resources/wsdl/deploy.wsdl",
                  targetNamespace = "http://www.apache.org/ode/deployapi") 
public class DeploymentService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.apache.org/ode/deployapi", "DeploymentService");
    public final static QName DeploymentPort = new QName("http://www.apache.org/ode/deployapi", "DeploymentPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/weissas/workspaces/integrationsystem_dev/messages/src/main/resources/wsdl/deploy.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DeploymentService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/weissas/workspaces/integrationsystem_dev/messages/src/main/resources/wsdl/deploy.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DeploymentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeploymentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeploymentService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns DeploymentPortType
     */
    @WebEndpoint(name = "DeploymentPort")
    public DeploymentPortType getDeploymentPort() {
        return super.getPort(DeploymentPort, DeploymentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeploymentPortType
     */
    @WebEndpoint(name = "DeploymentPort")
    public DeploymentPortType getDeploymentPort(WebServiceFeature... features) {
        return super.getPort(DeploymentPort, DeploymentPortType.class, features);
    }

}
