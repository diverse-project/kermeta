package fr.irisa.triskell.kermeta.kpm.editor.plugin;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.sourcelookup.containers.LocalFileStorage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

import fr.irisa.triskell.kermeta.kpm.workspace.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

public class OpenKPMEditor implements IActionDelegate {

	private IProject iproject;
	
	public void run(IAction action) {
		
		KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject(iproject);
		
		IFile file = project.getKpmIFile();
		
		IWorkbenchPage page = KPMEditorPlugin.getPlugin().getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(page, file);
		} catch (PartInitException exception) {
			exception.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection)selection;
			Iterator it = structuredSelection.iterator();

			IResource resource = (IResource) it.next();
			iproject = resource.getProject();

		}
	}

}
