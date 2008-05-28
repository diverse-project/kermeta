/*$Id: IAction.java,v 1.1 2008-05-28 09:26:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * This interface is used to map the kpm model side with the java execution side.
 * When defining an extension for fr.irisa.triskell.kermeta.javaAction extensionPoint, the implementation is a java class
 * that implements that interface.
 * 
 * @author paco
 *
 */
public interface IAction {

	/**
	 * Process the execution of an out for a given unit with some possible arguments.
	 * The execution can possibly be cancelled using the monitor.
	 * @param out The out processed by the dependency.
	 * @param unit The unit on which the dependency is processed.
	 * @param monitor A progress monitor to display process information.
	 * @param args Any other usefull arguments can be sent via this map.
	 */
	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor);
	
}
