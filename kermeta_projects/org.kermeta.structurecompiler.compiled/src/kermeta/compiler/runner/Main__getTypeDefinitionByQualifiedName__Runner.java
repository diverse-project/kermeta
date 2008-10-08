/* $Id: Main__getTypeDefinitionByQualifiedName__Runner.java,v 1.1 2008-10-08 14:37:57 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.compiler.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.helper.persistence.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class Main__getTypeDefinitionByQualifiedName__Runner {

	public static void main(String[] args) {

		ExtensibleURIConverterImpl.URI_MAP
				.put(
						URI.createURI("platform:/resource/"),
						URI
								.createURI("file:/C:/kermeta-1.2-ganymede-win32/runtime-KermetaCompilerTesting/"));

		PersistenceMapping
				.initialize("platform:/resource/org.kermeta.structurecompiler.compiled/config/kermeta.kruntimeconfiguration");

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.compiler.Main anExec = (kermeta.compiler.Main) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.compiler.Main");
		anExec.getTypeDefinitionByQualifiedName(args[0]);

		System.out.println("end of the execution of the method: main");
	}

}
