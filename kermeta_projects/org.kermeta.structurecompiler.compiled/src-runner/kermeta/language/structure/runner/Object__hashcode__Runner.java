/* $Id: Runner.javajet,v 1.20 2009-02-12 17:10:29 mclavreu Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.language.structure.runner;

import org.kermeta.compil.runtime.ExecutionContext;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable operation
 *
 * @generated
 */
public class Object__hashcode__Runner {

	/**
	 * @generated
	 * Main to run the execution
	 */
	public static void main(String[] args) {

		// The following uri map is setted automatically,
		// but you could customize it with your own paths according to your usage
		/*org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl.URI_MAP.put(
		    org.eclipse.emf.common.util.URI.createURI("platform:/resource/"),
		    org.eclipse.emf.common.util.URI.createURI("file://C:/eclipse3.5/eclipse/runtime-New_configuration2/")
		  );*/
		/*org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl.URI_MAP.put(
		    org.eclipse.emf.common.util.URI.createURI("platform:/plugin/"),
		    org.eclipse.emf.common.util.URI.createURI("file://C:/eclipse3.5/eclipse/runtime-New_configuration2/")
		  );*/

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.language.structure.Object anExec = (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getObject());
		anExec.hashcode();

	}

}
