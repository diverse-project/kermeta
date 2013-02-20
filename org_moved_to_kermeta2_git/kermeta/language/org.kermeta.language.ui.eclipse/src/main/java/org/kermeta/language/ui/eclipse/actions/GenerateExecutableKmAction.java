/* $Id:$ 
 * Creation : 7 déc. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.ui.eclipse.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.ui.eclipse.art2.impl.Art2ComponentKermetaUI4Eclipse;

public class GenerateExecutableKmAction  implements IObjectActionDelegate{

	private ISelection selection;
	
	public GenerateExecutableKmAction() {
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
	}

	@Override
	public void run(IAction arg0) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					
					URI uri = URI.createFileURI(project.getLocation().toString());
					sendGenerateExecutableKmEvent(uri.toString());
				}
				else {
					IFolder folder = null;
					if (element instanceof IFolder) {
						folder = (IFolder) element;
					} else if (element instanceof IAdaptable) {
						folder = (IFolder) ((IAdaptable) element).getAdapter(IFolder.class);
					}
					if (folder != null) {
						URI uri = URI.createFileURI(folder.getLocation().toString());
						sendGenerateExecutableKmEvent(uri.toString());
					}
				}
			}
		}
	}

	private void sendGenerateExecutableKmEvent(String uri) {
		Art2ComponentKermetaUI4Eclipse.getDefault().getLogger().debug("Generating GenerateExecutableKmEvent for " +uri);
		Art2ComponentKermetaUI4Eclipse.getDefault().getKEventPort().process(
				new org.kermeta.language.api.kevent.KExecutableKmUserRequestEvent(uri, uri+"/output/out.km", uri+"/intermediate_output"));
	}

	@Override
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = selection;
	}

}
