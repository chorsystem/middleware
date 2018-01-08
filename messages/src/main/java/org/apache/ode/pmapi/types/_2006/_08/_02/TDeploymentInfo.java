
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information about a BPEL process
 *                 deployment.
 * 
 * <p>Java class for tDeploymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDeploymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="package" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deploy-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deployer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDeploymentInfo", propOrder = {
    "_package",
    "document",
    "deployDate",
    "deployer"
})
public class TDeploymentInfo {

    @XmlElement(name = "package", required = true)
    protected String _package;
    @XmlElement(required = true)
    protected String document;
    @XmlElement(name = "deploy-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deployDate;
    @XmlElement(required = true)
    protected String deployer;

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocument(String value) {
        this.document = value;
    }

    /**
     * Gets the value of the deployDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeployDate() {
        return deployDate;
    }

    /**
     * Sets the value of the deployDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeployDate(XMLGregorianCalendar value) {
        this.deployDate = value;
    }

    /**
     * Gets the value of the deployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeployer() {
        return deployer;
    }

    /**
     * Sets the value of the deployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeployer(String value) {
        this.deployer = value;
    }

}
