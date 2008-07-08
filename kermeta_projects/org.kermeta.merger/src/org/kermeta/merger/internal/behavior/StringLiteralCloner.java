

/*$Id: StringLiteralCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	StringLiteralCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class StringLiteralCloner {

	static public Object clone(StringLiteral node) {
		StringLiteral literal = BehaviorFactory.eINSTANCE.createStringLiteral();
		literal.setValue( node.getValue() );
		return literal;
	}
}


