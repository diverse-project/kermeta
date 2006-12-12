package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Unit;

public interface IAction {

	/**
	 * Please do NOT send event to any units.
	 * @param dependency
	 */
	public void execute (Unit unit, ArrayList <String> dependents);
	
}
