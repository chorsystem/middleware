/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

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
 * @see org.eclipse.bpel4chor.model.chor.ChorFactory
 * @model kind="package"
 * @generated
 */
public interface ChorPackage extends EPackage
{
        /**
	 * The package name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNAME = "chor";

        /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNS_URI = "urn:HPI_IAAS:choreography:schemas:choreography:2006/12";

        /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNS_PREFIX = "chor";

        /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        ChorPackage eINSTANCE = org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl.init();

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getChoreography()
	 * @generated
	 */
        int CHOREOGRAPHY = 0;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__NAME = 0;

        /**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__TARGET_NAMESPACE = 1;

        /**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__PARTICIPANTS = 2;

        /**
	 * The feature id for the '<em><b>Participant Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__PARTICIPANT_SETS = 3;

        /**
	 * The feature id for the '<em><b>Message Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__MESSAGE_LINKS = 4;

        /**
	 * The feature id for the '<em><b>Participant Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__PARTICIPANT_REFS = 5;

        /**
	 * The feature id for the '<em><b>Flow Activity Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__FLOW_ACTIVITY_LINKS = 6;

        /**
	 * The feature id for the '<em><b>Groundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__GROUNDINGS = 7;

        /**
	 * The feature id for the '<em><b>For Each Iteration Specs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS = 8;

        /**
	 * The feature id for the '<em><b>Abstract Connector Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS = 9;

								/**
	 * The feature id for the '<em><b>Global Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__GLOBAL_DATA_MODEL = 10;

								/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CHOREOGRAPHY_FEATURE_COUNT = 11;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkImpl <em>CMessage Link</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CMessageLinkImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCMessageLink()
	 * @generated
	 */
        int CMESSAGE_LINK = 1;

        /**
	 * The feature id for the '<em><b>Send Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__SEND_ACTIVITY = 0;

        /**
	 * The feature id for the '<em><b>Receive Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__RECEIVE_ACTIVITY = 1;

        /**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__PARTICIPANT_REFS = 2;

        /**
	 * The feature id for the '<em><b>Bind Sender To</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__BIND_SENDER_TO = 3;

        /**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__SENDER = 4;

        /**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__SENDERS = 5;

        /**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__RECEIVER = 6;

        /**
	 * The feature id for the '<em><b>Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__MESSAGE_NAME = 7;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK__NAME = 8;

        /**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMESSAGE_LINK__STATE = 9;

								/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMESSAGE_LINK__ID = 10;

								/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMESSAGE_LINK__INSTANCE_ID = 11;

								/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMESSAGE_LINK__INSTANCE_BUFFER = 12;

								/**
	 * The number of structural features of the '<em>CMessage Link</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK_FEATURE_COUNT = 13;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefImpl <em>CParticipant Ref</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantRefImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantRef()
	 * @generated
	 */
        int CPARTICIPANT_REF = 2;

        /**
	 * The feature id for the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_REF__PARTICIPANT = 0;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_REF__NAME = 1;

        /**
	 * The number of structural features of the '<em>CParticipant Ref</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_REF_FEATURE_COUNT = 2;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl <em>Flow Activity Link</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getFlowActivityLink()
	 * @generated
	 */
        int FLOW_ACTIVITY_LINK = 3;

        /**
	 * The feature id for the '<em><b>Source Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY = 0;

        /**
	 * The feature id for the '<em><b>Target Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FLOW_ACTIVITY_LINK__TARGET_ACTIVITY = 1;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FLOW_ACTIVITY_LINK__NAME = 2;

        /**
	 * The feature id for the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FLOW_ACTIVITY_LINK__TRANSITION_CONDITION = 3;

        /**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ACTIVITY_LINK__CHANGED = 4;

								/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ACTIVITY_LINK__STATE = 5;

								/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ACTIVITY_LINK__ID = 6;

								/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ACTIVITY_LINK__INSTANCE_ID = 7;

								/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ACTIVITY_LINK__INSTANCE_BUFFER = 8;

								/**
	 * The number of structural features of the '<em>Flow Activity Link</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FLOW_ACTIVITY_LINK_FEATURE_COUNT = 9;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantCommonImpl <em>CParticipant Common</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantCommonImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantCommon()
	 * @generated
	 */
        int CPARTICIPANT_COMMON = 4;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_COMMON__NAME = 0;

        /**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_COMMON__SCOPE = 1;

        /**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_COMMON__PROCESS = 2;

        /**
	 * The number of structural features of the '<em>CParticipant Common</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_COMMON_FEATURE_COUNT = 3;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl <em>CParticipant</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipant()
	 * @generated
	 */
        int CPARTICIPANT = 5;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT__NAME = CPARTICIPANT_COMMON__NAME;

