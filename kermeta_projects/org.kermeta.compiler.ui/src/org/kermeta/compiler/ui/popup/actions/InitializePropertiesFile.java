/*$Id: $
* Project : org.kermeta.compiler.ui
* File : 	InitializePropertiesFile.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 dec. 07
* Authors : Cyril Faucher
*
* Description:
* 	Generate a properties file for customizing the compilation process,
* 	like the plugin_id, bundle_version or the unzipping of files to complement the compilation
*/

package org.kermeta.compiler.ui.popup.actions;

import java.io.ByteArrayInputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.util.CompilerProperties;


public class InitializePropertiesFile implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile kmtfile;
	
	/**
	 * Constructor for the action: InitializePropertiesFile.
	 */
	public InitializePropertiesFile() {
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
		createPropertiesFile(kmtfile.getFullPath());
	}

	 /**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.kmt file
			currentSelection = (StructuredSelection)selection;
			Iterator<?> it = currentSelection.iterator();

			while(it.hasNext()) {
				kmtfile = (IFile)it.next();
			}

		}
	}
	
	/**
	 * 
	 * @param subFolder
	 */
	protected static void createPropertiesFile(IPath path)
    {
		try {
			
			IFile summary_file = ResourcesPlugin.getWorkspace().getRoot().getFile(path.removeFileExtension().addFileExtension(KCompilerConstants.COMPILER_PROPERTIES_EXT));
			if( !summary_file.exists() ) {
				String str = CompilerProperties.PLUGIN_ID + " = " +
				"\n" + CompilerProperties.COPYRIGHT_HEADER + " = " +
				"\n" + CompilerProperties.BUNDLE_VERSION + " = 0.1.0" +
				"\n" + CompilerProperties.MAIN_OPERATIONS + " = " +
				"\n" + CompilerProperties.UNZIP_EXTERNS + " = " +
				"\n" + CompilerProperties.ENABLE_EMF_LOAD_INITIALIZATION + " = false";
				
				summary_file.create(new ByteArrayInputStream(str.getBytes()), true, new NullProgressMonitor());
			} else {
				Shell shell = new Shell();
				MessageDialog.openWarning(
					shell,
					"Compiler Properties file",
					"This compiler properties file already exists !");
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
