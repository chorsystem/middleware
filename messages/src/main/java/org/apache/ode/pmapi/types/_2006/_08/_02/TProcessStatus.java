
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tProcessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tProcessStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="RETIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tProcessStatus")
@XmlEnum
public enum TProcessStatus {


    /**
     * Process is accepting new
     *                         requests.
     * 
     */
    ACTIVE,

    /**
     * Process is NOT accepting new
     *                         requests.
     * 
     */
    RETIRED;

    public String value() {
        return name();
    }

    public static TProcessStatus fromValue(String v) {
        return valueOf(v);
    }

}
