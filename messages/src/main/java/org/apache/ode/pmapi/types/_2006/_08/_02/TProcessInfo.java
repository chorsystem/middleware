
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * Information about a BPEL process.
 * 
 * <p>Java class for tProcessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tProcessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tProcessStatus"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="definition-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tDefinitionInfo"/>
 *         &lt;element name="deployment-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tDeploymentInfo"/>
 *         &lt;element name="instance-summary" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tInstanceSummary" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tProcessProperties"/>
 *         &lt;element name="endpoints" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tEndpointReferences"/>
 *         &lt;element name="documents">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="document" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tDocumentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tProcessInfo", propOrder = {
    "pid",
    "status",
    "version",
    "definitionInfo",
    "deploymentInfo",
    "instanceSummary",
    "properties",
    "endpoints",
    "documents",
    "any"
})
public class TProcessInfo {

    @XmlElement(required = true)
    protected String pid;
    @XmlElement(required = true)
    protected TProcessStatus status;
    protected long version;
    @XmlElement(name = "definition-info", required = true)
    protected TDefinitionInfo definitionInfo;
    @XmlElement(name = "deployment-info", required = true)
    protected TDeploymentInfo deploymentInfo;
    @XmlElement(name = "instance-summary")
    protected TInstanceSummary instanceSummary;
    @XmlElement(required = true)
    protected TProcessProperties properties;
    @XmlElement(required = true)
    protected TEndpointReferences endpoints;
    @XmlElement(required = true)
    protected TProcessInfo.Documents documents;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TProcessStatus }
     *     
     */
    public TProcessStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProcessStatus }
     *     
     */
    public void setStatus(TProcessStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the definitionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TDefinitionInfo }
     *     
     */
    public TDefinitionInfo getDefinitionInfo() {
        return definitionInfo;
    }

    /**
     * Sets the value of the definitionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDefinitionInfo }
     *     
     */
    public void setDefinitionInfo(TDefinitionInfo value) {
        this.definitionInfo = value;
    }

    /**
     * Gets the value of the deploymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TDeploymentInfo }
     *     
     */
    public TDeploymentInfo getDeploymentInfo() {
        return deploymentInfo;
    }

    /**
     * Sets the value of the deploymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeploymentInfo }
     *     
     */
    public void setDeploymentInfo(TDeploymentInfo value) {
        this.deploymentInfo = value;
    }

    /**
     * Gets the value of the instanceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TInstanceSummary }
     *     
     */
    public TInstanceSummary getInstanceSummary() {
        return instanceSummary;
    }

    /**
     * Sets the value of the instanceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInstanceSummary }
     *     
     */
    public void setInstanceSummary(TInstanceSummary value) {
        this.instanceSummary = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link TProcessProperties }
     *     
     */
    public TProcessProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProcessProperties }
     *     
     */
    public void setProperties(TProcessProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the endpoints property.
     * 
     * @return
     *     possible object is
     *     {@link TEndpointReferences }
     *     
     */
    public TEndpointReferences getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of the endpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEndpointReferences }
     *     
     */
    public void setEndpoints(TEndpointReferences value) {
        this.endpoints = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link TProcessInfo.Documents }
     *     
     */
    public TProcessInfo.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProcessInfo.Documents }
     *     
     */
    public void setDocuments(TProcessInfo.Documents value) {
        this.documents = value;
    }

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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="document" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tDocumentInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "document"
    })
    public static class Documents {

        protected List<TDocumentInfo> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDocumentInfo }
         * 
         * 
         */
        public List<TDocumentInfo> getDocument() {
            if (document == null) {
                document = new ArrayList<TDocumentInfo>();
            }
            return this.document;
        }

    }

}
