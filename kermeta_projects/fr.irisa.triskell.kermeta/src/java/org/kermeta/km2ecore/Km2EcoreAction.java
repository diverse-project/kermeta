

/*$Id: Km2EcoreAction.java,v 1.2 2008-06-05 13:36:33 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	Action1.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 mai 08
* Authors : paco
*/

package org.kermeta.km2ecore;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;

import fr.irisa.triskell.eclipse.console.EclipseConsole;

public class Km2EcoreAction implements IObjectActionDelegate {

	/**
	 * The file to be converted into an ecore file.
	 */
	private IFile _file;
	
	public Km2EcoreAction() {
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		
		Job job = new Job("km2ecore_in_kmt") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				/*************/
				
				Map<String, Object> options = new HashMap<String, Object>();
				options.put(InterpreterOptions.MERGE, false);
				options.put(InterpreterOptions.TYPE_CHECKED, true);
				try {
					Interpreter interpreter = new Interpreter("platform:/plugin/fr.irisa.triskell.kermeta/src/java/org/kermeta/km2ecore/StructureCompiler.km", InterpreterMode.RUN, options);
					interpreter.setEntryPoint("kermeta::compiler::Main", "main_km2ecore_onlyEcore");
					String[] parameters = new String[3];
					parameters[0] = "platform:/resource" + _file.getFullPath().toString();
					parameters[1] = "";
					parameters[2] = "platform:/resource" + _file.getFullPath().toString() + ".ecore";
					interpreter.setParameters(parameters);
					EclipseConsole console = new EclipseConsole("KM2Ecore");
					interpreter.setStreams(console);
					interpreter.launch();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				/*************/
				
				return Status.OK_STATUS;
			}
		};
		
		job.schedule();
		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if ( selection instanceof TreeSelection ) {
			_file = (IFile) ((TreeSelection) selection).getFirstElement();
		}
	}

}


