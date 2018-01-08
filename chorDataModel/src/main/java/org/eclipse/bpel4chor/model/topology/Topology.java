/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Topology#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Topology#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Topology#getParticipantTypes <em>Participant Types</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Topology#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Topology#getMessageLinks <em>Message Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getTopology()
 * @model
 * @generated
 */
public interface Topology extends EObject
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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getTopology_Name()
         * @model required="true"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Topology#getName <em>Name</em>}' attribute.
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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getTopology_TargetNamespace()
         * @model required="true"
         * @generated
         */
        String getTargetNamespace();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Topology#getTargetNamespace <em>Target Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Target Namespace</em>' attribute.
         * @see #getTargetNamespace()
         * @generated
         */
        void setTargetNamespace(String value);

        /**
         * Returns the value of the '<em><b>Participant Types</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Types</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Types</em>' containment reference.
         * @see #setParticipantTypes(ParticipantTypes)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getTopology_ParticipantTypes()
         * @model containment="true" required="true"
         * @generated
         */
        ParticipantTypes getParticipantTypes();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Topology#getParticipantTypes <em>Participant Types</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Participant Types</em>' containment reference.
         * @see #getParticipantTypes()
         * @generated
         */
        void setParticipantTypes(ParticipantTypes value);

        /**
         * Returns the value of the '<em><b>Participants</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participants</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participants</em>' containment reference.
         * @see #setParticipants(Participants)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getTopology_Participants()
         * @model containment="true" required="true"
         * @generated
         */
        Participants getParticipants();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Topology#getParticipants <em>Participants</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Participants</em>' containment reference.
         * @see #getParticipants()
         * @generated
         */
        void setParticipants(Participants value);

        /**
         * Returns the value of the '<em><b>Message Links</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Links</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message Links</em>' containment reference.
         * @see #setMessageLinks(MessageLinks)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getTopology_MessageLinks()
         * @model containment="true" required="true"
         * @generated
         */
        MessageLinks getMessageLinks();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Topology#getMessageLinks <em>Message Links</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Message Links</em>' containment reference.
         * @see #getMessageLinks()
         * @generated
         */
        void setMessageLinks(MessageLinks value);

} // Topology
