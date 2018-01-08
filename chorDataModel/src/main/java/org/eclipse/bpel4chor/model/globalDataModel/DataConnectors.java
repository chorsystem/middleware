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
 * A representation of the model object '<em><b>Data Connectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnectors#getDataConnector <em>Data Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnectors()
 * @model
 * @generated
 */
public interface DataConnectors extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Connector</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnectors_DataConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataConnector> getDataConnector();

} // DataConnectors
