package fr.irisa.triskell.kermeta.kpm.actions.typecheck;

import java.util.Date;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.utils.KermetaUnitHelper;

public class Typecheck implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
			
			if ( monitor.isCanceled() )
				return;
			
			monitor.subTask("Typechecking " + unit.getValue());
			
			/*
			 * 
			 * Must unit be typechecked ?
			 * 
			 * 
			 */
			boolean mustBeTypechecked = false;
			IFile file = ResourceHelper.getIFile(unit.getValue());
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
			 * Getting the file's content if it exists. See the textual editor.
			 * 
			 * 
			 */
			String content = null;
			if ( args != null ) {
				content = (String) args.get("content");
			}
			
			//KermetaUnitFactory.getDefaultLoader().unload( "file:" + file.getLocation().toString() );

			
			/*
			 * 
			 * Getting the Kermeta Unit
			 * 
			 * 
			 */
			KermetaUnit kermetaUnit = KermetaUnitHelper.typecheckFile(file, content, monitor);
			
			
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

	}

}
