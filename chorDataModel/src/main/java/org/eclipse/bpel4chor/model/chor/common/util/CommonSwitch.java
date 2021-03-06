/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.util;

import java.util.List;
import java.util.Map;

import org.eclipse.bpel4chor.model.chor.common.*;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommonPackage.ELEMENT_INSTANCE: {
				ElementInstance elementInstance = (ElementInstance)theEObject;
				T result = caseElementInstance(elementInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE: {
				MessageLinkElementInstance messageLinkElementInstance = (MessageLinkElementInstance)theEObject;
				T result = caseMessageLinkElementInstance(messageLinkElementInstance);
				if (result == null) result = caseElementInstance(messageLinkElementInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE: {
				ExtElementsElementInstance extElementsElementInstance = (ExtElementsElementInstance)theEObject;
				T result = caseExtElementsElementInstance(extElementsElementInstance);
				if (result == null) result = caseElementInstance(extElementsElementInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.LOOP_ELEMENT_INSTANCE: {
				LoopElementInstance loopElementInstance = (LoopElementInstance)theEObject;
				T result = caseLoopElementInstance(loopElementInstance);
				if (result == null) result = caseExtElementsElementInstance(loopElementInstance);
				if (result == null) result = caseElementInstance(loopElementInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ESTRING_TO_ELEMENT_INSTANCE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ElementInstance> eStringToElementInstanceMap = (Map.Entry<String, ElementInstance>)theEObject;
				T result = caseEStringToElementInstanceMap(eStringToElementInstanceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ESTRING_TO_PROCESS_INSTANCE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EMap<String, ElementInstance>> eStringToProcessInstanceMap = (Map.Entry<String, EMap<String, ElementInstance>>)theEObject;
				T result = caseEStringToProcessInstanceMap(eStringToProcessInstanceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementInstance(ElementInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Link Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Link Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageLinkElementInstance(MessageLinkElementInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Elements Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Elements Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtElementsElementInstance(ExtElementsElementInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopElementInstance(LoopElementInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To Element Instance Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To Element Instance Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToElementInstanceMap(Map.Entry<String, ElementInstance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To Process Instance Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To Process Instance Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToProcessInstanceMap(Map.Entry<String, EMap<String, ElementInstance>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CommonSwitch
