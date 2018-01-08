
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TPartnerLinkInfo;


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
 *         &lt;element name="partnerLink-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tPartnerLinkInfo" form="unqualified"/>
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
    "partnerLinkInfo"
})
@XmlRootElement(name = "getPartnerLinkInfoResponse")
public class GetPartnerLinkInfoResponse {

    @XmlElement(name = "partnerLink-info", required = true)
    protected TPartnerLinkInfo partnerLinkInfo;

    /**
     * Gets the value of the partnerLinkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TPartnerLinkInfo }
     *     
     */
    public TPartnerLinkInfo getPartnerLinkInfo() {
        return partnerLinkInfo;
    }

    /**
     * Sets the value of the partnerLinkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPartnerLinkInfo }
     *     
     */
    public void setPartnerLinkInfo(TPartnerLinkInfo value) {
        this.partnerLinkInfo = value;
    }

}
