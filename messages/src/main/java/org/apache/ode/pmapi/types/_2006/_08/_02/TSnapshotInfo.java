
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tSnapshotInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSnapshotInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="process-id" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="activityXPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.apache.org/ode/pmapi/types/2006/08/02/}snapshot-version" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSnapshotInfo", propOrder = {
    "iid",
    "processId",
    "activityXPath",
    "snapshotVersion"
})
public class TSnapshotInfo {

    @XmlElement(required = true)
    protected String iid;
    @XmlElement(name = "process-id")
    protected QName processId;
    @XmlElement(required = true)
    protected String activityXPath;
    @XmlElement(name = "snapshot-version", required = true)
    protected List<TSnapshotVersion> snapshotVersion;

    /**
     * Gets the value of the iid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIid() {
        return iid;
    }

    /**
     * Sets the value of the iid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIid(String value) {
        this.iid = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProcessId(QName value) {
        this.processId = value;
    }

    /**
     * Gets the value of the activityXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityXPath() {
        return activityXPath;
    }

    /**
     * Sets the value of the activityXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityXPath(String value) {
        this.activityXPath = value;
    }

    /**
     * Gets the value of the snapshotVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshotVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnapshotVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSnapshotVersion }
     * 
     * 
     */
    public List<TSnapshotVersion> getSnapshotVersion() {
        if (snapshotVersion == null) {
            snapshotVersion = new ArrayList<TSnapshotVersion>();
        }
        return this.snapshotVersion;
    }

}
