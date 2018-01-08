
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
 * <p>Java class for tInstanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInstanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="process-name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="root-scope" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeRef" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tInstanceStatus"/>
 *         &lt;element name="dt-started" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dt-last-active" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dt-error-since" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlation-properties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="correlation-property" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tCorrelationProperty" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="event-info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="first-dtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="last-dtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fault-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tFaultInfo" minOccurs="0"/>
 *         &lt;element name="failures" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tFailuresInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInstanceInfo", propOrder = {
    "iid",
    "pid",
    "processName",
    "rootScope",
    "status",
    "dtStarted",
    "dtLastActive",
    "dtErrorSince",
    "correlationProperties",
    "eventInfo",
    "faultInfo",
    "failures"
})
public class TInstanceInfo {

    @XmlElement(required = true)
    protected String iid;
    @XmlElement(required = true)
    protected String pid;
    @XmlElement(name = "process-name", required = true)
    protected QName processName;
    @XmlElement(name = "root-scope")
    protected TScopeRef rootScope;
    @XmlElement(required = true)
    protected TInstanceStatus status;
    @XmlElement(name = "dt-started", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtStarted;
    @XmlElement(name = "dt-last-active", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtLastActive;
    @XmlElement(name = "dt-error-since")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtErrorSince;
    @XmlElement(name = "correlation-properties")
    protected TInstanceInfo.CorrelationProperties correlationProperties;
    @XmlElement(name = "event-info")
    protected TInstanceInfo.EventInfo eventInfo;
    @XmlElement(name = "fault-info")
    protected TFaultInfo faultInfo;
    protected TFailuresInfo failures;

    /**
     * Gets the value of the iid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIid() {
        return iid;
    }

    /**
     * Sets the value of the iid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIid(String value) {
        this.iid = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the processName property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProcessName(QName value) {
        this.processName = value;
    }

    /**
     * Gets the value of the rootScope property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeRef }
     *     
     */
    public TScopeRef getRootScope() {
        return rootScope;
    }

    /**
     * Sets the value of the rootScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeRef }
     *     
     */
    public void setRootScope(TScopeRef value) {
        this.rootScope = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TInstanceStatus }
     *     
     */
    public TInstanceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInstanceStatus }
     *     
     */
    public void setStatus(TInstanceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the dtStarted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtStarted() {
        return dtStarted;
    }

    /**
     * Sets the value of the dtStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtStarted(XMLGregorianCalendar value) {
        this.dtStarted = value;
    }

    /**
     * Gets the value of the dtLastActive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtLastActive() {
        return dtLastActive;
    }

    /**
     * Sets the value of the dtLastActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtLastActive(XMLGregorianCalendar value) {
        this.dtLastActive = value;
    }

    /**
     * Gets the value of the dtErrorSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtErrorSince() {
        return dtErrorSince;
    }

    /**
     * Sets the value of the dtErrorSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtErrorSince(XMLGregorianCalendar value) {
        this.dtErrorSince = value;
    }

    /**
     * Gets the value of the correlationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link TInstanceInfo.CorrelationProperties }
     *     
     */
    public TInstanceInfo.CorrelationProperties getCorrelationProperties() {
        return correlationProperties;
    }

    /**
     * Sets the value of the correlationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInstanceInfo.CorrelationProperties }
     *     
     */
    public void setCorrelationProperties(TInstanceInfo.CorrelationProperties value) {
        this.correlationProperties = value;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TInstanceInfo.EventInfo }
     *     
     */
    public TInstanceInfo.EventInfo getEventInfo() {
        return eventInfo;
    }

    /**
     * Sets the value of the eventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInstanceInfo.EventInfo }
     *     
     */
    public void setEventInfo(TInstanceInfo.EventInfo value) {
        this.eventInfo = value;
    }

    /**
     * Gets the value of the faultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TFaultInfo }
     *     
     */
    public TFaultInfo getFaultInfo() {
        return faultInfo;
    }

    /**
     * Sets the value of the faultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFaultInfo }
     *     
     */
    public void setFaultInfo(TFaultInfo value) {
        this.faultInfo = value;
    }

    /**
     * Gets the value of the failures property.
     * 
     * @return
     *     possible object is
     *     {@link TFailuresInfo }
     *     
     */
    public TFailuresInfo getFailures() {
        return failures;
    }

    /**
     * Sets the value of the failures property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFailuresInfo }
     *     
     */
    public void setFailures(TFailuresInfo value) {
        this.failures = value;
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
     *         &lt;element name="correlation-property" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tCorrelationProperty" maxOccurs="unbounded"/>
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
        "correlationProperty"
    })
    public static class CorrelationProperties {

        @XmlElement(name = "correlation-property", required = true)
        protected List<TCorrelationProperty> correlationProperty;

        /**
         * Gets the value of the correlationProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the correlationProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorrelationProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCorrelationProperty }
         * 
         * 
         */
        public List<TCorrelationProperty> getCorrelationProperty() {
            if (correlationProperty == null) {
                correlationProperty = new ArrayList<TCorrelationProperty>();
            }
            return this.correlationProperty;
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
     *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="first-dtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="last-dtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "count",
        "firstDtime",
        "lastDtime"
    })
    public static class EventInfo {

        protected int count;
        @XmlElement(name = "first-dtime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar firstDtime;
        @XmlElement(name = "last-dtime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastDtime;

        /**
         * Gets the value of the count property.
         * 
         */
        public int getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         */
        public void setCount(int value) {
            this.count = value;
        }

        /**
         * Gets the value of the firstDtime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFirstDtime() {
            return firstDtime;
        }

        /**
         * Sets the value of the firstDtime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFirstDtime(XMLGregorianCalendar value) {
            this.firstDtime = value;
        }

        /**
         * Gets the value of the lastDtime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastDtime() {
            return lastDtime;
        }

        /**
         * Sets the value of the lastDtime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastDtime(XMLGregorianCalendar value) {
            this.lastDtime = value;
        }

    }

}
