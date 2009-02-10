/* $Id: KM2EcoreContext__initializeConstants__Runner.java,v 1.11 2009-02-10 17:51:53 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package km2ecore.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class KM2EcoreContext__initializeConstants__Runner {

	/**
	 * @generated
	 * Main for standalone context
	 */
	public static void main(String[] args) {

		// The following uri map is setted automatically,
		// but you could customize it with your own paths according to your usage
		/*ExtensibleURIConverterImpl.URI_MAP.put(
		    URI.createURI("platform:/resource/"),
		    URI.createURI("file://C:/kermeta-1.2-ganymede-win32/runtime-KermetaCompilerTesting/")
		  );*/
		/*ExtensibleURIConverterImpl.URI_MAP.put(
		    URI.createURI("platform:/plugin/"),
		    URI.createURI("file://C:/kermeta-1.2-ganymede-win32/runtime-KermetaCompilerTesting/")
		  );*/

		//Initialize the persistence mapping
		//Maybe, we can comment the following line
		PersistenceMapping.getInstance();

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		km2ecore.KM2EcoreContext anExec = (km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.Km2ecorePackage.eINSTANCE
						.getKM2EcoreContext());
		anExec.initializeConstants();

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

		km2ecore.KM2EcoreContext anExec = (km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.Km2ecorePackage.eINSTANCE
						.getKM2EcoreContext());
		anExec.initializeConstants();

	}

}
