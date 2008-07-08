

/*$Id: IntegerLiteralCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.language.structure.Object;

public class IntegerLiteralCloner {

	static public Object clone(IntegerLiteral node) {
		IntegerLiteral literal = BehaviorFactory.eINSTANCE.createIntegerLiteral();
		literal.setValue( node.getValue() );
		return literal;
	}
	
}


