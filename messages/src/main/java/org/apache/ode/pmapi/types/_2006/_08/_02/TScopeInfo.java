
package org.apache.ode.pmapi.types._2006._08._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tScopeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tScopeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="siid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeStatus"/>
 *         &lt;element name="parent-scope-ref" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeRef" minOccurs="0"/>
 *         &lt;element name="children" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="child-ref" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeRef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="activities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.apache.org/ode/pmapi/types/2006/08/02/}activity-info" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="variables" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="variable-ref" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tVariableRef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="correlation-sets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="correlation-set" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="correlation-property" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tCorrelationProperty" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="csetid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="endpoints" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tEndpointReferences"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tScopeInfo", propOrder = {
    "siid",
    "name",
    "status",
    "parentScopeRef",
    "children",
    "activities",
    "variables",
    "correlationSets",
    "endpoints"
})
public class TScopeInfo {

    @XmlElement(required = true)
    protected String siid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected TScopeStatus status;
    @XmlElement(name = "parent-scope-ref")
    protected TScopeRef parentScopeRef;
    protected TScopeInfo.Children children;
    protected TScopeInfo.Activities activities;
    protected TScopeInfo.Variables variables;
    @XmlElement(name = "correlation-sets")
    protected TScopeInfo.CorrelationSets correlationSets;
    @XmlElement(required = true)
    protected TEndpointReferences endpoints;

    /**
     * Gets the value of the siid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiid() {
        return siid;
    }

    /**
     * Sets the value of the siid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiid(String value) {
        this.siid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeStatus }
     *     
     */
    public TScopeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeStatus }
     *     
     */
    public void setStatus(TScopeStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the parentScopeRef property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeRef }
     *     
     */
    public TScopeRef getParentScopeRef() {
        return parentScopeRef;
    }

    /**
     * Sets the value of the parentScopeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeRef }
     *     
     */
    public void setParentScopeRef(TScopeRef value) {
        this.parentScopeRef = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeInfo.Children }
     *     
     */
    public TScopeInfo.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeInfo.Children }
     *     
     */
    public void setChildren(TScopeInfo.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeInfo.Activities }
     *     
     */
    public TScopeInfo.Activities getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeInfo.Activities }
     *     
     */
    public void setActivities(TScopeInfo.Activities value) {
        this.activities = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeInfo.Variables }
     *     
     */
    public TScopeInfo.Variables getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeInfo.Variables }
     *     
     */
    public void setVariables(TScopeInfo.Variables value) {
        this.variables = value;
    }

    /**
     * Gets the value of the correlationSets property.
     * 
     * @return
     *     possible object is
     *     {@link TScopeInfo.CorrelationSets }
     *     
     */
    public TScopeInfo.CorrelationSets getCorrelationSets() {
        return correlationSets;
    }

    /**
     * Sets the value of the correlationSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScopeInfo.CorrelationSets }
     *     
     */
    public void setCorrelationSets(TScopeInfo.CorrelationSets value) {
        this.correlationSets = value;
    }

    /**
     * Gets the value of the endpoints property.
     * 
     * @return
     *     possible object is
     *     {@link TEndpointReferences }
     *     
     */
    public TEndpointReferences getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of the endpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEndpointReferences }
     *     
     */
    public void setEndpoints(TEndpointReferences value) {
        this.endpoints = value;
    }


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
     *         &lt;element ref="{http://www.apache.org/ode/pmapi/types/2006/08/02/}activity-info" maxOccurs="unbounded" minOccurs="0"/>
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
        "activityInfo"
    })
    public static class Activities {

        @XmlElement(name = "activity-info")
        protected List<TActivityInfo> activityInfo;

        /**
         * Gets the value of the activityInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activityInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivityInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TActivityInfo }
         * 
         * 
         */
        public List<TActivityInfo> getActivityInfo() {
            if (activityInfo == null) {
                activityInfo = new ArrayList<TActivityInfo>();
            }
            return this.activityInfo;
        }

    }


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
     *         &lt;element name="child-ref" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tScopeRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "childRef"
    })
    public static class Children {

        @XmlElement(name = "child-ref")
        protected List<TScopeRef> childRef;

        /**
         * Gets the value of the childRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TScopeRef }
         * 
         * 
         */
        public List<TScopeRef> getChildRef() {
            if (childRef == null) {
                childRef = new ArrayList<TScopeRef>();
            }
            return this.childRef;
        }

    }


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
     *         &lt;element name="correlation-set" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="correlation-property" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tCorrelationProperty" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="csetid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "correlationSet"
    })
    public static class CorrelationSets {

        @XmlElement(name = "correlation-set", required = true)
        protected List<TScopeInfo.CorrelationSets.CorrelationSet> correlationSet;

        /**
         * Gets the value of the correlationSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the correlationSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorrelationSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TScopeInfo.CorrelationSets.CorrelationSet }
         * 
         * 
         */
        public List<TScopeInfo.CorrelationSets.CorrelationSet> getCorrelationSet() {
            if (correlationSet == null) {
                correlationSet = new ArrayList<TScopeInfo.CorrelationSets.CorrelationSet>();
            }
            return this.correlationSet;
        }


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
         *         &lt;element name="correlation-property" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tCorrelationProperty" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="csetid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "correlationProperty"
        })
        public static class CorrelationSet {

            @XmlElement(name = "correlation-property", required = true)
            protected List<TCorrelationProperty> correlationProperty;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "csetid", required = true)
            protected String csetid;

            /**
             * Gets the value of the correlationProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the correlationProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCorrelationProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCorrelationProperty }
             * 
             * 
             */
            public List<TCorrelationProperty> getCorrelationProperty() {
                if (correlationProperty == null) {
                    correlationProperty = new ArrayList<TCorrelationProperty>();
                }
                return this.correlationProperty;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the csetid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCsetid() {
                return csetid;
            }

            /**
             * Sets the value of the csetid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCsetid(String value) {
                this.csetid = value;
            }

        }

    }


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
     *         &lt;element name="variable-ref" type="{http://www.apache.org/ode/pmapi/types/2006/08/02/}tVariableRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "variableRef"
    })
    public static class Variables {

        @XmlElement(name = "variable-ref")
        protected List<TVariableRef> variableRef;

        /**
         * Gets the value of the variableRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariableRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TVariableRef }
         * 
         * 
         */
        public List<TVariableRef> getVariableRef() {
            if (variableRef == null) {
                variableRef = new ArrayList<TVariableRef>();
            }
            return this.variableRef;
        }

    }

}
