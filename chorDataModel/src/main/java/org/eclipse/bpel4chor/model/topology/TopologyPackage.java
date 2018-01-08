/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.topology.TopologyFactory
 * @model kind="package"
 * @generated
 */
public interface TopologyPackage extends EPackage
{
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "topology";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "urn:HPI_IAAS:choreography:schemas:choreography:topology:2006/12";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "top";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        TopologyPackage eINSTANCE = org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl.init();

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl <em>Topology</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getTopology()
         * @generated
         */
        int TOPOLOGY = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TOPOLOGY__NAME = 0;

        /**
         * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TOPOLOGY__TARGET_NAMESPACE = 1;

        /**
         * The feature id for the '<em><b>Participant Types</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TOPOLOGY__PARTICIPANT_TYPES = 2;

        /**
         * The feature id for the '<em><b>Participants</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TOPOLOGY__PARTICIPANTS = 3;

        /**
         * The feature id for the '<em><b>Message Links</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TOPOLOGY__MESSAGE_LINKS = 4;

        /**
         * The number of structural features of the '<em>Topology</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TOPOLOGY_FEATURE_COUNT = 5;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl <em>Participant Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipantType()
         * @generated
         */
        int PARTICIPANT_TYPE = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_TYPE__NAME = 0;

        /**
         * The feature id for the '<em><b>Participant Behavior Description</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION = 1;

        /**
         * The feature id for the '<em><b>Process Language</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_TYPE__PROCESS_LANGUAGE = 2;

        /**
         * The number of structural features of the '<em>Participant Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_TYPE_FEATURE_COUNT = 3;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl <em>Participant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipant()
         * @generated
         */
        int PARTICIPANT = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT__NAME = 0;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT__TYPE = 1;

        /**
         * The feature id for the '<em><b>Selects</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT__SELECTS = 2;

        /**
         * The feature id for the '<em><b>For Each</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT__FOR_EACH = 3;

        /**
         * The feature id for the '<em><b>Scope</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT__SCOPE = 4;

        /**
         * The feature id for the '<em><b>Containment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT__CONTAINMENT = 5;

        /**
         * The number of structural features of the '<em>Participant</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_FEATURE_COUNT = 6;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl <em>Participant Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipantSet()
         * @generated
         */
        int PARTICIPANT_SET = 3;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET__NAME = 0;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET__TYPE = 1;

        /**
         * The feature id for the '<em><b>For Each</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET__FOR_EACH = 2;

        /**
         * The feature id for the '<em><b>Scope</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET__SCOPE = 3;

        /**
         * The feature id for the '<em><b>Participant Set</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET__PARTICIPANT_SET = 4;

        /**
         * The feature id for the '<em><b>Participant</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET__PARTICIPANT = 5;

        /**
         * The number of structural features of the '<em>Participant Set</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_SET_FEATURE_COUNT = 6;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantsImpl <em>Participants</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantsImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipants()
         * @generated
         */
        int PARTICIPANTS = 4;

        /**
         * The feature id for the '<em><b>Participant</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANTS__PARTICIPANT = 0;

        /**
         * The feature id for the '<em><b>Participant Set</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANTS__PARTICIPANT_SET = 1;

        /**
         * The number of structural features of the '<em>Participants</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANTS_FEATURE_COUNT = 2;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl <em>Message Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getMessageLink()
         * @generated
         */
        int MESSAGE_LINK = 5;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__NAME = 0;

        /**
         * The feature id for the '<em><b>Sender</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__SENDER = 1;

        /**
         * The feature id for the '<em><b>Senders</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__SENDERS = 2;

        /**
         * The feature id for the '<em><b>Send Activity</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__SEND_ACTIVITY = 3;

        /**
         * The feature id for the '<em><b>Bind Sender To</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__BIND_SENDER_TO = 4;

        /**
         * The feature id for the '<em><b>Receiver</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__RECEIVER = 5;

        /**
         * The feature id for the '<em><b>Receive Activity</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__RECEIVE_ACTIVITY = 6;

        /**
         * The feature id for the '<em><b>Message Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__MESSAGE_NAME = 7;

        /**
         * The feature id for the '<em><b>Participant Refs</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__PARTICIPANT_REFS = 8;

        /**
         * The feature id for the '<em><b>Copy Participant Refs To</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO = 9;

        /**
         * The number of structural features of the '<em>Message Link</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK_FEATURE_COUNT = 10;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypesImpl <em>Participant Types</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantTypesImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipantTypes()
         * @generated
         */
        int PARTICIPANT_TYPES = 6;

