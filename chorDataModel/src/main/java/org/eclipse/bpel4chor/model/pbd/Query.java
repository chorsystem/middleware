/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Query#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Query#getOpaque <em>Opaque</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Query#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Language</em>' attribute.
	 * @see #setQueryLanguage(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getQuery_QueryLanguage()
	 * @model
	 * @generated
	 */
	String getQueryLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Query#getQueryLanguage <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language</em>' attribute.
	 * @see #getQueryLanguage()
	 * @generated
	 */
	void setQueryLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Opaque</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.OpaqueBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opaque</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueBoolean
	 * @see #setOpaque(OpaqueBoolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getQuery_Opaque()
	 * @model
	 * @generated
	 */
	OpaqueBoolean getOpaque();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Query#getOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueBoolean
	 * @see #getOpaque()
	 * @generated
	 */
	void setOpaque(OpaqueBoolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getQuery_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Query#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Query
