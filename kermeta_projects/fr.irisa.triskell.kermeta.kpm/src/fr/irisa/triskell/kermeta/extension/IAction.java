/*$Id: IAction.java,v 1.4 2007-12-20 09:13:08 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.extension;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * Interface which allows the use of extension point named "actions".
 * 
 * @author paco
 *
 */
public interface IAction {

	/**
	 * 
	 * @param out The out processed by the dependency.
	 * @param unit The unit on which the dependency is processed.
	 * @param monitor A progress monitor to display process information.
	 * @param args Any other usefull arguments can be sent via this map.
	 */
	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters);
	
}