        /**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT__SCOPE = CPARTICIPANT_COMMON__SCOPE;

        /**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT__PROCESS = CPARTICIPANT_COMMON__PROCESS;

        /**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT__CONTAINMENT = CPARTICIPANT_COMMON_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Selects</b></em>' reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT__SELECTS = CPARTICIPANT_COMMON_FEATURE_COUNT + 1;

        /**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPARTICIPANT__INSTANCES = CPARTICIPANT_COMMON_FEATURE_COUNT + 2;

								/**
	 * The number of structural features of the '<em>CParticipant</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_FEATURE_COUNT = CPARTICIPANT_COMMON_FEATURE_COUNT + 3;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantSetImpl <em>CParticipant Set</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantSetImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantSet()
	 * @generated
	 */
        int CPARTICIPANT_SET = 6;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_SET__NAME = CPARTICIPANT_COMMON__NAME;

        /**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_SET__SCOPE = CPARTICIPANT_COMMON__SCOPE;

        /**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_SET__PROCESS = CPARTICIPANT_COMMON__PROCESS;

        /**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_SET__PARTICIPANTS = CPARTICIPANT_COMMON_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Participant Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_SET__PARTICIPANT_SETS = CPARTICIPANT_COMMON_FEATURE_COUNT + 1;

        /**
	 * The number of structural features of the '<em>CParticipant Set</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_SET_FEATURE_COUNT = CPARTICIPANT_COMMON_FEATURE_COUNT + 2;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl <em>CGrounding</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCGrounding()
	 * @generated
	 */
        int CGROUNDING = 7;

        /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CGROUNDING__NAME = 0;

        /**
	 * The feature id for the '<em><b>CMessage Link Groundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CGROUNDING__CMESSAGE_LINK_GROUNDINGS = 1;

        /**
	 * The feature id for the '<em><b>Correlation Set Groundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CGROUNDING__CORRELATION_SET_GROUNDINGS = 2;

        /**
	 * The feature id for the '<em><b>CParticipant Ref Groundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CGROUNDING__CPARTICIPANT_REF_GROUNDINGS = 3;

        /**
	 * The number of structural features of the '<em>CGrounding</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CGROUNDING_FEATURE_COUNT = 4;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CorrelationSetGroundingImpl <em>Correlation Set Grounding</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CorrelationSetGroundingImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCorrelationSetGrounding()
	 * @generated
	 */
        int CORRELATION_SET_GROUNDING = 8;

        /**
	 * The feature id for the '<em><b>Correlation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CORRELATION_SET_GROUNDING__CORRELATION_SET = 0;

        /**
	 * The feature id for the '<em><b>Property Groundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS = 1;

        /**
	 * The number of structural features of the '<em>Correlation Set Grounding</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CORRELATION_SET_GROUNDING_FEATURE_COUNT = 2;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.PropertyGroundingImpl <em>Property Grounding</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.PropertyGroundingImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getPropertyGrounding()
	 * @generated
	 */
        int PROPERTY_GROUNDING = 9;

        /**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROPERTY_GROUNDING__PROPERTY_NAME = 0;

        /**
	 * The feature id for the '<em><b>WSDL Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROPERTY_GROUNDING__WSDL_PROPERTY = 1;

        /**
	 * The number of structural features of the '<em>Property Grounding</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROPERTY_GROUNDING_FEATURE_COUNT = 2;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl <em>CMessage Link Grounding</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCMessageLinkGrounding()
	 * @generated
	 */
        int CMESSAGE_LINK_GROUNDING = 10;

        /**
	 * The feature id for the '<em><b>CMessage Link</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK = 0;

        /**
	 * The feature id for the '<em><b>Port Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK_GROUNDING__PORT_TYPE = 1;

        /**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK_GROUNDING__OPERATION = 2;

        /**
	 * The feature id for the '<em><b>BS To WSDL Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY = 3;

        /**
	 * The number of structural features of the '<em>CMessage Link Grounding</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CMESSAGE_LINK_GROUNDING_FEATURE_COUNT = 4;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefGroundingImpl <em>CParticipant Ref Grounding</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantRefGroundingImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantRefGrounding()
	 * @generated
	 */
        int CPARTICIPANT_REF_GROUNDING = 11;

        /**
	 * The feature id for the '<em><b>CParticipant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF = 0;

        /**
	 * The feature id for the '<em><b>WSDL Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY = 1;

        /**
	 * The number of structural features of the '<em>CParticipant Ref Grounding</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CPARTICIPANT_REF_GROUNDING_FEATURE_COUNT = 2;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.CQNameImpl <em>CQ Name</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.CQNameImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCQName()
	 * @generated
	 */
        int CQ_NAME = 12;

