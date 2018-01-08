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
 * A representation of the model object '<em><b>Data Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataMappings#getDataMapping <em>Data Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataMappings()
 * @model
 * @generated
 */
public interface DataMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Mapping</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataMappings_DataMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMapping> getDataMapping();

} // DataMappings
