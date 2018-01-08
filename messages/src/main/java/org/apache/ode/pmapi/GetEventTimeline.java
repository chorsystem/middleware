
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
 *         &lt;element name="instanceFilter" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="eventFilter" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
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
    "instanceFilter",
    "eventFilter"
})
@XmlRootElement(name = "getEventTimeline")
public class GetEventTimeline {

    @XmlElement(required = true)
    protected String instanceFilter;
    @XmlElement(required = true)
    protected String eventFilter;

    /**
     * Gets the value of the instanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceFilter() {
        return instanceFilter;
    }

    /**
     * Sets the value of the instanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceFilter(String value) {
        this.instanceFilter = value;
    }

    /**
     * Gets the value of the eventFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventFilter() {
        return eventFilter;
    }

    /**
     * Sets the value of the eventFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventFilter(String value) {
        this.eventFilter = value;
    }

}
