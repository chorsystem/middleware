/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Import#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Import#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Import#getImportType <em>Import Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getImport_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Import#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getImport_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Import#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Type</em>' attribute.
	 * @see #setImportType(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getImport_ImportType()
	 * @model
	 * @generated
	 */
	String getImportType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Import#getImportType <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Type</em>' attribute.
	 * @see #getImportType()
	 * @generated
	 */
	void setImportType(String value);

} // Import
