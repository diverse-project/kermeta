/* $Id: Parameter__isRunnable__Runner.java,v 1.5 2008-10-16 13:17:34 cfaucher Exp $
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
public class Parameter__isRunnable__Runner {

	//Main for standalone context
	public static void main(String[] args) {

		ExtensibleURIConverterImpl.URI_MAP
				.put(
						URI.createURI("platform:/resource/"),
						URI
								.createURI("file:/C:/kermeta-1.2-ganymede-win32/runtime-KermetaCompilerTesting/"));

		//Put here the pathes to the metamodel stored in an ecore file that are required for loading and saving issues
		//Uncomment the following line and replace
		//SaverOrLoader.registerEcoreMetamodel("platform:/resource/<myproject>/<>/<myMetaModel>.ecore");
		//SaverOrLoader.registerEcoreMetamodel("/home/<>/<myproject>/<>/<myMetaModel>.ecore");

		//Initialize the persistence mapping
		PersistenceMapping.initialize();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.language.structure.Parameter anExec = (kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Parameter");
		anExec.isRunnable();

	}

	//Main for deployed version in Eclipse
	public static void main_forDeployedVersion(String[] args) {

		//Initialize the persistence mapping
		PersistenceMapping.initialize();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.language.structure.Parameter anExec = (kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Parameter");
		anExec.isRunnable();

	}

}
