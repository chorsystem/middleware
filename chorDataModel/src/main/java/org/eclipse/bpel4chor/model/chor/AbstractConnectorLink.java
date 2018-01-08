/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector;
import org.eclipse.bpel4chor.model.pbd.CLinkable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Connector Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSendActivity <em>Send Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiveActivity <em>Receive Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getBindSenderTo <em>Bind Sender To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getMessageName <em>Message Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getAbstractConnector <em>Abstract Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink()
 * @model
 * @generated
 */
public interface AbstractConnectorLink extends EObject {
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_SendActivity()
	 * @model
	 * @generated
	 */
	CLinkable getSendActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSendActivity <em>Send Activity</em>}' reference.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_ReceiveActivity()
	 * @model
	 * @generated
	 */
	CLinkable getReceiveActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiveActivity <em>Receive Activity</em>}' reference.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_ParticipantRefs()
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_BindSenderTo()
	 * @model
	 * @generated
	 */
	CParticipant getBindSenderTo();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getBindSenderTo <em>Bind Sender To</em>}' reference.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_Sender()
	 * @model
	 * @generated
	 */
	CParticipant getSender();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSender <em>Sender</em>}' reference.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_Senders()
	 * @model
	 * @generated
	 */
	CParticipantSet getSenders();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getSenders <em>Senders</em>}' reference.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_Receiver()
	 * @model
	 * @generated
	 */
	CParticipant getReceiver();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getReceiver <em>Receiver</em>}' reference.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_MessageName()
	 * @model
	 * @generated
	 */
	String getMessageName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getMessageName <em>Message Name</em>}' attribute.
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connector</em>' reference.
	 * @see #setAbstractConnector(AbstractConnector)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getAbstractConnectorLink_AbstractConnector()
	 * @model
	 * @generated
	 */
	AbstractConnector getAbstractConnector();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink#getAbstractConnector <em>Abstract Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Connector</em>' reference.
	 * @see #getAbstractConnector()
	 * @generated
	 */
	void setAbstractConnector(AbstractConnector value);

} // AbstractConnectorLink
