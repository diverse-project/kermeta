

/*$Id: CallResultCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
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


