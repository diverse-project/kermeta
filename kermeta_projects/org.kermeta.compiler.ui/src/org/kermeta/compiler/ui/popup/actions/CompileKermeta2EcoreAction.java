/* $Id: CompileKermeta2EcoreAction.java,v 1.4 2009-02-16 16:01:01 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan 08, 2009
 * Authors       : Cyril Faucher <cfaucher@irisa.fr>
 */

package org.kermeta.compiler.ui.popup.actions;

import java.util.Iterator;

import kermeta.compiler.runner.Main__main_km2ecore_behaviorJava__Runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.Kmt2KmExporter4Compiler;
import org.kermeta.compiler.ui.Activator;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.simk.presentation.SimkEditor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * This action aims at providing a compiler kmt2ecore without generating the Java code
 * @author cfaucher
 *
 */
public class CompileKermeta2EcoreAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile file;

	
	/**
	 * Constructor for CompileKermetaAction.
	 */
	public CompileKermeta2EcoreAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		Job job = new Job("Kermeta Compiling Process") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				/*************/
				monitor.beginTask("Merging km", 3);
				try {
					
					//Avoid out of sync issue
					file.getParent().refreshLocal(1, monitor);
					
					//The following 2 lines are required to set rightly the Simk plugin
					Platform.getBundle("org.kermeta.simk").start();
					@SuppressWarnings("unused")
					SimkEditor simkEditor = new SimkEditor();
					
					Kmt2KmExporter4Compiler kermetaCompiler = new Kmt2KmExporter4Compiler(file);
					
					String uri = "platform:/resource" + file.getFullPath().toString();
					KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(uri, null);
					// Generate the km merged and the traceability model
					kermetaCompiler.writeUnit(kermetaUnit, file);
					monitor.worked(1);
					monitor.setTaskName("Generating ecore from km");
					
					// Generate the Ecore containing the kmt source code compiled into Java
					IFile km_merged_file = ResourceHelper.getIFile(file.getFullPath()
							.removeFileExtension().addFileExtension("km")
							.toString());
					
					String[] _args = new String[1];
					_args[0] = km_merged_file.getFullPath().toString();
					Main__main_km2ecore_behaviorJava__Runner.main_forDeployedVersion(_args);
					
					//Avoid out of sync issue
					file.getParent().refreshLocal(1, monitor);

					monitor.worked(1);
					monitor.setTaskName("Generating java plugin from ecore");
					monitor.subTask("Generating java plugin from ecore");
					
					Activator.internalLog.info("The compilation process is complete");
								
				} catch (UnsupportedClassVersionError e){
					Activator.logErrorMessage("Java version incompatibility : one of the dependencies of this plugin is not compatible with your JVM", e);
        		} catch (Exception e) {
					String message = "Compilation of " + file.getName()+" failed";
					Activator.logErrorMessage(message, e);
				} catch (Error e) {
					String message = "Compilation of " + file.getName()+" failed";
					Activator.logErrorMessage(message, e);
				}
			
				monitor.done();
				/*************/
				
				return Status.OK_STATUS;
			}
		};
		
		job.schedule();
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// the selection should be a single *.kmt file
			currentSelection = (StructuredSelection) selection;
			Iterator<IFile> it = currentSelection.iterator();

			while (it.hasNext()) {
				file = (IFile) it.next();
			}
		}
		try {
			action.setEnabled(false);
			KermetaUnit ku_fromFile = LoaderPlugin.getDefault().load(
					"platform:/resource/" + file.getFullPath(), null);
			if (!ku_fromFile.isErroneous()) {
				action.setEnabled(true);
			}
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
