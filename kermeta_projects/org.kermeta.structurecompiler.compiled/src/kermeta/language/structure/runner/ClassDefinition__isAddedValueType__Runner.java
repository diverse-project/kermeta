/* $Id: ClassDefinition__isAddedValueType__Runner.java,v 1.4 2008-11-27 15:49:48 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.language.structure.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class ClassDefinition__isAddedValueType__Runner {

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

		kermeta.language.structure.ClassDefinition anExec = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.ClassDefinition");
		anExec.isAddedValueType();

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

		kermeta.language.structure.ClassDefinition anExec = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.ClassDefinition");
		anExec.isAddedValueType();

	}

}
