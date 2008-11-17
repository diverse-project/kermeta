

/*$Id: MergeEcoreAction.java,v 1.1.1.1 2008-11-17 15:44:02 mclavreu Exp $
* Project : org.kermeta.kompose.ui
* File : 	MergeEcoreAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 juin 08
* Authors : paco
*/

package org.kermeta.kompose.ui.experimental.ecore.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class MergeEcoreAction implements IObjectActionDelegate {

	private List<IFile> _files;
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		MergeEcoreWizard wizard = new MergeEcoreWizard(_files);
		WizardDialog dialog = new WizardDialog( new Shell(), wizard );
		dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if ( selection instanceof StructuredSelection ) {
			StructuredSelection s = (StructuredSelection) selection;
			_files = new ArrayList<IFile>();
			_files.addAll( s.toList() );
		}
	}

}


