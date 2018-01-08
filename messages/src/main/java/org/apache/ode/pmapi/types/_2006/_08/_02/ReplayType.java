
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mock" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="mockQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="live" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplayType", propOrder = {
    "mock",
    "mockQuery",
    "live"
})
public class ReplayType {

    @XmlSchemaType(name = "anySimpleType")
    protected Object mock;
    protected String mockQuery;
    @XmlSchemaType(name = "anySimpleType")
    protected Object live;

    /**
     * Gets the value of the mock property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMock() {
        return mock;
    }

    /**
     * Sets the value of the mock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMock(Object value) {
        this.mock = value;
    }

    /**
     * Gets the value of the mockQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMockQuery() {
        return mockQuery;
    }

    /**
     * Sets the value of the mockQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMockQuery(String value) {
        this.mockQuery = value;
    }

    /**
     * Gets the value of the live property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLive() {
        return live;
    }

    /**
     * Sets the value of the live property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLive(Object value) {
        this.live = value;
    }

}
