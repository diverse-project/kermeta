

/*$Id: AssignmentCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	AssignmentCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;

public class AssignmentCloner {

	static public Object clone(Assignment node, AbstractBehaviorCloner visitor) {
		Assignment assignment = BehaviorFactory.eINSTANCE.createAssignment();
		assignment.setIsCast( node.isIsCast() );
		assignment.setTarget( (CallExpression) visitor.accept(node.getTarget()) );
		assignment.setValue( (Expression) visitor.accept(node.getValue()) );
		return assignment;
	}
	
}


