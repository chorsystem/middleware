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
 * A representation of the model object '<em><b>From Parts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.FromParts#getFromPart <em>From Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFromParts()
 * @model
 * @generated
 */
public interface FromParts extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>From Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.FromPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Part</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFromParts_FromPart()
	 * @model containment="true"
	 * @generated
	 */
	EList<FromPart> getFromPart();

} // FromParts
