/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = org.eclipse.bpel4chor.model.chor.common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Instance</em>'.
	 * @generated
	 */
	ElementInstance createElementInstance();

	/**
	 * Returns a new object of class '<em>Message Link Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Link Element Instance</em>'.
	 * @generated
	 */
	MessageLinkElementInstance createMessageLinkElementInstance();

	/**
	 * Returns a new object of class '<em>Ext Elements Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Elements Element Instance</em>'.
	 * @generated
	 */
	ExtElementsElementInstance createExtElementsElementInstance();

	/**
	 * Returns a new object of class '<em>Loop Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Element Instance</em>'.
	 * @generated
	 */
	LoopElementInstance createLoopElementInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
