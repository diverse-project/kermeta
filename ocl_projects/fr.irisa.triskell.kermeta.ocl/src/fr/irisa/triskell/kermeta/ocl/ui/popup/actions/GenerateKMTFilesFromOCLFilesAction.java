package fr.irisa.triskell.kermeta.ocl.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;

public class GenerateKMTFilesFromOCLFilesAction implements IObjectActionDelegate {

	private IFolder _folder;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	@Override
	public void run(IAction action) {
		if ( _folder != null ) {
			ResourceSelectionDialog d = new ResourceSelectionDialog(new Shell(), ResourceHelper.root, "Select the Ecore MetaModel");
			int returnedCode = d.open();
			if ( returnedCode == Window.OK ) {
				IResource r = (IResource) d.getResult()[0];
				if ( r instanceof IFile ) {
					IFile file = (IFile) r;
					if ( file.getFileExtension().equals("ecore") ) {
						String ecoreAbsolutePath = file.getFullPath().toString();
						OCLResourceVisitor v = new OCLResourceVisitor(ecoreAbsolutePath);
						try {
							_folder.accept(v);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
			_folder = null;
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		StructuredSelection ss = (StructuredSelection) selection;
		_folder = (IFolder) ss.getFirstElement();
	}


}
