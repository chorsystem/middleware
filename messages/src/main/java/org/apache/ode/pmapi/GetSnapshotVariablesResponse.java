
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TSnapshotVariables;


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
 *         &lt;element name="snapshot-variables" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tSnapshotVariables" form="unqualified"/>
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
    "snapshotVariables"
})
@XmlRootElement(name = "getSnapshotVariablesResponse")
public class GetSnapshotVariablesResponse {

    @XmlElement(name = "snapshot-variables", required = true)
    protected TSnapshotVariables snapshotVariables;

    /**
     * Gets the value of the snapshotVariables property.
     * 
     * @return
     *     possible object is
     *     {@link TSnapshotVariables }
     *     
     */
    public TSnapshotVariables getSnapshotVariables() {
        return snapshotVariables;
    }

    /**
     * Sets the value of the snapshotVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSnapshotVariables }
     *     
     */
    public void setSnapshotVariables(TSnapshotVariables value) {
        this.snapshotVariables = value;
    }

}
