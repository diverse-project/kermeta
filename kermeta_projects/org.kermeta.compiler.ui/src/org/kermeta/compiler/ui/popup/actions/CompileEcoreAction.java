/* $Id: CompileEcoreAction.java,v 1.5 2009-02-06 10:19:50 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileEcoreAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.ui.popup.actions;

import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.Compiler;
import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * This action is dedicated to launch the generation of the Java source code from the Ecore and Simk files
 * this actino is launched by right-click on an Ecore file
 * @author cfaucher
 *
 */
public class CompileEcoreAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile ecorefile;
	
	final static public Log internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileEcoreAction.
	 */
	public CompileEcoreAction() {
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
		
		Shell shell = new Shell();
		
		boolean isConfirmed = MessageDialog.openConfirm(
			shell,
			"KermetaCompiler Ecore2Java",
			"This action skips the kmt2ecore compilation, the potential changes in your kmt sources will be not taking into account !");
		
		if ( isConfirmed ) {
			
			Job job = new Job("Kermeta Compiling Process") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
		
					/*************/
				
					try {
						if (ecorefile != null) {
							Compiler compiler = new Compiler(ecorefile, new NullProgressMonitor());
				
							compiler.run();
							internalLog.info("The compilation process is complete");
						}		
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					
					/*************/
					
					return Status.OK_STATUS;
				}
			};
		
			job.schedule();
		
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection) selection;
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				ecorefile = (IFile) it.next();
			}
		}
	}

}
