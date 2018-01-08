//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.23 at 12:01:31 PM MESZ 
//


package de.unistuttgart.iaas.chor.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="choreographyModel" type="{http://www.example.org/choreography_model_information_message}ChorModelType" maxOccurs="unbounded" minOccurs="0"/>
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
    "choreographyModel"
})
@XmlRootElement(name = "GetChorModelsReturnMessage", namespace = "http://www.example.org/choreography_model_information_message")
public class GetChorModelsReturnMessage {

    @XmlElement(namespace = "http://www.example.org/choreography_model_information_message")
    protected List<ChorModelType> choreographyModel;

    /**
     * Gets the value of the choreographyModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choreographyModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoreographyModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChorModelType }
     * 
     * 
     */
    public List<ChorModelType> getChoreographyModel() {
        if (choreographyModel == null) {
            choreographyModel = new ArrayList<ChorModelType>();
        }
        return this.choreographyModel;
    }

}
