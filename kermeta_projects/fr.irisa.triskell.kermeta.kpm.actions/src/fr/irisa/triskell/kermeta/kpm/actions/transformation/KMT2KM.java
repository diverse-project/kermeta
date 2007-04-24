/*$Id: KMT2KM.java,v 1.3 2007-04-24 13:35:38 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.transformation;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.PropertyNotFoundException;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KMT2KM implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
			
		/*
		 * 
		 * Getting the path (relative to the workspace) of the output file.
		 * 
		 * 
		 */
		String outputString = NameFilterHelper.getOuputString(unit, out);
		IFile outputFile = ResourceHelper.getIFile( outputString );
		
		/*
		 * 
		 * If empty string, out is obviously corrupted.
		 * We quit.
		 * 
		 * 
		 */
		if ( outputString.equals("") )
			return;
		
		/*
		 * 
		 * Check if the out has been disabled.
		 * 
		 */
		IFile inputFile = ResourceHelper.getIFile( unit.getValue() );
		try {
			String value = ResourceHelper.getProperty(inputFile, "fr.irisa.triskell.kermeta.kpm.generateKM");
			if ( ! Boolean.parseBoolean(value) )
				return;
		} catch (PropertyNotFoundException e1) {
			return;
		}
		
		
		/*
		 * 
		 * Getting the Kermeta Unit.
		 * The kermeta unit can be null if there is no need to regenerate the km.
		 * 
		 * 
		 */
		KermetaUnit kermetaUnit = KermetaUnitHost.getInstance().getValue(unit);
		
		if ( kermetaUnit == null )
			return;
		
		/*
		 * 
		 * The transformation is processed if and only if the Kermeta Unit
		 * has no erors.
		 * 
		 * 
		 */
		if ( ! kermetaUnit.messages.hasError() ) {
			kermetaUnit.saveAsXMIModel( outputFile.getLocation().toString() );
			/*
			 * 
			 * Refereshing the workspace to display the new file.
			 * 
			 */
			try {
				outputFile.refreshLocal(0, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
