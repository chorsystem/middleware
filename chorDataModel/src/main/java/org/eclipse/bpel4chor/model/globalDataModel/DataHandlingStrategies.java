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
 * A representation of the model object '<em><b>Data Handling Strategies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies#getDataHandlingStrategy <em>Data Handling Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataHandlingStrategies()
 * @model
 * @generated
 */
public interface DataHandlingStrategies extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Handling Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Handling Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Handling Strategy</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataHandlingStrategies_DataHandlingStrategy()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataHandlingStrategy> getDataHandlingStrategy();

} // DataHandlingStrategies
