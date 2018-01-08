/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.impl;

import java.util.Map;

import org.eclipse.bpel4chor.model.chor.common.*;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory("http://uni.stuttgart.iaas.chor.common"); 
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommonPackage.ELEMENT_INSTANCE: return createElementInstance();
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE: return createMessageLinkElementInstance();
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE: return createExtElementsElementInstance();
			case CommonPackage.LOOP_ELEMENT_INSTANCE: return createLoopElementInstance();
			case CommonPackage.ESTRING_TO_ELEMENT_INSTANCE_MAP: return (EObject)createEStringToElementInstanceMap();
			case CommonPackage.ESTRING_TO_PROCESS_INSTANCE_MAP: return (EObject)createEStringToProcessInstanceMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementInstance createElementInstance() {
		ElementInstanceImpl elementInstance = new ElementInstanceImpl();
		return elementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLinkElementInstance createMessageLinkElementInstance() {
		MessageLinkElementInstanceImpl messageLinkElementInstance = new MessageLinkElementInstanceImpl();
		return messageLinkElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtElementsElementInstance createExtElementsElementInstance() {
		ExtElementsElementInstanceImpl extElementsElementInstance = new ExtElementsElementInstanceImpl();
		return extElementsElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopElementInstance createLoopElementInstance() {
		LoopElementInstanceImpl loopElementInstance = new LoopElementInstanceImpl();
		return loopElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ElementInstance> createEStringToElementInstanceMap() {
		EStringToElementInstanceMapImpl eStringToElementInstanceMap = new EStringToElementInstanceMapImpl();
		return eStringToElementInstanceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EMap<String, ElementInstance>> createEStringToProcessInstanceMap() {
		EStringToProcessInstanceMapImpl eStringToProcessInstanceMap = new EStringToProcessInstanceMapImpl();
		return eStringToProcessInstanceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
