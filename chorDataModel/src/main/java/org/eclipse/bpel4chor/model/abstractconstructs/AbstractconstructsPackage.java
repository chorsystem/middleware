/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs;

import org.eclipse.bpel4chor.model.pbd.PbdPackage;

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
 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractconstructsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractconstructs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://abstractconstructs/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstractconstructs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractconstructsPackage eINSTANCE = org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getAbstractActivity()
	 * @generated
	 */
	int ABSTRACT_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__DOCUMENTATION = PbdPackage.EXTENSION_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__ANY_ATTRIBUTE = PbdPackage.EXTENSION_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__ANY_ELEMENT = PbdPackage.EXTENSION_ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__STATE = PbdPackage.EXTENSION_ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__XPATH = PbdPackage.EXTENSION_ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__TARGETS = PbdPackage.EXTENSION_ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__SOURCES = PbdPackage.EXTENSION_ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__NAME = PbdPackage.EXTENSION_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__SUPPRESS_JOIN_FAILURE = PbdPackage.EXTENSION_ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__ID = PbdPackage.EXTENSION_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK = PbdPackage.EXTENSION_ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Refinement Start Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refinement End Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Handling Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plugin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__PLUGIN_TYPE = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Specific Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_FEATURE_COUNT = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractConnectorImpl
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getAbstractConnector()
	 * @generated
	 */
	int ABSTRACT_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Refinement Start Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__REFINEMENT_START_PHASE = 3;

	/**
	 * The feature id for the '<em><b>Refinement End Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__REFINEMENT_END_PHASE = 4;

	/**
	 * The feature id for the '<em><b>Failure Handling Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__FAILURE_HANDLING_STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Plugin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__PLUGIN_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Type Specific Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__TYPE_SPECIFIC_CONTENT = 7;

	/**
	 * The number of structural features of the '<em>Abstract Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractContainerImpl <em>Abstract Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractContainerImpl
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getAbstractContainer()
	 * @generated
	 */
	int ABSTRACT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__DOCUMENTATION = PbdPackage.EXTENSION_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ANY_ATTRIBUTE = PbdPackage.EXTENSION_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ANY_ELEMENT = PbdPackage.EXTENSION_ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__STATE = PbdPackage.EXTENSION_ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__XPATH = PbdPackage.EXTENSION_ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__TARGETS = PbdPackage.EXTENSION_ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__SOURCES = PbdPackage.EXTENSION_ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__NAME = PbdPackage.EXTENSION_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__SUPPRESS_JOIN_FAILURE = PbdPackage.EXTENSION_ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ID = PbdPackage.EXTENSION_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__DANGLING_FLOW_ACTIVITY_LINK = PbdPackage.EXTENSION_ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__CONTENT = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_FEATURE_COUNT = PbdPackage.EXTENSION_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases <em>Refinement Phases</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getRefinementPhases()
	 * @generated
	 */
	int REFINEMENT_PHASES = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity
	 * @generated
	 */
	EClass getAbstractActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementStartPhase <em>Refinement Start Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement Start Phase</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementStartPhase()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_RefinementStartPhase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementEndPhase <em>Refinement End Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement End Phase</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementEndPhase()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_RefinementEndPhase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Handling Strategy</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getFailureHandlingStrategy()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_FailureHandlingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getPluginType <em>Plugin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Type</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getPluginType()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_PluginType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getTypeSpecificContent <em>Type Specific Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Specific Content</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getTypeSpecificContent()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_TypeSpecificContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connector</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector
	 * @generated
	 */
	EClass getAbstractConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getName()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EAttribute getAbstractConnector_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getSource()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EReference getAbstractConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTarget()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EReference getAbstractConnector_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementStartPhase <em>Refinement Start Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement Start Phase</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementStartPhase()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EAttribute getAbstractConnector_RefinementStartPhase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementEndPhase <em>Refinement End Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement End Phase</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementEndPhase()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EAttribute getAbstractConnector_RefinementEndPhase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Handling Strategy</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getFailureHandlingStrategy()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EAttribute getAbstractConnector_FailureHandlingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getPluginType <em>Plugin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Type</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getPluginType()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EAttribute getAbstractConnector_PluginType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTypeSpecificContent <em>Type Specific Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Specific Content</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTypeSpecificContent()
	 * @see #getAbstractConnector()
	 * @generated
	 */
	EReference getAbstractConnector_TypeSpecificContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer <em>Abstract Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Container</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer
	 * @generated
	 */
	EClass getAbstractContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer#getContent()
	 * @see #getAbstractContainer()
	 * @generated
	 */
	EReference getAbstractContainer_Content();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases <em>Refinement Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refinement Phases</em>'.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
	 * @generated
	 */
	EEnum getRefinementPhases();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractconstructsFactory getAbstractconstructsFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getAbstractActivity()
		 * @generated
		 */
		EClass ABSTRACT_ACTIVITY = eINSTANCE.getAbstractActivity();

		/**
		 * The meta object literal for the '<em><b>Refinement Start Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE = eINSTANCE.getAbstractActivity_RefinementStartPhase();

		/**
		 * The meta object literal for the '<em><b>Refinement End Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE = eINSTANCE.getAbstractActivity_RefinementEndPhase();

		/**
		 * The meta object literal for the '<em><b>Failure Handling Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY = eINSTANCE.getAbstractActivity_FailureHandlingStrategy();

		/**
		 * The meta object literal for the '<em><b>Plugin Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__PLUGIN_TYPE = eINSTANCE.getAbstractActivity_PluginType();

		/**
		 * The meta object literal for the '<em><b>Type Specific Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT = eINSTANCE.getAbstractActivity_TypeSpecificContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractConnectorImpl
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getAbstractConnector()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTOR = eINSTANCE.getAbstractConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR__NAME = eINSTANCE.getAbstractConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR__SOURCE = eINSTANCE.getAbstractConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR__TARGET = eINSTANCE.getAbstractConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Refinement Start Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR__REFINEMENT_START_PHASE = eINSTANCE.getAbstractConnector_RefinementStartPhase();

		/**
		 * The meta object literal for the '<em><b>Refinement End Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR__REFINEMENT_END_PHASE = eINSTANCE.getAbstractConnector_RefinementEndPhase();

		/**
		 * The meta object literal for the '<em><b>Failure Handling Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR__FAILURE_HANDLING_STRATEGY = eINSTANCE.getAbstractConnector_FailureHandlingStrategy();

		/**
		 * The meta object literal for the '<em><b>Plugin Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONNECTOR__PLUGIN_TYPE = eINSTANCE.getAbstractConnector_PluginType();

		/**
		 * The meta object literal for the '<em><b>Type Specific Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTOR__TYPE_SPECIFIC_CONTENT = eINSTANCE.getAbstractConnector_TypeSpecificContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractContainerImpl <em>Abstract Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractContainerImpl
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getAbstractContainer()
		 * @generated
		 */
		EClass ABSTRACT_CONTAINER = eINSTANCE.getAbstractContainer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTAINER__CONTENT = eINSTANCE.getAbstractContainer_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases <em>Refinement Phases</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
		 * @see org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsPackageImpl#getRefinementPhases()
		 * @generated
		 */
		EEnum REFINEMENT_PHASES = eINSTANCE.getRefinementPhases();

	}

} //AbstractconstructsPackage
