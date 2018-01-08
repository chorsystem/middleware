
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TVariableInfo;


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
 *         &lt;element name="variable-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tVariableInfo" form="unqualified"/>
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
    "variableInfo"
})
@XmlRootElement(name = "getVariableInfoResponse")
public class GetVariableInfoResponse {

    @XmlElement(name = "variable-info", required = true)
    protected TVariableInfo variableInfo;

    /**
     * Gets the value of the variableInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TVariableInfo }
     *     
     */
    public TVariableInfo getVariableInfo() {
        return variableInfo;
    }

    /**
     * Sets the value of the variableInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVariableInfo }
     *     
     */
    public void setVariableInfo(TVariableInfo value) {
        this.variableInfo = value;
    }

}
