
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="siid" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
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
    "siid"
})
@XmlRootElement(name = "getScopeInfo")
public class GetScopeInfo {

    protected long siid;

    /**
     * Gets the value of the siid property.
     * 
     */
    public long getSiid() {
        return siid;
    }

    /**
     * Sets the value of the siid property.
     * 
     */
    public void setSiid(long value) {
        this.siid = value;
    }

}
