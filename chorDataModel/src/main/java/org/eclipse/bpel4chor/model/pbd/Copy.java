/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Copy#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Copy#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCopy()
 * @model
 * @generated
 */
public interface Copy extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(From)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCopy_From()
	 * @model containment="true"
	 * @generated
	 */
	From getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Copy#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(From value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(To)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCopy_To()
	 * @model containment="true"
	 * @generated
	 */
	To getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Copy#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(To value);

	/**
	 * Returns the value of the '<em><b>Keep Src Element Name</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Src Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Src Element Name</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setKeepSrcElementName(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCopy_KeepSrcElementName()
	 * @model default="no"
	 * @generated
	 */
	Boolean getKeepSrcElementName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Src Element Name</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getKeepSrcElementName()
	 * @generated
	 */
	void setKeepSrcElementName(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Missing From Data</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Missing From Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Missing From Data</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setIgnoreMissingFromData(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCopy_IgnoreMissingFromData()
	 * @model default="no"
	 * @generated
	 */
	Boolean getIgnoreMissingFromData();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Missing From Data</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getIgnoreMissingFromData()
	 * @generated
	 */
	void setIgnoreMissingFromData(Boolean value);

} // Copy
