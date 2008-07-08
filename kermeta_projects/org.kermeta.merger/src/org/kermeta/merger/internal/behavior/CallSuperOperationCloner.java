

/*$Id: CallSuperOperationCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	CallSuperOperationCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class CallSuperOperationCloner {

	static public Object clone(CallSuperOperation node, AbstractBehaviorCloner visitor) {
		CallSuperOperation call = BehaviorFactory.eINSTANCE.createCallSuperOperation();
		call.setName( node.getName() );
		// getting the post fix
		for ( Expression expression : node.getParameters() )
			call.getParameters().add( (Expression) visitor.accept(expression) );
		return call;
	}
	
}


