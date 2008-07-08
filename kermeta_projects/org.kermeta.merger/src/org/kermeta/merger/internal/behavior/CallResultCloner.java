

/*$Id: CallResultCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	CallResultCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class CallResultCloner {

	static public Object clone(CallResult node, AbstractBehaviorCloner visitor) {
		CallResult call = BehaviorFactory.eINSTANCE.createCallResult();
		call.setName( node.getName() );
		call.setIsAtpre( node.isIsAtpre() );
		// getting the post fix
		for ( Expression expression : node.getParameters() )
			call.getParameters().add( (Expression) visitor.accept(expression) );
		return call;
	}
	
}


