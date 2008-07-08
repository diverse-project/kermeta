

/*$Id: LambdaParameterCloner.java,v 1.3 2008-07-08 13:18:34 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	LambdaParameterCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class LambdaParameterCloner {

	static public Object clone(LambdaParameter node, AbstractBehaviorCloner visitor) {
		LambdaParameter newParameter = BehaviorFactory.eINSTANCE.createLambdaParameter();
		newParameter.setName( node.getName() );
		if ( node.getType() != null )
			newParameter.setType( (TypeReference) visitor.accept(node.getType()) );
		return newParameter;
	}
	
}


