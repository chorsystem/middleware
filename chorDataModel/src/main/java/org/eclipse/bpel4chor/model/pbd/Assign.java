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
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Assign#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Assign#getExtensionAssignOperation <em>Extension Assign Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Assign#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Activity {
	/**
	 * Returns the value of the '<em><b>Copy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.Copy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getAssign_Copy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Copy> getCopy();

	/**
	 * Returns the value of the '<em><b>Extension Assign Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.ExtensionAssignOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Assign Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Assign Operation</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getAssign_ExtensionAssignOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionAssignOperation> getExtensionAssignOperation();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setValidate(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getAssign_Validate()
	 * @model default="no"
	 * @generated
	 */
	Boolean getValidate();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Assign#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(Boolean value);

} // Assign
