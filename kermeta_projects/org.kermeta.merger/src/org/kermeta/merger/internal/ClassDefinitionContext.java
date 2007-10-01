

/*$Id: ClassDefinitionContext.java,v 1.1 2007-10-01 15:07:49 ftanguy Exp $
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

public class ClassDefinitionContext {

	Map<String, List<Operation>> operationsMapping = new HashMap<String, List<Operation>> ();
	
	List<ClassDefinition> aspects = new ArrayList<ClassDefinition> ();
	
}


