

/*$Id: IntegerLiteralCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	IntegerLiteralCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;

public class IntegerLiteralCloner {

	static public Object clone(IntegerLiteral node) {
		IntegerLiteral literal = BehaviorFactory.eINSTANCE.createIntegerLiteral();
		literal.setValue( node.getValue() );
		return literal;
	}
	
}


