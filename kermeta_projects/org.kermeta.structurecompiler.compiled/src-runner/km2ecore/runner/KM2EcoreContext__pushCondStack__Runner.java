/* $Id: Runner.javajet,v 1.20 2009-02-12 17:10:29 mclavreu Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package km2ecore.runner;

import org.kermeta.compil.runtime.ExecutionContext;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable operation
 *
 * @generated
 */
public class KM2EcoreContext__pushCondStack__Runner {

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

		km2ecore.KM2EcoreContext anExec = (km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.Km2ecorePackage.eINSTANCE
						.getKM2EcoreContext());
		anExec.pushCondStack();

	}

}
