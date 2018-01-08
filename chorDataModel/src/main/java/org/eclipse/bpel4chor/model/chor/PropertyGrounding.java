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
 * A representation of the model object '<em><b>Property Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding#getWSDLProperty <em>WSDL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getPropertyGrounding()
 * @model
 * @generated
 */
public interface PropertyGrounding extends EObject
{
        /**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getPropertyGrounding_PropertyName()
	 * @model
	 * @generated
	 */
        String getPropertyName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
        void setPropertyName(String value);

        /**
	 * Returns the value of the '<em><b>WSDL Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>WSDL Property</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>WSDL Property</em>' containment reference.
	 * @see #setWSDLProperty(CQName)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getPropertyGrounding_WSDLProperty()
	 * @model containment="true"
	 * @generated
	 */
        CQName getWSDLProperty();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding#getWSDLProperty <em>WSDL Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WSDL Property</em>' containment reference.
	 * @see #getWSDLProperty()
	 * @generated
	 */
        void setWSDLProperty(CQName value);

} // PropertyGrounding
