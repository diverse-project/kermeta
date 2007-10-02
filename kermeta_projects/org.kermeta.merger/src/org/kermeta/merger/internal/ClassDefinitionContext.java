

/*$Id: ClassDefinitionContext.java,v 1.2 2007-10-02 15:20:32 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	ClassDefinitionContex.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 1 oct. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;

public class ClassDefinitionContext {

	Map<String, List<Operation>> operationsMapping = new HashMap<String, List<Operation>> ();
	
	Map<String, List<Property>> propertiesMapping = new HashMap<String, List<Property>> ();
	
	List<ClassDefinition> aspects = new ArrayList<ClassDefinition> ();
	
}


