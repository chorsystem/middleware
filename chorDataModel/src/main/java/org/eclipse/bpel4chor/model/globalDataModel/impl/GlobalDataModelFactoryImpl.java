/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalDataModelFactoryImpl extends EFactoryImpl implements GlobalDataModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlobalDataModelFactory init() {
		try {
			GlobalDataModelFactory theGlobalDataModelFactory = (GlobalDataModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.uni-stuttgart/iaas/choreography/gdm"); 
			if (theGlobalDataModelFactory != null) {
				return theGlobalDataModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlobalDataModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDataModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL: return createGlobalDataModel();
			case GlobalDataModelPackage.DATA_OBJECT: return createDataObject();
			case GlobalDataModelPackage.DATA_OBJECTS: return createDataObjects();
			case GlobalDataModelPackage.DATA_CONNECTORS: return createDataConnectors();
			case GlobalDataModelPackage.DATA_CONNECTOR: return createDataConnector();
			case GlobalDataModelPackage.DATA_MAPPING: return createDataMapping();
			case GlobalDataModelPackage.DATA_MAPPINGS: return createDataMappings();
			case GlobalDataModelPackage.DATA_OBJECT_METADATA: return createDataObjectMetadata();
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGIES: return createDataHandlingStrategies();
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY: return createDataHandlingStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GlobalDataModelPackage.DATA_OBJECT_TYPE:
				return createDataObjectTypeFromString(eDataType, initialValue);
			case GlobalDataModelPackage.TRANSFER_STRATEGY_TYPE:
				return createTransferStrategyTypeFromString(eDataType, initialValue);
			case GlobalDataModelPackage.TRANSFORMATION_STRATEGY_TYPE:
				return createTransformationStrategyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GlobalDataModelPackage.DATA_OBJECT_TYPE:
				return convertDataObjectTypeToString(eDataType, instanceValue);
			case GlobalDataModelPackage.TRANSFER_STRATEGY_TYPE:
				return convertTransferStrategyTypeToString(eDataType, instanceValue);
			case GlobalDataModelPackage.TRANSFORMATION_STRATEGY_TYPE:
				return convertTransformationStrategyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDataModel createGlobalDataModel() {
		GlobalDataModelImpl globalDataModel = new GlobalDataModelImpl();
		return globalDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjects createDataObjects() {
		DataObjectsImpl dataObjects = new DataObjectsImpl();
		return dataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnectors createDataConnectors() {
		DataConnectorsImpl dataConnectors = new DataConnectorsImpl();
		return dataConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnector createDataConnector() {
		DataConnectorImpl dataConnector = new DataConnectorImpl();
		return dataConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMapping createDataMapping() {
		DataMappingImpl dataMapping = new DataMappingImpl();
		return dataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMappings createDataMappings() {
		DataMappingsImpl dataMappings = new DataMappingsImpl();
		return dataMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectMetadata createDataObjectMetadata() {
		DataObjectMetadataImpl dataObjectMetadata = new DataObjectMetadataImpl();
		return dataObjectMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHandlingStrategies createDataHandlingStrategies() {
		DataHandlingStrategiesImpl dataHandlingStrategies = new DataHandlingStrategiesImpl();
		return dataHandlingStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHandlingStrategy createDataHandlingStrategy() {
		DataHandlingStrategyImpl dataHandlingStrategy = new DataHandlingStrategyImpl();
		return dataHandlingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectType createDataObjectTypeFromString(EDataType eDataType, String initialValue) {
		DataObjectType result = DataObjectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferStrategyType createTransferStrategyTypeFromString(EDataType eDataType, String initialValue) {
		TransferStrategyType result = TransferStrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationStrategyType createTransformationStrategyTypeFromString(EDataType eDataType, String initialValue) {
		TransformationStrategyType result = TransformationStrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformationStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDataModelPackage getGlobalDataModelPackage() {
		return (GlobalDataModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlobalDataModelPackage getPackage() {
		return GlobalDataModelPackage.eINSTANCE;
	}

} //GlobalDataModelFactoryImpl
