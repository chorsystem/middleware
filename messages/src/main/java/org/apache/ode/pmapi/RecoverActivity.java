
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
 *         &lt;element name="iid" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
 *         &lt;element name="aid" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
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
    "aid",
    "action"
})
@XmlRootElement(name = "recoverActivity")
public class RecoverActivity {

    protected long iid;
    protected long aid;
    @XmlElement(required = true)
    protected String action;

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
     * Gets the value of the aid property.
     * 
     */
    public long getAid() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     */
    public void setAid(long value) {
        this.aid = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
