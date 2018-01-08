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
 * A representation of the model object '<em><b>Message Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.MessageLinks#getMessageLink <em>Message Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLinks()
 * @model
 * @generated
 */
public interface MessageLinks extends EObject
{
        /**
         * Returns the value of the '<em><b>Message Link</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.topology.MessageLink}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Link</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message Link</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getMessageLinks_MessageLink()
         * @model containment="true"
         * @generated
         */
        EList<MessageLink> getMessageLink();

} // MessageLinks
