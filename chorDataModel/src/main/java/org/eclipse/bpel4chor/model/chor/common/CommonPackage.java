/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common;

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
 * @see org.eclipse.bpel4chor.model.chor.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uni.stuttgart.iaas.chor.common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl <em>Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getElementInstance()
	 * @generated
	 */
	int ELEMENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE__INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE__PROCESS_INSTANCE_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE__STATE = 3;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE__VISITED = 4;

	/**
	 * The number of structural features of the '<em>Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl <em>Message Link Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getMessageLinkElementInstance()
	 * @generated
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__INSTANCE_ID = ELEMENT_INSTANCE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__PROCESS_INSTANCE_ID = ELEMENT_INSTANCE__PROCESS_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__TIMESTAMP = ELEMENT_INSTANCE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__STATE = ELEMENT_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__VISITED = ELEMENT_INSTANCE__VISITED;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID = ELEMENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sending Activity Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID = ELEMENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiving Activity Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID = ELEMENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sending Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID = ELEMENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receiving Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID = ELEMENT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Link Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LINK_ELEMENT_INSTANCE_FEATURE_COUNT = ELEMENT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl <em>Ext Elements Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getExtElementsElementInstance()
	 * @generated
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__INSTANCE_ID = ELEMENT_INSTANCE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__PROCESS_INSTANCE_ID = ELEMENT_INSTANCE__PROCESS_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__TIMESTAMP = ELEMENT_INSTANCE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__STATE = ELEMENT_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__VISITED = ELEMENT_INSTANCE__VISITED;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH = ELEMENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION = ELEMENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Loop Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE = ELEMENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ext Elements Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENTS_ELEMENT_INSTANCE_FEATURE_COUNT = ELEMENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.LoopElementInstanceImpl <em>Loop Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.LoopElementInstanceImpl
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getLoopElementInstance()
	 * @generated
	 */
	int LOOP_ELEMENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__INSTANCE_ID = EXT_ELEMENTS_ELEMENT_INSTANCE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__PROCESS_INSTANCE_ID = EXT_ELEMENTS_ELEMENT_INSTANCE__PROCESS_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__TIMESTAMP = EXT_ELEMENTS_ELEMENT_INSTANCE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__STATE = EXT_ELEMENTS_ELEMENT_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__VISITED = EXT_ELEMENTS_ELEMENT_INSTANCE__VISITED;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__XPATH = EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH;

	/**
	 * The feature id for the '<em><b>Loop Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__LOOP_ITERATION = EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION;

	/**
	 * The feature id for the '<em><b>Parent Loop Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE = EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE;

	/**
	 * The feature id for the '<em><b>Loop Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE__LOOP_COUNTER = EXT_ELEMENTS_ELEMENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ELEMENT_INSTANCE_FEATURE_COUNT = EXT_ELEMENTS_ELEMENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.EStringToElementInstanceMapImpl <em>EString To Element Instance Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.EStringToElementInstanceMapImpl
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getEStringToElementInstanceMap()
	 * @generated
	 */
	int ESTRING_TO_ELEMENT_INSTANCE_MAP = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ELEMENT_INSTANCE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ELEMENT_INSTANCE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Element Instance Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ELEMENT_INSTANCE_MAP_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.EStringToProcessInstanceMapImpl <em>EString To Process Instance Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.EStringToProcessInstanceMapImpl
	 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getEStringToProcessInstanceMap()
	 * @generated
	 */
	int ESTRING_TO_PROCESS_INSTANCE_MAP = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_PROCESS_INSTANCE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_PROCESS_INSTANCE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Process Instance Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_PROCESS_INSTANCE_MAP_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance <em>Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ElementInstance
	 * @generated
	 */
	EClass getElementInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ElementInstance#getInstanceID()
	 * @see #getElementInstance()
	 * @generated
	 */
	EAttribute getElementInstance_InstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getProcessInstanceID <em>Process Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ElementInstance#getProcessInstanceID()
	 * @see #getElementInstance()
	 * @generated
	 */
	EAttribute getElementInstance_ProcessInstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ElementInstance#getTimestamp()
	 * @see #getElementInstance()
	 * @generated
	 */
	EAttribute getElementInstance_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ElementInstance#getState()
	 * @see #getElementInstance()
	 * @generated
	 */
	EAttribute getElementInstance_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#isVisited <em>Visited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visited</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ElementInstance#isVisited()
	 * @see #getElementInstance()
	 * @generated
	 */
	EAttribute getElementInstance_Visited();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance <em>Message Link Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Link Element Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance
	 * @generated
	 */
	EClass getMessageLinkElementInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getMessageID()
	 * @see #getMessageLinkElementInstance()
	 * @generated
	 */
	EAttribute getMessageLinkElementInstance_MessageID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingActivityInstanceID <em>Sending Activity Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sending Activity Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingActivityInstanceID()
	 * @see #getMessageLinkElementInstance()
	 * @generated
	 */
	EAttribute getMessageLinkElementInstance_SendingActivityInstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingActivityInstanceID <em>Receiving Activity Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiving Activity Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingActivityInstanceID()
	 * @see #getMessageLinkElementInstance()
	 * @generated
	 */
	EAttribute getMessageLinkElementInstance_ReceivingActivityInstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingProcessInstanceID <em>Sending Process Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sending Process Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingProcessInstanceID()
	 * @see #getMessageLinkElementInstance()
	 * @generated
	 */
	EAttribute getMessageLinkElementInstance_SendingProcessInstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingProcessInstanceID <em>Receiving Process Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiving Process Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingProcessInstanceID()
	 * @see #getMessageLinkElementInstance()
	 * @generated
	 */
	EAttribute getMessageLinkElementInstance_ReceivingProcessInstanceID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance <em>Ext Elements Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Elements Element Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance
	 * @generated
	 */
	EClass getExtElementsElementInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getXpath()
	 * @see #getExtElementsElementInstance()
	 * @generated
	 */
	EAttribute getExtElementsElementInstance_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getLoopIteration <em>Loop Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Iteration</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getLoopIteration()
	 * @see #getExtElementsElementInstance()
	 * @generated
	 */
	EAttribute getExtElementsElementInstance_LoopIteration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getParentLoopInstance <em>Parent Loop Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Loop Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getParentLoopInstance()
	 * @see #getExtElementsElementInstance()
	 * @generated
	 */
	EReference getExtElementsElementInstance_ParentLoopInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.chor.common.LoopElementInstance <em>Loop Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Element Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.LoopElementInstance
	 * @generated
	 */
	EClass getLoopElementInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.chor.common.LoopElementInstance#getLoopCounter <em>Loop Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Counter</em>'.
	 * @see org.eclipse.bpel4chor.model.chor.common.LoopElementInstance#getLoopCounter()
	 * @see #getLoopElementInstance()
	 * @generated
	 */
	EAttribute getLoopElementInstance_LoopCounter();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Element Instance Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Element Instance Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.bpel4chor.model.chor.common.ElementInstance"
	 * @generated
	 */
	EClass getEStringToElementInstanceMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToElementInstanceMap()
	 * @generated
	 */
	EAttribute getEStringToElementInstanceMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToElementInstanceMap()
	 * @generated
	 */
	EReference getEStringToElementInstanceMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Process Instance Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Process Instance Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueMapType="org.eclipse.bpel4chor.model.chor.common.EStringToElementInstanceMap<org.eclipse.emf.ecore.EString, org.eclipse.bpel4chor.model.chor.common.ElementInstance>"
	 * @generated
	 */
	EClass getEStringToProcessInstanceMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToProcessInstanceMap()
	 * @generated
	 */
	EAttribute getEStringToProcessInstanceMap_Key();

	/**
	 * Returns the meta object for the map '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToProcessInstanceMap()
	 * @generated
	 */
	EReference getEStringToProcessInstanceMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl <em>Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getElementInstance()
		 * @generated
		 */
		EClass ELEMENT_INSTANCE = eINSTANCE.getElementInstance();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INSTANCE__INSTANCE_ID = eINSTANCE.getElementInstance_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Process Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INSTANCE__PROCESS_INSTANCE_ID = eINSTANCE.getElementInstance_ProcessInstanceID();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INSTANCE__TIMESTAMP = eINSTANCE.getElementInstance_Timestamp();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INSTANCE__STATE = eINSTANCE.getElementInstance_State();

		/**
		 * The meta object literal for the '<em><b>Visited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INSTANCE__VISITED = eINSTANCE.getElementInstance_Visited();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl <em>Message Link Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getMessageLinkElementInstance()
		 * @generated
		 */
		EClass MESSAGE_LINK_ELEMENT_INSTANCE = eINSTANCE.getMessageLinkElementInstance();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID = eINSTANCE.getMessageLinkElementInstance_MessageID();

		/**
		 * The meta object literal for the '<em><b>Sending Activity Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID = eINSTANCE.getMessageLinkElementInstance_SendingActivityInstanceID();

		/**
		 * The meta object literal for the '<em><b>Receiving Activity Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID = eINSTANCE.getMessageLinkElementInstance_ReceivingActivityInstanceID();

		/**
		 * The meta object literal for the '<em><b>Sending Process Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID = eINSTANCE.getMessageLinkElementInstance_SendingProcessInstanceID();

		/**
		 * The meta object literal for the '<em><b>Receiving Process Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID = eINSTANCE.getMessageLinkElementInstance_ReceivingProcessInstanceID();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl <em>Ext Elements Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getExtElementsElementInstance()
		 * @generated
		 */
		EClass EXT_ELEMENTS_ELEMENT_INSTANCE = eINSTANCE.getExtElementsElementInstance();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH = eINSTANCE.getExtElementsElementInstance_Xpath();

		/**
		 * The meta object literal for the '<em><b>Loop Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION = eINSTANCE.getExtElementsElementInstance_LoopIteration();

		/**
		 * The meta object literal for the '<em><b>Parent Loop Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE = eINSTANCE.getExtElementsElementInstance_ParentLoopInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.LoopElementInstanceImpl <em>Loop Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.LoopElementInstanceImpl
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getLoopElementInstance()
		 * @generated
		 */
		EClass LOOP_ELEMENT_INSTANCE = eINSTANCE.getLoopElementInstance();

		/**
		 * The meta object literal for the '<em><b>Loop Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_ELEMENT_INSTANCE__LOOP_COUNTER = eINSTANCE.getLoopElementInstance_LoopCounter();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.EStringToElementInstanceMapImpl <em>EString To Element Instance Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.EStringToElementInstanceMapImpl
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getEStringToElementInstanceMap()
		 * @generated
		 */
		EClass ESTRING_TO_ELEMENT_INSTANCE_MAP = eINSTANCE.getEStringToElementInstanceMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_ELEMENT_INSTANCE_MAP__KEY = eINSTANCE.getEStringToElementInstanceMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_ELEMENT_INSTANCE_MAP__VALUE = eINSTANCE.getEStringToElementInstanceMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.chor.common.impl.EStringToProcessInstanceMapImpl <em>EString To Process Instance Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.EStringToProcessInstanceMapImpl
		 * @see org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl#getEStringToProcessInstanceMap()
		 * @generated
		 */
		EClass ESTRING_TO_PROCESS_INSTANCE_MAP = eINSTANCE.getEStringToProcessInstanceMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_PROCESS_INSTANCE_MAP__KEY = eINSTANCE.getEStringToProcessInstanceMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_PROCESS_INSTANCE_MAP__VALUE = eINSTANCE.getEStringToProcessInstanceMap_Value();

	}

} //CommonPackage
