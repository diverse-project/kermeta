

/*$Id: BooleanLiteralCloner.java,v 1.3 2008-07-08 13:18:32 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	BooleanLiteralCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class BooleanLiteralCloner {

	static public Object clone(BooleanLiteral node) {
		BooleanLiteral literal = BehaviorFactory.eINSTANCE.createBooleanLiteral();
		literal.setValue( node.isValue() );
		return literal;
	}
	
}


