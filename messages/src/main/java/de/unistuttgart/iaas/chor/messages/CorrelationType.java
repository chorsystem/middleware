//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.23 at 12:01:31 PM MESZ 
//


package de.unistuttgart.iaas.chor.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for correlationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="correlationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityModelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="part" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "correlationType", namespace = "http://www.example.org/choreography_deployment_message", propOrder = {
    "activityModelID",
    "pattern",
    "initiate",
    "messageType",
    "part",
    "query"
})
public class CorrelationType {

    @XmlElement(required = true)
    protected String activityModelID;
    @XmlElement(required = true)
    protected String pattern;
    @XmlElement(required = true)
    protected String initiate;
    @XmlElement(required = true)
    protected QName messageType;
    @XmlElement(required = true)
    protected String part;
    @XmlElement(required = true)
    protected String query;

    /**
     * Gets the value of the activityModelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityModelID() {
        return activityModelID;
    }

    /**
     * Sets the value of the activityModelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityModelID(String value) {
        this.activityModelID = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the initiate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiate() {
        return initiate;
    }

    /**
     * Sets the value of the initiate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiate(String value) {
        this.initiate = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMessageType(QName value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPart(String value) {
        this.part = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

}