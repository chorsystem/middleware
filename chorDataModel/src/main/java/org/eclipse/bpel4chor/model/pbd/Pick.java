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
 * A representation of the model object '<em><b>Pick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Pick#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Pick#getOnAlarm <em>On Alarm</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Pick#getCreateInstance <em>Create Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPick()
 * @model
 * @generated
 */
public interface Pick extends Activity {
	/**
	 * Returns the value of the '<em><b>On Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.OnMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Message</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPick_OnMessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnMessage> getOnMessage();

	/**
	 * Returns the value of the '<em><b>On Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.OnAlarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Alarm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Alarm</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPick_OnAlarm()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnAlarm> getOnAlarm();

	/**
	 * Returns the value of the '<em><b>Create Instance</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Instance</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setCreateInstance(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPick_CreateInstance()
	 * @model default="no"
	 * @generated
	 */
	Boolean getCreateInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Pick#getCreateInstance <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Instance</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getCreateInstance()
	 * @generated
	 */
	void setCreateInstance(Boolean value);

} // Pick
