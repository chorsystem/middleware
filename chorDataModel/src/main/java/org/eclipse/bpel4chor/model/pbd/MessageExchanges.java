/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Exchanges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.MessageExchanges#getMessageExchange <em>Message Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getMessageExchanges()
 * @model
 * @generated
 */
public interface MessageExchanges extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Message Exchange</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.MessageExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getMessageExchanges_MessageExchange()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageExchange> getMessageExchange();

} // MessageExchanges
