/*$Id: AddNewTestCaseFolder.java,v 1.3 2008-06-16 13:04:04 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeTrekAllLocalTextFiles.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 dec. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.common.KCompilerConstants;


public class AddNewTestCaseFolder implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for the action: InitializeTrekAllTextFiles.
	 */
	public AddNewTestCaseFolder() {
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
			createTestCaseFolder(folder);
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
	 * @param folder
	 */
	protected static void createTestCaseFolder(IFolder folder)
    {	
		try {
			IFolder subFolder = null;
			for(IResource subResource : folder.members(false) ) {
				if(subResource instanceof IFolder) {
					subFolder = (IFolder) subResource;
				}
			}
			int numFolder = 0;
			if( subFolder != null ) {
				numFolder = java.lang.Integer.valueOf(subFolder.getName().substring(4, 7));
			}
			numFolder++;
			
			String testCaseFolderName = "test";
			if( numFolder<10 ) {
				testCaseFolderName = testCaseFolderName + "00" + String.valueOf(numFolder).toString();
			} else if ( numFolder<100 ) {
				testCaseFolderName = testCaseFolderName + "0" + String.valueOf(numFolder).toString();				
			}

			IPath path = folder.getFullPath().append("/" + testCaseFolderName);
			IFolder testCaseFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
			if( !testCaseFolder.exists() ) {
				testCaseFolder.create(true, true, new NullProgressMonitor());
				ResourcesPlugin.getWorkspace().getRoot().getFolder(path.append("/" + KCompilerConstants.INPUT_FOLDER)).create(true, true, new NullProgressMonitor());
				ResourcesPlugin.getWorkspace().getRoot().getFolder(path.append("/" + KCompilerConstants.INPUT_FOLDER + "/kermeta")).create(true, true, new NullProgressMonitor());
				ResourcesPlugin.getWorkspace().getRoot().getFolder(path.append("/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER)).create(true, true, new NullProgressMonitor());
				ResourcesPlugin.getWorkspace().getRoot().getFolder(path.append("/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER + "/ecore")).create(true, true, new NullProgressMonitor());
				ResourcesPlugin.getWorkspace().getRoot().getFolder(path.append("/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER + "/java")).create(true, true, new NullProgressMonitor());
				InitializeTrekLocalSummary.createSummaryTextFile(testCaseFolder);
				IFile kmt_file = ResourcesPlugin.getWorkspace().getRoot().getFile(path.append("/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + folder.getName() + "_" + testCaseFolderName).addFileExtension(KCompilerConstants.KMT_EXT));
				if( !kmt_file.exists() ) {
					String kmt_file_content = "@mainClass \"" + 
						folder.getName() + "_" + testCaseFolderName + 
						"::Main\"\n@mainOperation \"main\"\n\npackage " + 
						folder.getName() + "_" + testCaseFolderName + 
						";\n\nrequire kermeta\n\nclass Main {\n}";
					kmt_file.create(new ByteArrayInputStream(kmt_file_content.getBytes()), true, new NullProgressMonitor());
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
