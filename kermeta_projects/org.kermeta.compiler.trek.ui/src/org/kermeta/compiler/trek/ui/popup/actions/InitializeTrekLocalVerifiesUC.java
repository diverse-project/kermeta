/*$Id: InitializeTrekLocalVerifiesUC.java,v 1.2 2008-02-01 13:27:00 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeTrekLocalVerifiesUC.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 dec. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.tests.KCompilerConstants;


public class InitializeTrekLocalVerifiesUC implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for Action1.
	 */
	public InitializeTrekLocalVerifiesUC() {
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
			createSummaryTextFile(folder);
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
	protected static void createSummaryTextFile(IFolder subFolder)
    {
		try {
			IFile summary_file = ResourcesPlugin.getWorkspace().getRoot().getFile(subFolder.getFullPath().append("/" + KCompilerConstants.VERIFIES_UC_PREFIX + subFolder.getName()).addFileExtension(KCompilerConstants.VERIFIES_UC_EXT));
			if( !summary_file.exists() ) {
				String content = "verifies_uc_0=" + subFolder.getParent().getName() + "\nverifies_uc_1=";
				summary_file.create(new ByteArrayInputStream(content.getBytes()), true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
