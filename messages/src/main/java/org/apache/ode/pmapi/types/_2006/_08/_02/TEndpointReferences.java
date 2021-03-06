
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for tEndpointReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tEndpointReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endpoint-ref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="partner-link" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="partner-role" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEndpointReferences", propOrder = {
    "endpointRef"
})
public class TEndpointReferences {

    @XmlElement(name = "endpoint-ref")
    protected List<TEndpointReferences.EndpointRef> endpointRef;

    /**
     * Gets the value of the endpointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEndpointReferences.EndpointRef }
     * 
     * 
     */
    public List<TEndpointReferences.EndpointRef> getEndpointRef() {
        if (endpointRef == null) {
            endpointRef = new ArrayList<TEndpointReferences.EndpointRef>();
        }
        return this.endpointRef;
    }


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
     *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="partner-link" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="partner-role" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class EndpointRef {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "partner-link")
        protected String partnerLink;
        @XmlAttribute(name = "partner-role")
        protected String partnerRole;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the partnerLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerLink() {
            return partnerLink;
        }

        /**
         * Sets the value of the partnerLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerLink(String value) {
            this.partnerLink = value;
        }

        /**
         * Gets the value of the partnerRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerRole() {
            return partnerRole;
        }

        /**
         * Sets the value of the partnerRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerRole(String value) {
            this.partnerRole = value;
        }

    }

}
