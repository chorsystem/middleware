
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TSnapshotPartnerLinks;


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
 *         &lt;element name="snapshot-partnerLinks" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tSnapshotPartnerLinks" form="unqualified"/>
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
    "snapshotPartnerLinks"
})
@XmlRootElement(name = "getSnapshotPartnerLinksResponse")
public class GetSnapshotPartnerLinksResponse {

    @XmlElement(name = "snapshot-partnerLinks", required = true)
    protected TSnapshotPartnerLinks snapshotPartnerLinks;

    /**
     * Gets the value of the snapshotPartnerLinks property.
     * 
     * @return
     *     possible object is
     *     {@link TSnapshotPartnerLinks }
     *     
     */
    public TSnapshotPartnerLinks getSnapshotPartnerLinks() {
        return snapshotPartnerLinks;
    }

    /**
     * Sets the value of the snapshotPartnerLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSnapshotPartnerLinks }
     *     
     */
    public void setSnapshotPartnerLinks(TSnapshotPartnerLinks value) {
        this.snapshotPartnerLinks = value;
    }

}
