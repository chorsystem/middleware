/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata#getMetaData <em>Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObjectMetadata()
 * @model
 * @generated
 */
public interface DataObjectMetadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObjectMetadata_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getMetaData();

} // DataObjectMetadata
