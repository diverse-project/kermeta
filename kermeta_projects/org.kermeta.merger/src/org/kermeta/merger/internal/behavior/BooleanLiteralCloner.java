

/*$Id: BooleanLiteralCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
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

public class BooleanLiteralCloner {

	static public Object clone(BooleanLiteral node) {
		BooleanLiteral literal = BehaviorFactory.eINSTANCE.createBooleanLiteral();
		literal.setValue( node.isValue() );
		return literal;
	}
	
}


