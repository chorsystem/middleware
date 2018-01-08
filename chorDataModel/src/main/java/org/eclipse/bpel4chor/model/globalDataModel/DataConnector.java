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
 * A representation of the model object '<em><b>Data Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSourceMappings <em>Source Mappings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTargetMappings <em>Target Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnector()
 * @model
 * @generated
 */
public interface DataConnector extends EObject {
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
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnector_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnector_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Source Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Mappings</em>' containment reference.
	 * @see #setSourceMappings(DataMappings)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnector_SourceMappings()
	 * @model containment="true"
	 * @generated
	 */
	DataMappings getSourceMappings();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getSourceMappings <em>Source Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Mappings</em>' containment reference.
	 * @see #getSourceMappings()
	 * @generated
	 */
	void setSourceMappings(DataMappings value);

	/**
	 * Returns the value of the '<em><b>Target Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mappings</em>' containment reference.
	 * @see #setTargetMappings(DataMappings)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataConnector_TargetMappings()
	 * @model containment="true"
	 * @generated
	 */
	DataMappings getTargetMappings();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataConnector#getTargetMappings <em>Target Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mappings</em>' containment reference.
	 * @see #getTargetMappings()
	 * @generated
	 */
	void setTargetMappings(DataMappings value);

} // DataConnector
