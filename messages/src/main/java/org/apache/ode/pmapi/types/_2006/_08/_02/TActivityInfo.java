
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information about an activity.
 *             
 * 
 * <p>Java class for tActivityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tActivityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aiid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tActivityStatus"/>
 *         &lt;element name="scope" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeRef" minOccurs="0"/>
 *         &lt;element name="dt-enabled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dt-started" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dt-completed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="failure" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tFailureInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tActivityInfo", propOrder = {
    "name",
    "type",
    "aiid",
    "status",
    "scope",
    "dtEnabled",
    "dtStarted",
    "dtCompleted",
    "failure"
})
public class TActivityInfo {

    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String aiid;
    @XmlElement(required = true)
    protected TActivityStatus status;
    protected TScopeRef scope;
    @XmlElement(name = "dt-enabled")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEnabled;
    @XmlElement(name = "dt-started")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtStarted;
    @XmlElement(name = "dt-completed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCompleted;
    protected TFailureInfo failure;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the aiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAiid() {
        return aiid;
    }

    /**
     * Sets the value of the aiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAiid(String value) {
        this.aiid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TActivityStatus }
     *     
     */
    public TActivityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TActivityStatus }
     *     
     */
    public void setStatus(TActivityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeRef }
     *     
     */
    public TScopeRef getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeRef }
     *     
     */
    public void setScope(TScopeRef value) {
        this.scope = value;
    }

    /**
     * Gets the value of the dtEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEnabled() {
        return dtEnabled;
    }

    /**
     * Sets the value of the dtEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEnabled(XMLGregorianCalendar value) {
        this.dtEnabled = value;
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
     * Gets the value of the dtCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtCompleted() {
        return dtCompleted;
    }

    /**
     * Sets the value of the dtCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtCompleted(XMLGregorianCalendar value) {
        this.dtCompleted = value;
    }

    /**
     * Gets the value of the failure property.
     * 
     * @return
     *     possible object is
     *     {@link TFailureInfo }
     *     
     */
    public TFailureInfo getFailure() {
        return failure;
    }

    /**
     * Sets the value of the failure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFailureInfo }
     *     
     */
    public void setFailure(TFailureInfo value) {
        this.failure = value;
    }

}
