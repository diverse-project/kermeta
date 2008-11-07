/* $Id: Object__checkInvariants__Runner.java,v 1.8 2008-11-07 08:52:42 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.language.structure.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;
import org.kermeta.compil.runtime.helper.persistence.SaverOrLoader;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class Object__checkInvariants__Runner {

	/**
	 * @generated
	 * Main for standalone context
	 */
	public static void main(String[] args) {

		ExtensibleURIConverterImpl.URI_MAP
				.put(
						URI.createURI("platform:/resource/"),
						URI
								.createURI("file:/C:/kermeta-1.2-ganymede-win32/runtime-KermetaCompilerTesting/"));

		//Put here the paths to the metamodel stored in an ecore file that are required for loading and saving issues
		//Uncomment the following line and replace the path
		//If the Java Class import are not fixed, please use this qualified name for the SaverOrLoader Class: org.kermeta.compil.runtime.helper.persistence.SaverOrLoader
		//SaverOrLoader.registerEcoreMetamodel("platform:/resource/<myproject>/<>/<myMetaModel>.ecore");
		//SaverOrLoader.registerEcoreMetamodel("/home/<>/<myproject>/<>/<myMetaModel>.ecore");

		//Initialize the persistence mapping
		PersistenceMapping.initialize();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.language.structure.Object anExec = (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Object");
		anExec.checkInvariants();

	}

	/**
	 * @generated
	 * Main for deployed version in Eclipse
	 */
	public static void main_forDeployedVersion(String[] args) {

		//Initialize the persistence mapping
		PersistenceMapping.initialize();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.language.structure.Object anExec = (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Object");
		anExec.checkInvariants();

	}

}
