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
 * A representation of the model object '<em><b>Partner Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.PartnerLinks#getPartnerLink <em>Partner Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLinks()
 * @model
 * @generated
 */
public interface PartnerLinks extends ExtensibleElements
{
        /**
         * Returns the value of the '<em><b>Partner Link</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.PartnerLink}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Partner Link</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Partner Link</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLinks_PartnerLink()
         * @model containment="true"
         * @generated
         */
        EList<PartnerLink> getPartnerLink();

} // PartnerLinks