        /**
         * The feature id for the '<em><b>Participant Type</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_TYPES__PARTICIPANT_TYPE = 0;

        /**
         * The number of structural features of the '<em>Participant Types</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_TYPES_FEATURE_COUNT = 1;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinksImpl <em>Message Links</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.impl.MessageLinksImpl
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getMessageLinks()
         * @generated
         */
        int MESSAGE_LINKS = 7;

        /**
         * The feature id for the '<em><b>Message Link</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINKS__MESSAGE_LINK = 0;

        /**
         * The number of structural features of the '<em>Message Links</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINKS_FEATURE_COUNT = 1;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.topology.Containment <em>Containment</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.topology.Containment
         * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getContainment()
         * @generated
         */
        int CONTAINMENT = 8;


        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.Topology <em>Topology</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Topology</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Topology
         * @generated
         */
        EClass getTopology();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Topology#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Topology#getName()
         * @see #getTopology()
         * @generated
         */
        EAttribute getTopology_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Topology#getTargetNamespace <em>Target Namespace</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Target Namespace</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Topology#getTargetNamespace()
         * @see #getTopology()
         * @generated
         */
        EAttribute getTopology_TargetNamespace();

        /**
         * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.topology.Topology#getParticipantTypes <em>Participant Types</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Participant Types</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Topology#getParticipantTypes()
         * @see #getTopology()
         * @generated
         */
        EReference getTopology_ParticipantTypes();

        /**
         * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.topology.Topology#getParticipants <em>Participants</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Participants</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Topology#getParticipants()
         * @see #getTopology()
         * @generated
         */
        EReference getTopology_Participants();

        /**
         * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.topology.Topology#getMessageLinks <em>Message Links</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Message Links</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Topology#getMessageLinks()
         * @see #getTopology()
         * @generated
         */
        EReference getTopology_MessageLinks();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.ParticipantType <em>Participant Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participant Type</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantType
         * @generated
         */
        EClass getParticipantType();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantType#getName()
         * @see #getParticipantType()
         * @generated
         */
        EAttribute getParticipantType_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getParticipantBehaviorDescription <em>Participant Behavior Description</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Participant Behavior Description</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantType#getParticipantBehaviorDescription()
         * @see #getParticipantType()
         * @generated
         */
        EAttribute getParticipantType_ParticipantBehaviorDescription();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getProcessLanguage <em>Process Language</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Process Language</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantType#getProcessLanguage()
         * @see #getParticipantType()
         * @generated
         */
        EAttribute getParticipantType_ProcessLanguage();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.Participant <em>Participant</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participant</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant
         * @generated
         */
        EClass getParticipant();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Participant#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant#getName()
         * @see #getParticipant()
         * @generated
         */
        EAttribute getParticipant_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Participant#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant#getType()
         * @see #getParticipant()
         * @generated
         */
        EAttribute getParticipant_Type();

        /**
         * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.topology.Participant#getSelects <em>Selects</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Selects</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant#getSelects()
         * @see #getParticipant()
         * @generated
         */
        EAttribute getParticipant_Selects();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Participant#getForEach <em>For Each</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>For Each</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant#getForEach()
         * @see #getParticipant()
         * @generated
         */
        EAttribute getParticipant_ForEach();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Participant#getScope <em>Scope</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Scope</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant#getScope()
         * @see #getParticipant()
         * @generated
         */
        EAttribute getParticipant_Scope();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.Participant#getContainment <em>Containment</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Containment</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participant#getContainment()
         * @see #getParticipant()
         * @generated
         */
        EAttribute getParticipant_Containment();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet <em>Participant Set</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participant Set</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet
         * @generated
         */
        EClass getParticipantSet();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet#getName()
         * @see #getParticipantSet()
         * @generated
         */
        EAttribute getParticipantSet_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet#getType()
         * @see #getParticipantSet()
         * @generated
         */
        EAttribute getParticipantSet_Type();

