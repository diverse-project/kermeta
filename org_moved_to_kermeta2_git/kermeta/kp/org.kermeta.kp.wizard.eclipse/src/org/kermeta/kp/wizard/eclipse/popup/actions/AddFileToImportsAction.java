/*$Id:  $
 * License : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : 2 janv. 2013
 * Authors : 
 *      Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.wizard.eclipse.popup.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.kp.ImportFile;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpFactory;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.kp.wizard.eclipse.Activator;
import org.kermeta.kp.wizard.eclipse.preferences.PreferenceConstants;
import org.kermeta.kp.wizard.eclipse.wizards.KermetaProjectNewWizard;
import org.kermeta.language.builder.eclipse.KermetaBuilderHelper;

public class AddFileToImportsAction implements IObjectActionDelegate {

	private Shell shell;

	private ISelection selection;

	public AddFileToImportsAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Object o : ((IStructuredSelection) selection).toList()) {
				if (o instanceof IFile) {
					IFile file = (IFile) o;
					try {

						// update kp that should reference this new file
						IFile kpfile = KermetaBuilderHelper.findRootKPinProject(file.getProject());
						if(kpfile == null){
							
							if (org.eclipse.jface.dialogs.MessageDialog.openQuestion(shell, 
									"Add file to kp", 
									"No kp file found in "+file.getProject().getName()+ ". Create a new kp file ?")) {
								kpfile = KermetaProjectNewWizard.createDefaultKp(file.getProject(), "project.kp", new NullProgressMonitor());
						    }
						}
						if(kpfile == null){ return; }
						KermetaProjectNewWizard.addKermetaNatureToProject(file.getProject());
						KpLoaderImpl ldr = new KpLoaderImpl(
								org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem());

						// Load KP file
						KermetaProject kp = ldr.loadKp(kpfile.getLocationURI().toString());
						ImportFile newImportFile = KpFactory.eINSTANCE.createImportFile();
						newImportFile.setUrl("${project.baseUri}/" + file.getProjectRelativePath());
						boolean alreadyImported = false;
						for(ImportFile importFile: kp.getImportedFiles()){
							if(importFile.getUrl().equals(newImportFile.getUrl())) alreadyImported = true;
						}
						if(!alreadyImported){
							kp.getImportedFiles().add(newImportFile);
							// save back to disk
							kp.eResource().save(null);
						}

						kpfile.refreshLocal(0, null);
					} catch (IOException e) {
						org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem().error(e.getMessage(), this.getClass().getCanonicalName(), e);
					} catch (CoreException e) {
						org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem().error(e.getMessage(), this.getClass().getCanonicalName(), e);
					}
				}
			}

		}		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
