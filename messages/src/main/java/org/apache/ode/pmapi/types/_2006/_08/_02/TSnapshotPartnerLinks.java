
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tSnapshotPartnerLinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSnapshotPartnerLinks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.apache.org/ode/pmapi/types/2006/08/02/}partnerLink-info" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSnapshotPartnerLinks", propOrder = {
    "partnerLinkInfo"
})
public class TSnapshotPartnerLinks {

    @XmlElement(name = "partnerLink-info")
    protected List<TPartnerLinkInfo> partnerLinkInfo;

    /**
     * Gets the value of the partnerLinkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerLinkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerLinkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPartnerLinkInfo }
     * 
     * 
     */
    public List<TPartnerLinkInfo> getPartnerLinkInfo() {
        if (partnerLinkInfo == null) {
            partnerLinkInfo = new ArrayList<TPartnerLinkInfo>();
        }
        return this.partnerLinkInfo;
    }

}
