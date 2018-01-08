/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Parts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ToParts#getToPart <em>To Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getToParts()
 * @model
 * @generated
 */
public interface ToParts extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>To Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.ToPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Part</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getToParts_ToPart()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToPart> getToPart();

} // ToParts
