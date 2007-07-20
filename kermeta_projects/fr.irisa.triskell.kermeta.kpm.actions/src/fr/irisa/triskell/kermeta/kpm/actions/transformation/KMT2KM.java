/*$Id: KMT2KM.java,v 1.5 2007-07-20 15:09:26 ftanguy Exp $
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
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.resources.PropertyNotFoundException;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;

public class KMT2KM implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
			
		
		if ( monitor.isCanceled() )
			return;
		
		try {
			
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
			
			if ( inputFile == null )
				// This can happen when refactoring the name of the file.
				return;
			
			try {
				String value = ResourceHelper.getProperty(inputFile, "fr.irisa.triskell.kermeta.kpm.generateKM");
				if ( ! Boolean.parseBoolean(value) )
					return;
			} catch (PropertyNotFoundException e1) {
				ResourceHelper.setProperty(inputFile, "fr.irisa.triskell.kermeta.kpm.generateKM", false);
				return;
			}
			

			/*
			 * 
			 * Display information to the user.
			 * 
			 */
			monitor.beginTask("", 1);
			monitor.subTask(inputFile.getName().toString() + " converted to " + outputFile.getName().toString());
			
			
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
			if ( ! kermetaUnit.isErrored() ) {
				KmExporter exporter = new KmExporter();
				exporter.export(kermetaUnit, "");
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
			
			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}

	}

}
