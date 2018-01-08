
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
 *         &lt;element name="getCommunicationResponse" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}GetCommunicationResponse" form="unqualified"/>
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
    "getCommunicationResponse"
})
@XmlRootElement(name = "getCommunicationResponse")
public class GetCommunicationResponse {

    @XmlElement(required = true)
    protected org.apache.ode.pmapi.types._2006._08._02.GetCommunicationResponse getCommunicationResponse;

    /**
     * Gets the value of the getCommunicationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link org.apache.ode.pmapi.types._2006._08._02.GetCommunicationResponse }
     *     
     */
    public org.apache.ode.pmapi.types._2006._08._02.GetCommunicationResponse getGetCommunicationResponse() {
        return getCommunicationResponse;
    }

    /**
     * Sets the value of the getCommunicationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.apache.ode.pmapi.types._2006._08._02.GetCommunicationResponse }
     *     
     */
    public void setGetCommunicationResponse(org.apache.ode.pmapi.types._2006._08._02.GetCommunicationResponse value) {
        this.getCommunicationResponse = value;
    }

}
