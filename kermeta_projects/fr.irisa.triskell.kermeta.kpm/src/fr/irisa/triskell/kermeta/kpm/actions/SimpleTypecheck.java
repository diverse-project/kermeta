package fr.irisa.triskell.kermeta.kpm.actions;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.helpers.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.MarkersHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class SimpleTypecheck implements IAction {

	public void execute(Dependency dependency) {
		
		File from = (File) dependency.getFrom();
		
		KermetaUnit unit = KermetaWorkspace.getInstance().getKermetaUnit( from );
		
		if ( unit == null )
			return;
		
		// Markers creation if the Kermeta Unit has errors.
		MarkersHelper.clearMarkers(from);
		if ( unit.messages.hasError() ) {
			MarkersHelper.createMarkers(from, unit);
		}
		
		if ( KermetaWorkspace.getInstance().isAnObjectInterestedInFile(from) )
			KermetaWorkspace.getInstance().updateKermetaUnit(from, unit);
		else
			KermetaUnitHelper.unloadKermetaUnit( unit );

	}

}
