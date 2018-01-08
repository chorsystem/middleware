/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.FromPart#getPart <em>Part</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.FromPart#getToVariable <em>To Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFromPart()
 * @model
 * @generated
 */
public interface FromPart extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFromPart_Part()
	 * @model
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.FromPart#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

	/**
	 * Returns the value of the '<em><b>To Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Variable</em>' attribute.
	 * @see #setToVariable(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getFromPart_ToVariable()
	 * @model
	 * @generated
	 */
	String getToVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.FromPart#getToVariable <em>To Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Variable</em>' attribute.
	 * @see #getToVariable()
	 * @generated
	 */
	void setToVariable(String value);

} // FromPart
