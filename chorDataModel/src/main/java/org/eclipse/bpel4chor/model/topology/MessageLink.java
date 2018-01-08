/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSendActivity <em>Send Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getBindSenderTo <em>Bind Sender To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getReceiveActivity <em>Receive Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getMessageName <em>Message Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLink#getCopyParticipantRefsTo <em>Copy Participant Refs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink()
 * @model
 * @generated
 */
public interface MessageLink extends EObject
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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_Name()
         * @model
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Sender</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Sender</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Sender</em>' attribute.
         * @see #setSender(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_Sender()
         * @model
         * @generated
         */
        String getSender();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSender <em>Sender</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Sender</em>' attribute.
         * @see #getSender()
         * @generated
         */
        void setSender(String value);

        /**
         * Returns the value of the '<em><b>Senders</b></em>' attribute list.
         * The list contents are of type {@link java.lang.String}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Senders</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Senders</em>' attribute list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_Senders()
         * @model
         * @generated
         */
        EList<String> getSenders();

        /**
         * Returns the value of the '<em><b>Send Activity</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Send Activity</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Send Activity</em>' attribute.
         * @see #setSendActivity(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_SendActivity()
         * @model
         * @generated
         */
        String getSendActivity();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getSendActivity <em>Send Activity</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Send Activity</em>' attribute.
         * @see #getSendActivity()
         * @generated
         */
        void setSendActivity(String value);

        /**
         * Returns the value of the '<em><b>Bind Sender To</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Bind Sender To</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Bind Sender To</em>' attribute.
         * @see #setBindSenderTo(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_BindSenderTo()
         * @model
         * @generated
         */
        String getBindSenderTo();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getBindSenderTo <em>Bind Sender To</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Bind Sender To</em>' attribute.
         * @see #getBindSenderTo()
         * @generated
         */
        void setBindSenderTo(String value);

        /**
         * Returns the value of the '<em><b>Receiver</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Receiver</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Receiver</em>' attribute.
         * @see #setReceiver(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_Receiver()
         * @model required="true"
         * @generated
         */
        String getReceiver();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getReceiver <em>Receiver</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Receiver</em>' attribute.
         * @see #getReceiver()
         * @generated
         */
        void setReceiver(String value);

        /**
         * Returns the value of the '<em><b>Receive Activity</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Receive Activity</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Receive Activity</em>' attribute.
         * @see #setReceiveActivity(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_ReceiveActivity()
         * @model
         * @generated
         */
        String getReceiveActivity();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getReceiveActivity <em>Receive Activity</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Receive Activity</em>' attribute.
         * @see #getReceiveActivity()
         * @generated
         */
        void setReceiveActivity(String value);

        /**
         * Returns the value of the '<em><b>Message Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message Name</em>' attribute.
         * @see #setMessageName(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_MessageName()
         * @model required="true"
         * @generated
         */
        String getMessageName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.MessageLink#getMessageName <em>Message Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Message Name</em>' attribute.
         * @see #getMessageName()
         * @generated
         */
        void setMessageName(String value);

        /**
         * Returns the value of the '<em><b>Participant Refs</b></em>' attribute list.
         * The list contents are of type {@link java.lang.String}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Refs</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Refs</em>' attribute list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_ParticipantRefs()
         * @model
         * @generated
         */
        EList<String> getParticipantRefs();

        /**
         * Returns the value of the '<em><b>Copy Participant Refs To</b></em>' attribute list.
         * The list contents are of type {@link java.lang.String}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Copy Participant Refs To</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Copy Participant Refs To</em>' attribute list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLink_CopyParticipantRefsTo()
         * @model
         * @generated
         */
        EList<String> getCopyParticipantRefsTo();

} // MessageLink
