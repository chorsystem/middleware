
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPartnerLinkRefList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPartnerLinkRefList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partnerLink" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tPartnerLinkRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPartnerLinkRefList", propOrder = {
    "partnerLink"
})
public class TPartnerLinkRefList {

    protected List<TPartnerLinkRef> partnerLink;

    /**
     * Gets the value of the partnerLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPartnerLinkRef }
     * 
     * 
     */
    public List<TPartnerLinkRef> getPartnerLink() {
        if (partnerLink == null) {
            partnerLink = new ArrayList<TPartnerLinkRef>();
        }
        return this.partnerLink;
    }

}
