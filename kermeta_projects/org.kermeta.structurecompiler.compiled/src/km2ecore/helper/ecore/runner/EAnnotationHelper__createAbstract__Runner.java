/* $Id: EAnnotationHelper__createAbstract__Runner.java,v 1.12 2009-02-23 15:26:53 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package km2ecore.helper.ecore.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class EAnnotationHelper__createAbstract__Runner {

	/**
	 * @generated
	 * Main for standalone context
	 */
	public static void main(String[] args) {

		// The following uri map is setted automatically,
		// but you could customize it with your own paths according to your usage
		/*ExtensibleURIConverterImpl.URI_MAP.put(
		    URI.createURI("platform:/resource/"),
		    URI.createURI("file://udd/cfaucher/wkpseclipse/runtime-KermetaCompiler2/")
		  );*/
		/*ExtensibleURIConverterImpl.URI_MAP.put(
		    URI.createURI("platform:/plugin/"),
		    URI.createURI("file://udd/cfaucher/wkpseclipse/runtime-KermetaCompiler2/")
		  );*/

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		km2ecore.helper.ecore.EAnnotationHelper anExec = (km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
						.getEAnnotationHelper());
		anExec.createAbstract();

	}

	/**
	 * @generated
	 * Main for deployed version in Eclipse
	 */
	public static void main_forDeployedVersion(String[] args) {

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		km2ecore.helper.ecore.EAnnotationHelper anExec = (km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
						.getEAnnotationHelper());
		anExec.createAbstract();

	}

}
