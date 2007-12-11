/*$Id: InitializeTrekLocalProgress.java,v 1.1 2007-12-11 18:19:12 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeTrekProgress.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.trek.ui.KCompilerConstants;


public class InitializeTrekLocalProgress implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for Action1.
	 */
	public InitializeTrekLocalProgress() {
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
			createProgressTextFile(folder);
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
	
	/**
	 * 
	 * @param subFolder
	 */
	protected static void createProgressTextFile(IFolder subFolder)
    {
		try {
			IFile progress_file = ResourcesPlugin.getWorkspace().getRoot().getFile(subFolder.getFullPath().append("/" + KCompilerConstants.PROGRESS_PREFIX + subFolder.getName()).addFileExtension(KCompilerConstants.PROGRESS_EXT));
			if( !progress_file.exists() ) {
				progress_file.create(new ByteArrayInputStream("Design=0\nImpl_Java=0\nImpl_Kermeta=0\n".getBytes()), true, new NullProgressMonitor());					
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
