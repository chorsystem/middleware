/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getMyRole <em>My Role</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getPartnerRole <em>Partner Role</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLink()
 * @model
 * @generated
 */
public interface PartnerLink extends ExtensibleElements
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
         * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLink_Name()
         * @model
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Partner Link Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Partner Link Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Partner Link Type</em>' attribute.
         * @see #setPartnerLinkType(String)
         * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLink_PartnerLinkType()
         * @model
         * @generated
         */
        String getPartnerLinkType();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Partner Link Type</em>' attribute.
         * @see #getPartnerLinkType()
         * @generated
         */
        void setPartnerLinkType(String value);

        /**
         * Returns the value of the '<em><b>My Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>My Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>My Role</em>' attribute.
         * @see #setMyRole(String)
         * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLink_MyRole()
         * @model
         * @generated
         */
        String getMyRole();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getMyRole <em>My Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>My Role</em>' attribute.
         * @see #getMyRole()
         * @generated
         */
        void setMyRole(String value);

        /**
         * Returns the value of the '<em><b>Partner Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Partner Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Partner Role</em>' attribute.
         * @see #setPartnerRole(String)
         * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLink_PartnerRole()
         * @model
         * @generated
         */
        String getPartnerRole();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getPartnerRole <em>Partner Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Partner Role</em>' attribute.
         * @see #getPartnerRole()
         * @generated
         */
        void setPartnerRole(String value);

        /**
         * Returns the value of the '<em><b>Initialize Partner Role</b></em>' attribute.
         * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Initialize Partner Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Initialize Partner Role</em>' attribute.
         * @see org.eclipse.bpel4chor.model.pbd.Boolean
         * @see #setInitializePartnerRole(Boolean)
         * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getPartnerLink_InitializePartnerRole()
         * @model
         * @generated
         */
        Boolean getInitializePartnerRole();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Initialize Partner Role</em>' attribute.
         * @see org.eclipse.bpel4chor.model.pbd.Boolean
         * @see #getInitializePartnerRole()
         * @generated
         */
        void setInitializePartnerRole(Boolean value);

} // PartnerLink
