
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tScopeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tScopeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="FAULTED"/>
 *     &lt;enumeration value="FAULTHANDLING"/>
 *     &lt;enumeration value="COMPENSATING"/>
 *     &lt;enumeration value="COMPENSATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tScopeStatus")
@XmlEnum
public enum TScopeStatus {


    /**
     * Scope is active.
     * 
     */
    ACTIVE,

    /**
     * Scope has completed.
     * 
     */
    COMPLETED,

    /**
     * Scope has faulted.
     * 
     */
    FAULTED,

    /**
     * Scope is executing its fault
     *                         handler.
     * 
     */
    FAULTHANDLING,

    /**
     * Scope is executing its compensation
     *                         handler.
     * 
     */
    COMPENSATING,

    /**
     * Scope has been compensated.
     * 
     */
    COMPENSATED;

    public String value() {
        return name();
    }

    public static TScopeStatus fromValue(String v) {
        return valueOf(v);
    }

}
