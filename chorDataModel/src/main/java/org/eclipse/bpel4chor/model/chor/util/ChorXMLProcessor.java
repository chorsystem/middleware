/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.util;

import java.util.Map;

import org.eclipse.bpel4chor.model.chor.ChorPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChorXMLProcessor extends XMLProcessor
{

        /**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ChorXMLProcessor()
        {
		super((EPackage.Registry.INSTANCE));
		ChorPackage.eINSTANCE.eClass();
	}
        
        /**
	 * Register for "*" and "xml" file extensions the ChorResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected Map<String, Resource.Factory> getRegistrations()
        {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ChorResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ChorResourceFactoryImpl());
		}
		return registrations;
	}

} //ChorXMLProcessor
