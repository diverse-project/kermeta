/* $Id: EEnum__getEEnumLiteralByLiteral__Runner.java,v 1.9 2009-02-23 15:26:45 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package ecore.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class EEnum__getEEnumLiteralByLiteral__Runner {

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

		ecore.EEnum anExec = (ecore.EEnum) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE.getEEnum());
		anExec.getEEnumLiteralByLiteral(args[0]);

	}

	/**
	 * @generated
	 * Main for deployed version in Eclipse
	 */
	public static void main_forDeployedVersion(String[] args) {

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		ecore.EEnum anExec = (ecore.EEnum) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE.getEEnum());
		anExec.getEEnumLiteralByLiteral(args[0]);

	}

}
