
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for tPartnerLinkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPartnerLinkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="self" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tPartnerLinkRef"/>
 *         &lt;element name="myRoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerRoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="myRoleServiceName" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="myEPR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="partnerEPR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mySessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPartnerLinkInfo", propOrder = {
    "self",
    "myRoleName",
    "partnerRoleName",
    "myRoleServiceName",
    "myEPR",
    "partnerEPR",
    "mySessionId",
    "partnerSessionId"
})
public class TPartnerLinkInfo {

    @XmlElement(required = true)
    protected TPartnerLinkRef self;
    @XmlElement(required = true)
    protected String myRoleName;
    @XmlElement(required = true)
    protected String partnerRoleName;
    @XmlElement(required = true)
    protected QName myRoleServiceName;
    protected TPartnerLinkInfo.MyEPR myEPR;
    protected TPartnerLinkInfo.PartnerEPR partnerEPR;
    @XmlElement(required = true)
    protected String mySessionId;
    @XmlElement(required = true)
    protected String partnerSessionId;

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link TPartnerLinkRef }
     *     
     */
    public TPartnerLinkRef getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPartnerLinkRef }
     *     
     */
    public void setSelf(TPartnerLinkRef value) {
        this.self = value;
    }

    /**
     * Gets the value of the myRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyRoleName() {
        return myRoleName;
    }

    /**
     * Sets the value of the myRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyRoleName(String value) {
        this.myRoleName = value;
    }

    /**
     * Gets the value of the partnerRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRoleName() {
        return partnerRoleName;
    }

    /**
     * Sets the value of the partnerRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRoleName(String value) {
        this.partnerRoleName = value;
    }

    /**
     * Gets the value of the myRoleServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMyRoleServiceName() {
        return myRoleServiceName;
    }

    /**
     * Sets the value of the myRoleServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMyRoleServiceName(QName value) {
        this.myRoleServiceName = value;
    }

    /**
     * Gets the value of the myEPR property.
     * 
     * @return
     *     possible object is
     *     {@link TPartnerLinkInfo.MyEPR }
     *     
     */
    public TPartnerLinkInfo.MyEPR getMyEPR() {
        return myEPR;
    }

    /**
     * Sets the value of the myEPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPartnerLinkInfo.MyEPR }
     *     
     */
    public void setMyEPR(TPartnerLinkInfo.MyEPR value) {
        this.myEPR = value;
    }

    /**
     * Gets the value of the partnerEPR property.
     * 
     * @return
     *     possible object is
     *     {@link TPartnerLinkInfo.PartnerEPR }
     *     
     */
    public TPartnerLinkInfo.PartnerEPR getPartnerEPR() {
        return partnerEPR;
    }

    /**
     * Sets the value of the partnerEPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPartnerLinkInfo.PartnerEPR }
     *     
     */
    public void setPartnerEPR(TPartnerLinkInfo.PartnerEPR value) {
        this.partnerEPR = value;
    }

    /**
     * Gets the value of the mySessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMySessionId() {
        return mySessionId;
    }

    /**
     * Sets the value of the mySessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMySessionId(String value) {
        this.mySessionId = value;
    }

    /**
     * Gets the value of the partnerSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSessionId() {
        return partnerSessionId;
    }

    /**
     * Sets the value of the partnerSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSessionId(String value) {
        this.partnerSessionId = value;
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
    public static class MyEPR {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

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
    public static class PartnerEPR {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
