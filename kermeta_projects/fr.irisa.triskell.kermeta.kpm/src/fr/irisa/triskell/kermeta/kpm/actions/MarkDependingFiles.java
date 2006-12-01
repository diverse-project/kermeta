package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.Set;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.helpers.MarkersHelper;

public class MarkDependingFiles implements IAction {

	public void execute(Dependency dependency) {
		
		File from = (File) dependency.getFrom();
		
		Set <Dependency> requireDependencies = from.getDependencies("require");

		for ( Dependency currentDependency : requireDependencies ) {
			
			File fileToMark = (File) currentDependency.getTo();
			String message = "The required file " + from.getRelativeName() + " contains erros.";
			
			MarkersHelper.createMarker(fileToMark, message);
			
		}
		
	}

}
