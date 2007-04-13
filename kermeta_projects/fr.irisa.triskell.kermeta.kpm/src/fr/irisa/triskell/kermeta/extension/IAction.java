/*$Id: IAction.java,v 1.2 2007-04-13 14:44:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.extension;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.Out;
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
	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args);
	
}
