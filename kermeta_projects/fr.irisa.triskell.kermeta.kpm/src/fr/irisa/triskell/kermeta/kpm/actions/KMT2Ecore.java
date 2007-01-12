package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KMT2Ecore implements IAction {

	
	/**
	 * When calling this method, we know that the unit is a kmt file and there is only one ecore file dependent.
	 */
	public void execute(Unit unit, ArrayList<String> dependents) {
		
		
		IFile file = IResourceHelper.getIFile( (File) unit );
		
		for ( String s : dependents ) {
			
			String extension = StringHelper.getExtension( s );
			
			if ( extension.equals (".ecore") ) {
				String absoluteName = IResourceHelper.root.getLocation().toString() + s;
				KermetaUnit kunit = KermetaWorkspace.getInstance().getKermetaUnit(file);
				if ( ! kunit.messages.hasError() )
					KM2Ecore.writeEcore(kunit, absoluteName, true);
			}
		}
	}

}
