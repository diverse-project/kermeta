/* $Id: Bag__asOrderedSet__Runner.java,v 1.4 2008-10-08 14:37:34 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.standard.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.helper.persistence.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class Bag__asOrderedSet__Runner {

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

		kermeta.standard.Bag anExec = (kermeta.standard.Bag) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag");
		anExec.asOrderedSet();

		System.out.println("end of the execution of the method: main");
	}

}
