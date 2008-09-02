/* $Id: CompileKermetaAction.java,v 1.6 2008-09-02 21:57:37 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.ui.popup.actions;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.Compiler;
import org.kermeta.compiler.KermetaCompiler;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class CompileKermetaAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile file;

	final static public Log internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileKermetaAction.
	 */
	public CompileKermetaAction() {
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
		
				try {
		
					KermetaCompiler kermetaCompiler = new KermetaCompiler(file);
					
					String uri = "platform:/resource" + file.getFullPath().toString();
					KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(uri, null);
					
					// Generate the km merged and the traceability model
					kermetaCompiler.writeUnit(kermetaUnit, file);
					
					// Generate the Ecore containing the kmt source code compiled into Java
					IFile km_merged_file = ResourceHelper.getIFile(file.getFullPath()
							.removeFileExtension().addFileExtension("km")
							.toString());
					kermetaCompiler.generateEcore(km_merged_file);
					
					// Run the generation of Java Classes and the required helpers (Simk)
					IFile ecore_file = ResourceHelper.getIFile(file.getFullPath()
							.removeFileExtension().addFileExtension("ecore")
							.toString());
					Compiler compiler = new Compiler(ecore_file);//new Compiler(ecore_file.getFullPath().toString());
					compiler.run();
					internalLog.info("The compilation process is complete");
								
				} catch (Exception e) {
					e.printStackTrace();
				}
		
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
