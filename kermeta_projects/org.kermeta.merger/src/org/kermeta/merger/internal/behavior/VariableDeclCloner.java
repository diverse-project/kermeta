

/*$Id: VariableDeclCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	VariableDeclCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;

public class VariableDeclCloner {

	static public Object clone(VariableDecl node, AbstractBehaviorCloner visitor) {
		VariableDecl declaration = BehaviorFactory.eINSTANCE.createVariableDecl();
		declaration.setIdentifier( node.getIdentifier() );
		if ( node.getInitialization() != null )
			declaration.setInitialization( (Expression) visitor.accept(node.getInitialization()) );
		declaration.setType( (TypeReference) visitor.accept(node.getType()) );
		return declaration;
	}
	
}


