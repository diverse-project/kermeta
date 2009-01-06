

/*$Id: MergeAction.java,v 1.9 2009-01-06 10:00:55 cfaucher Exp $
* Project : org.kermeta.compiler.ui
* File : 	MergeAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 31 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.KermetaCompiler;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;

public class MergeAction implements IObjectActionDelegate {

	private IFile file;
	
	public MergeAction() {
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
	
	public void run(IAction action) {
		
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				try {
					
					String uri = "platform:/resource" + file.getFullPath().toString();
					KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(uri, null);
					KermetaCompiler kermetaCompiler = new KermetaCompiler(file);
					kermetaCompiler.writeUnit(kermetaUnit, file);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				file = null;
			}
		};

		try {
			ResourcesPlugin.getWorkspace().run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		TreeSelection treeSelection = (TreeSelection) selection;
		file = (IFile) treeSelection.getFirstElement();
	}

}


