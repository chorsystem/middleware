/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.Properties#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EObject
{
        /**
         * Returns the value of the '<em><b>Property</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.grounding.Property}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Property</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getProperties_Property()
         * @model containment="true"
         *        extendedMetaData="name='property' kind='element' namespace='##targetNamespace'"
         * @generated
         */
        EList<Property> getProperty();

} // Properties
