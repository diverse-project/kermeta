

/*$Id: AbstractBehaviorCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	AbstractBehaviorCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

abstract public class AbstractBehaviorCloner extends KermetaOptimizedVisitor {

	private KermetaUnit kermetaUnit;
	
	public KermetaUnit getKermetaUnit() {
		return kermetaUnit;
	}
	
	public AbstractBehaviorCloner(KermetaUnit kermetaUnit) {
		this.kermetaUnit = kermetaUnit;
	}
	
}


