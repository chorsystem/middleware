/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataObjects <em>Data Objects</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataConnectors <em>Data Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getGlobalDataModel()
 * @model
 * @generated
 */
public interface GlobalDataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Objects</em>' containment reference.
	 * @see #setDataObjects(DataObjects)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getGlobalDataModel_DataObjects()
	 * @model containment="true"
	 * @generated
	 */
	DataObjects getDataObjects();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataObjects <em>Data Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Objects</em>' containment reference.
	 * @see #getDataObjects()
	 * @generated
	 */
	void setDataObjects(DataObjects value);

	/**
	 * Returns the value of the '<em><b>Data Connectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Connectors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Connectors</em>' containment reference.
	 * @see #setDataConnectors(DataConnectors)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getGlobalDataModel_DataConnectors()
	 * @model containment="true"
	 * @generated
	 */
	DataConnectors getDataConnectors();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataConnectors <em>Data Connectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Connectors</em>' containment reference.
	 * @see #getDataConnectors()
	 * @generated
	 */
	void setDataConnectors(DataConnectors value);

} // GlobalDataModel
