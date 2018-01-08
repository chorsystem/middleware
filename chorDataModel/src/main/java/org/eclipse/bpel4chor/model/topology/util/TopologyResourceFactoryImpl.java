/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.topology.util.TopologyResourceImpl
 * @generated
 */
public class TopologyResourceFactoryImpl extends ResourceFactoryImpl
{
        /**
         * Creates an instance of the resource factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TopologyResourceFactoryImpl()
        {
                super();
        }

        /**
         * Creates an instance of the resource.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Resource createResource(URI uri)
        {
                Resource result = new TopologyResourceImpl(uri);
                return result;
        }

} //TopologyResourceFactoryImpl