        /**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CQ_NAME__NS_URI = 0;

        /**
	 * The feature id for the '<em><b>Local Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CQ_NAME__LOCAL_PART = 1;

        /**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CQ_NAME__PREFIX = 2;

        /**
	 * The number of structural features of the '<em>CQ Name</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CQ_NAME_FEATURE_COUNT = 3;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl <em>For Each Iteration Spec</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getForEachIterationSpec()
	 * @generated
	 */
        int FOR_EACH_ITERATION_SPEC = 13;

        /**
	 * The feature id for the '<em><b>Iterator Set</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FOR_EACH_ITERATION_SPEC__ITERATOR_SET = 0;

        /**
	 * The feature id for the '<em><b>Iterator Value</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE = 1;

        /**
	 * The feature id for the '<em><b>For Each</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FOR_EACH_ITERATION_SPEC__FOR_EACH = 2;

        /**
	 * The number of structural features of the '<em>For Each Iteration Spec</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int FOR_EACH_ITERATION_SPEC_FEATURE_COUNT = 3;

        /**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl <em>Abstract Connector Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getAbstractConnectorLink()
	 * @generated
	 */
	int ABSTRACT_CONNECTOR_LINK = 14;

								/**
	 * The feature id for the '<em><b>Send Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY = 0;

								/**
	 * The feature id for the '<em><b>Receive Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY = 1;

								/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS = 2;

								/**
	 * The feature id for the '<em><b>Bind Sender To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO = 3;

								/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__SENDER = 4;

								/**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__SENDERS = 5;

								/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__RECEIVER = 6;

								/**
	 * The feature id for the '<em><b>Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME = 7;

								/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__NAME = 8;

								/**
	 * The feature id for the '<em><b>Abstract Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR = 9;

								/**
	 * The number of structural features of the '<em>Abstract Connector Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_LINK_FEATURE_COUNT = 10;

								/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.impl.ProcessInstanceImpl
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getProcessInstance()
	 * @generated
	 */
	int PROCESS_INSTANCE = 15;

								/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__INSTANCE_ID = 0;

								/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__PROCESS = 1;

								/**
	 * The number of structural features of the '<em>Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_FEATURE_COUNT = 2;

								/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.PContainment <em>PContainment</em>}' enum.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.PContainment
	 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getPContainment()
	 * @generated
	 */
        int PCONTAINMENT = 16;


        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography
	 * @generated
	 */
        EClass getChoreography();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.Choreography#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getName()
	 * @see #getChoreography()
	 * @generated
	 */
        EAttribute getChoreography_Name();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.Choreography#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getTargetNamespace()
	 * @see #getChoreography()
	 * @generated
	 */
        EAttribute getChoreography_TargetNamespace();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getParticipants()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_Participants();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getParticipantSets <em>Participant Sets</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Sets</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getParticipantSets()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_ParticipantSets();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getMessageLinks <em>Message Links</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Links</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getMessageLinks()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_MessageLinks();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Refs</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getParticipantRefs()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_ParticipantRefs();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getFlowActivityLinks <em>Flow Activity Links</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Activity Links</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getFlowActivityLinks()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_FlowActivityLinks();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getGroundings <em>Groundings</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groundings</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getGroundings()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_Groundings();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getForEachIterationSpecs <em>For Each Iteration Specs</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>For Each Iteration Specs</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getForEachIterationSpecs()
	 * @see #getChoreography()
	 * @generated
	 */
        EReference getChoreography_ForEachIterationSpecs();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.Choreography#getAbstractConnectorLinks <em>Abstract Connector Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connector Links</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getAbstractConnectorLinks()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_AbstractConnectorLinks();

								/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.Choreography#getGlobalDataModel <em>Global Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Data Model</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography#getGlobalDataModel()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_GlobalDataModel();

								/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CMessageLink <em>CMessage Link</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMessage Link</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink
	 * @generated
	 */
        EClass getCMessageLink();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSendActivity <em>Send Activity</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getSendActivity()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_SendActivity();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiveActivity <em>Receive Activity</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiveActivity()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_ReceiveActivity();

        /**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Refs</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getParticipantRefs()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_ParticipantRefs();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getBindSenderTo <em>Bind Sender To</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Sender To</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getBindSenderTo()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_BindSenderTo();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getSender()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_Sender();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Senders</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getSenders()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_Senders();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiver()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EReference getCMessageLink_Receiver();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getMessageName <em>Message Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getMessageName()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EAttribute getCMessageLink_MessageName();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getName()
	 * @see #getCMessageLink()
	 * @generated
	 */
        EAttribute getCMessageLink_Name();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getState()
	 * @see #getCMessageLink()
	 * @generated
	 */
	EAttribute getCMessageLink_State();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getId()
	 * @see #getCMessageLink()
	 * @generated
	 */
	EAttribute getCMessageLink_Id();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceID()
	 * @see #getCMessageLink()
	 * @generated
	 */
	EAttribute getCMessageLink_InstanceID();

