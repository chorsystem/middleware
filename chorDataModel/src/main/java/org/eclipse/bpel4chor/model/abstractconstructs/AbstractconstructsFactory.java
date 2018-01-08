/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage
 * @generated
 */
public interface AbstractconstructsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractconstructsFactory eINSTANCE = org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractconstructsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Activity</em>'.
	 * @generated
	 */
	AbstractActivity createAbstractActivity();

	/**
	 * Returns a new object of class '<em>Abstract Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Connector</em>'.
	 * @generated
	 */
	AbstractConnector createAbstractConnector();

	/**
	 * Returns a new object of class '<em>Abstract Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Container</em>'.
	 * @generated
	 */
	AbstractContainer createAbstractContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractconstructsPackage getAbstractconstructsPackage();

} //AbstractconstructsFactory
