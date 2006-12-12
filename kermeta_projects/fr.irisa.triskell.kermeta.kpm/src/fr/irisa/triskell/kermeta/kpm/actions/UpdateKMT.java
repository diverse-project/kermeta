package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.kpm.AbstractExpression;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

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
		
		
	}

	
	
}
