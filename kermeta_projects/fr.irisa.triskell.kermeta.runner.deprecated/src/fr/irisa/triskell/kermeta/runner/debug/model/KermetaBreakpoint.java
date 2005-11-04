/* $Id: KermetaBreakpoint.java,v 1.1 2005-11-04 17:01:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaBreakpoint.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.debug.core.model.Breakpoint;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * @author zdrey
 *
 */
public class KermetaBreakpoint extends Breakpoint {

	/**
	 * 
	 */
	public KermetaBreakpoint() {
		super();
		System.out.println("A breakpoint was created");
	}

	/**
	 * @see org.eclipse.debug.core.model.IBreakpoint#getModelIdentifier()
	 */
	public String getModelIdentifier() {
		return RunnerPlugin.getUniqueIdentifier();
	}
	
	

}
