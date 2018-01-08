/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs;

import org.eclipse.bpel4chor.model.pbd.ExtensionActivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementStartPhase <em>Refinement Start Phase</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementEndPhase <em>Refinement End Phase</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getPluginType <em>Plugin Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getTypeSpecificContent <em>Type Specific Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractActivity()
 * @model
 * @generated
 */
public interface AbstractActivity extends ExtensionActivity {
	/**
	 * Returns the value of the '<em><b>Refinement Start Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Start Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement Start Phase</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
	 * @see #setRefinementStartPhase(RefinementPhases)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractActivity_RefinementStartPhase()
	 * @model
	 * @generated
	 */
	RefinementPhases getRefinementStartPhase();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementStartPhase <em>Refinement Start Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement Start Phase</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
	 * @see #getRefinementStartPhase()
	 * @generated
	 */
	void setRefinementStartPhase(RefinementPhases value);

	/**
	 * Returns the value of the '<em><b>Refinement End Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement End Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement End Phase</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
	 * @see #setRefinementEndPhase(RefinementPhases)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractActivity_RefinementEndPhase()
	 * @model
	 * @generated
	 */
	RefinementPhases getRefinementEndPhase();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getRefinementEndPhase <em>Refinement End Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement End Phase</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases
	 * @see #getRefinementEndPhase()
	 * @generated
	 */
	void setRefinementEndPhase(RefinementPhases value);

	/**
	 * Returns the value of the '<em><b>Failure Handling Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Handling Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Handling Strategy</em>' attribute.
	 * @see #setFailureHandlingStrategy(String)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractActivity_FailureHandlingStrategy()
	 * @model
	 * @generated
	 */
	String getFailureHandlingStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Handling Strategy</em>' attribute.
	 * @see #getFailureHandlingStrategy()
	 * @generated
	 */
	void setFailureHandlingStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Type</em>' attribute.
	 * @see #setPluginType(String)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractActivity_PluginType()
	 * @model required="true"
	 * @generated
	 */
	String getPluginType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getPluginType <em>Plugin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Type</em>' attribute.
	 * @see #getPluginType()
	 * @generated
	 */
	void setPluginType(String value);

	/**
	 * Returns the value of the '<em><b>Type Specific Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Specific Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Specific Content</em>' reference.
	 * @see #setTypeSpecificContent(EObject)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractActivity_TypeSpecificContent()
	 * @model
	 * @generated
	 */
	EObject getTypeSpecificContent();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity#getTypeSpecificContent <em>Type Specific Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Specific Content</em>' reference.
	 * @see #getTypeSpecificContent()
	 * @generated
	 */
	void setTypeSpecificContent(EObject value);

} // AbstractActivity
