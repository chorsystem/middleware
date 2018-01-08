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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="choreographyModelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chorInstance" type="{http://www.example.org/choreography_instance_information_message}ChorInstanceInformation"/>
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
    "choreographyModelID",
    "chorInstance"
})
@XmlRootElement(name = "ChorStartReturnMessage", namespace = "http://www.example.org/choreography_control_message")
public class ChorStartReturnMessage {

    @XmlElement(namespace = "http://www.example.org/choreography_control_message", required = true)
    protected String choreographyModelID;
    @XmlElement(namespace = "http://www.example.org/choreography_control_message", required = true)
    protected ChorInstanceInformation chorInstance;

    /**
     * Gets the value of the choreographyModelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyModelID() {
        return choreographyModelID;
    }

    /**
     * Sets the value of the choreographyModelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyModelID(String value) {
        this.choreographyModelID = value;
    }

    /**
     * Gets the value of the chorInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ChorInstanceInformation }
     *     
     */
    public ChorInstanceInformation getChorInstance() {
        return chorInstance;
    }

    /**
     * Sets the value of the chorInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChorInstanceInformation }
     *     
     */
    public void setChorInstance(ChorInstanceInformation value) {
        this.chorInstance = value;
    }

}