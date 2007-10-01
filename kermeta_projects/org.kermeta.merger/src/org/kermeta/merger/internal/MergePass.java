

/*$Id: MergePass.java,v 1.1 2007-10-01 15:07:49 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	MergePass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import org.kermeta.io.KermetaUnit;

abstract public class MergePass {

	protected KermetaUnit kermetaUnit;
	
	protected MergeContext context;
	
	public MergePass(KermetaUnit kermetaUnit, MergeContext context) {
		this.kermetaUnit = kermetaUnit;
		this.context = context;
	}
	
	abstract public void process();
	
}


