

/*$Id: BlockCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	BlockCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;

public class BlockCloner {

	static public Object clone(Block node, AbstractBehaviorCloner visitor) {
		Block block = BehaviorFactory.eINSTANCE.createBlock();
		for ( Expression expression : node.getStatement() )
			block.getStatement().add( (Expression) visitor.accept(expression) );
		for ( Rescue r : node.getRescueBlock() )
			block.getRescueBlock().add( (Rescue) visitor.accept(r) );
		return block;
	}
	
}


