package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.PlatformUI;


import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.tools.wizards.Kermeta2EcoreWizard;
import fr.irisa.triskell.kermeta.kpm.helpers.DependencyHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.MarkersHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

public class Typecheck implements IAction {

	public void execute(Dependency dependency) {
		
		File from = (File) dependency.getFrom();
		
	//	KermetaUnit unit = KermetaWorkspace.getInstance().getKermetaUnit( from );
		KermetaUnit unit = KermetaUnitHelper.typeCheckFile(from);
		
		//DependencyHelper.addRequireDependencies(unit);
		
		if ( unit == null )
			return;
		
		// Markers creation if the Kermeta Unit has errors.
		MarkersHelper.clearMarkers(from);
		if ( unit.messages.hasError() ) {
			MarkersHelper.createMarkers(from, unit);
		}
			
		
		HashSet <Dependency> dependencies = from.getDependenciesWithEvent("typecheck");
		
		
		for ( Dependency currentDependency : dependencies ) {
		
			File to = (File) currentDependency.getTo();

			String extension = to.getExtension();

			MarkersHelper.clearMarkers(to);
			if ( unit.messages.hasError() ) {
				MarkersHelper.createMarker(to, "File " + from.getRelativeName() + " has changed and contains errors.");
				from.receiveEvent( "generate_marker" );
			} else {
				if ( extension.equals(".km") ) {
					unit.saveAsXMIModel( to.getAbsoluteName() );			
				} else if ( extension.equals(".ecore") ) {
						if ( doesFileExist(to) )
							KM2Ecore.writeEcore(unit, to.getAbsoluteName(), true);
				} else if ( extension.equals(".kmt") ) {
					// pretty print
				}
				to.setLastTimeModified( from.getLastTimeModified() );
			}
		}

		if ( KermetaWorkspace.getInstance().isAnObjectInterestedInFile(from) )
			KermetaWorkspace.getInstance().updateKermetaUnit(from, unit);
		//else
			//StdLibKermetaUnitHelper.unloadStdLib();
			//KermetaUnitHelper.unloadKermetaUnit( unit );
		
	}
	
	private boolean doesFileExist( File file ) {
		return IResourceHelper.getIFile(file).exists();
	}

}
