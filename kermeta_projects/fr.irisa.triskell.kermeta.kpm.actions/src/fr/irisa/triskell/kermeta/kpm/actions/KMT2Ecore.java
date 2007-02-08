package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.workspace.IAction;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KMT2Ecore implements IAction {

	/**
	 * When calling this method, we know that the unit is a kmt file and there is only one ecore file dependent.
	 */
	public void execute(Unit unit, ArrayList<String> dependents, Hashtable params, IProgressMonitor monitor) {
		
		try {
		
			IFile file = IResourceHelper.getIFile( (File) unit );

			monitor.subTask("Converting " + file.getName() + " into an ecore file");
			
			for ( String s : (ArrayList<String>)dependents ) {
				
				String extension = StringHelper.getExtension( s );
			
				if ( extension.equals (".ecore") ) {
					String absoluteName = ResourceHelper.root.getLocation().toString() + s;
					KermetaUnit kunit = KermetaWorkspace.getInstance().getKermetaUnit(file);
					if ( ! kunit.messages.hasError() )
						KM2Ecore.writeEcore(kunit, absoluteName, true);
				}
			}
			
			monitor.worked(1);
		} finally {
			monitor.done();
		}
	}

}
