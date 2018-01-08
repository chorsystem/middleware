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
 * A representation of the model object '<em><b>Fault Handlers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatchAll <em>Catch All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFaultHandlers()
 * @model
 * @generated
 */
public interface FaultHandlers extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Catch</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.Catch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFaultHandlers_Catch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catch> getCatch();

	/**
	 * Returns the value of the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch All</em>' containment reference.
	 * @see #setCatchAll(CatchAll)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFaultHandlers_CatchAll()
	 * @model containment="true"
	 * @generated
	 */
	CatchAll getCatchAll();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatchAll <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch All</em>' containment reference.
	 * @see #getCatchAll()
	 * @generated
	 */
	void setCatchAll(CatchAll value);

} // FaultHandlers
