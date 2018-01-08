
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TEventInfoList;


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
 *         &lt;element name="bpel-event-list" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tEventInfoList" form="unqualified"/>
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
    "bpelEventList"
})
@XmlRootElement(name = "listEventsResponse")
public class ListEventsResponse {

    @XmlElement(name = "bpel-event-list", required = true)
    protected TEventInfoList bpelEventList;

    /**
     * Gets the value of the bpelEventList property.
     * 
     * @return
     *     possible object is
     *     {@link TEventInfoList }
     *     
     */
    public TEventInfoList getBpelEventList() {
        return bpelEventList;
    }

    /**
     * Sets the value of the bpelEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEventInfoList }
     *     
     */
    public void setBpelEventList(TEventInfoList value) {
        this.bpelEventList = value;
    }

}
