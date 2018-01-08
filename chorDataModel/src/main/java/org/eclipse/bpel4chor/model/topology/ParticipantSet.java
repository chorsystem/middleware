/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getParticipantSet <em>Participant Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet()
 * @model
 * @generated
 */
public interface ParticipantSet extends EObject
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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet_Name()
         * @model required="true"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see #setType(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet_Type()
         * @model
         * @generated
         */
        String getType();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see #getType()
         * @generated
         */
        void setType(String value);

        /**
         * Returns the value of the '<em><b>For Each</b></em>' attribute list.
         * The list contents are of type {@link javax.xml.namespace.QName}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>For Each</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>For Each</em>' attribute list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet_ForEach()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        EList<QName> getForEach();

        /**
         * Returns the value of the '<em><b>Scope</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Scope</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Scope</em>' attribute.
         * @see #setScope(QName)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet_Scope()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getScope();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet#getScope <em>Scope</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Scope</em>' attribute.
         * @see #getScope()
         * @generated
         */
        void setScope(QName value);

        /**
         * Returns the value of the '<em><b>Participant Set</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.topology.ParticipantSet}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Set</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Set</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet_ParticipantSet()
         * @model containment="true"
         * @generated
         */
        EList<ParticipantSet> getParticipantSet();

        /**
         * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.topology.Participant}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantSet_Participant()
         * @model containment="true"
         * @generated
         */
        EList<Participant> getParticipant();

} // ParticipantSet
