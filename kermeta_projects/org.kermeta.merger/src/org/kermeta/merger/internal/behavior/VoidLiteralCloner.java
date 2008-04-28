

/*$Id: VoidLiteralCloner.java,v 1.2 2008-04-28 11:51:07 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	VoidLiteralCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;

public class VoidLiteralCloner {

	static public Object visitVoidLiteral(VoidLiteral node) {
		VoidLiteral literal = BehaviorFactory.eINSTANCE.createVoidLiteral();
		return literal;
	}
	
}


