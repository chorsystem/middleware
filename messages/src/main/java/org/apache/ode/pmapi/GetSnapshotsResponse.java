
package org.apache.ode.pmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.ode.pmapi.types._2006._08._02.TSnapshotInfoList;


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
 *         &lt;element name="snapshot-info-list" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tSnapshotInfoList" form="unqualified"/>
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
    "snapshotInfoList"
})
@XmlRootElement(name = "getSnapshotsResponse")
public class GetSnapshotsResponse {

    @XmlElement(name = "snapshot-info-list", required = true)
    protected TSnapshotInfoList snapshotInfoList;

    /**
     * Gets the value of the snapshotInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link TSnapshotInfoList }
     *     
     */
    public TSnapshotInfoList getSnapshotInfoList() {
        return snapshotInfoList;
    }

    /**
     * Sets the value of the snapshotInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSnapshotInfoList }
     *     
     */
    public void setSnapshotInfoList(TSnapshotInfoList value) {
        this.snapshotInfoList = value;
    }

}
