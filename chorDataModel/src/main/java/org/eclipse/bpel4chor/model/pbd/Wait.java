/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Wait#getFor <em>For</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Wait#getUntil <em>Until</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends Activity {
	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(Expression)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getWait_For()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFor();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Wait#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Expression value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' containment reference.
	 * @see #setUntil(Expression)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getWait_Until()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUntil();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Wait#getUntil <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' containment reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(Expression value);

} // Wait
