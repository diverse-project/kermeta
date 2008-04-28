

/*$Id: JavaStaticCallCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	JavaStaticCallCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;

public class JavaStaticCallCloner {

	static public Object clone(JavaStaticCall node, AbstractBehaviorCloner visitor) {
		JavaStaticCall call = BehaviorFactory.eINSTANCE.createJavaStaticCall();
		call.setJclass( node.getJclass() );
		call.setJmethod( node.getJmethod() );
		// getting the post fix
		for ( Expression expression : node.getParameters() )
			call.getParameters().add( (Expression) visitor.accept(expression) );
		return call;
	}
	
}