								/**
	 * Returns the meta object for the map '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceBuffer <em>Instance Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Instance Buffer</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceBuffer()
	 * @see #getCMessageLink()
	 * @generated
	 */
	EReference getCMessageLink_InstanceBuffer();

								/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CParticipantRef <em>CParticipant Ref</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CParticipant Ref</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRef
	 * @generated
	 */
        EClass getCParticipantRef();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CParticipantRef#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRef#getParticipant()
	 * @see #getCParticipantRef()
	 * @generated
	 */
        EReference getCParticipantRef_Participant();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CParticipantRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRef#getName()
	 * @see #getCParticipantRef()
	 * @generated
	 */
        EAttribute getCParticipantRef_Name();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink <em>Flow Activity Link</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Activity Link</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink
	 * @generated
	 */
        EClass getFlowActivityLink();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getSourceActivity <em>Source Activity</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getSourceActivity()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
        EReference getFlowActivityLink_SourceActivity();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTargetActivity <em>Target Activity</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTargetActivity()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
        EReference getFlowActivityLink_TargetActivity();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getName()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
        EAttribute getFlowActivityLink_Name();

        /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTransitionCondition()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
        EReference getFlowActivityLink_TransitionCondition();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getChanged()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
	EAttribute getFlowActivityLink_Changed();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getState()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
	EAttribute getFlowActivityLink_State();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getId()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
	EAttribute getFlowActivityLink_Id();

								/**
	 * Returns the meta object for the map '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceBuffer <em>Instance Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Instance Buffer</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceBuffer()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
	EReference getFlowActivityLink_InstanceBuffer();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceID()
	 * @see #getFlowActivityLink()
	 * @generated
	 */
	EAttribute getFlowActivityLink_InstanceID();

								/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon <em>CParticipant Common</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CParticipant Common</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantCommon
	 * @generated
	 */
        EClass getCParticipantCommon();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantCommon#getName()
	 * @see #getCParticipantCommon()
	 * @generated
	 */
        EAttribute getCParticipantCommon_Name();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantCommon#getScope()
	 * @see #getCParticipantCommon()
	 * @generated
	 */
        EReference getCParticipantCommon_Scope();

        /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantCommon#getProcess()
	 * @see #getCParticipantCommon()
	 * @generated
	 */
        EReference getCParticipantCommon_Process();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CParticipant <em>CParticipant</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CParticipant</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipant
	 * @generated
	 */
        EClass getCParticipant();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CParticipant#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipant#getContainment()
	 * @see #getCParticipant()
	 * @generated
	 */
        EAttribute getCParticipant_Containment();

        /**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel4chor.model.chor.CParticipant#getSelects <em>Selects</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selects</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipant#getSelects()
	 * @see #getCParticipant()
	 * @generated
	 */
        EReference getCParticipant_Selects();

        /**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel4chor.model.chor.CParticipant#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipant#getInstances()
	 * @see #getCParticipant()
	 * @generated
	 */
	EReference getCParticipant_Instances();

								/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CParticipantSet <em>CParticipant Set</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CParticipant Set</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantSet
	 * @generated
	 */
        EClass getCParticipantSet();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.CParticipantSet#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantSet#getParticipants()
	 * @see #getCParticipantSet()
	 * @generated
	 */
        EReference getCParticipantSet_Participants();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.CParticipantSet#getParticipantSets <em>Participant Sets</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Sets</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantSet#getParticipantSets()
	 * @see #getCParticipantSet()
	 * @generated
	 */
        EReference getCParticipantSet_ParticipantSets();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CGrounding <em>CGrounding</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CGrounding</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CGrounding
	 * @generated
	 */
        EClass getCGrounding();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CGrounding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CGrounding#getName()
	 * @see #getCGrounding()
	 * @generated
	 */
        EAttribute getCGrounding_Name();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.CGrounding#getCMessageLinkGroundings <em>CMessage Link Groundings</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CMessage Link Groundings</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CGrounding#getCMessageLinkGroundings()
	 * @see #getCGrounding()
	 * @generated
	 */
        EReference getCGrounding_CMessageLinkGroundings();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.CGrounding#getCorrelationSetGroundings <em>Correlation Set Groundings</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Set Groundings</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CGrounding#getCorrelationSetGroundings()
	 * @see #getCGrounding()
	 * @generated
	 */
        EReference getCGrounding_CorrelationSetGroundings();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.CGrounding#getCParticipantRefGroundings <em>CParticipant Ref Groundings</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CParticipant Ref Groundings</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CGrounding#getCParticipantRefGroundings()
	 * @see #getCGrounding()
	 * @generated
	 */
        EReference getCGrounding_CParticipantRefGroundings();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding <em>Correlation Set Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Set Grounding</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding
	 * @generated
	 */
        EClass getCorrelationSetGrounding();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getCorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Set</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getCorrelationSet()
	 * @see #getCorrelationSetGrounding()
	 * @generated
	 */
        EReference getCorrelationSetGrounding_CorrelationSet();

