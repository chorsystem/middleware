/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import org.eclipse.bpel4chor.model.topology.Containment;
import org.eclipse.bpel4chor.model.topology.MessageLink;
import org.eclipse.bpel4chor.model.topology.MessageLinks;
import org.eclipse.bpel4chor.model.topology.Participant;
import org.eclipse.bpel4chor.model.topology.ParticipantSet;
import org.eclipse.bpel4chor.model.topology.ParticipantType;
import org.eclipse.bpel4chor.model.topology.ParticipantTypes;
import org.eclipse.bpel4chor.model.topology.Participants;
import org.eclipse.bpel4chor.model.topology.Topology;
import org.eclipse.bpel4chor.model.topology.TopologyFactory;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class TopologyPackageImpl extends EPackageImpl implements TopologyPackage
{
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass topologyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass participantTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass participantEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass participantSetEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass participantsEClass = null;

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
        private EClass participantTypesEClass = null;

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
        private EEnum containmentEEnum = null;

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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private TopologyPackageImpl()
        {
                super(eNS_URI, TopologyFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link TopologyPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static TopologyPackage init()
        {
                if (isInited) return (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);

                // Obtain or create and register package
                TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TopologyPackageImpl());

                isInited = true;

                // Initialize simple dependencies
                WSDLPackage.eINSTANCE.eClass();

                // Create package meta-data objects
                theTopologyPackage.createPackageContents();

                // Initialize created meta-data
                theTopologyPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theTopologyPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(TopologyPackage.eNS_URI, theTopologyPackage);
                return theTopologyPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTopology()
        {
                return topologyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTopology_Name()
        {
                return (EAttribute)topologyEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTopology_TargetNamespace()
        {
                return (EAttribute)topologyEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTopology_ParticipantTypes()
        {
                return (EReference)topologyEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTopology_Participants()
        {
                return (EReference)topologyEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTopology_MessageLinks()
        {
                return (EReference)topologyEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipantType()
        {
                return participantTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantType_Name()
        {
                return (EAttribute)participantTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantType_ParticipantBehaviorDescription()
        {
                return (EAttribute)participantTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantType_ProcessLanguage()
        {
                return (EAttribute)participantTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipant()
        {
                return participantEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipant_Name()
        {
                return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipant_Type()
        {
                return (EAttribute)participantEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipant_Selects()
        {
                return (EAttribute)participantEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipant_ForEach()
        {
                return (EAttribute)participantEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipant_Scope()
        {
                return (EAttribute)participantEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipant_Containment()
        {
                return (EAttribute)participantEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipantSet()
        {
                return participantSetEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantSet_Name()
        {
                return (EAttribute)participantSetEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantSet_Type()
        {
                return (EAttribute)participantSetEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantSet_ForEach()
        {
                return (EAttribute)participantSetEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParticipantSet_Scope()
        {
                return (EAttribute)participantSetEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParticipantSet_ParticipantSet()
        {
                return (EReference)participantSetEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParticipantSet_Participant()
        {
                return (EReference)participantSetEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipants()
        {
                return participantsEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParticipants_Participant()
        {
                return (EReference)participantsEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParticipants_ParticipantSet()
        {
                return (EReference)participantsEClass.getEStructuralFeatures().get(1);
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
        public EAttribute getMessageLink_Sender()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_Senders()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_SendActivity()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_BindSenderTo()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_Receiver()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_ReceiveActivity()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_MessageName()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_ParticipantRefs()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessageLink_CopyParticipantRefsTo()
        {
                return (EAttribute)messageLinkEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParticipantTypes()
        {
                return participantTypesEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParticipantTypes_ParticipantType()
        {
                return (EReference)participantTypesEClass.getEStructuralFeatures().get(0);
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
        public EEnum getContainment()
        {
                return containmentEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TopologyFactory getTopologyFactory()
        {
                return (TopologyFactory)getEFactoryInstance();
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
                topologyEClass = createEClass(TOPOLOGY);
                createEAttribute(topologyEClass, TOPOLOGY__NAME);
                createEAttribute(topologyEClass, TOPOLOGY__TARGET_NAMESPACE);
                createEReference(topologyEClass, TOPOLOGY__PARTICIPANT_TYPES);
                createEReference(topologyEClass, TOPOLOGY__PARTICIPANTS);
                createEReference(topologyEClass, TOPOLOGY__MESSAGE_LINKS);

                participantTypeEClass = createEClass(PARTICIPANT_TYPE);
                createEAttribute(participantTypeEClass, PARTICIPANT_TYPE__NAME);
                createEAttribute(participantTypeEClass, PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION);
                createEAttribute(participantTypeEClass, PARTICIPANT_TYPE__PROCESS_LANGUAGE);

                participantEClass = createEClass(PARTICIPANT);
                createEAttribute(participantEClass, PARTICIPANT__NAME);
                createEAttribute(participantEClass, PARTICIPANT__TYPE);
                createEAttribute(participantEClass, PARTICIPANT__SELECTS);
                createEAttribute(participantEClass, PARTICIPANT__FOR_EACH);
                createEAttribute(participantEClass, PARTICIPANT__SCOPE);
                createEAttribute(participantEClass, PARTICIPANT__CONTAINMENT);

                participantSetEClass = createEClass(PARTICIPANT_SET);
                createEAttribute(participantSetEClass, PARTICIPANT_SET__NAME);
                createEAttribute(participantSetEClass, PARTICIPANT_SET__TYPE);
                createEAttribute(participantSetEClass, PARTICIPANT_SET__FOR_EACH);
                createEAttribute(participantSetEClass, PARTICIPANT_SET__SCOPE);
                createEReference(participantSetEClass, PARTICIPANT_SET__PARTICIPANT_SET);
                createEReference(participantSetEClass, PARTICIPANT_SET__PARTICIPANT);

                participantsEClass = createEClass(PARTICIPANTS);
                createEReference(participantsEClass, PARTICIPANTS__PARTICIPANT);
                createEReference(participantsEClass, PARTICIPANTS__PARTICIPANT_SET);

                messageLinkEClass = createEClass(MESSAGE_LINK);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__NAME);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__SENDER);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__SENDERS);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__SEND_ACTIVITY);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__BIND_SENDER_TO);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__RECEIVER);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__RECEIVE_ACTIVITY);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__MESSAGE_NAME);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__PARTICIPANT_REFS);
                createEAttribute(messageLinkEClass, MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO);

                participantTypesEClass = createEClass(PARTICIPANT_TYPES);
                createEReference(participantTypesEClass, PARTICIPANT_TYPES__PARTICIPANT_TYPE);

                messageLinksEClass = createEClass(MESSAGE_LINKS);
                createEReference(messageLinksEClass, MESSAGE_LINKS__MESSAGE_LINK);

                // Create enums
                containmentEEnum = createEEnum(CONTAINMENT);
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
                initEClass(topologyEClass, Topology.class, "Topology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getTopology_Name(), ecorePackage.getEString(), "name", null, 1, 1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTopology_TargetNamespace(), ecorePackage.getEString(), "targetNamespace", null, 1, 1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTopology_ParticipantTypes(), this.getParticipantTypes(), null, "participantTypes", null, 1, 1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTopology_Participants(), this.getParticipants(), null, "participants", null, 1, 1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTopology_MessageLinks(), this.getMessageLinks(), null, "messageLinks", null, 1, 1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantTypeEClass, ParticipantType.class, "ParticipantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getParticipantType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipantType_ParticipantBehaviorDescription(), theWSDLPackage.getQName(), "participantBehaviorDescription", null, 1, 1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipantType_ProcessLanguage(), ecorePackage.getEString(), "processLanguage", "urn:HPI_IAAS:choreography:profile:2006/12", 0, 1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getParticipant_Name(), ecorePackage.getEString(), "name", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipant_Type(), ecorePackage.getEString(), "type", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
                initEAttribute(getParticipant_Selects(), ecorePackage.getEString(), "selects", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipant_ForEach(), theWSDLPackage.getQName(), "forEach", "", 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipant_Scope(), theWSDLPackage.getQName(), "scope", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipant_Containment(), this.getContainment(), "containment", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantSetEClass, ParticipantSet.class, "ParticipantSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getParticipantSet_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipantSet_Type(), ecorePackage.getEString(), "type", null, 0, 1, ParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipantSet_ForEach(), theWSDLPackage.getQName(), "forEach", null, 0, -1, ParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getParticipantSet_Scope(), theWSDLPackage.getQName(), "scope", null, 0, 1, ParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getParticipantSet_ParticipantSet(), this.getParticipantSet(), null, "participantSet", null, 0, -1, ParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getParticipantSet_Participant(), this.getParticipant(), null, "participant", null, 0, -1, ParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantsEClass, Participants.class, "Participants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getParticipants_Participant(), this.getParticipant(), null, "participant", null, 0, -1, Participants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getParticipants_ParticipantSet(), this.getParticipantSet(), null, "participantSet", null, 0, -1, Participants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageLinkEClass, MessageLink.class, "MessageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMessageLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_Sender(), ecorePackage.getEString(), "sender", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_Senders(), ecorePackage.getEString(), "senders", null, 0, -1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_SendActivity(), ecorePackage.getEString(), "sendActivity", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_BindSenderTo(), ecorePackage.getEString(), "bindSenderTo", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_Receiver(), ecorePackage.getEString(), "receiver", null, 1, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_ReceiveActivity(), ecorePackage.getEString(), "receiveActivity", null, 0, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_MessageName(), ecorePackage.getEString(), "messageName", null, 1, 1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_ParticipantRefs(), ecorePackage.getEString(), "participantRefs", null, 0, -1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessageLink_CopyParticipantRefsTo(), ecorePackage.getEString(), "copyParticipantRefsTo", null, 0, -1, MessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(participantTypesEClass, ParticipantTypes.class, "ParticipantTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getParticipantTypes_ParticipantType(), this.getParticipantType(), null, "participantType", null, 0, -1, ParticipantTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageLinksEClass, MessageLinks.class, "MessageLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessageLinks_MessageLink(), this.getMessageLink(), null, "messageLink", null, 0, -1, MessageLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize enums and add enum literals
                initEEnum(containmentEEnum, Containment.class, "Containment");
                addEEnumLiteral(containmentEEnum, Containment.ADDIFNOTEXISTS);
                addEEnumLiteral(containmentEEnum, Containment.MUSTADD);
                addEEnumLiteral(containmentEEnum, Containment.REQUIRED);

                // Create resource
                createResource(eNS_URI);
        }

} //TopologyPackageImpl
