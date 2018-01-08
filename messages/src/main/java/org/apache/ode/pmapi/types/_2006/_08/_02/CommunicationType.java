
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for CommunicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processType" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="rollbackOnFault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceConfig" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *                   &lt;element name="replayType" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}ReplayType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exchange" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}ExchangeType"/>
 *                   &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *                   &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;choice>
 *                     &lt;element name="out" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                     &lt;element name="fault" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}FaultType"/>
 *                     &lt;element name="failure" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}FailureType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationType", propOrder = {
    "processType",
    "rollbackOnFault",
    "serviceConfig",
    "exchange"
})
public class CommunicationType {

    @XmlElement(required = true)
    protected QName processType;
    @XmlElement(defaultValue = "true")
    protected Boolean rollbackOnFault;
    @XmlElement(required = true)
    protected List<CommunicationType.ServiceConfig> serviceConfig;
    @XmlElement(required = true)
    protected List<CommunicationType.Exchange> exchange;

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProcessType(QName value) {
        this.processType = value;
    }

    /**
     * Gets the value of the rollbackOnFault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollbackOnFault() {
        return rollbackOnFault;
    }

    /**
     * Sets the value of the rollbackOnFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollbackOnFault(Boolean value) {
        this.rollbackOnFault = value;
    }

    /**
     * Gets the value of the serviceConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType.ServiceConfig }
     * 
     * 
     */
    public List<CommunicationType.ServiceConfig> getServiceConfig() {
        if (serviceConfig == null) {
            serviceConfig = new ArrayList<CommunicationType.ServiceConfig>();
        }
        return this.serviceConfig;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType.Exchange }
     * 
     * 
     */
    public List<CommunicationType.Exchange> getExchange() {
        if (exchange == null) {
            exchange = new ArrayList<CommunicationType.Exchange>();
        }
        return this.exchange;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="type" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}ExchangeType"/>
     *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}QName"/>
     *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;choice>
     *           &lt;element name="out" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *           &lt;element name="fault" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}FaultType"/>
     *           &lt;element name="failure" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}FailureType"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "createTime",
        "service",
        "operation",
        "in",
        "out",
        "fault",
        "failure"
    })
    public static class Exchange {

        @XmlElement(required = true)
        protected ExchangeType type;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createTime;
        @XmlElement(required = true)
        protected QName service;
        @XmlElement(required = true)
        protected String operation;
        @XmlElement(required = true)
        protected Object in;
        protected Object out;
        protected FaultType fault;
        protected FailureType failure;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ExchangeType }
         *     
         */
        public ExchangeType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExchangeType }
         *     
         */
        public void setType(ExchangeType value) {
            this.type = value;
        }

        /**
         * Gets the value of the createTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateTime() {
            return createTime;
        }

        /**
         * Sets the value of the createTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateTime(XMLGregorianCalendar value) {
            this.createTime = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link QName }
         *     
         */
        public QName getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link QName }
         *     
         */
        public void setService(QName value) {
            this.service = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperation(String value) {
            this.operation = value;
        }

        /**
         * Gets the value of the in property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getIn() {
            return in;
        }

        /**
         * Sets the value of the in property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setIn(Object value) {
            this.in = value;
        }

        /**
         * Gets the value of the out property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOut() {
            return out;
        }

        /**
         * Sets the value of the out property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOut(Object value) {
            this.out = value;
        }

        /**
         * Gets the value of the fault property.
         * 
         * @return
         *     possible object is
         *     {@link FaultType }
         *     
         */
        public FaultType getFault() {
            return fault;
        }

        /**
         * Sets the value of the fault property.
         * 
         * @param value
         *     allowed object is
         *     {@link FaultType }
         *     
         */
        public void setFault(FaultType value) {
            this.fault = value;
        }

        /**
         * Gets the value of the failure property.
         * 
         * @return
         *     possible object is
         *     {@link FailureType }
         *     
         */
        public FailureType getFailure() {
            return failure;
        }

        /**
         * Sets the value of the failure property.
         * 
         * @param value
         *     allowed object is
         *     {@link FailureType }
         *     
         */
        public void setFailure(FailureType value) {
            this.failure = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}QName"/>
     *         &lt;element name="replayType" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}ReplayType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "service",
        "replayType"
    })
    public static class ServiceConfig {

        @XmlElement(required = true)
        protected QName service;
        @XmlElement(required = true)
        protected ReplayType replayType;

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link QName }
         *     
         */
        public QName getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link QName }
         *     
         */
        public void setService(QName value) {
            this.service = value;
        }

        /**
         * Gets the value of the replayType property.
         * 
         * @return
         *     possible object is
         *     {@link ReplayType }
         *     
         */
        public ReplayType getReplayType() {
            return replayType;
        }

        /**
         * Sets the value of the replayType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReplayType }
         *     
         */
        public void setReplayType(ReplayType value) {
            this.replayType = value;
        }

    }

}
