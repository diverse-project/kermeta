/* $Id: KermetaBreakpoint.java,v 1.6 2005-12-08 17:38:13 zdrey Exp $
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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
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
	static public final String FUNCTION_NAME_PROP = "kermeta.function_name";

	/**
	 * 
	 */
	public KermetaBreakpoint() {
		super();
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
			return (Integer)getMarker().getAttribute(IMarker.LINE_NUMBER);
		} catch (CoreException e) {
			return new Integer(-1);
		}
	}
	
	public String getFile()
	{
		IResource r = getMarker().getResource();
		return "platform:/resource/" + r.getFullPath().toPortableString();
		// return r.getLocation().toOSString();
	}

}
