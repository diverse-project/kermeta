

/*$Id: RaiseCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	RaiseCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Raise;

public class RaiseCloner {

	static public Object clone(Raise node, AbstractBehaviorCloner visitor) {
		Raise raise = BehaviorFactory.eINSTANCE.createRaise();
		raise.setExpression( (Expression) visitor.accept(node.getExpression()) );
		return raise;
	}
	
}