        /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getPropertyGroundings <em>Property Groundings</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Groundings</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getPropertyGroundings()
	 * @see #getCorrelationSetGrounding()
	 * @generated
	 */
        EReference getCorrelationSetGrounding_PropertyGroundings();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding <em>Property Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Grounding</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.PropertyGrounding
	 * @generated
	 */
        EClass getPropertyGrounding();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.PropertyGrounding#getPropertyName()
	 * @see #getPropertyGrounding()
	 * @generated
	 */
        EAttribute getPropertyGrounding_PropertyName();

        /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding#getWSDLProperty <em>WSDL Property</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSDL Property</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.PropertyGrounding#getWSDLProperty()
	 * @see #getPropertyGrounding()
	 * @generated
	 */
        EReference getPropertyGrounding_WSDLProperty();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding <em>CMessage Link Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMessage Link Grounding</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding
	 * @generated
	 */
        EClass getCMessageLinkGrounding();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getCMessageLink <em>CMessage Link</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CMessage Link</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getCMessageLink()
	 * @see #getCMessageLinkGrounding()
	 * @generated
	 */
        EReference getCMessageLinkGrounding_CMessageLink();

        /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Type</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getPortType()
	 * @see #getCMessageLinkGrounding()
	 * @generated
	 */
        EReference getCMessageLinkGrounding_PortType();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getOperation()
	 * @see #getCMessageLinkGrounding()
	 * @generated
	 */
        EAttribute getCMessageLinkGrounding_Operation();

        /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getBSToWSDLProperty <em>BS To WSDL Property</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BS To WSDL Property</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getBSToWSDLProperty()
	 * @see #getCMessageLinkGrounding()
	 * @generated
	 */
        EReference getCMessageLinkGrounding_BSToWSDLProperty();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding <em>CParticipant Ref Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CParticipant Ref Grounding</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding
	 * @generated
	 */
        EClass getCParticipantRefGrounding();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getCParticipantRef <em>CParticipant Ref</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CParticipant Ref</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getCParticipantRef()
	 * @see #getCParticipantRefGrounding()
	 * @generated
	 */
        EReference getCParticipantRefGrounding_CParticipantRef();

        /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getWSDLProperty <em>WSDL Property</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSDL Property</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getWSDLProperty()
	 * @see #getCParticipantRefGrounding()
	 * @generated
	 */
        EReference getCParticipantRefGrounding_WSDLProperty();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.CQName <em>CQ Name</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CQ Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CQName
	 * @generated
	 */
        EClass getCQName();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CQName#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CQName#getNsURI()
	 * @see #getCQName()
	 * @generated
	 */
        EAttribute getCQName_NsURI();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CQName#getLocalPart <em>Local Part</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Part</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CQName#getLocalPart()
	 * @see #getCQName()
	 * @generated
	 */
        EAttribute getCQName_LocalPart();

        /**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.CQName#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.CQName#getPrefix()
	 * @see #getCQName()
	 * @generated
	 */
        EAttribute getCQName_Prefix();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec <em>For Each Iteration Spec</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Iteration Spec</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ForEachIterationSpec
	 * @generated
	 */
        EClass getForEachIterationSpec();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorSet <em>Iterator Set</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iterator Set</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorSet()
	 * @see #getForEachIterationSpec()
	 * @generated
	 */
        EReference getForEachIterationSpec_IteratorSet();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorValue <em>Iterator Value</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iterator Value</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorValue()
	 * @see #getForEachIterationSpec()
	 * @generated
	 */
        EReference getForEachIterationSpec_IteratorValue();

        /**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Each</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getForEach()
	 * @see #getForEachIterationSpec()
	 * @generated
	 */
        EReference getForEachIterationSpec_ForEach();

        /**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink <em>Abstract Connector Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connector Link</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink
	 * @generated
	 */
	EClass getAbstractConnectorLink();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSendActivity <em>Send Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSendActivity()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_SendActivity();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiveActivity <em>Receive Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiveActivity()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_ReceiveActivity();

								/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Refs</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getParticipantRefs()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_ParticipantRefs();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getBindSenderTo <em>Bind Sender To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Sender To</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getBindSenderTo()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_BindSenderTo();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSender()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_Sender();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Senders</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSenders()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_Senders();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiver()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_Receiver();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getMessageName <em>Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getMessageName()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EAttribute getAbstractConnectorLink_MessageName();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getName()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EAttribute getAbstractConnectorLink_Name();

