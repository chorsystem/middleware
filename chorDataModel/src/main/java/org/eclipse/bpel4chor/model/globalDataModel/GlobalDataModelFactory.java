/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage
 * @generated
 */
public interface GlobalDataModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlobalDataModelFactory eINSTANCE = org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Global Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Data Model</em>'.
	 * @generated
	 */
	GlobalDataModel createGlobalDataModel();

	/**
	 * Returns a new object of class '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object</em>'.
	 * @generated
	 */
	DataObject createDataObject();

	/**
	 * Returns a new object of class '<em>Data Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Objects</em>'.
	 * @generated
	 */
	DataObjects createDataObjects();

	/**
	 * Returns a new object of class '<em>Data Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Connectors</em>'.
	 * @generated
	 */
	DataConnectors createDataConnectors();

	/**
	 * Returns a new object of class '<em>Data Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Connector</em>'.
	 * @generated
	 */
	DataConnector createDataConnector();

	/**
	 * Returns a new object of class '<em>Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Mapping</em>'.
	 * @generated
	 */
	DataMapping createDataMapping();

	/**
	 * Returns a new object of class '<em>Data Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Mappings</em>'.
	 * @generated
	 */
	DataMappings createDataMappings();

	/**
	 * Returns a new object of class '<em>Data Object Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object Metadata</em>'.
	 * @generated
	 */
	DataObjectMetadata createDataObjectMetadata();

	/**
	 * Returns a new object of class '<em>Data Handling Strategies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Handling Strategies</em>'.
	 * @generated
	 */
	DataHandlingStrategies createDataHandlingStrategies();

	/**
	 * Returns a new object of class '<em>Data Handling Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Handling Strategy</em>'.
	 * @generated
	 */
	DataHandlingStrategy createDataHandlingStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GlobalDataModelPackage getGlobalDataModelPackage();

} //GlobalDataModelFactory
