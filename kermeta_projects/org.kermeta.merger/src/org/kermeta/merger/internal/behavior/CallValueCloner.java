

/*$Id: CallValueCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.language.structure.Object;

public class CallValueCloner {

	static public Object clone(CallValue node) {
		CallValue call = BehaviorFactory.eINSTANCE.createCallValue();
		call.setName( node.getName() );
		return call;
	}
	
}