        /**
         * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getForEach <em>For Each</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>For Each</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet#getForEach()
         * @see #getParticipantSet()
         * @generated
         */
        EAttribute getParticipantSet_ForEach();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getScope <em>Scope</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Scope</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet#getScope()
         * @see #getParticipantSet()
         * @generated
         */
        EAttribute getParticipantSet_Scope();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getParticipantSet <em>Participant Set</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Participant Set</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet#getParticipantSet()
         * @see #getParticipantSet()
         * @generated
         */
        EReference getParticipantSet_ParticipantSet();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getParticipant <em>Participant</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Participant</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet#getParticipant()
         * @see #getParticipantSet()
         * @generated
         */
        EReference getParticipantSet_Participant();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.Participants <em>Participants</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participants</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participants
         * @generated
         */
        EClass getParticipants();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.topology.Participants#getParticipant <em>Participant</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Participant</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participants#getParticipant()
         * @see #getParticipants()
         * @generated
         */
        EReference getParticipants_Participant();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.topology.Participants#getParticipantSet <em>Participant Set</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Participant Set</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Participants#getParticipantSet()
         * @see #getParticipants()
         * @generated
         */
        EReference getParticipants_ParticipantSet();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.MessageLink <em>Message Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message Link</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink
         * @generated
         */
        EClass getMessageLink();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getName()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSender <em>Sender</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Sender</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getSender()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Sender();

        /**
         * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSenders <em>Senders</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Senders</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getSenders()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Senders();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSendActivity <em>Send Activity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Send Activity</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getSendActivity()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_SendActivity();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getBindSenderTo <em>Bind Sender To</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Bind Sender To</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getBindSenderTo()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_BindSenderTo();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getReceiver <em>Receiver</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Receiver</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getReceiver()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Receiver();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getReceiveActivity <em>Receive Activity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Receive Activity</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getReceiveActivity()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_ReceiveActivity();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getMessageName <em>Message Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Message Name</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getMessageName()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_MessageName();

        /**
         * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getParticipantRefs <em>Participant Refs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Participant Refs</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getParticipantRefs()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_ParticipantRefs();

        /**
         * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getCopyParticipantRefsTo <em>Copy Participant Refs To</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Copy Participant Refs To</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink#getCopyParticipantRefsTo()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_CopyParticipantRefsTo();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.ParticipantTypes <em>Participant Types</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participant Types</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantTypes
         * @generated
         */
        EClass getParticipantTypes();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.topology.ParticipantTypes#getParticipantType <em>Participant Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Participant Type</em>'.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantTypes#getParticipantType()
         * @see #getParticipantTypes()
         * @generated
         */
        EReference getParticipantTypes_ParticipantType();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.topology.MessageLinks <em>Message Links</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message Links</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLinks
         * @generated
         */
        EClass getMessageLinks();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.topology.MessageLinks#getMessageLink <em>Message Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Message Link</em>'.
         * @see org.eclipse.bpel4chor.model.topology.MessageLinks#getMessageLink()
         * @see #getMessageLinks()
         * @generated
         */
        EReference getMessageLinks_MessageLink();

