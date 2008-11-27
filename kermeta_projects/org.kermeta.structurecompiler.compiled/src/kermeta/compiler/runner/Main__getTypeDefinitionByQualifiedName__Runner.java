/* $Id: Main__getTypeDefinitionByQualifiedName__Runner.java,v 1.6 2008-11-27 15:50:13 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.compiler.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class Main__getTypeDefinitionByQualifiedName__Runner {

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
		PersistenceMapping.initialize();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.compiler.Main anExec = (kermeta.compiler.Main) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.compiler.Main");
		anExec.getTypeDefinitionByQualifiedName(args[0]);

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

		kermeta.compiler.Main anExec = (kermeta.compiler.Main) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.compiler.Main");
		anExec.getTypeDefinitionByQualifiedName(args[0]);

	}

}