								/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getAbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Connector</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getAbstractConnector()
	 * @see #getAbstractConnectorLink()
	 * @generated
	 */
	EReference getAbstractConnectorLink_AbstractConnector();

								/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.ProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ProcessInstance
	 * @generated
	 */
	EClass getProcessInstance();

								/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.ProcessInstance#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ProcessInstance#getInstanceID()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EAttribute getProcessInstance_InstanceID();

								/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.chor.ProcessInstance#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.ProcessInstance#getProcess()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_Process();

								/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.chor.PContainment <em>PContainment</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PContainment</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.PContainment
	 * @generated
	 */
        EEnum getPContainment();

        /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
        ChorFactory getChorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getChoreography()
		 * @generated
		 */
                EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

                /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CHOREOGRAPHY__NAME = eINSTANCE.getChoreography_Name();

                /**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CHOREOGRAPHY__TARGET_NAMESPACE = eINSTANCE.getChoreography_TargetNamespace();

                /**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__PARTICIPANTS = eINSTANCE.getChoreography_Participants();

                /**
		 * The meta object literal for the '<em><b>Participant Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__PARTICIPANT_SETS = eINSTANCE.getChoreography_ParticipantSets();

                /**
		 * The meta object literal for the '<em><b>Message Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__MESSAGE_LINKS = eINSTANCE.getChoreography_MessageLinks();

                /**
		 * The meta object literal for the '<em><b>Participant Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__PARTICIPANT_REFS = eINSTANCE.getChoreography_ParticipantRefs();

                /**
		 * The meta object literal for the '<em><b>Flow Activity Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__FLOW_ACTIVITY_LINKS = eINSTANCE.getChoreography_FlowActivityLinks();

                /**
		 * The meta object literal for the '<em><b>Groundings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__GROUNDINGS = eINSTANCE.getChoreography_Groundings();

                /**
		 * The meta object literal for the '<em><b>For Each Iteration Specs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS = eINSTANCE.getChoreography_ForEachIterationSpecs();

                /**
		 * The meta object literal for the '<em><b>Abstract Connector Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS = eINSTANCE.getChoreography_AbstractConnectorLinks();

																/**
		 * The meta object literal for the '<em><b>Global Data Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__GLOBAL_DATA_MODEL = eINSTANCE.getChoreography_GlobalDataModel();

																/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkImpl <em>CMessage Link</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CMessageLinkImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCMessageLink()
		 * @generated
		 */
                EClass CMESSAGE_LINK = eINSTANCE.getCMessageLink();

                /**
		 * The meta object literal for the '<em><b>Send Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__SEND_ACTIVITY = eINSTANCE.getCMessageLink_SendActivity();

                /**
		 * The meta object literal for the '<em><b>Receive Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__RECEIVE_ACTIVITY = eINSTANCE.getCMessageLink_ReceiveActivity();

                /**
		 * The meta object literal for the '<em><b>Participant Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__PARTICIPANT_REFS = eINSTANCE.getCMessageLink_ParticipantRefs();

                /**
		 * The meta object literal for the '<em><b>Bind Sender To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__BIND_SENDER_TO = eINSTANCE.getCMessageLink_BindSenderTo();

                /**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__SENDER = eINSTANCE.getCMessageLink_Sender();

                /**
		 * The meta object literal for the '<em><b>Senders</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__SENDERS = eINSTANCE.getCMessageLink_Senders();

                /**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK__RECEIVER = eINSTANCE.getCMessageLink_Receiver();

                /**
		 * The meta object literal for the '<em><b>Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CMESSAGE_LINK__MESSAGE_NAME = eINSTANCE.getCMessageLink_MessageName();

                /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CMESSAGE_LINK__NAME = eINSTANCE.getCMessageLink_Name();

                /**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMESSAGE_LINK__STATE = eINSTANCE.getCMessageLink_State();

																/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMESSAGE_LINK__ID = eINSTANCE.getCMessageLink_Id();

																/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMESSAGE_LINK__INSTANCE_ID = eINSTANCE.getCMessageLink_InstanceID();

																/**
		 * The meta object literal for the '<em><b>Instance Buffer</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMESSAGE_LINK__INSTANCE_BUFFER = eINSTANCE.getCMessageLink_InstanceBuffer();

																/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefImpl <em>CParticipant Ref</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantRefImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantRef()
		 * @generated
		 */
                EClass CPARTICIPANT_REF = eINSTANCE.getCParticipantRef();

                /**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_REF__PARTICIPANT = eINSTANCE.getCParticipantRef_Participant();

                /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CPARTICIPANT_REF__NAME = eINSTANCE.getCParticipantRef_Name();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl <em>Flow Activity Link</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getFlowActivityLink()
		 * @generated
		 */
                EClass FLOW_ACTIVITY_LINK = eINSTANCE.getFlowActivityLink();

