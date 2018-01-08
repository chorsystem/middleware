/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance;
import org.eclipse.bpel4chor.model.pbd.CLinkable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMessage Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSendActivity <em>Send Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiveActivity <em>Receive Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getBindSenderTo <em>Bind Sender To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getMessageName <em>Message Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceBuffer <em>Instance Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink()
 * @model
 * @generated
 */
public interface CMessageLink extends EObject
{
        /**
	 * Returns the value of the '<em><b>Send Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Send Activity</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Activity</em>' reference.
	 * @see #setSendActivity(CLinkable)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_SendActivity()
	 * @model
	 * @generated
	 */
        CLinkable getSendActivity();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSendActivity <em>Send Activity</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Activity</em>' reference.
	 * @see #getSendActivity()
	 * @generated
	 */
        void setSendActivity(CLinkable value);

        /**
	 * Returns the value of the '<em><b>Receive Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Receive Activity</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Activity</em>' reference.
	 * @see #setReceiveActivity(CLinkable)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_ReceiveActivity()
	 * @model
	 * @generated
	 */
        CLinkable getReceiveActivity();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiveActivity <em>Receive Activity</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Activity</em>' reference.
	 * @see #getReceiveActivity()
	 * @generated
	 */
        void setReceiveActivity(CLinkable value);

        /**
	 * Returns the value of the '<em><b>Participant Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipantRef}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Refs</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Refs</em>' reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_ParticipantRefs()
	 * @model
	 * @generated
	 */
        EList<CParticipantRef> getParticipantRefs();

        /**
	 * Returns the value of the '<em><b>Bind Sender To</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Bind Sender To</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Sender To</em>' reference.
	 * @see #setBindSenderTo(CParticipant)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_BindSenderTo()
	 * @model
	 * @generated
	 */
        CParticipant getBindSenderTo();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getBindSenderTo <em>Bind Sender To</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Sender To</em>' reference.
	 * @see #getBindSenderTo()
	 * @generated
	 */
        void setBindSenderTo(CParticipant value);

        /**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Sender</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(CParticipant)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_Sender()
	 * @model
	 * @generated
	 */
        CParticipant getSender();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
        void setSender(CParticipant value);

        /**
	 * Returns the value of the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Senders</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders</em>' reference.
	 * @see #setSenders(CParticipantSet)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_Senders()
	 * @model
	 * @generated
	 */
        CParticipantSet getSenders();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getSenders <em>Senders</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senders</em>' reference.
	 * @see #getSenders()
	 * @generated
	 */
        void setSenders(CParticipantSet value);

        /**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Receiver</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(CParticipant)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_Receiver()
	 * @model
	 * @generated
	 */
        CParticipant getReceiver();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
        void setReceiver(CParticipant value);

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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_MessageName()
	 * @model
	 * @generated
	 */
        String getMessageName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getMessageName <em>Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Name</em>' attribute.
	 * @see #getMessageName()
	 * @generated
	 */
        void setMessageName(String value);

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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_Name()
	 * @model
	 * @generated
	 */
        String getName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
        void setName(String value);

								/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_State()
	 * @model
	 * @generated
	 */
	String getState();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

								/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_Id()
	 * @model
	 * @generated
	 */
	String getId();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

								/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLink#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

								/**
	 * Returns the value of the '<em><b>Instance Buffer</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.bpel4chor.model.chor.common.ElementInstance},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Buffer</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Buffer</em>' map.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLink_InstanceBuffer()
	 * @model mapType="org.eclipse.bpel4chor.model.chor.common.EStringToElementInstanceMap<org.eclipse.emf.ecore.EString, org.eclipse.bpel4chor.model.chor.common.ElementInstance>"
	 * @generated
	 */
	EMap<String, ElementInstance> getInstanceBuffer();

} // CMessageLink
