/* $Id: Object__getWrapperValueTypeSelfExpression__Runner.java,v 1.1 2008-09-04 15:40:27 cfaucher Exp $
 * This file has been generated by the compiler of Kermeta (http://www.kermeta.org)
 */

package kermeta.language.structure.runner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.helper.persistence.PersistenceMapping;

/**
 * A Stub of a Java Application Runner for a Kermeta runnable method
 *
 * @generated
 */
public class Object__getWrapperValueTypeSelfExpression__Runner {

	public static void main(String[] args) {

		ExtensibleURIConverterImpl.URI_MAP.put(URI
				.createURI("platform:/resource/"), URI
				.createURI("file:/C:/eclipse3.3.2/runtime-KermetaCompiler/"));

		PersistenceMapping
				.initialize("platform:/resource/org.kermeta.structurecompiler.compiled/config/kermeta.kruntimeconfiguration");

		//Initialize the reflection
		ExecutionContext.getInstance().lazyInitialize();

		kermeta.language.structure.Object anExec = (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Object");
		anExec.getWrapperValueTypeSelfExpression();

		System.out.println("end of the execution of the method: main");
	}

}
