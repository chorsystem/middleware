/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementStartPhase <em>Refinement Start Phase</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementEndPhase <em>Refinement End Phase</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getPluginType <em>Plugin Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTypeSpecificContent <em>Type Specific Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector()
 * @model
 * @generated
 */
public interface AbstractConnector extends EObject {
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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getName <em>Name</em>}' attribute.
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
	 * @see #setSource(AbstractContainer)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	AbstractContainer getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractContainer value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractConnector)
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractConnector getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractConnector value);

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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_RefinementStartPhase()
	 * @model
	 * @generated
	 */
	RefinementPhases getRefinementStartPhase();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementStartPhase <em>Refinement Start Phase</em>}' attribute.
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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_RefinementEndPhase()
	 * @model
	 * @generated
	 */
	RefinementPhases getRefinementEndPhase();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getRefinementEndPhase <em>Refinement End Phase</em>}' attribute.
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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_FailureHandlingStrategy()
	 * @model
	 * @generated
	 */
	String getFailureHandlingStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}' attribute.
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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_PluginType()
	 * @model required="true"
	 * @generated
	 */
	String getPluginType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getPluginType <em>Plugin Type</em>}' attribute.
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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getAbstractConnector_TypeSpecificContent()
	 * @model
	 * @generated
	 */
	EObject getTypeSpecificContent();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector#getTypeSpecificContent <em>Type Specific Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Specific Content</em>' reference.
	 * @see #getTypeSpecificContent()
	 * @generated
	 */
	void setTypeSpecificContent(EObject value);

} // AbstractConnector
