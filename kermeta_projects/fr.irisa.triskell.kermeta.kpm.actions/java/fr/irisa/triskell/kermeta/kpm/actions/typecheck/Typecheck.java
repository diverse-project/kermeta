/*$Id: Typecheck.java,v 1.2 2007-09-13 09:03:45 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.typecheck;

import java.util.Date;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.util2.KermetaUnitHelper;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class Typecheck implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args) {
			
		if ( monitor.isCanceled() )
			return;
		
		try {
			
			monitor.beginTask("", 1);
			monitor.subTask( "Typechecking " + unit.getValue() );
			
			/*
			 * 
			 * Must unit be typechecked ?
			 * 
			 * 
			 */
			boolean mustBeTypechecked = false;
			IFile file = ResourceHelper.getIFile(unit.getValue());
			if ( file == null )
				// file can be null when refactoring its name.
				// Something must be done when the file is edited and refactored at the same time.
				return;
			if ( file.getLocalTimeStamp() != unit.getLastTimeModified().getTime() )
				mustBeTypechecked = true;
			
			
			/*
			 * 
			 * Getting arguments. Maybe typechecking must be done despite of the timestamp comparison.
			 * For instance, when a unit is updated, dependent units must also be updated and typechecking must be forced.
			 * 
			 * 
			 */
			boolean forceTypechecking = false;
			if ( args != null ) {
				Boolean value = (Boolean) args.get("forceTypechecking");
				if ( value != null )
					forceTypechecking = value;
			}
			
			
			/*
			 * 
			 * If no typechecking needed, let's quit.
			 * 
			 * 
			 */
			if ( ! mustBeTypechecked && ! forceTypechecking )
				return;
			
			
			/*
			 * 
			 * The file must be type checked. Remove the kermeta unit from the memory.
			 * 
			 */
			String fileURI = "platform:/resource" + file.getFullPath().toString();
			IOPlugin.getDefault().unload( fileURI );
			
			
			/*
			 * 
			 * Getting the file's content if it exists. See the textual editor.
			 * 
			 * 
			 */
			String content = null;
			if ( args != null ) {
				content = (String) args.get("content");
			}
		
			/*
			 * 
			 * Getting the Kermeta Unit
			 * 
			 * 
			 */
			//KermetaUnit kermetaUnit = KermetaUnitHelper.typecheckFile(file, content, monitor);
			KermetaUnit kermetaUnit;
			try {
				kermetaUnit = KermetaUnitChecker.check(file, content, this, monitor);
				
				/*
				 * 
				 * If the kermeta unit is null, it means that the process has been cancelled.
				 * So we just stop right here.
				 * 
				 */
				if ( kermetaUnit == null )
					return;
				
				/*
				 * 
				 * Typechecking is done. Update the lastTimeModified field.
				 * 
				 * 
				 */
				unit.setLastTimeModified( new Date(file.getLocalTimeStamp()) );
				
				/*
				 * 
				 * Maybe, some objects needs ths Kermeta Unit.
				 * Let's update their value.
				 * 
				 * 
				 */
				KermetaUnitHost.getInstance().update(unit, kermetaUnit);
				
			} catch (KermetaIOFileNotFoundException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
			
			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}

	}

}
