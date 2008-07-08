

/*$Id: RescueCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	RescueCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class RescueCloner {

	static public Object clone(Rescue node, AbstractBehaviorCloner visitor) {
		Rescue rescue = BehaviorFactory.eINSTANCE.createRescue();
		// TODO According to the meta model, the rescue has an execption type.
		// But it seams that the interpreter handles rescue block without any exception type.
		if ( node.getExceptionType() != null )
			rescue.setExceptionType((TypeReference) visitor.accept(node.getExceptionType()) );
		rescue.setExceptionName( node.getExceptionName() );
		for ( Expression expression : node.getBody() )
			rescue.getBody().add( (Expression) visitor.accept(expression) );
		return rescue;
	}
	
}