                /**
		 * The meta object literal for the '<em><b>Source Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY = eINSTANCE.getFlowActivityLink_SourceActivity();

                /**
		 * The meta object literal for the '<em><b>Target Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference FLOW_ACTIVITY_LINK__TARGET_ACTIVITY = eINSTANCE.getFlowActivityLink_TargetActivity();

                /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute FLOW_ACTIVITY_LINK__NAME = eINSTANCE.getFlowActivityLink_Name();

                /**
		 * The meta object literal for the '<em><b>Transition Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference FLOW_ACTIVITY_LINK__TRANSITION_CONDITION = eINSTANCE.getFlowActivityLink_TransitionCondition();

                /**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ACTIVITY_LINK__CHANGED = eINSTANCE.getFlowActivityLink_Changed();

																/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ACTIVITY_LINK__STATE = eINSTANCE.getFlowActivityLink_State();

																/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ACTIVITY_LINK__ID = eINSTANCE.getFlowActivityLink_Id();

																/**
		 * The meta object literal for the '<em><b>Instance Buffer</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ACTIVITY_LINK__INSTANCE_BUFFER = eINSTANCE.getFlowActivityLink_InstanceBuffer();

																/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ACTIVITY_LINK__INSTANCE_ID = eINSTANCE.getFlowActivityLink_InstanceID();

																/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantCommonImpl <em>CParticipant Common</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantCommonImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantCommon()
		 * @generated
		 */
                EClass CPARTICIPANT_COMMON = eINSTANCE.getCParticipantCommon();

                /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CPARTICIPANT_COMMON__NAME = eINSTANCE.getCParticipantCommon_Name();

                /**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_COMMON__SCOPE = eINSTANCE.getCParticipantCommon_Scope();

                /**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_COMMON__PROCESS = eINSTANCE.getCParticipantCommon_Process();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl <em>CParticipant</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipant()
		 * @generated
		 */
                EClass CPARTICIPANT = eINSTANCE.getCParticipant();

                /**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CPARTICIPANT__CONTAINMENT = eINSTANCE.getCParticipant_Containment();

                /**
		 * The meta object literal for the '<em><b>Selects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT__SELECTS = eINSTANCE.getCParticipant_Selects();

                /**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPARTICIPANT__INSTANCES = eINSTANCE.getCParticipant_Instances();

																/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantSetImpl <em>CParticipant Set</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantSetImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantSet()
		 * @generated
		 */
                EClass CPARTICIPANT_SET = eINSTANCE.getCParticipantSet();

                /**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_SET__PARTICIPANTS = eINSTANCE.getCParticipantSet_Participants();

                /**
		 * The meta object literal for the '<em><b>Participant Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_SET__PARTICIPANT_SETS = eINSTANCE.getCParticipantSet_ParticipantSets();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl <em>CGrounding</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCGrounding()
		 * @generated
		 */
                EClass CGROUNDING = eINSTANCE.getCGrounding();

                /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CGROUNDING__NAME = eINSTANCE.getCGrounding_Name();

                /**
		 * The meta object literal for the '<em><b>CMessage Link Groundings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CGROUNDING__CMESSAGE_LINK_GROUNDINGS = eINSTANCE.getCGrounding_CMessageLinkGroundings();

                /**
		 * The meta object literal for the '<em><b>Correlation Set Groundings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CGROUNDING__CORRELATION_SET_GROUNDINGS = eINSTANCE.getCGrounding_CorrelationSetGroundings();

                /**
		 * The meta object literal for the '<em><b>CParticipant Ref Groundings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CGROUNDING__CPARTICIPANT_REF_GROUNDINGS = eINSTANCE.getCGrounding_CParticipantRefGroundings();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CorrelationSetGroundingImpl <em>Correlation Set Grounding</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CorrelationSetGroundingImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCorrelationSetGrounding()
		 * @generated
		 */
                EClass CORRELATION_SET_GROUNDING = eINSTANCE.getCorrelationSetGrounding();

                /**
		 * The meta object literal for the '<em><b>Correlation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CORRELATION_SET_GROUNDING__CORRELATION_SET = eINSTANCE.getCorrelationSetGrounding_CorrelationSet();

                /**
		 * The meta object literal for the '<em><b>Property Groundings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS = eINSTANCE.getCorrelationSetGrounding_PropertyGroundings();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.PropertyGroundingImpl <em>Property Grounding</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.PropertyGroundingImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getPropertyGrounding()
		 * @generated
		 */
                EClass PROPERTY_GROUNDING = eINSTANCE.getPropertyGrounding();

