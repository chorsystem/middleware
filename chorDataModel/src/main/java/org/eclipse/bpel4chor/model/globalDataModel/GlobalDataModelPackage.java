/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelFactory
 * @model kind="package"
 * @generated
 */
public interface GlobalDataModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "globalDataModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.uni-stuttgart/iaas/choreography/gdm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlobalDataModelPackage eINSTANCE = org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelImpl <em>Global Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getGlobalDataModel()
	 * @generated
	 */
	int GLOBAL_DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Data Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DATA_MODEL__DATA_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Data Connectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DATA_MODEL__DATA_CONNECTORS = 1;

	/**
	 * The number of structural features of the '<em>Global Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Structural Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__STRUCTURAL_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__META_DATA = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__INCOMING = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__OUTGOING = 5;

	/**
	 * The feature id for the '<em><b>Data Handling Strategies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DATA_HANDLING_STRATEGIES = 6;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectsImpl <em>Data Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectsImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObjects()
	 * @generated
	 */
	int DATA_OBJECTS = 2;

	/**
	 * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECTS__DATA_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Data Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECTS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorsImpl <em>Data Connectors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorsImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataConnectors()
	 * @generated
	 */
	int DATA_CONNECTORS = 3;

	/**
	 * The feature id for the '<em><b>Data Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTORS__DATA_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Data Connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTORS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl <em>Data Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataConnector()
	 * @generated
	 */
	int DATA_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTOR__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTOR__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTOR__SOURCE_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Target Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTOR__TARGET_MAPPINGS = 4;

	/**
	 * The number of structural features of the '<em>Data Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingImpl <em>Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataMapping()
	 * @generated
	 */
	int DATA_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Source Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__SOURCE_SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Target Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__TARGET_SELECTOR = 1;

	/**
	 * The number of structural features of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingsImpl <em>Data Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingsImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataMappings()
	 * @generated
	 */
	int DATA_MAPPINGS = 6;

	/**
	 * The feature id for the '<em><b>Data Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPINGS__DATA_MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Data Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectMetadataImpl <em>Data Object Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectMetadataImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObjectMetadata()
	 * @generated
	 */
	int DATA_OBJECT_METADATA = 7;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_METADATA__META_DATA = 0;

	/**
	 * The number of structural features of the '<em>Data Object Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_METADATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategiesImpl <em>Data Handling Strategies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategiesImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataHandlingStrategies()
	 * @generated
	 */
	int DATA_HANDLING_STRATEGIES = 8;

	/**
	 * The feature id for the '<em><b>Data Handling Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Data Handling Strategies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HANDLING_STRATEGIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategyImpl <em>Data Handling Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategyImpl
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataHandlingStrategy()
	 * @generated
	 */
	int DATA_HANDLING_STRATEGY = 9;

	/**
	 * The feature id for the '<em><b>Transfer Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Transformation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Data Handling Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HANDLING_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectType <em>Data Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectType
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObjectType()
	 * @generated
	 */
	int DATA_OBJECT_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType <em>Transfer Strategy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getTransferStrategyType()
	 * @generated
	 */
	int TRANSFER_STRATEGY_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType <em>Transformation Strategy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType
	 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getTransformationStrategyType()
	 * @generated
	 */
	int TRANSFORMATION_STRATEGY_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel <em>Global Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Data Model</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel
	 * @generated
	 */
	EClass getGlobalDataModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataObjects <em>Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Objects</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataObjects()
	 * @see #getGlobalDataModel()
	 * @generated
	 */
	EReference getGlobalDataModel_DataObjects();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataConnectors <em>Data Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Connectors</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel#getDataConnectors()
	 * @see #getGlobalDataModel()
	 * @generated
	 */
	EReference getGlobalDataModel_DataConnectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getName()
	 * @see #getDataObject()
	 * @generated
	 */
	EAttribute getDataObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getType()
	 * @see #getDataObject()
	 * @generated
	 */
	EAttribute getDataObject_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getStructuralDefinition <em>Structural Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Definition</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getStructuralDefinition()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_StructuralDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getMetaData()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_MetaData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getIncoming()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_Incoming();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getOutgoing()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getDataHandlingStrategies <em>Data Handling Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Handling Strategies</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObject#getDataHandlingStrategies()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_DataHandlingStrategies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjects <em>Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Objects</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjects
	 * @generated
	 */
	EClass getDataObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjects#getDataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Object</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjects#getDataObject()
	 * @see #getDataObjects()
	 * @generated
	 */
	EReference getDataObjects_DataObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnectors <em>Data Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Connectors</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnectors
	 * @generated
	 */
	EClass getDataConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnectors#getDataConnector <em>Data Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Connector</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnectors#getDataConnector()
	 * @see #getDataConnectors()
	 * @generated
	 */
	EReference getDataConnectors_DataConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector <em>Data Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Connector</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnector
	 * @generated
	 */
	EClass getDataConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getName()
	 * @see #getDataConnector()
	 * @generated
	 */
	EAttribute getDataConnector_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSource()
	 * @see #getDataConnector()
	 * @generated
	 */
	EReference getDataConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTarget()
	 * @see #getDataConnector()
	 * @generated
	 */
	EReference getDataConnector_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSourceMappings <em>Source Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Mappings</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSourceMappings()
	 * @see #getDataConnector()
	 * @generated
	 */
	EReference getDataConnector_SourceMappings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTargetMappings <em>Target Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Mappings</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTargetMappings()
	 * @see #getDataConnector()
	 * @generated
	 */
	EReference getDataConnector_TargetMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapping</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataMapping
	 * @generated
	 */
	EClass getDataMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getSourceSelector <em>Source Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Selector</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getSourceSelector()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_SourceSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getTargetSelector <em>Target Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Selector</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getTargetSelector()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_TargetSelector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMappings <em>Data Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mappings</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataMappings
	 * @generated
	 */
	EClass getDataMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMappings#getDataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Mapping</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataMappings#getDataMapping()
	 * @see #getDataMappings()
	 * @generated
	 */
	EReference getDataMappings_DataMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata <em>Data Object Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object Metadata</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata
	 * @generated
	 */
	EClass getDataObjectMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Data</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata#getMetaData()
	 * @see #getDataObjectMetadata()
	 * @generated
	 */
	EReference getDataObjectMetadata_MetaData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies <em>Data Handling Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Handling Strategies</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies
	 * @generated
	 */
	EClass getDataHandlingStrategies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies#getDataHandlingStrategy <em>Data Handling Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Handling Strategy</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies#getDataHandlingStrategy()
	 * @see #getDataHandlingStrategies()
	 * @generated
	 */
	EReference getDataHandlingStrategies_DataHandlingStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy <em>Data Handling Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Handling Strategy</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy
	 * @generated
	 */
	EClass getDataHandlingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransferStrategy <em>Transfer Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Strategy</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransferStrategy()
	 * @see #getDataHandlingStrategy()
	 * @generated
	 */
	EAttribute getDataHandlingStrategy_TransferStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransformationStrategy <em>Transformation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Strategy</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransformationStrategy()
	 * @see #getDataHandlingStrategy()
	 * @generated
	 */
	EAttribute getDataHandlingStrategy_TransformationStrategy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectType <em>Data Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Object Type</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectType
	 * @generated
	 */
	EEnum getDataObjectType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType <em>Transfer Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Strategy Type</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType
	 * @generated
	 */
	EEnum getTransferStrategyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType <em>Transformation Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformation Strategy Type</em>'.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType
	 * @generated
	 */
	EEnum getTransformationStrategyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlobalDataModelFactory getGlobalDataModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelImpl <em>Global Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getGlobalDataModel()
		 * @generated
		 */
		EClass GLOBAL_DATA_MODEL = eINSTANCE.getGlobalDataModel();

		/**
		 * The meta object literal for the '<em><b>Data Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DATA_MODEL__DATA_OBJECTS = eINSTANCE.getGlobalDataModel_DataObjects();

		/**
		 * The meta object literal for the '<em><b>Data Connectors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DATA_MODEL__DATA_CONNECTORS = eINSTANCE.getGlobalDataModel_DataConnectors();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT__NAME = eINSTANCE.getDataObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT__TYPE = eINSTANCE.getDataObject_Type();

		/**
		 * The meta object literal for the '<em><b>Structural Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__STRUCTURAL_DEFINITION = eINSTANCE.getDataObject_StructuralDefinition();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__META_DATA = eINSTANCE.getDataObject_MetaData();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__INCOMING = eINSTANCE.getDataObject_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__OUTGOING = eINSTANCE.getDataObject_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Data Handling Strategies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__DATA_HANDLING_STRATEGIES = eINSTANCE.getDataObject_DataHandlingStrategies();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectsImpl <em>Data Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectsImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObjects()
		 * @generated
		 */
		EClass DATA_OBJECTS = eINSTANCE.getDataObjects();

		/**
		 * The meta object literal for the '<em><b>Data Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECTS__DATA_OBJECT = eINSTANCE.getDataObjects_DataObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorsImpl <em>Data Connectors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorsImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataConnectors()
		 * @generated
		 */
		EClass DATA_CONNECTORS = eINSTANCE.getDataConnectors();

		/**
		 * The meta object literal for the '<em><b>Data Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONNECTORS__DATA_CONNECTOR = eINSTANCE.getDataConnectors_DataConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl <em>Data Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataConnector()
		 * @generated
		 */
		EClass DATA_CONNECTOR = eINSTANCE.getDataConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONNECTOR__NAME = eINSTANCE.getDataConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONNECTOR__SOURCE = eINSTANCE.getDataConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONNECTOR__TARGET = eINSTANCE.getDataConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Source Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONNECTOR__SOURCE_MAPPINGS = eINSTANCE.getDataConnector_SourceMappings();

		/**
		 * The meta object literal for the '<em><b>Target Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONNECTOR__TARGET_MAPPINGS = eINSTANCE.getDataConnector_TargetMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingImpl <em>Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataMapping()
		 * @generated
		 */
		EClass DATA_MAPPING = eINSTANCE.getDataMapping();

		/**
		 * The meta object literal for the '<em><b>Source Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__SOURCE_SELECTOR = eINSTANCE.getDataMapping_SourceSelector();

		/**
		 * The meta object literal for the '<em><b>Target Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__TARGET_SELECTOR = eINSTANCE.getDataMapping_TargetSelector();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingsImpl <em>Data Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingsImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataMappings()
		 * @generated
		 */
		EClass DATA_MAPPINGS = eINSTANCE.getDataMappings();

		/**
		 * The meta object literal for the '<em><b>Data Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAPPINGS__DATA_MAPPING = eINSTANCE.getDataMappings_DataMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectMetadataImpl <em>Data Object Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectMetadataImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObjectMetadata()
		 * @generated
		 */
		EClass DATA_OBJECT_METADATA = eINSTANCE.getDataObjectMetadata();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT_METADATA__META_DATA = eINSTANCE.getDataObjectMetadata_MetaData();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategiesImpl <em>Data Handling Strategies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategiesImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataHandlingStrategies()
		 * @generated
		 */
		EClass DATA_HANDLING_STRATEGIES = eINSTANCE.getDataHandlingStrategies();

		/**
		 * The meta object literal for the '<em><b>Data Handling Strategy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY = eINSTANCE.getDataHandlingStrategies_DataHandlingStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategyImpl <em>Data Handling Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategyImpl
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataHandlingStrategy()
		 * @generated
		 */
		EClass DATA_HANDLING_STRATEGY = eINSTANCE.getDataHandlingStrategy();

		/**
		 * The meta object literal for the '<em><b>Transfer Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY = eINSTANCE.getDataHandlingStrategy_TransferStrategy();

		/**
		 * The meta object literal for the '<em><b>Transformation Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY = eINSTANCE.getDataHandlingStrategy_TransformationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectType <em>Data Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectType
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getDataObjectType()
		 * @generated
		 */
		EEnum DATA_OBJECT_TYPE = eINSTANCE.getDataObjectType();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType <em>Transfer Strategy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getTransferStrategyType()
		 * @generated
		 */
		EEnum TRANSFER_STRATEGY_TYPE = eINSTANCE.getTransferStrategyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType <em>Transformation Strategy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType
		 * @see org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelPackageImpl#getTransformationStrategyType()
		 * @generated
		 */
		EEnum TRANSFORMATION_STRATEGY_TYPE = eINSTANCE.getTransformationStrategyType();

	}

} //GlobalDataModelPackage
