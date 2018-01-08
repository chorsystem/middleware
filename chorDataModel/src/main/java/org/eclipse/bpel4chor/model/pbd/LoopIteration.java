/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.LoopIteration#getLoopIterationCounter <em>Loop Iteration Counter</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.LoopIteration#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getLoopIteration()
 * @model
 * @generated
 */
public interface LoopIteration extends EObject {
	/**
	 * Returns the value of the '<em><b>Loop Iteration Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Iteration Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Iteration Counter</em>' attribute.
	 * @see #setLoopIterationCounter(int)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getLoopIteration_LoopIterationCounter()
	 * @model
	 * @generated
	 */
	int getLoopIterationCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.LoopIteration#getLoopIterationCounter <em>Loop Iteration Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Iteration Counter</em>' attribute.
	 * @see #getLoopIterationCounter()
	 * @generated
	 */
	void setLoopIterationCounter(int value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getLoopIteration_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.LoopIteration#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // LoopIteration
