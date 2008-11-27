/* $Id: EMFResource__saveAndValidateWithEMF__Runner.java,v 1.9 2008-11-27 15:49:47 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.persistence.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class EMFResource__saveAndValidateWithEMF__Runner {

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

		kermeta.persistence.EMFResource anExec = (kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.persistence.EMFResource");
		anExec.saveAndValidateWithEMF();

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

		kermeta.persistence.EMFResource anExec = (kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.persistence.EMFResource");
		anExec.saveAndValidateWithEMF();

	}

}
