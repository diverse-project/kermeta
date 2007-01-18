package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;

import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.IAction;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KMT2KM implements IAction {

	public void execute(Unit unit, ArrayList<String> dependents) {
		
		IFile file = IResourceHelper.getIFile( (File) unit );
		
		for ( String s : dependents ) {
			
			String extension = StringHelper.getExtension( s );
			
			if ( extension.equals (".km") ) {
				String absoluteName = IResourceHelper.root.getLocation().toString() + s;
				KermetaUnit kunit = KermetaWorkspace.getInstance().getKermetaUnit(file);
				if ( ! kunit.messages.hasError() )
					kunit.saveAsXMIModel(absoluteName);
			}
		}

	}

}
