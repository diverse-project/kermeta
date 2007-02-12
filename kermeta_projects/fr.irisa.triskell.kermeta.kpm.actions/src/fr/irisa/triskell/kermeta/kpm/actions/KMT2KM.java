package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.IAction;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KMT2KM implements IAction {

	public void execute(Unit unit, ArrayList<String> dependents, Hashtable params, IProgressMonitor monitor) {
		
		try {
			
			IFile file = IResourceHelper.getIFile( (File) unit );

			monitor.subTask("Converting " + file.getName() + " into a KM file");
			
			for ( String s : dependents ) {
				
				String extension = StringHelper.getExtension( s );
				
				if ( extension.equals (".km") ) {
					String absoluteName = ResourceHelper.root.getLocation().toString() + s;
					KermetaUnit kunit = KermetaWorkspace.getInstance().getKermetaUnit(file);
					if ( (kunit != null) && ! kunit.messages.hasError() )
						kunit.saveAsXMIModel(absoluteName);
				}
			}
		
			monitor.worked(1);
		} finally {
			monitor.done();
		}
	}

}
