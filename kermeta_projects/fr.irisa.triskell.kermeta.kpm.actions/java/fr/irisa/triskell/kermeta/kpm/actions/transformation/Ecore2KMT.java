

/*$Id: Ecore2KMT.java,v 1.6 2008-02-14 07:13:47 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	Ecore2KMT.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.actions.transformation;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KMTOutputBuilder;

import fr.irisa.triskell.eclipse.resources.PropertyNotFoundException;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;

public class Ecore2KMT implements IAction {

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
			IFile outputFile = ResourceHelper.getIFile( outputString, false );
			
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
				String value = ResourceHelper.getProperty(inputFile, out.getAction().getExtensionPoint() );
				if ( ! Boolean.parseBoolean(value) )					
					return;
			} catch (PropertyNotFoundException e1) {
				ResourceHelper.setProperty(inputFile, out.getAction().getExtensionPoint(), true);
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
			KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit( "platform:/resource" + unit.getValue() );
			
			if ( kermetaUnit == null ) 
				return;
/*			{
				kermetaUnit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit( inputFile.getLocation().toString() );
				kermetaUnit.typeCheck(null);
			}*/
			
			/*
			 * 
			 * The transformation is processed if and only if the Kermeta Unit
			 * has no erors.
			 * 
			 * 
			 */
			if ( kermetaUnit.isIndirectlyErroneous() ) {
				
				String msg = outputFile.getFullPath().toString() + " may contain errors because " + inputFile.getFullPath().toString() + " has been incorrectly typechecked.";
				KPMPlugin.getDefault().getLog().log(
						new Status(Status.WARNING, KPMPlugin.PLUGIN_ID, Status.OK, msg, null)
				);
				
			}	
			try {
				KMTOutputBuilder builder = new KMTOutputBuilder();
				int index = outputString.lastIndexOf("/");
				String rep = outputString.substring(0, index);
				builder.print(kermetaUnit, rep, "platform:/resource"+outputString);
				builder.flush();
				outputFile.refreshLocal(0, monitor);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}


	}

}


