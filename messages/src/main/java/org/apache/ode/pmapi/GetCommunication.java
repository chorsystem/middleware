
package org.apache.ode.pmapi;

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
 *         &lt;element name="getCommunication" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}GetCommunication" form="unqualified"/>
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
    "getCommunication"
})
@XmlRootElement(name = "getCommunication")
public class GetCommunication {

    @XmlElement(required = true)
    protected org.apache.ode.pmapi.types._2006._08._02.GetCommunication getCommunication;

    /**
     * Gets the value of the getCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link org.apache.ode.pmapi.types._2006._08._02.GetCommunication }
     *     
     */
    public org.apache.ode.pmapi.types._2006._08._02.GetCommunication getGetCommunication() {
        return getCommunication;
    }

    /**
     * Sets the value of the getCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.apache.ode.pmapi.types._2006._08._02.GetCommunication }
     *     
     */
    public void setGetCommunication(org.apache.ode.pmapi.types._2006._08._02.GetCommunication value) {
        this.getCommunication = value;
    }

}
