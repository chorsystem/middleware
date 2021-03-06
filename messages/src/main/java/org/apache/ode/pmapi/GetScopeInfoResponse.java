
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TScopeInfo;


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
 *         &lt;element name="scope-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeInfo" form="unqualified"/>
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
    "scopeInfo"
})
@XmlRootElement(name = "getScopeInfoResponse")
public class GetScopeInfoResponse {

    @XmlElement(name = "scope-info", required = true)
    protected TScopeInfo scopeInfo;

    /**
     * Gets the value of the scopeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeInfo }
     *     
     */
    public TScopeInfo getScopeInfo() {
        return scopeInfo;
    }

    /**
     * Sets the value of the scopeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeInfo }
     *     
     */
    public void setScopeInfo(TScopeInfo value) {
        this.scopeInfo = value;
    }

}
