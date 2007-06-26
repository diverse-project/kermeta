

/*$Id: Ecore2KMT.java,v 1.1 2007-06-26 12:24:01 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	Ecore2KMT.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.actions.transformation;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;

import fr.irisa.triskell.eclipse.resources.PropertyNotFoundException;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.tools.wizards.KmtPrinterWizard;

public class Ecore2KMT implements IAction {

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
			KermetaUnit kermetaUnit = KermetaUnitHost.getInstance().getValue(unit);
			
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
			if ( kermetaUnit.messages.hasError() ) {
				
				String msg = outputFile.getFullPath().toString() + " may contain errors because " + inputFile.getFullPath().toString() + " has been incorrectly typechecked.";
				KPMPlugin.getDefault().getLog().log(
						new Status(Status.WARNING, KPMPlugin.PLUGIN_ID, Status.OK, msg, null)
				);
				
			}	
			KmtPrinterWizard wizard= new KmtPrinterWizard();
			try {
				wizard.writeUnit(kermetaUnit, outputFile);
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


