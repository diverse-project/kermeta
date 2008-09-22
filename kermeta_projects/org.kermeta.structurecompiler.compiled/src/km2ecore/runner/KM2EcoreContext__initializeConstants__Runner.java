/* $Id: KM2EcoreContext__initializeConstants__Runner.java,v 1.3 2008-09-22 14:48:58 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package km2ecore.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.helper.persistence.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class KM2EcoreContext__initializeConstants__Runner {

	public static void main(String[] args) {

		ExtensibleURIConverterImpl.URI_MAP.put(URI
				.createURI("platform:/resource/"), URI
				.createURI("file:/C:/eclipse3.3.2/runtime-KermetaCompiler/"));

		PersistenceMapping
				.initialize("platform:/resource/org.kermeta.structurecompiler.compiled/config/kermeta.kruntimeconfiguration");

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		km2ecore.KM2EcoreContext anExec = (km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.KM2EcoreContext");
		anExec.initializeConstants();

		System.out.println("end of the execution of the method: main");
	}

}
