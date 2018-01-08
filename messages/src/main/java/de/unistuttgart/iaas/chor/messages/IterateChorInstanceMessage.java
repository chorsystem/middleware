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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TVariableRefList;


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
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="choreographyModelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="choreographyInstanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialStartParticipant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialRewindingPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="snapshotXPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="snapshotVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variables" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "method",
    "choreographyModelID",
    "choreographyInstanceID",
    "initialStartParticipant",
    "initialRewindingPoint",
    "view",
    "xpath",
    "snapshotXPath",
    "snapshotVersion",
    "variables"
})
@XmlRootElement(name = "IterateChorInstanceMessage")
public class IterateChorInstanceMessage {

    @XmlElement(required = true)
    protected String method;
    @XmlElement(required = true)
    protected String choreographyModelID;
    @XmlElement(required = true)
    protected String choreographyInstanceID;
    @XmlElement(required = true)
    protected String initialStartParticipant;
    @XmlElement(required = true)
    protected String initialRewindingPoint;
    @XmlElement(required = true)
    protected String view;
    @XmlElement(required = true)
    protected String xpath;
    @XmlElement(required = true)
    protected String snapshotXPath;
    @XmlElement(required = true)
    protected String snapshotVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TVariableRefList variables;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

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
     * Gets the value of the choreographyInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyInstanceID() {
        return choreographyInstanceID;
    }

    /**
     * Sets the value of the choreographyInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyInstanceID(String value) {
        this.choreographyInstanceID = value;
    }

    /**
     * Gets the value of the initialStartParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialStartParticipant() {
        return initialStartParticipant;
    }

    /**
     * Sets the value of the initialStartParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialStartParticipant(String value) {
        this.initialStartParticipant = value;
    }

    /**
     * Gets the value of the initialRewindingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialRewindingPoint() {
        return initialRewindingPoint;
    }

    /**
     * Sets the value of the initialRewindingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialRewindingPoint(String value) {
        this.initialRewindingPoint = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpath(String value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the snapshotXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotXPath() {
        return snapshotXPath;
    }

    /**
     * Sets the value of the snapshotXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotXPath(String value) {
        this.snapshotXPath = value;
    }

    /**
     * Gets the value of the snapshotVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotVersion() {
        return snapshotVersion;
    }

    /**
     * Sets the value of the snapshotVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotVersion(String value) {
        this.snapshotVersion = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link TVariableRefList }
     *     
     */
    public TVariableRefList getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVariableRefList }
     *     
     */
    public void setVariables(TVariableRefList value) {
        this.variables = value;
    }

}
