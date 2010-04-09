

/*$Id: DestroyKermetaUnitsFromMemory.java,v 1.2 2008-02-14 07:12:53 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.ui
* File : 	DestroyKermetaUnitsFromMemory.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 févr. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.KpmManager;

public class DestroyKermetaUnitsFromMemory implements
		IWorkbenchWindowActionDelegate {

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
	}

	public void run(IAction action) {
		//LoaderPlugin.getDefault().unloadAll();
		IOPlugin.getDefault().unloadAll();
		KpmManager.getDefault().resetKPM();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

}


