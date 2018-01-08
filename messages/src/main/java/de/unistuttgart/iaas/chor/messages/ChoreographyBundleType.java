//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.08 at 10:45:27 PM MEZ 
//


package de.unistuttgart.iaas.chor.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for choreographyBundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choreographyBundleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="choreographyModelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="choreographyFolderZip" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="processBundles" type="{http://www.example.org/choreography_deployment_message}processBundleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.example.org/choreography_deployment_message}serviceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choreographyBundleType", namespace = "http://www.example.org/choreography_deployment_message", propOrder = {
    "choreographyModelID",
    "name",
    "choreographyFolderZip",
    "processBundles",
    "services"
})
public class ChoreographyBundleType {

    @XmlElement(required = true)
    protected String choreographyModelID;
    @XmlElement(required = true)
    protected QName name;
    @XmlElement(required = true)
    protected byte[] choreographyFolderZip;
    protected List<ProcessBundleType> processBundles;
    protected List<ServiceType> services;

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
     * Gets the value of the choreographyFolderZip property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChoreographyFolderZip() {
        return choreographyFolderZip;
    }

    /**
     * Sets the value of the choreographyFolderZip property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChoreographyFolderZip(byte[] value) {
        this.choreographyFolderZip = ((byte[]) value);
    }

    /**
     * Gets the value of the processBundles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processBundles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessBundles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessBundleType }
     * 
     * 
     */
    public List<ProcessBundleType> getProcessBundles() {
        if (processBundles == null) {
            processBundles = new ArrayList<ProcessBundleType>();
        }
        return this.processBundles;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getServices() {
        if (services == null) {
            services = new ArrayList<ServiceType>();
        }
        return this.services;
    }

}
