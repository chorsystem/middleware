
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tInstanceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tInstanceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="TERMINATED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tInstanceStatus")
@XmlEnum
public enum TInstanceStatus {


    /**
     * Instance is active.
     * 
     */
    ACTIVE,

    /**
     * Instance has completed.
     * 
     */
    COMPLETED,

    /**
     * Instance was terminated.
     * 
     */
    TERMINATED,

    /**
     * Instance failed (with a fault).
     * 
     */
    FAILED,

    /**
     * Instance has been suspended.
     * 
     */
    SUSPENDED,

    /**
     * Instance is.....
     * 
     */
    ERROR;

    public String value() {
        return name();
    }

    public static TInstanceStatus fromValue(String v) {
        return valueOf(v);
    }

}
