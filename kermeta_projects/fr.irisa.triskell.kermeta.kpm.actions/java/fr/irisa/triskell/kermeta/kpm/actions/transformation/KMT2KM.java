/*$Id: KMT2KM.java,v 1.11 2008-04-28 11:49:38 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.transformation;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.PropertyNotFoundException;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;

public class KMT2KM implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {			
		
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
			monitor.subTask(inputFile.getName().toString() + " converted to " + outputString);
			
			
			/*
			 * 
			 * Getting the Kermeta Unit.
			 * The kermeta unit can be null if there is no need to regenerate the km.
			 * 
			 * 
			 */
			KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit( "platform:/resource" + unit.getValue() );
			
			if ( kermetaUnit == null )
				return;
			
			/*
			 * 
			 * The transformation is processed if and only if the Kermeta Unit
			 * has no erors.
			 * 
			 * 
			 */
			if ( ! kermetaUnit.isIndirectlyErroneous() ) {
				int index = outputString.lastIndexOf("/");
				String rep = "platform:/resource" + outputString.substring(0, index);
				String fileName = "platform:/resource" + outputString;
				KmExporter exporter = new KmExporter();
				exporter.export(kermetaUnit, rep, fileName, false);
				/*
				 * 
				 * Refereshing the workspace to display the new file.
				 * 
				 */
				try {
					IFile outputFile = ResourceHelper.getIFile( outputString );
					if ( outputFile != null )
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
