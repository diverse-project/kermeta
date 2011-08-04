package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.builder.eclipse.KermetaBuilder;

public class BuildKP implements IObjectActionDelegate {

	private ISelection selection;
	
	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
	}

	@Override
	public void run(IAction arg0) {
		if (selection instanceof IStructuredSelection) {
			Object oneElement = ((IStructuredSelection)selection).getFirstElement();
			if (oneElement instanceof IFile) {
				KermetaBuilder.getDefault().buildFromKP(KermetaBuilder.getDefault().generateIdentifier((IFile) oneElement));				
			}
		}
	}

	@Override
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = selection;		
	}

}
