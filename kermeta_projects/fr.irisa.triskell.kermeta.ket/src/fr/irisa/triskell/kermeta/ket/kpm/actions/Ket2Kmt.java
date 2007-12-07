/*$Id: Ket2Kmt.java,v 1.1 2007-12-07 05:31:58 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.ket
* File : 	Ket2Kmt.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 03 dec. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package fr.irisa.triskell.kermeta.ket.kpm.actions;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.PropertyNotFoundException;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.ket.Generator;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;

public class Ket2Kmt implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {

		if ( monitor.isCanceled() )
			return;
		
		try {
			
			/*
			 * Getting the path (relative to the workspace) of the output file.
			 */
			String outputString = NameFilterHelper.getOuputString(unit, out);
			
			IFile outputFile = ResourceHelper.getIFile( outputString, false );
			IOPlugin.getDefault().unload(outputFile);
						
			
			/*
			 * If empty string, out is obviously corrupted.
			 * We quit.
			 */
			if ( outputString.equals("") ) {
				return;
			}
			
			/*
			 * Check if the out has been disabled.
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
			 * Display information to the user.
			 */
			monitor.beginTask("", 1);
			monitor.subTask(inputFile.getName().toString() + " converted to " + outputFile.getName().toString());
			
			Generator ket2Kmt = new Generator();
			
			ket2Kmt.generate(inputFile, outputFile.getLocation().toString());
						
			try {
				IFile outputFile2 = ResourceHelper.getIFile( outputString );
				if ( outputFile2 != null )
					outputFile.refreshLocal(0, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}


	}

}


