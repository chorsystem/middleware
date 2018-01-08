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
 * A representation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getSourceSelector <em>Source Selector</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getTargetSelector <em>Target Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataMapping()
 * @model
 * @generated
 */
public interface DataMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Selector</em>' attribute.
	 * @see #setSourceSelector(String)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataMapping_SourceSelector()
	 * @model
	 * @generated
	 */
	String getSourceSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getSourceSelector <em>Source Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Selector</em>' attribute.
	 * @see #getSourceSelector()
	 * @generated
	 */
	void setSourceSelector(String value);

	/**
	 * Returns the value of the '<em><b>Target Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Selector</em>' attribute.
	 * @see #setTargetSelector(String)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataMapping_TargetSelector()
	 * @model
	 * @generated
	 */
	String getTargetSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataMapping#getTargetSelector <em>Target Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Selector</em>' attribute.
	 * @see #getTargetSelector()
	 * @generated
	 */
	void setTargetSelector(String value);

} // DataMapping
