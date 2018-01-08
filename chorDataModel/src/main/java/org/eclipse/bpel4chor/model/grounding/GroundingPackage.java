/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.bpel4chor.model.grounding.GroundingFactory
 * @model kind="package"
 * @generated
 */
public interface GroundingPackage extends EPackage
{
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "grounding";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "urn:HPI_IAAS:choreography:schemas:choreography:grounding:2006/12";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "grd";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        GroundingPackage eINSTANCE = org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl.init();

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl <em>Grounding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getGrounding()
         * @generated
         */
        int GROUNDING = 0;

        /**
         * The feature id for the '<em><b>Topology</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GROUNDING__TOPOLOGY = 0;

        /**
         * The feature id for the '<em><b>Message Links</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GROUNDING__MESSAGE_LINKS = 1;

        /**
         * The feature id for the '<em><b>Participant Refs</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GROUNDING__PARTICIPANT_REFS = 2;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GROUNDING__PROPERTIES = 3;

        /**
         * The number of structural features of the '<em>Grounding</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GROUNDING_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinksImpl <em>Message Links</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.MessageLinksImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getMessageLinks()
         * @generated
         */
        int MESSAGE_LINKS = 1;

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
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefsImpl <em>Participant Refs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefsImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getParticipantRefs()
         * @generated
         */
        int PARTICIPANT_REFS = 2;

        /**
         * The feature id for the '<em><b>Participant Ref</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_REFS__PARTICIPANT_REF = 0;

        /**
         * The number of structural features of the '<em>Participant Refs</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_REFS_FEATURE_COUNT = 1;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.PropertiesImpl <em>Properties</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.PropertiesImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getProperties()
         * @generated
         */
        int PROPERTIES = 3;

        /**
         * The feature id for the '<em><b>Property</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTIES__PROPERTY = 0;

        /**
         * The number of structural features of the '<em>Properties</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTIES_FEATURE_COUNT = 1;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl <em>Message Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getMessageLink()
         * @generated
         */
        int MESSAGE_LINK = 4;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__NAME = 0;

        /**
         * The feature id for the '<em><b>Port Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__PORT_TYPE = 1;

        /**
         * The feature id for the '<em><b>Operation</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__OPERATION = 2;

        /**
         * The feature id for the '<em><b>Senders</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__SENDERS = 3;

        /**
         * The feature id for the '<em><b>Expected Port Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__EXPECTED_PORT_TYPE = 4;

        /**
         * The feature id for the '<em><b>Expected Operation</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__EXPECTED_OPERATION = 5;

        /**
         * The feature id for the '<em><b>Mediator</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__MEDIATOR = 6;

        /**
         * The feature id for the '<em><b>Offered Port Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__OFFERED_PORT_TYPE = 7;

        /**
         * The feature id for the '<em><b>Offered Operation</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK__OFFERED_OPERATION = 8;

        /**
         * The number of structural features of the '<em>Message Link</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_LINK_FEATURE_COUNT = 9;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefImpl <em>Participant Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getParticipantRef()
         * @generated
         */
        int PARTICIPANT_REF = 5;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_REF__NAME = 0;

        /**
         * The feature id for the '<em><b>WSD Lproperty</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_REF__WSD_LPROPERTY = 1;

        /**
         * The number of structural features of the '<em>Participant Ref</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PARTICIPANT_REF_FEATURE_COUNT = 2;

        /**
         * The meta object id for the '{@link org.eclipse.bpel4chor.model.grounding.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.bpel4chor.model.grounding.impl.PropertyImpl
         * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getProperty()
         * @generated
         */
        int PROPERTY = 6;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY__NAME = 0;

        /**
         * The feature id for the '<em><b>WSD Lproperty</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY__WSD_LPROPERTY = 1;

        /**
         * The number of structural features of the '<em>Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY_FEATURE_COUNT = 2;


        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.Grounding <em>Grounding</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Grounding</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Grounding
         * @generated
         */
        EClass getGrounding();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getTopology <em>Topology</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Topology</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Grounding#getTopology()
         * @see #getGrounding()
         * @generated
         */
        EAttribute getGrounding_Topology();

        /**
         * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getMessageLinks <em>Message Links</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Message Links</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Grounding#getMessageLinks()
         * @see #getGrounding()
         * @generated
         */
        EReference getGrounding_MessageLinks();

        /**
         * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getParticipantRefs <em>Participant Refs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Participant Refs</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Grounding#getParticipantRefs()
         * @see #getGrounding()
         * @generated
         */
        EReference getGrounding_ParticipantRefs();

        /**
         * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Properties</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Grounding#getProperties()
         * @see #getGrounding()
         * @generated
         */
        EReference getGrounding_Properties();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.MessageLinks <em>Message Links</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message Links</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLinks
         * @generated
         */
        EClass getMessageLinks();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.grounding.MessageLinks#getMessageLink <em>Message Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Message Link</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLinks#getMessageLink()
         * @see #getMessageLinks()
         * @generated
         */
        EReference getMessageLinks_MessageLink();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRefs <em>Participant Refs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participant Refs</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRefs
         * @generated
         */
        EClass getParticipantRefs();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRefs#getParticipantRef <em>Participant Ref</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Participant Ref</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRefs#getParticipantRef()
         * @see #getParticipantRefs()
         * @generated
         */
        EReference getParticipantRefs_ParticipantRef();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.Properties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Properties</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Properties
         * @generated
         */
        EClass getProperties();

