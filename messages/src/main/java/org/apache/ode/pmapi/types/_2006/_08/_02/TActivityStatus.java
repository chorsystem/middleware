
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tActivityStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tActivityStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="STARTED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tActivityStatus")
@XmlEnum
public enum TActivityStatus {


    /**
     * Activity is enabled, but not necessarily ready to execute.
     * 
     */
    ENABLED,

    /**
     * Activity has started execution.
     * 
     */
    STARTED,

    /**
     * Activity has finished execution.
     * 
     */
    COMPLETED,

    /**
     * Activity is in failure state, recovery required.
     * 
     */
    FAILURE;

    public String value() {
        return name();
    }

    public static TActivityStatus fromValue(String v) {
        return valueOf(v);
    }

}
