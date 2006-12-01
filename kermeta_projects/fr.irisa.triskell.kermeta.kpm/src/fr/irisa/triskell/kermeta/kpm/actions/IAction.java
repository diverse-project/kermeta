package fr.irisa.triskell.kermeta.kpm.actions;

import fr.irisa.triskell.kermeta.kpm.Dependency;

public interface IAction {

	/**
	 * Please do NOT send event to any units.
	 * @param dependency
	 */
	public void execute (Dependency dependency);
	
}