        /**
         * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.grounding.Properties#getProperty <em>Property</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Property</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Properties#getProperty()
         * @see #getProperties()
         * @generated
         */
        EReference getProperties_Property();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.MessageLink <em>Message Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message Link</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink
         * @generated
         */
        EClass getMessageLink();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getName()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getPortType <em>Port Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Port Type</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getPortType()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_PortType();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOperation <em>Operation</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Operation</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getOperation()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Operation();

        /**
         * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getSenders <em>Senders</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Senders</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getSenders()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Senders();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedPortType <em>Expected Port Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Expected Port Type</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedPortType()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_ExpectedPortType();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedOperation <em>Expected Operation</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Expected Operation</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedOperation()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_ExpectedOperation();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getMediator <em>Mediator</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Mediator</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getMediator()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_Mediator();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedPortType <em>Offered Port Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Offered Port Type</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedPortType()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_OfferedPortType();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedOperation <em>Offered Operation</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Offered Operation</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedOperation()
         * @see #getMessageLink()
         * @generated
         */
        EAttribute getMessageLink_OfferedOperation();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef <em>Participant Ref</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Participant Ref</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRef
         * @generated
         */
        EClass getParticipantRef();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRef#getName()
         * @see #getParticipantRef()
         * @generated
         */
        EAttribute getParticipantRef_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef#getWSDLproperty <em>WSD Lproperty</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>WSD Lproperty</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRef#getWSDLproperty()
         * @see #getParticipantRef()
         * @generated
         */
        EAttribute getParticipantRef_WSDLproperty();

        /**
         * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.grounding.Property <em>Property</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Property</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Property
         * @generated
         */
        EClass getProperty();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.Property#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Property#getName()
         * @see #getProperty()
         * @generated
         */
        EAttribute getProperty_Name();

        /**
         * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.grounding.Property#getWSDLproperty <em>WSD Lproperty</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>WSD Lproperty</em>'.
         * @see org.eclipse.bpel4chor.model.grounding.Property#getWSDLproperty()
         * @see #getProperty()
         * @generated
         */
        EAttribute getProperty_WSDLproperty();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        GroundingFactory getGroundingFactory();

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
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl <em>Grounding</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getGrounding()
                 * @generated
                 */
                EClass GROUNDING = eINSTANCE.getGrounding();

                /**
                 * The meta object literal for the '<em><b>Topology</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute GROUNDING__TOPOLOGY = eINSTANCE.getGrounding_Topology();

                /**
                 * The meta object literal for the '<em><b>Message Links</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference GROUNDING__MESSAGE_LINKS = eINSTANCE.getGrounding_MessageLinks();

                /**
                 * The meta object literal for the '<em><b>Participant Refs</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference GROUNDING__PARTICIPANT_REFS = eINSTANCE.getGrounding_ParticipantRefs();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference GROUNDING__PROPERTIES = eINSTANCE.getGrounding_Properties();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinksImpl <em>Message Links</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.MessageLinksImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getMessageLinks()
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
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefsImpl <em>Participant Refs</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefsImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getParticipantRefs()
                 * @generated
                 */
                EClass PARTICIPANT_REFS = eINSTANCE.getParticipantRefs();

                /**
                 * The meta object literal for the '<em><b>Participant Ref</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PARTICIPANT_REFS__PARTICIPANT_REF = eINSTANCE.getParticipantRefs_ParticipantRef();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.PropertiesImpl <em>Properties</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.PropertiesImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getProperties()
                 * @generated
                 */
                EClass PROPERTIES = eINSTANCE.getProperties();

                /**
                 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PROPERTIES__PROPERTY = eINSTANCE.getProperties_Property();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl <em>Message Link</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getMessageLink()
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
                 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__PORT_TYPE = eINSTANCE.getMessageLink_PortType();

                /**
                 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__OPERATION = eINSTANCE.getMessageLink_Operation();

                /**
                 * The meta object literal for the '<em><b>Senders</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__SENDERS = eINSTANCE.getMessageLink_Senders();

                /**
                 * The meta object literal for the '<em><b>Expected Port Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__EXPECTED_PORT_TYPE = eINSTANCE.getMessageLink_ExpectedPortType();

                /**
                 * The meta object literal for the '<em><b>Expected Operation</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__EXPECTED_OPERATION = eINSTANCE.getMessageLink_ExpectedOperation();

                /**
                 * The meta object literal for the '<em><b>Mediator</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__MEDIATOR = eINSTANCE.getMessageLink_Mediator();

                /**
                 * The meta object literal for the '<em><b>Offered Port Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__OFFERED_PORT_TYPE = eINSTANCE.getMessageLink_OfferedPortType();

                /**
                 * The meta object literal for the '<em><b>Offered Operation</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE_LINK__OFFERED_OPERATION = eINSTANCE.getMessageLink_OfferedOperation();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefImpl <em>Participant Ref</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getParticipantRef()
                 * @generated
                 */
                EClass PARTICIPANT_REF = eINSTANCE.getParticipantRef();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_REF__NAME = eINSTANCE.getParticipantRef_Name();

                /**
                 * The meta object literal for the '<em><b>WSD Lproperty</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PARTICIPANT_REF__WSD_LPROPERTY = eINSTANCE.getParticipantRef_WSDLproperty();

                /**
                 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.grounding.impl.PropertyImpl <em>Property</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.bpel4chor.model.grounding.impl.PropertyImpl
                 * @see org.eclipse.bpel4chor.model.grounding.impl.GroundingPackageImpl#getProperty()
                 * @generated
                 */
                EClass PROPERTY = eINSTANCE.getProperty();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

                /**
                 * The meta object literal for the '<em><b>WSD Lproperty</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PROPERTY__WSD_LPROPERTY = eINSTANCE.getProperty_WSDLproperty();

        }

} //GroundingPackage
