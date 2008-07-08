

/*$Id: SelfExpressionCloner.java,v 1.3 2008-07-08 13:18:32 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	SelfExpressionCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class SelfExpressionCloner {

	static public Object clone(SelfExpression node) {
		SelfExpression expression = BehaviorFactory.eINSTANCE.createSelfExpression();
		return expression;
	}
	
}


