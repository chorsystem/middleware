/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getParticipantSets <em>Participant Sets</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getMessageLinks <em>Message Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getFlowActivityLinks <em>Flow Activity Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getGroundings <em>Groundings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getForEachIterationSpecs <em>For Each Iteration Specs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getAbstractConnectorLinks <em>Abstract Connector Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.Choreography#getGlobalDataModel <em>Global Data Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends EObject
{
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_Name()
	 * @model required="true"
	 * @generated
	 */
        String getName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.Choreography#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
        void setName(String value);

        /**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_TargetNamespace()
	 * @model required="true"
	 * @generated
	 */
        String getTargetNamespace();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.Choreography#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
        void setTargetNamespace(String value);

        /**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipant}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_Participants()
	 * @model containment="true"
	 * @generated
	 */
        EList<CParticipant> getParticipants();

        /**
	 * Returns the value of the '<em><b>Participant Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipantSet}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Sets</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Sets</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_ParticipantSets()
	 * @model containment="true"
	 * @generated
	 */
        EList<CParticipantSet> getParticipantSets();

        /**
	 * Returns the value of the '<em><b>Message Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CMessageLink}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Links</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Links</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_MessageLinks()
	 * @model containment="true"
	 * @generated
	 */
        EList<CMessageLink> getMessageLinks();

        /**
	 * Returns the value of the '<em><b>Participant Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipantRef}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Refs</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Refs</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_ParticipantRefs()
	 * @model containment="true"
	 * @generated
	 */
        EList<CParticipantRef> getParticipantRefs();

        /**
	 * Returns the value of the '<em><b>Flow Activity Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.FlowActivityLink}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Flow Activity Links</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Activity Links</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_FlowActivityLinks()
	 * @model containment="true"
	 * @generated
	 */
        EList<FlowActivityLink> getFlowActivityLinks();

        /**
	 * Returns the value of the '<em><b>Groundings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CGrounding}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Groundings</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Groundings</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_Groundings()
	 * @model containment="true"
	 * @generated
	 */
        EList<CGrounding> getGroundings();

        /**
	 * Returns the value of the '<em><b>For Each Iteration Specs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>For Each Iteration Specs</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each Iteration Specs</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_ForEachIterationSpecs()
	 * @model containment="true"
	 * @generated
	 */
        EList<ForEachIterationSpec> getForEachIterationSpecs();

								/**
	 * Returns the value of the '<em><b>Abstract Connector Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connector Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connector Links</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_AbstractConnectorLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConnectorLink> getAbstractConnectorLinks();

								/**
	 * Returns the value of the '<em><b>Global Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Data Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Data Model</em>' containment reference.
	 * @see #setGlobalDataModel(GlobalDataModel)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getChoreography_GlobalDataModel()
	 * @model containment="true"
	 * @generated
	 */
	GlobalDataModel getGlobalDataModel();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.Choreography#getGlobalDataModel <em>Global Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Data Model</em>' containment reference.
	 * @see #getGlobalDataModel()
	 * @generated
	 */
	void setGlobalDataModel(GlobalDataModel value);

} // Choreography
