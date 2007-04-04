package fr.irisa.triskell.kermeta.kpm.actions.transformation;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

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
		 * Getting the Kermeta Unit.
		 * 
		 * 
		 */
		KermetaUnit kermetaUnit = KermetaUnitHost.getInstance().getValue(unit);
		
		if ( kermetaUnit == null )
			System.out.println();
		
		/*
		 * 
		 * The transformation is processed if and only if the Kermeta Unit
		 * has no erors.
		 * 
		 * 
		 */
		if ( ! kermetaUnit.messages.hasError() ) {
			IFile file = ResourceHelper.getIFile( outputString );
			kermetaUnit.saveAsXMIModel( file.getLocation().toString() );
			/*
			 * 
			 * Refereshing the workspace to display the new file.
			 * 
			 */
			try {
				file.refreshLocal(0, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
