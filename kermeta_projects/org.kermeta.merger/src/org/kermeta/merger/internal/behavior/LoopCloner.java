

/*$Id: LoopCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	LoopCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class LoopCloner {

	static public Object clone(Loop node, AbstractBehaviorCloner visitor) {
		Loop loop = BehaviorFactory.eINSTANCE.createLoop();
		if ( node.getBody() != null )
			loop.setBody( (Expression) visitor.accept(node.getBody()) );
		if ( node.getInitialization() != null )
			loop.setInitialization( (Expression) visitor.accept(node.getInitialization()) );
		loop.setStopCondition( (Expression) visitor.accept(node.getStopCondition()) );
		return loop;
	}
	
}


