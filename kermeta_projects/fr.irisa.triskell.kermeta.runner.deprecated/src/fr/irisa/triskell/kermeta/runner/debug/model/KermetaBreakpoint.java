/* $Id: KermetaBreakpoint.java,v 1.3 2005-11-28 18:54:35 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaBreakpoint.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.Breakpoint;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * @author zdrey
 *
 */
public class KermetaBreakpoint extends Breakpoint {

	// the marker ID (can we find it by calculating it? this string is 
	// marker id in plugin.xml data.
	public static final String KERMETA_BREAKPOINT_ID="fr.irisa.triskell.kermeta.runner.kermetaBreakpoint";
	
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
		return KermetaDebugModelPresentation.KERMETA_DEBUG_MODEL_ID;
	}
	
	/**
	 * Helper 
	 * Note : first iteraiotn, we only check breakpoints on the edited file.
	 * @return
	 */
	public Integer getLine() {
		try {
			System.out.println("Trying to get line of breakpoint");
			return (Integer)getMarker().getAttribute(IMarker.LINE_NUMBER);
		} catch (CoreException e) {
			return new Integer(-1);
		}
	}
}
