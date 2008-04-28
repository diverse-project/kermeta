

/*$Id: LambdaExpressionCloner.java,v 1.2 2008-04-28 11:51:07 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	LambdaExpressionCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;

public class LambdaExpressionCloner {

	static public Object clone(LambdaExpression node, AbstractBehaviorCloner visitor) {
		LambdaExpression lambda = BehaviorFactory.eINSTANCE.createLambdaExpression();
		lambda.setBody( (Expression) visitor.accept(node.getBody()) );
		// getting the post fix
		for ( LambdaParameter parameter : node.getParameters() )
			lambda.getParameters().add( (LambdaParameter) visitor.accept(parameter) );
		return lambda;
	}
	
}


