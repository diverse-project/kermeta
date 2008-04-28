

/*$Id: TypeLiteralCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	TypeLiteralCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;

public class TypeLiteralCloner {

	static public Object clone(TypeLiteral node, AbstractBehaviorCloner visitor) {
		TypeLiteral literal = BehaviorFactory.eINSTANCE.createTypeLiteral();
		literal.setTyperef( (TypeReference) visitor.accept(node.getTyperef()) );
		return literal;
	}
	
}


