

/*$Id: CallValueCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	CallValueCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;

public class CallValueCloner {

	static public Object clone(CallValue node) {
		CallValue call = BehaviorFactory.eINSTANCE.createCallValue();
		call.setName( node.getName() );
		return call;
	}
	
}


