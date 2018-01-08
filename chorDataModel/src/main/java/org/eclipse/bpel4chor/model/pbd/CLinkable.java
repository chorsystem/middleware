/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLinkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.CLinkable#getDanglingMessageLink <em>Dangling Message Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCLinkable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CLinkable extends EObject {
	/**
	 * Returns the value of the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.DanglingMessageLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dangling Message Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangling Message Link</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCLinkable_DanglingMessageLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<DanglingMessageLink> getDanglingMessageLink();

} // CLinkable
