package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class UpdateKMT implements IAction {

	public void execute(Unit unit, ArrayList <String> dependents) {
		
		IFile file = IResourceHelper.getIFile( (File) unit );
		
		for ( String s : dependents ) {
			
			String extension = StringHelper.getExtension( s );
			
			if ( extension.equals (".ecore") ) {
				KermetaUnit kunit = KermetaWorkspace.getInstance().getKermetaUnit(file);
				String absoluteName = IResourceHelper.root.getLocation().toString() + s;
				KM2Ecore.writeEcore(kunit, absoluteName, true);
			} else if ( extension.equals(".km") ) {
				KermetaUnit kunit = KermetaWorkspace.getInstance().getKermetaUnit(file);
				String absoluteName = IResourceHelper.root.getLocation().toString() + s;
				kunit.saveAsXMIModel(absoluteName);
			}
			
		}
		
		KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( file.getProject() );
		try {
			project.getValue().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
		
	}

	
	
}
