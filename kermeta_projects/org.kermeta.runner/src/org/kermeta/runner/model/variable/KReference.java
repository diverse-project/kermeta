

/*$Id: KReference.java,v 1.1 2008-04-01 15:10:15 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KReference.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 mars 08
* Authors : paco
*/

package org.kermeta.runner.model.variable;

import org.kermeta.runner.model.KStackFrame;


public class KReference extends KAbstractVariable {

	public KReference(KStackFrame frame, String name) {
		super(frame, name);
	}
	
	public KReference(KAbstractVariable parent, String name) {
		super(parent, name);
	}

}


