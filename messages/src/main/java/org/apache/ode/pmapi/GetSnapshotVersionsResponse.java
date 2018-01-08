
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TSnapshotInfo;


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
 *         &lt;element name="snapshot-info" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tSnapshotInfo" form="unqualified"/>
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
    "snapshotInfo"
})
@XmlRootElement(name = "getSnapshotVersionsResponse")
public class GetSnapshotVersionsResponse {

    @XmlElement(name = "snapshot-info", required = true)
    protected TSnapshotInfo snapshotInfo;

    /**
     * Gets the value of the snapshotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TSnapshotInfo }
     *     
     */
    public TSnapshotInfo getSnapshotInfo() {
        return snapshotInfo;
    }

    /**
     * Sets the value of the snapshotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSnapshotInfo }
     *     
     */
    public void setSnapshotInfo(TSnapshotInfo value) {
        this.snapshotInfo = value;
    }

}
