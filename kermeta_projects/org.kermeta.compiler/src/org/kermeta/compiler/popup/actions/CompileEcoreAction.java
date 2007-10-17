/* $Id: CompileEcoreAction.java,v 1.1 2007-10-17 08:56:20 cfaucher Exp $
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

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.Compiler;


public class CompileEcoreAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile ecorefile;

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
