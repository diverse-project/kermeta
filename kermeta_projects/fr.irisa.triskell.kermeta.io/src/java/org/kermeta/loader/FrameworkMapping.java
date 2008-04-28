

/*$Id: FrameworkMapping.java,v 1.5 2008-04-28 11:50:17 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	FrameworkMapping.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 oct. 07
* Authors : paco
* 
* FIXME CF: Maybe this file should be generated when the framework is compiled
*/

package org.kermeta.loader;

import java.util.HashMap;
import java.util.Map;

public class FrameworkMapping {

	static final public Map<String, String> mapping = new HashMap<String, String> ();
	
	
	static public void initialize(boolean deployedMode) {
		if ( deployedMode )
			initializeDeployed();
		else
			initializeLocale();
	}
	
	
	static private void initializeDeployed() {

		mapping.put(
			"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.ecore"
			, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.km");
		
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kermeta_java.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kermeta_java.km");
		
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/ecore/ecore_compatibility.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/ecore/ecore_compatibility.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/exceptions/exceptions.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/exceptions/exceptions.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/io/file_io.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/io/file_io.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/io/std_io.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/io/std_io.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/assert.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/assert.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/kunit.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/kunit.km");
				
		/*mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/behavior.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/behavior.km");*/
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/structure.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/structure.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/dynamic_expression.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/dynamic_expression.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/persistence/resource.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/persistence/resource.km");
				
		/*mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/reflection/reflection.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/reflection/reflection.km");*/
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/collections.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/collections.km");
				
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/java.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/java.km");
		
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/primitive_types.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/primitive_types.km");
	
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/hashtable.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/hashtable.km");
		
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/stack.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/stack.km");
		
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/StringBuffer.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/StringBuffer.km");
		
		mapping.put(
				"platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/reflective_collections.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/reflective_collections.km");
							
	}
	
	
	static private void initializeLocale() {

		mapping.put(
			"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.ecore"
			, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.km");
		
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/kermeta_java.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kermeta_java.km");
		
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/ecore/ecore_compatibility.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/ecore/ecore_compatibility.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/exceptions/exceptions.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/exceptions/exceptions.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/io/file_io.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/io/file_io.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/io/std_io.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/io/std_io.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/assert.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/assert.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/kunit.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/kunit/kunit.km");
				
		/*mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/language/behavior.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/behavior.km");*/
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/language/structure.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/structure.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/language/dynamic_expression.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/dynamic_expression.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/persistence/resource.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/persistence/resource.km");
				
	/*	mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/reflection/reflection.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/reflection/reflection.km");*/
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/standard/collections.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/collections.km");
				
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/standard/java.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/java.km");
		
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/standard/primitive_types.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/standard/primitive_types.km");
	
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/utils/hashtable.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/hashtable.km");
		
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/utils/stack.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/stack.km");
		
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/utils/StringBuffer.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/utils/StringBuffer.km");
		
		mapping.put(
				"platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/language/reflective_collections.ecore"
				, "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/language/reflective_collections.km");
							
	}
	
}


