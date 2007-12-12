/*$Id: InitializeTrekAllLocalTextFiles.java,v 1.1 2007-12-12 09:55:34 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeTrekAllLocalTextFiles.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 dec. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class InitializeTrekAllLocalTextFiles implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for the action: InitializeTrekAllTextFiles.
	 */
	public InitializeTrekAllLocalTextFiles() {
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
		for(IFolder folder : folders) {
			InitializeTrekLocalSummary.createSummaryTextFile(folder);
			InitializeTrekLocalProgress.createProgressTextFile(folder);
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			currentSelection = (StructuredSelection) selection;
			folders.clear();
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				if(obj instanceof IFolder) {
					folders.add((IFolder) obj);
				}
			}
		}
	}

}
