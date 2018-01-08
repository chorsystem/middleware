
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tCorrelationProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCorrelationProperty">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="csetid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="propertyName" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationProperty", propOrder = {
    "value"
})
public class TCorrelationProperty {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "csetid", required = true)
    protected String csetid;
    @XmlAttribute(name = "propertyName", required = true)
    protected QName propertyName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the csetid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsetid() {
        return csetid;
    }

    /**
     * Sets the value of the csetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsetid(String value) {
        this.csetid = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPropertyName(QName value) {
        this.propertyName = value;
    }

}
