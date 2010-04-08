

/*$Id: OutProcessor.java,v 1.1 2008-05-28 09:26:16 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	OutProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class OutProcessor {
	
	/**
	 * 
	 * @param unit
	 * @param out
	 * @param args
	 * @param monitor
	 */
	static public void process(Unit unit, Out out, Map<String, Object> args, IProgressMonitor monitor) {
		
		// Processing parameters before.
		for ( Parameter p : out.getParameters() ) {
			if ( p.getType().equals("String") ) {
				args.put(p.getName(), p.getValue());
			}
		}
		// Executing the action.
		if ( out.getExtensionPoint() != null) 
			ActionExecutor.execute(out, unit, out.getExtensionPoint(), args, monitor);
	}
	
}


