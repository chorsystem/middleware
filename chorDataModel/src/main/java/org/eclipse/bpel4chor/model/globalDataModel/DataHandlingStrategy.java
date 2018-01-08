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
 * A representation of the model object '<em><b>Data Handling Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransferStrategy <em>Transfer Strategy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransformationStrategy <em>Transformation Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataHandlingStrategy()
 * @model
 * @generated
 */
public interface DataHandlingStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Transfer Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Strategy</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType
	 * @see #setTransferStrategy(TransferStrategyType)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataHandlingStrategy_TransferStrategy()
	 * @model
	 * @generated
	 */
	TransferStrategyType getTransferStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransferStrategy <em>Transfer Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Strategy</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType
	 * @see #getTransferStrategy()
	 * @generated
	 */
	void setTransferStrategy(TransferStrategyType value);

	/**
	 * Returns the value of the '<em><b>Transformation Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Strategy</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType
	 * @see #setTransformationStrategy(TransformationStrategyType)
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getDataHandlingStrategy_TransformationStrategy()
	 * @model
	 * @generated
	 */
	TransformationStrategyType getTransformationStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy#getTransformationStrategy <em>Transformation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Strategy</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType
	 * @see #getTransformationStrategy()
	 * @generated
	 */
	void setTransformationStrategy(TransformationStrategyType value);

} // DataHandlingStrategy
