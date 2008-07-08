

/*$Id: RaiseCloner.java,v 1.3 2008-07-08 13:18:32 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.language.structure.Object;

public class RaiseCloner {

	static public Object clone(Raise node, AbstractBehaviorCloner visitor) {
		Raise raise = BehaviorFactory.eINSTANCE.createRaise();
		raise.setExpression( (Expression) visitor.accept(node.getExpression()) );
		return raise;
	}
	
}


