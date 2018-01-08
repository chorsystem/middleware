/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getParticipantBehaviorDescription <em>Participant Behavior Description</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getProcessLanguage <em>Process Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantType()
 * @model
 * @generated
 */
public interface ParticipantType extends EObject
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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantType_Name()
         * @model required="true"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Participant Behavior Description</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Behavior Description</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Behavior Description</em>' attribute.
         * @see #setParticipantBehaviorDescription(QName)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantType_ParticipantBehaviorDescription()
         * @model dataType="org.eclipse.wst.wsdl.QName" required="true"
         * @generated
         */
        QName getParticipantBehaviorDescription();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getParticipantBehaviorDescription <em>Participant Behavior Description</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Participant Behavior Description</em>' attribute.
         * @see #getParticipantBehaviorDescription()
         * @generated
         */
        void setParticipantBehaviorDescription(QName value);

        /**
         * Returns the value of the '<em><b>Process Language</b></em>' attribute.
         * The default value is <code>"urn:HPI_IAAS:choreography:profile:2006/12"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Process Language</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Process Language</em>' attribute.
         * @see #setProcessLanguage(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantType_ProcessLanguage()
         * @model default="urn:HPI_IAAS:choreography:profile:2006/12"
         * @generated
         */
        String getProcessLanguage();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.ParticipantType#getProcessLanguage <em>Process Language</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Process Language</em>' attribute.
         * @see #getProcessLanguage()
         * @generated
         */
        void setProcessLanguage(String value);

} // ParticipantType
