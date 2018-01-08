package org.apache.ode.pmapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.9
 * 2017-08-24T14:09:35.324+02:00
 * Generated source version: 3.0.9
 * 
 */
@WebService(targetNamespace = "http://www.apache.org/ode/pmapi", name = "ProcessManagementPortType")
@XmlSeeAlso({ObjectFactory.class, org.apache.ode.pmapi.types._2006._08._02.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ProcessManagementPortType {

    @WebResult(name = "process-info-list", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info-list")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfoList listProcesses(
        @WebParam(partName = "filter", name = "filter")
        java.lang.String filter,
        @WebParam(partName = "orderKeys", name = "orderKeys")
        java.lang.String orderKeys
    ) throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo setRetired(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid,
        @WebParam(partName = "retired", name = "retired")
        boolean retired
    ) throws ManagementFault;

    @WebResult(name = "process-info-list", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info-list")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfoList listAllProcesses() throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo setProcessProperty(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid,
        @WebParam(partName = "propertyName", name = "propertyName")
        javax.xml.namespace.QName propertyName,
        @WebParam(partName = "propertyValue", name = "propertyValue")
        java.lang.String propertyValue
    ) throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo getProcessInfo(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid
    ) throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo activate(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid
    ) throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo getProcessInfoCustom(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid,
        @WebParam(partName = "customizer", name = "customizer")
        java.lang.String customizer
    ) throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo setProcessPropertyNode(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid,
        @WebParam(partName = "propertyName", name = "propertyName")
        javax.xml.namespace.QName propertyName,
        @WebParam(partName = "propertyValue", name = "propertyValue")
        java.lang.Object propertyValue
    ) throws ManagementFault;

    @WebResult(name = "process-info-list", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info-list")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfoList listProcessesCustom(
        @WebParam(partName = "filter", name = "filter")
        java.lang.String filter,
        @WebParam(partName = "orderKeys", name = "orderKeys")
        java.lang.String orderKeys,
        @WebParam(partName = "customizer", name = "customizer")
        java.lang.String customizer
    ) throws ManagementFault;

    @WebResult(name = "process-info", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "process-info")
    @WebMethod
    public org.apache.ode.pmapi.types._2006._08._02.TProcessInfo getExtensibilityElements(
        @WebParam(partName = "pid", name = "pid")
        javax.xml.namespace.QName pid,
        @WebParam(partName = "aids", name = "aids")
        AidsType aids
    ) throws ManagementFault;

    @WebResult(name = "isRetired", targetNamespace = "http://www.apache.org/ode/pmapi", partName = "isRetired")
    @WebMethod(action = "http://www.apache.org/ode/pmapi/setPackageRetired")
    public boolean setPackageRetired(
        @WebParam(partName = "packageName", name = "packageName")
        java.lang.String packageName,
        @WebParam(partName = "retired", name = "retired")
        boolean retired
    ) throws ManagementFault;
}