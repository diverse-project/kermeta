

/*$Id: ConditionalCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	ConditionalCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;

public class ConditionalCloner {

	static public Object clone(Conditional node, AbstractBehaviorCloner visitor) {
		Conditional conditional = BehaviorFactory.eINSTANCE.createConditional();
		conditional.setCondition( (Expression) visitor.accept(node.getCondition()) );
		if ( node.getElseBody() != null )
			conditional.setElseBody( (Expression) visitor.accept(node.getElseBody()) );
		conditional.setThenBody( (Expression) visitor.accept(node.getThenBody()) );
		return conditional;
	}
	
}


