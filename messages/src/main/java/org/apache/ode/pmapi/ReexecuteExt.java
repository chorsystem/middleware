
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TPartnerLinkRefList;
import org.apache.ode.pmapi.types._2006._08._02.TVariableRefList;


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
 *         &lt;element name="iid" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
 *         &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="snapshotXPath" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
 *         &lt;element name="variables" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tVariableRefList" form="unqualified"/>
 *         &lt;element name="partnerLinks" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tPartnerLinkRefList" form="unqualified"/>
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
    "iid",
    "xpath",
    "snapshotXPath",
    "version",
    "variables",
    "partnerLinks"
})
@XmlRootElement(name = "reexecuteExt")
public class ReexecuteExt {

    protected long iid;
    @XmlElement(required = true)
    protected String xpath;
    @XmlElement(required = true)
    protected String snapshotXPath;
    protected long version;
    @XmlElement(required = true)
    protected TVariableRefList variables;
    @XmlElement(required = true)
    protected TPartnerLinkRefList partnerLinks;

    /**
     * Gets the value of the iid property.
     * 
     */
    public long getIid() {
        return iid;
    }

    /**
     * Sets the value of the iid property.
     * 
     */
    public void setIid(long value) {
        this.iid = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpath(String value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the snapshotXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotXPath() {
        return snapshotXPath;
    }

    /**
     * Sets the value of the snapshotXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotXPath(String value) {
        this.snapshotXPath = value;
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
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link TVariableRefList }
     *     
     */
    public TVariableRefList getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVariableRefList }
     *     
     */
    public void setVariables(TVariableRefList value) {
        this.variables = value;
    }

    /**
     * Gets the value of the partnerLinks property.
     * 
     * @return
     *     possible object is
     *     {@link TPartnerLinkRefList }
     *     
     */
    public TPartnerLinkRefList getPartnerLinks() {
        return partnerLinks;
    }

    /**
     * Sets the value of the partnerLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPartnerLinkRefList }
     *     
     */
    public void setPartnerLinks(TPartnerLinkRefList value) {
        this.partnerLinks = value;
    }

}
