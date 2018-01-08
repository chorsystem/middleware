/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Element Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.LoopElementInstance#getLoopCounter <em>Loop Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getLoopElementInstance()
 * @model
 * @generated
 */
public interface LoopElementInstance extends ExtElementsElementInstance {
	/**
	 * Returns the value of the '<em><b>Loop Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Counter</em>' attribute.
	 * @see #setLoopCounter(long)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getLoopElementInstance_LoopCounter()
	 * @model
	 * @generated
	 */
	long getLoopCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.LoopElementInstance#getLoopCounter <em>Loop Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Counter</em>' attribute.
	 * @see #getLoopCounter()
	 * @generated
	 */
	void setLoopCounter(long value);

} // LoopElementInstance
