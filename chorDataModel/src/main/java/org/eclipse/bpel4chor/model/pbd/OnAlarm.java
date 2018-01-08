/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getFor <em>For</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getUntil <em>Until</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getRepeatEvery <em>Repeat Every</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getOnAlarm()
 * @model
 * @generated
 */
public interface OnAlarm extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(For)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getOnAlarm_For()
	 * @model containment="true"
	 * @generated
	 */
	For getFor();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(For value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' containment reference.
	 * @see #setUntil(Until)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getOnAlarm_Until()
	 * @model containment="true"
	 * @generated
	 */
	Until getUntil();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getUntil <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' containment reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(Until value);

	/**
	 * Returns the value of the '<em><b>Repeat Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Every</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Every</em>' containment reference.
	 * @see #setRepeatEvery(RepeatEvery)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getOnAlarm_RepeatEvery()
	 * @model containment="true"
	 * @generated
	 */
	RepeatEvery getRepeatEvery();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getRepeatEvery <em>Repeat Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Every</em>' containment reference.
	 * @see #getRepeatEvery()
	 * @generated
	 */
	void setRepeatEvery(RepeatEvery value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scope is only alowed, when OnAlarm is used in EventHandlers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getOnAlarm_Scope()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity is only alowed, when OnAlarm is used in Pick
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getOnAlarm_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // OnAlarm
