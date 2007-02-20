

/*$Id: IAction.java,v 1.3 2007-02-20 14:24:01 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.workspace;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * 
 * This interface is the bridge between the model and
 * actions which can be performed on that model.
 * 
 * @author ftanguy
 *
 */
public interface IAction {

	/**
	 * Please do NOT send event to any units.
	 * @param dependency
	 */
	public void execute (Unit unit, ArrayList <String> dependents, Hashtable params, IProgressMonitor monitor);
	
}
