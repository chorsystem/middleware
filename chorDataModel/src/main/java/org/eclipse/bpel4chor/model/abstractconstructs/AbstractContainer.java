/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.ExtensionActivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractContainer()
 * @model
 * @generated
 */
public interface AbstractContainer extends ExtensionActivity, CLinkable {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractContainer_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getContent();

} // AbstractContainer
