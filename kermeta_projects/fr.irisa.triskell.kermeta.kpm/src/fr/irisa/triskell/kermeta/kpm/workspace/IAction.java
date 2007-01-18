package fr.irisa.triskell.kermeta.kpm.workspace;

import java.util.ArrayList;

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
	public void execute (Unit unit, ArrayList <String> dependents);
	
}
