/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMessage Link Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getCMessageLink <em>CMessage Link</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getBSToWSDLProperty <em>BS To WSDL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLinkGrounding()
 * @model
 * @generated
 */
public interface CMessageLinkGrounding extends EObject
{
        /**
	 * Returns the value of the '<em><b>CMessage Link</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>CMessage Link</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>CMessage Link</em>' reference.
	 * @see #setCMessageLink(CMessageLink)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLinkGrounding_CMessageLink()
	 * @model
	 * @generated
	 */
        CMessageLink getCMessageLink();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getCMessageLink <em>CMessage Link</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMessage Link</em>' reference.
	 * @see #getCMessageLink()
	 * @generated
	 */
        void setCMessageLink(CMessageLink value);

        /**
	 * Returns the value of the '<em><b>Port Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Port Type</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' containment reference.
	 * @see #setPortType(CQName)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLinkGrounding_PortType()
	 * @model containment="true"
	 * @generated
	 */
        CQName getPortType();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getPortType <em>Port Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' containment reference.
	 * @see #getPortType()
	 * @generated
	 */
        void setPortType(CQName value);

        /**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Operation</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLinkGrounding_Operation()
	 * @model
	 * @generated
	 */
        String getOperation();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
        void setOperation(String value);

        /**
	 * Returns the value of the '<em><b>BS To WSDL Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>BS To WSDL Property</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>BS To WSDL Property</em>' containment reference.
	 * @see #setBSToWSDLProperty(CQName)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCMessageLinkGrounding_BSToWSDLProperty()
	 * @model containment="true"
	 * @generated
	 */
        CQName getBSToWSDLProperty();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding#getBSToWSDLProperty <em>BS To WSDL Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BS To WSDL Property</em>' containment reference.
	 * @see #getBSToWSDLProperty()
	 * @generated
	 */
        void setBSToWSDLProperty(CQName value);

} // CMessageLinkGrounding
