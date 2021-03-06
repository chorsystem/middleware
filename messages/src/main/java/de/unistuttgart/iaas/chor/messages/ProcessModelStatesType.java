//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.08 at 10:45:27 PM MEZ 
//


package de.unistuttgart.iaas.chor.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessModelStatesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessModelStatesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Process_Active"/>
 *     &lt;enumeration value="Process_Deployed"/>
 *     &lt;enumeration value="Process_Disabled"/>
 *     &lt;enumeration value="Process_Retired"/>
 *     &lt;enumeration value="Process_Undeployed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessModelStatesType", namespace = "http://www.example.org/process_model_states")
@XmlEnum
public enum ProcessModelStatesType {

    @XmlEnumValue("Process_Active")
    PROCESS_ACTIVE("Process_Active"),
    @XmlEnumValue("Process_Deployed")
    PROCESS_DEPLOYED("Process_Deployed"),
    @XmlEnumValue("Process_Disabled")
    PROCESS_DISABLED("Process_Disabled"),
    @XmlEnumValue("Process_Retired")
    PROCESS_RETIRED("Process_Retired"),
    @XmlEnumValue("Process_Undeployed")
    PROCESS_UNDEPLOYED("Process_Undeployed");
    private final String value;

    ProcessModelStatesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessModelStatesType fromValue(String v) {
        for (ProcessModelStatesType c: ProcessModelStatesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
