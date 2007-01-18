package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import fr.irisa.triskell.kermeta.core.markers.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.IAction;

public class MarkDependents implements IAction {

	public void execute(Unit unit, ArrayList <String> dependents) {
		
		IFile file = IResourceHelper.getIFile( (File) unit );
		
		try {
		
			if ( file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE).length != 0 ) {
			
				for ( String s : dependents ) {
					IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile( new Path(s) );
					KermetaMarkersHelper.clearMarkers(ifile);
					KermetaMarkersHelper.createMarker(ifile, "File " + file.getFullPath().toString() + " contains errors.");
				}
			
			} else {
				for ( String s : dependents ) {
					IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile( new Path(s) );
					KermetaMarkersHelper.clearMarkers(ifile);
				}
			}
			
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
		
	}

	
	
}
