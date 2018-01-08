/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import org.eclipse.bpel4chor.model.grounding.Grounding;
import org.eclipse.bpel4chor.model.grounding.GroundingFactory;
import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.grounding.MessageLink;
import org.eclipse.bpel4chor.model.grounding.MessageLinks;
import org.eclipse.bpel4chor.model.grounding.ParticipantRef;
import org.eclipse.bpel4chor.model.grounding.ParticipantRefs;
import org.eclipse.bpel4chor.model.grounding.Properties;
import org.eclipse.bpel4chor.model.grounding.Property;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.wst.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundingPackageImpl extends EPackageImpl implements GroundingPackage
{
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass groundingEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass messageLinksEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass participantRefsEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass propertiesEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass messageLinkEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass participantRefEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass propertyEClass = null;

        /**
         * Creates an instance of the model <b>Package</b>, registered with
         * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
         * package URI value.
         * <p>Note: the correct way to create the package is via the static
         * factory method {@link #init init()}, which also performs
         * initialization of the package, or returns the registered package,
         * if one already exists.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.EPackage.Registry
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private GroundingPackageImpl()
        {
                super(eNS_URI, GroundingFactory.eINSTANCE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static boolean isInited = false;

        /**
         * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
         * 
         * <p>This method is used to initialize {@link GroundingPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static GroundingPackage init()
        {
                if (isInited) return (GroundingPackage)EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI);

                // Obtain or create and register package
                GroundingPackageImpl theGroundingPackage = (GroundingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GroundingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GroundingPackageImpl());

                isInited = true;

                // Initialize simple dependencies
                WSDLPackage.eINSTANCE.eClass();

                // Create package meta-data objects
                theGroundingPackage.createPackageContents();

                // Initialize created meta-data
                theGroundingPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theGroundingPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(GroundingPackage.eNS_URI, theGroundingPackage);
                return theGroundingPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getGrounding()
        {
                return groundingEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getGrounding_Topology()
        {
                return (EAttribute)groundingEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getGrounding_MessageLinks()
        {
                return (EReference)groundingEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getGrounding_ParticipantRefs()
        {
                return (EReference)groundingEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getGrounding_Properties()
        {
                return (EReference)groundingEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMessageLinks()
        {
                return messageLinksEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessageLinks_MessageLink()
        {
                return (EReference)messageLinksEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipantRefs()
        {
                return participantRefsEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParticipantRefs_ParticipantRef()
        {
                return (EReference)participantRefsEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getProperties()
        {
                return propertiesEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getProperties_Property()
        {
                return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMessageLink()
        {
                return messageLinkEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_Name()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_PortType()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_Operation()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_Senders()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_ExpectedPortType()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_ExpectedOperation()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_Mediator()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_OfferedPortType()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_OfferedOperation()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipantRef()
        {
                return participantRefEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantRef_Name()
        {
                return (EAttribute)participantRefEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantRef_WSDLproperty()
        {
                return (EAttribute)participantRefEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getProperty()
        {
                return propertyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getProperty_Name()
        {
                return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getProperty_WSDLproperty()
        {
                return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public GroundingFactory getGroundingFactory()
        {
                return (GroundingFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents()
        {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                groundingEClass = createEClass(GROUNDING);
                createEAttribute(groundingEClass, GROUNDING__TOPOLOGY);
                createEReference(groundingEClass, GROUNDING__MESSAGE_LINKS);
                createEReference(groundingEClass, GROUNDING__PARTICIPANT_REFS);
                createEReference(groundingEClass, GROUNDING__PROPERTIES);

                messageLinksEClass = createEClass(MESSAGE_LINKS);
                createEReference(messageLinksEClass, MESSAGE_LINKS__MESSAGE_LINK);

                participantRefsEClass = createEClass(PARTICIPANT_REFS);
                createEReference(participantRefsEClass, PARTICIPANT_REFS__PARTICIPANT_REF);

                propertiesEClass = createEClass(PROPERTIES);
                createEReference(propertiesEClass, PROPERTIES__PROPERTY);

                messageLinkEClass = createEClass(MESSAGE_LINK);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__NAME);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__PORT_TYPE);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__OPERATION);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__SENDERS);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__EXPECTED_PORT_TYPE);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__EXPECTED_OPERATION);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__MEDIATOR);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__OFFERED_PORT_TYPE);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__OFFERED_OPERATION);

                participantRefEClass = createEClass(PARTICIPANT_REF);
                createEAttribute(participantRefEClass, PARTICIPANT_REF__NAME);
                createEAttribute(participantRefEClass, PARTICIPANT_REF__WSD_LPROPERTY);

                propertyEClass = createEClass(PROPERTY);
                createEAttribute(propertyEClass, PROPERTY__NAME);
                createEAttribute(propertyEClass, PROPERTY__WSD_LPROPERTY);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents()
        {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Obtain other dependent packages
                WSDLPackage theWSDLPackage = (WSDLPackage)EPackage.Registry.INSTANCE.getEPackage(WSDLPackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes

                // Initialize classes and features; add operations and parameters
                initEClass(groundingEClass, Grounding.class, "Grounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getGrounding_Topology(), theWSDLPackage.getQName(), "topology", null, 0, 1, Grounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getGrounding_MessageLinks(), this.getMessageLinks(), null, "messageLinks", null, 1, 1, Grounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getGrounding_ParticipantRefs(), this.getParticipantRefs(), null, "participantRefs", null, 1, 1, Grounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getGrounding_Properties(), this.getProperties(), null, "properties", null, 1, 1, Grounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageLinksEClass, MessageLinks.class, "MessageLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessageLinks_MessageLink(), this.getMessageLink(), null, "messageLink", null, 0, -1, MessageLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantRefsEClass, ParticipantRefs.class, "ParticipantRefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getParticipantRefs_ParticipantRef(), this.getParticipantRef(), null, "participantRef", null, 0, -1, ParticipantRefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getProperties_Property(), this.getProperty(), null, "property", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageLinkEClass, MessageLink.class, "MessageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMessageLink_Name(), theWSDLPackage.getQName(), "name", null, 1, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_PortType(), theWSDLPackage.getQName(), "portType", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_Senders(), theWSDLPackage.getQName(), "senders", null, 0, -1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_ExpectedPortType(), theWSDLPackage.getQName(), "expectedPortType", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_ExpectedOperation(), ecorePackage.getEString(), "expectedOperation", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_Mediator(), ecorePackage.getEString(), "mediator", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_OfferedPortType(), theWSDLPackage.getQName(), "offeredPortType", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_OfferedOperation(), ecorePackage.getEString(), "offeredOperation", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantRefEClass, ParticipantRef.class, "ParticipantRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getParticipantRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParticipantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipantRef_WSDLproperty(), theWSDLPackage.getQName(), "WSDLproperty", null, 1, 1, ParticipantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getProperty_Name(), theWSDLPackage.getQName(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getProperty_WSDLproperty(), theWSDLPackage.getQName(), "WSDLproperty", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);

                // Create annotations
                // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
                createExtendedMetaDataAnnotations();
        }

        /**
         * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void createExtendedMetaDataAnnotations()
        {
                String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
                addAnnotation
                  (getGrounding_MessageLinks(), 
                   source, 
                   new String[] 
                   {
                         "name", "messageLinks",
                         "kind", "element",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getGrounding_ParticipantRefs(), 
                   source, 
                   new String[] 
                   {
                         "name", "participantRefs",
                         "kind", "element",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getGrounding_Properties(), 
                   source, 
                   new String[] 
                   {
                         "name", "properties",
                         "kind", "element",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getMessageLinks_MessageLink(), 
                   source, 
                   new String[] 
                   {
                         "name", "messageLink",
                         "kind", "element",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getParticipantRefs_ParticipantRef(), 
                   source, 
                   new String[] 
                   {
                         "name", "participantRef",
                         "kind", "element",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getProperties_Property(), 
                   source, 
                   new String[] 
                   {
                         "name", "property",
                         "kind", "element",
                         "namespace", "##targetNamespace"
                   });
        }

} //GroundingPackageImpl
