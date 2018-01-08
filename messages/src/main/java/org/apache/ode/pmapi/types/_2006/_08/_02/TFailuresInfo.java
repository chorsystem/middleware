
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Indicates one or more activities are in the failure
 *                 state and require recovery.
 * 
 * <p>Java class for tFailuresInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFailuresInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dt-failure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFailuresInfo", propOrder = {
    "dtFailure",
    "count"
})
public class TFailuresInfo {

    @XmlElement(name = "dt-failure", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFailure;
    protected int count;

    /**
     * Gets the value of the dtFailure property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFailure() {
        return dtFailure;
    }

    /**
     * Sets the value of the dtFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFailure(XMLGregorianCalendar value) {
        this.dtFailure = value;
    }

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

}
