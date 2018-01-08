/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xsd.XSDTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getStructuralDefinition <em>Structural Definition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getDataHandlingStrategies <em>Data Handling Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject()
 * @model
 * @generated
 */
public interface DataObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.globalDataModel.DataObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectType
	 * @see #setType(DataObjectType)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_Type()
	 * @model
	 * @generated
	 */
	DataObjectType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.DataObjectType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataObjectType value);

	/**
	 * Returns the value of the '<em><b>Structural Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Definition</em>' reference.
	 * @see #setStructuralDefinition(XSDTypeDefinition)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_StructuralDefinition()
	 * @model
	 * @generated
	 */
	XSDTypeDefinition getStructuralDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getStructuralDefinition <em>Structural Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Definition</em>' reference.
	 * @see #getStructuralDefinition()
	 * @generated
	 */
	void setStructuralDefinition(XSDTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference.
	 * @see #setMetaData(DataObjectMetadata)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	DataObjectMetadata getMetaData();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getMetaData <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' containment reference.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(DataObjectMetadata value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(DataConnectors)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_Incoming()
	 * @model
	 * @generated
	 */
	DataConnectors getIncoming();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(DataConnectors value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(DataConnectors)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_Outgoing()
	 * @model
	 * @generated
	 */
	DataConnectors getOutgoing();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(DataConnectors value);

	/**
	 * Returns the value of the '<em><b>Data Handling Strategies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Handling Strategies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Handling Strategies</em>' reference.
	 * @see #setDataHandlingStrategies(DataHandlingStrategies)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataObject_DataHandlingStrategies()
	 * @model
	 * @generated
	 */
	DataHandlingStrategies getDataHandlingStrategies();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataObject#getDataHandlingStrategies <em>Data Handling Strategies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Handling Strategies</em>' reference.
	 * @see #getDataHandlingStrategies()
	 * @generated
	 */
	void setDataHandlingStrategies(DataHandlingStrategies value);

} // DataObject