                /**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute PROPERTY_GROUNDING__PROPERTY_NAME = eINSTANCE.getPropertyGrounding_PropertyName();

                /**
		 * The meta object literal for the '<em><b>WSDL Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference PROPERTY_GROUNDING__WSDL_PROPERTY = eINSTANCE.getPropertyGrounding_WSDLProperty();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl <em>CMessage Link Grounding</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCMessageLinkGrounding()
		 * @generated
		 */
                EClass CMESSAGE_LINK_GROUNDING = eINSTANCE.getCMessageLinkGrounding();

                /**
		 * The meta object literal for the '<em><b>CMessage Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK = eINSTANCE.getCMessageLinkGrounding_CMessageLink();

                /**
		 * The meta object literal for the '<em><b>Port Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK_GROUNDING__PORT_TYPE = eINSTANCE.getCMessageLinkGrounding_PortType();

                /**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CMESSAGE_LINK_GROUNDING__OPERATION = eINSTANCE.getCMessageLinkGrounding_Operation();

                /**
		 * The meta object literal for the '<em><b>BS To WSDL Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY = eINSTANCE.getCMessageLinkGrounding_BSToWSDLProperty();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefGroundingImpl <em>CParticipant Ref Grounding</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CParticipantRefGroundingImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCParticipantRefGrounding()
		 * @generated
		 */
                EClass CPARTICIPANT_REF_GROUNDING = eINSTANCE.getCParticipantRefGrounding();

                /**
		 * The meta object literal for the '<em><b>CParticipant Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF = eINSTANCE.getCParticipantRefGrounding_CParticipantRef();

                /**
		 * The meta object literal for the '<em><b>WSDL Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY = eINSTANCE.getCParticipantRefGrounding_WSDLProperty();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.CQNameImpl <em>CQ Name</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.CQNameImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getCQName()
		 * @generated
		 */
                EClass CQ_NAME = eINSTANCE.getCQName();

                /**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CQ_NAME__NS_URI = eINSTANCE.getCQName_NsURI();

                /**
		 * The meta object literal for the '<em><b>Local Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CQ_NAME__LOCAL_PART = eINSTANCE.getCQName_LocalPart();

                /**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute CQ_NAME__PREFIX = eINSTANCE.getCQName_Prefix();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl <em>For Each Iteration Spec</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getForEachIterationSpec()
		 * @generated
		 */
                EClass FOR_EACH_ITERATION_SPEC = eINSTANCE.getForEachIterationSpec();

                /**
		 * The meta object literal for the '<em><b>Iterator Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference FOR_EACH_ITERATION_SPEC__ITERATOR_SET = eINSTANCE.getForEachIterationSpec_IteratorSet();

                /**
		 * The meta object literal for the '<em><b>Iterator Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE = eINSTANCE.getForEachIterationSpec_IteratorValue();

                /**
		 * The meta object literal for the '<em><b>For Each</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference FOR_EACH_ITERATION_SPEC__FOR_EACH = eINSTANCE.getForEachIterationSpec_ForEach();

                /**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl <em>Abstract Connector Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getAbstractConnectorLink()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTOR_LINK = eINSTANCE.getAbstractConnectorLink();

																/**
		 * The meta object literal for the '<em><b>Send Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY = eINSTANCE.getAbstractConnectorLink_SendActivity();

																/**
		 * The meta object literal for the '<em><b>Receive Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY = eINSTANCE.getAbstractConnectorLink_ReceiveActivity();

																/**
		 * The meta object literal for the '<em><b>Participant Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS = eINSTANCE.getAbstractConnectorLink_ParticipantRefs();

																/**
		 * The meta object literal for the '<em><b>Bind Sender To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO = eINSTANCE.getAbstractConnectorLink_BindSenderTo();

																/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__SENDER = eINSTANCE.getAbstractConnectorLink_Sender();

																/**
		 * The meta object literal for the '<em><b>Senders</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__SENDERS = eINSTANCE.getAbstractConnectorLink_Senders();

																/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__RECEIVER = eINSTANCE.getAbstractConnectorLink_Receiver();

																/**
		 * The meta object literal for the '<em><b>Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME = eINSTANCE.getAbstractConnectorLink_MessageName();

																/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR_LINK__NAME = eINSTANCE.getAbstractConnectorLink_Name();

																/**
		 * The meta object literal for the '<em><b>Abstract Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR = eINSTANCE.getAbstractConnectorLink_AbstractConnector();

																/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.impl.ProcessInstanceImpl
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getProcessInstance()
		 * @generated
		 */
		EClass PROCESS_INSTANCE = eINSTANCE.getProcessInstance();

																/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INSTANCE__INSTANCE_ID = eINSTANCE.getProcessInstance_InstanceID();

																/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__PROCESS = eINSTANCE.getProcessInstance_Process();

																/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.PContainment <em>PContainment</em>}' enum.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.PContainment
		 * @see org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl#getPContainment()
		 * @generated
		 */
                EEnum PCONTAINMENT = eINSTANCE.getPContainment();

        }

} //ChorPackage
