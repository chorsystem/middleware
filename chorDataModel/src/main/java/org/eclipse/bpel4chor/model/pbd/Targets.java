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
 * A representation of the model object '<em><b>Targets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Targets#getJoinCondition <em>Join Condition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Targets#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getTargets()
 * @model
 * @generated
 */
public interface Targets extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Join Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Condition</em>' containment reference.
	 * @see #setJoinCondition(JoinCondition)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getTargets_JoinCondition()
	 * @model containment="true"
	 * @generated
	 */
	JoinCondition getJoinCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Targets#getJoinCondition <em>Join Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Condition</em>' containment reference.
	 * @see #getJoinCondition()
	 * @generated
	 */
	void setJoinCondition(JoinCondition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.Target}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getTargets_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Target> getTarget();

} // Targets
