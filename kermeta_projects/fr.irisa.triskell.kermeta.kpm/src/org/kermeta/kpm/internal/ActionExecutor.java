

/*$Id: ActionExecutor.java,v 1.2 2008-05-29 06:46:57 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	ActionExecutor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.kermeta.interpreter.helper.KermetaLauncher;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KpmManager;
import org.kermeta.kpm.NameFilterHelper;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class ActionExecutor {

	final static public String OUTPUT_REGEX_FILE = "_OUTPUT_REGEX_FILE_";
	
	static public void execute(Out out, Unit unit, String extensionAction, Map<String, Object> args, IProgressMonitor monitor) {
		assert( args != null );
		IConfigurationElement element = KpmManager.getDefault().getConfigurationElement( extensionAction );
		if ( element != null ) {
			String extensionType = element.getDeclaringExtension().getExtensionPointUniqueIdentifier();
			try {
				
				if ( extensionType.equals("fr.irisa.triskell.kermeta.kpm.javaAction") ) {
					IAction action = (IAction) element.createExecutableExtension("class");
					action.execute(out, unit, args, monitor);
				
				} else if ( extensionType.equals("fr.irisa.triskell.kermeta.kpm.kermetaAction") ) {
				 
					String relativePath = element.getAttribute("File");
					String filePath = "platform:/plugin/" + element.getDeclaringExtension().getContributor().getName() + "/" + relativePath;
					String[] arguments = new String[2];
					arguments[0] = unit.getName();
					
					String outputString = "";
					if ( args.containsKey(OUTPUT_REGEX_FILE) ) {
						String regex = (String) args.get(OUTPUT_REGEX_FILE);
						outputString = NameFilterHelper.getOutputString(unit, regex);
					}
					
					arguments[1] = outputString;
					
					KermetaLauncher.execute( filePath, arguments );	
				}
				
			} catch (CoreException exception) {
				exception.printStackTrace();
			} catch (Exception e) {
				String message = "KPM Error when processing the action " + extensionAction + " on " + unit.getName();
				Status status = new Status(IStatus.ERROR, KPMPlugin.PLUGIN_ID, message, e);
				KPMPlugin.getDefault().getLog().log(status);
			}
			
		}
	}
	
}


