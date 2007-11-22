/* $Id: CompileEcoreAction.java,v 1.2 2007-11-22 13:00:24 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileEcoreAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.popup.actions;

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.Compiler;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


public class CompileEcoreAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile ecorefile;
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

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

		if (ecorefile != null) {
			Compiler compiler = new Compiler(ecorefile);

			try {
				compiler.run();
				internalLog.info("The compilation process is complete");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
