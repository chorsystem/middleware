/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.impl;

import java.util.Map;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.common.CommonFactory;
import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;
import org.eclipse.bpel4chor.model.chor.common.LoopElementInstance;
import org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance;

import org.eclipse.bpel4chor.model.chor.impl.ChorPackageImpl;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;

import org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl;

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
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageLinkElementInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extElementsElementInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopElementInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToElementInstanceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToProcessInstanceMapEClass = null;

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
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementInstance() {
		return elementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInstance_InstanceID() {
		return (EAttribute)elementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInstance_ProcessInstanceID() {
		return (EAttribute)elementInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInstance_Timestamp() {
		return (EAttribute)elementInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInstance_State() {
		return (EAttribute)elementInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInstance_Visited() {
		return (EAttribute)elementInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageLinkElementInstance() {
		return messageLinkElementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLinkElementInstance_MessageID() {
		return (EAttribute)messageLinkElementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLinkElementInstance_SendingActivityInstanceID() {
		return (EAttribute)messageLinkElementInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLinkElementInstance_ReceivingActivityInstanceID() {
		return (EAttribute)messageLinkElementInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLinkElementInstance_SendingProcessInstanceID() {
		return (EAttribute)messageLinkElementInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLinkElementInstance_ReceivingProcessInstanceID() {
		return (EAttribute)messageLinkElementInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtElementsElementInstance() {
		return extElementsElementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtElementsElementInstance_Xpath() {
		return (EAttribute)extElementsElementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtElementsElementInstance_LoopIteration() {
		return (EAttribute)extElementsElementInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtElementsElementInstance_ParentLoopInstance() {
		return (EReference)extElementsElementInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopElementInstance() {
		return loopElementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopElementInstance_LoopCounter() {
		return (EAttribute)loopElementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToElementInstanceMap() {
		return eStringToElementInstanceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToElementInstanceMap_Key() {
		return (EAttribute)eStringToElementInstanceMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStringToElementInstanceMap_Value() {
		return (EReference)eStringToElementInstanceMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToProcessInstanceMap() {
		return eStringToProcessInstanceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToProcessInstanceMap_Key() {
		return (EAttribute)eStringToProcessInstanceMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStringToProcessInstanceMap_Value() {
		return (EReference)eStringToProcessInstanceMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementInstanceEClass = createEClass(ELEMENT_INSTANCE);
		createEAttribute(elementInstanceEClass, ELEMENT_INSTANCE__INSTANCE_ID);
		createEAttribute(elementInstanceEClass, ELEMENT_INSTANCE__PROCESS_INSTANCE_ID);
		createEAttribute(elementInstanceEClass, ELEMENT_INSTANCE__TIMESTAMP);
		createEAttribute(elementInstanceEClass, ELEMENT_INSTANCE__STATE);
		createEAttribute(elementInstanceEClass, ELEMENT_INSTANCE__VISITED);

		messageLinkElementInstanceEClass = createEClass(MESSAGE_LINK_ELEMENT_INSTANCE);
		createEAttribute(messageLinkElementInstanceEClass, MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID);
		createEAttribute(messageLinkElementInstanceEClass, MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID);
		createEAttribute(messageLinkElementInstanceEClass, MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID);
		createEAttribute(messageLinkElementInstanceEClass, MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID);
		createEAttribute(messageLinkElementInstanceEClass, MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID);

		extElementsElementInstanceEClass = createEClass(EXT_ELEMENTS_ELEMENT_INSTANCE);
		createEAttribute(extElementsElementInstanceEClass, EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH);
		createEAttribute(extElementsElementInstanceEClass, EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION);
		createEReference(extElementsElementInstanceEClass, EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE);

		loopElementInstanceEClass = createEClass(LOOP_ELEMENT_INSTANCE);
		createEAttribute(loopElementInstanceEClass, LOOP_ELEMENT_INSTANCE__LOOP_COUNTER);

		eStringToElementInstanceMapEClass = createEClass(ESTRING_TO_ELEMENT_INSTANCE_MAP);
		createEAttribute(eStringToElementInstanceMapEClass, ESTRING_TO_ELEMENT_INSTANCE_MAP__KEY);
		createEReference(eStringToElementInstanceMapEClass, ESTRING_TO_ELEMENT_INSTANCE_MAP__VALUE);

		eStringToProcessInstanceMapEClass = createEClass(ESTRING_TO_PROCESS_INSTANCE_MAP);
		createEAttribute(eStringToProcessInstanceMapEClass, ESTRING_TO_PROCESS_INSTANCE_MAP__KEY);
		createEReference(eStringToProcessInstanceMapEClass, ESTRING_TO_PROCESS_INSTANCE_MAP__VALUE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		messageLinkElementInstanceEClass.getESuperTypes().add(this.getElementInstance());
		extElementsElementInstanceEClass.getESuperTypes().add(this.getElementInstance());
		loopElementInstanceEClass.getESuperTypes().add(this.getExtElementsElementInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(elementInstanceEClass, ElementInstance.class, "ElementInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementInstance_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, ElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInstance_ProcessInstanceID(), ecorePackage.getEString(), "processInstanceID", null, 0, 1, ElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInstance_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, ElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInstance_State(), ecorePackage.getEString(), "state", null, 0, 1, ElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInstance_Visited(), ecorePackage.getEBoolean(), "visited", null, 0, 1, ElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageLinkElementInstanceEClass, MessageLinkElementInstance.class, "MessageLinkElementInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageLinkElementInstance_MessageID(), ecorePackage.getEString(), "messageID", null, 0, 1, MessageLinkElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageLinkElementInstance_SendingActivityInstanceID(), ecorePackage.getEString(), "sendingActivityInstanceID", null, 0, 1, MessageLinkElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageLinkElementInstance_ReceivingActivityInstanceID(), ecorePackage.getEString(), "receivingActivityInstanceID", null, 0, 1, MessageLinkElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageLinkElementInstance_SendingProcessInstanceID(), ecorePackage.getEString(), "sendingProcessInstanceID", null, 0, 1, MessageLinkElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageLinkElementInstance_ReceivingProcessInstanceID(), ecorePackage.getEString(), "receivingProcessInstanceID", null, 0, 1, MessageLinkElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extElementsElementInstanceEClass, ExtElementsElementInstance.class, "ExtElementsElementInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtElementsElementInstance_Xpath(), ecorePackage.getEString(), "xpath", null, 0, 1, ExtElementsElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtElementsElementInstance_LoopIteration(), ecorePackage.getELong(), "loopIteration", null, 0, 1, ExtElementsElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtElementsElementInstance_ParentLoopInstance(), this.getLoopElementInstance(), null, "parentLoopInstance", null, 0, 1, ExtElementsElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopElementInstanceEClass, LoopElementInstance.class, "LoopElementInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoopElementInstance_LoopCounter(), ecorePackage.getELong(), "loopCounter", null, 0, 1, LoopElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToElementInstanceMapEClass, Map.Entry.class, "EStringToElementInstanceMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToElementInstanceMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStringToElementInstanceMap_Value(), this.getElementInstance(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToProcessInstanceMapEClass, Map.Entry.class, "EStringToProcessInstanceMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToProcessInstanceMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStringToProcessInstanceMap_Value(), this.getEStringToElementInstanceMap(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonPackageImpl
