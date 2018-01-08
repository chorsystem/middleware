
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TInstanceInfoList;


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
 *         &lt;element name="instance-info-list" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tInstanceInfoList" form="unqualified"/>
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
    "instanceInfoList"
})
@XmlRootElement(name = "listInstancesSummaryResponse")
public class ListInstancesSummaryResponse {

    @XmlElement(name = "instance-info-list", required = true)
    protected TInstanceInfoList instanceInfoList;

    /**
     * Gets the value of the instanceInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link TInstanceInfoList }
     *     
     */
    public TInstanceInfoList getInstanceInfoList() {
        return instanceInfoList;
    }

    /**
     * Sets the value of the instanceInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInstanceInfoList }
     *     
     */
    public void setInstanceInfoList(TInstanceInfoList value) {
        this.instanceInfoList = value;
    }

}