        /**
         * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.topology.Containment <em>Containment</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Containment</em>'.
         * @see org.eclipse.bpel4chor.model.topology.Containment
         * @generated
         */
        EEnum getContainment();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        TopologyFactory getTopologyFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals
        {
                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl <em>Topology</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getTopology()
                 * @generated
                 */
                EClass TOPOLOGY = eINSTANCE.getTopology();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TOPOLOGY__NAME = eINSTANCE.getTopology_Name();

                /**
                 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TOPOLOGY__TARGET_NAMESPACE = eINSTANCE.getTopology_TargetNamespace();

                /**
                 * The meta object literal for the '<em><b>Participant Types</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TOPOLOGY__PARTICIPANT_TYPES = eINSTANCE.getTopology_ParticipantTypes();

                /**
                 * The meta object literal for the '<em><b>Participants</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TOPOLOGY__PARTICIPANTS = eINSTANCE.getTopology_Participants();

                /**
                 * The meta object literal for the '<em><b>Message Links</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TOPOLOGY__MESSAGE_LINKS = eINSTANCE.getTopology_MessageLinks();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl <em>Participant Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipantType()
                 * @generated
                 */
                EClass PARTICIPANT_TYPE = eINSTANCE.getParticipantType();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_TYPE__NAME = eINSTANCE.getParticipantType_Name();

                /**
                 * The meta object literal for the '<em><b>Participant Behavior Description</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION = eINSTANCE.getParticipantType_ParticipantBehaviorDescription();

                /**
                 * The meta object literal for the '<em><b>Process Language</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_TYPE__PROCESS_LANGUAGE = eINSTANCE.getParticipantType_ProcessLanguage();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl <em>Participant</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipant()
                 * @generated
                 */
                EClass PARTICIPANT = eINSTANCE.getParticipant();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT__TYPE = eINSTANCE.getParticipant_Type();

                /**
                 * The meta object literal for the '<em><b>Selects</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT__SELECTS = eINSTANCE.getParticipant_Selects();

                /**
                 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT__FOR_EACH = eINSTANCE.getParticipant_ForEach();

                /**
                 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT__SCOPE = eINSTANCE.getParticipant_Scope();

                /**
                 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT__CONTAINMENT = eINSTANCE.getParticipant_Containment();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl <em>Participant Set</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipantSet()
                 * @generated
                 */
                EClass PARTICIPANT_SET = eINSTANCE.getParticipantSet();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_SET__NAME = eINSTANCE.getParticipantSet_Name();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_SET__TYPE = eINSTANCE.getParticipantSet_Type();

                /**
                 * The meta object literal for the '<em><b>For Each</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_SET__FOR_EACH = eINSTANCE.getParticipantSet_ForEach();

                /**
                 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_SET__SCOPE = eINSTANCE.getParticipantSet_Scope();

                /**
                 * The meta object literal for the '<em><b>Participant Set</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PARTICIPANT_SET__PARTICIPANT_SET = eINSTANCE.getParticipantSet_ParticipantSet();

                /**
                 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PARTICIPANT_SET__PARTICIPANT = eINSTANCE.getParticipantSet_Participant();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantsImpl <em>Participants</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantsImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipants()
                 * @generated
                 */
                EClass PARTICIPANTS = eINSTANCE.getParticipants();

                /**
                 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PARTICIPANTS__PARTICIPANT = eINSTANCE.getParticipants_Participant();

                /**
                 * The meta object literal for the '<em><b>Participant Set</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PARTICIPANTS__PARTICIPANT_SET = eINSTANCE.getParticipants_ParticipantSet();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl <em>Message Link</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getMessageLink()
                 * @generated
                 */
                EClass MESSAGE_LINK = eINSTANCE.getMessageLink();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__NAME = eINSTANCE.getMessageLink_Name();

                /**
                 * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__SENDER = eINSTANCE.getMessageLink_Sender();

                /**
                 * The meta object literal for the '<em><b>Senders</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__SENDERS = eINSTANCE.getMessageLink_Senders();

                /**
                 * The meta object literal for the '<em><b>Send Activity</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__SEND_ACTIVITY = eINSTANCE.getMessageLink_SendActivity();

                /**
                 * The meta object literal for the '<em><b>Bind Sender To</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__BIND_SENDER_TO = eINSTANCE.getMessageLink_BindSenderTo();

                /**
                 * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__RECEIVER = eINSTANCE.getMessageLink_Receiver();

                /**
                 * The meta object literal for the '<em><b>Receive Activity</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__RECEIVE_ACTIVITY = eINSTANCE.getMessageLink_ReceiveActivity();

                /**
                 * The meta object literal for the '<em><b>Message Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__MESSAGE_NAME = eINSTANCE.getMessageLink_MessageName();

                /**
                 * The meta object literal for the '<em><b>Participant Refs</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__PARTICIPANT_REFS = eINSTANCE.getMessageLink_ParticipantRefs();

                /**
                 * The meta object literal for the '<em><b>Copy Participant Refs To</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO = eINSTANCE.getMessageLink_CopyParticipantRefsTo();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypesImpl <em>Participant Types</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.ParticipantTypesImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getParticipantTypes()
                 * @generated
                 */
                EClass PARTICIPANT_TYPES = eINSTANCE.getParticipantTypes();

                /**
                 * The meta object literal for the '<em><b>Participant Type</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PARTICIPANT_TYPES__PARTICIPANT_TYPE = eINSTANCE.getParticipantTypes_ParticipantType();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinksImpl <em>Message Links</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.impl.MessageLinksImpl
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getMessageLinks()
                 * @generated
                 */
                EClass MESSAGE_LINKS = eINSTANCE.getMessageLinks();

                /**
                 * The meta object literal for the '<em><b>Message Link</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE_LINKS__MESSAGE_LINK = eINSTANCE.getMessageLinks_MessageLink();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.topology.Containment <em>Containment</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.topology.Containment
                 * @see org.eclipse.bpel4chor.model.topology.impl.TopologyPackageImpl#getContainment()
                 * @generated
                 */
                EEnum CONTAINMENT = eINSTANCE.getContainment();

        }

} //TopologyPackage
