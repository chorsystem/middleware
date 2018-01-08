//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.08 at 10:45:27 PM MEZ 
//


package de.unistuttgart.iaas.chor.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for StartParticipantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartParticipantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processModelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="headerMetaData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payload" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endpoint" type="{http://www.example.org/choreography_control_message}EndpointDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartParticipantType", namespace = "http://www.example.org/choreography_control_message", propOrder = {
    "processModelId",
    "name",
    "headerMetaData",
    "payload",
    "endpoint"
})
public class StartParticipantType {

    @XmlElement(required = true)
    protected String processModelId;
    @XmlElement(required = true)
    protected QName name;
    @XmlElement(required = true)
    protected String headerMetaData;
    @XmlElement(required = true)
    protected String payload;
    @XmlElement(required = true)
    protected EndpointDataType endpoint;

    /**
     * Gets the value of the processModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessModelId() {
        return processModelId;
    }

    /**
     * Sets the value of the processModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessModelId(String value) {
        this.processModelId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setName(QName value) {
        this.name = value;
    }

    /**
     * Gets the value of the headerMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderMetaData() {
        return headerMetaData;
    }

    /**
     * Sets the value of the headerMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderMetaData(String value) {
        this.headerMetaData = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(String value) {
        this.payload = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointDataType }
     *     
     */
    public EndpointDataType getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointDataType }
     *     
     */
    public void setEndpoint(EndpointDataType value) {
        this.endpoint = value;
    }

}
