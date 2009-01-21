/* $Id: TestCase__setTestMethodName__Runner.java,v 1.7 2009-01-21 09:15:51 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.kunit.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class TestCase__setTestMethodName__Runner {

	/**
	 * @generated
	 * Main for standalone context
	 */
	public static void main(String[] args) {

		ExtensibleURIConverterImpl.URI_MAP
				.put(
						URI.createURI("platform:/resource/"),
						URI
								.createURI("file://C:/kermeta-1.2-ganymede-win32/runtime-KermetaCompilerTesting/"));

		//Initialize the persistence mapping
		//Maybe, we can comment the following line
		PersistenceMapping.getInstance();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.kunit.TestCase anExec = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getTestCase());
		anExec.setTestMethodName(args[0]);

	}

	/**
	 * @generated
	 * Main for deployed version in Eclipse
	 */
	public static void main_forDeployedVersion(String[] args) {

		//Initialize the persistence mapping
		//Maybe, we can comment the following line
		PersistenceMapping.getInstance();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.kunit.TestCase anExec = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getTestCase());
		anExec.setTestMethodName(args[0]);

	}

}
