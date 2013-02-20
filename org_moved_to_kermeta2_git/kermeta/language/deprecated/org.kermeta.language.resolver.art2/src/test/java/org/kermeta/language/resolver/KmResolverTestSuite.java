/*$Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z cedricbouhours $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : December 2010
 * Authors :
 *			Cédric Bouhours <cedric.bouhours@inria.fr>
 */
package org.kermeta.language.resolver;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.kermeta.language.api.port.PortKmResolver;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.api.tests.port.PortKmResolverTestSuite;
import org.kermeta.language.resolver.art2.impl.Art2ComponentKmResolver;

import org.kermeta.language.language.resolverrunner.MainRunner;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite for KmBinaryMerger port
 */
public class KmResolverTestSuite extends TestSuite {

	// @Override
	public static Test suite() {

		((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap(org.kermeta.language.language.resolver.org.eclipse.emf.ecore.RichFactory$.MODULE$) ;
		// force to initialize the eInstance (required for correct serialisation
		XMLNamespacePackage einstance = org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage.eINSTANCE;

		MainRunner.init();

		PortKmResolverTestSuite.portKmResolver = new PortAbstractFactory<PortKmResolver>() {

			@Override
			public PortKmResolver create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
				Art2ComponentKmResolver resolver = new Art2ComponentKmResolver();
				resolver.simulatedStart(resolver.getClass().getCanonicalName());
				return resolver;
			}
		};

		return PortKmResolverTestSuite.suite();
	}    
}
