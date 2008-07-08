

/*$Id: BlockCloner.java,v 1.3 2008-07-08 13:18:32 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.language.structure.Object;

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


