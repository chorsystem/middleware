/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getBranches()
 * @model
 * @generated
 */
public interface Branches extends Expression {
	/**
	 * Returns the value of the '<em><b>Successful Branches Only</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful Branches Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful Branches Only</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setSuccessfulBranchesOnly(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getBranches_SuccessfulBranchesOnly()
	 * @model default="no"
	 * @generated
	 */
	Boolean getSuccessfulBranchesOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful Branches Only</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getSuccessfulBranchesOnly()
	 * @generated
	 */
	void setSuccessfulBranchesOnly(Boolean value);

} // Branches
