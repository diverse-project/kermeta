/* $Id: $
* Project    : org.kermeta.kp.migrateV1ToV2
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 22 juin 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.kp.migraterequirev1tokp.eclipse.ui.popup.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.kp.migraterequirev1tokp.eclipse.ui.require.MigrateRequireToKP;

public class MigrateRequireToKPAction implements IObjectActionDelegate {

	private Shell shell;
	
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public MigrateRequireToKPAction() {
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
		
		
		
		if ((selection instanceof IStructuredSelection)) {
			
			
			IStructuredSelection structured = (IStructuredSelection)selection;
          final  Object object = structured.getFirstElement();
            IFile kmtFile = (IFile) object;
            // "file:/"
            String kmtPathFile =  kmtFile.getLocation().toString().replace("\\", "/");
            String baseDirectory = kmtFile.getParent().getLocation().toString().replace("\\", "/");
            String workspaceDirectory = kmtFile.getWorkspace().getRoot().getLocation().toString().replace("\\", "/");
            String projectName = kmtFile.getProject().getName();
            String groupName = "group";
            
            
            if (object instanceof IFile) {
            	MigrateRequireToKP migrate = new MigrateRequireToKP();
            	try {
            		//String kpPath = migrate.migrateRequireInKP("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\Class2RDBMS.kmt", "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo","C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication" );
            	List<String> reqFiles = 	migrate.migrateRequireInKP(kmtPathFile,baseDirectory,"${project.baseUri}",workspaceDirectory, projectName, groupName   );
            	
            	
            	// Migrate all kmt files
           // migrate.migrateAllKmtFiles(reqFiles, baseDirectory, workspaceDirectory);
            	//migrate.migrateKMT(kmtPathFile,baseDirectory, workspaceDirectory);
            	
            	MessageDialog.openInformation(
        				shell,
        				"Ui",
        				"Kmt migration was executed");
            	// Refresh Kp
            	new Job("Refresh Kp ") {
    				public IStatus run(IProgressMonitor pm) {
    					
    					try {
							((IFile)object).getParent().refreshLocal(1,pm);
							
							
						} catch (CoreException e) {
							e.printStackTrace();
						}
    					return Status.OK_STATUS;
    				}
    			}.schedule(); 
            	
            	
            		
            	} catch (FileNotFoundException e) {
            		e.printStackTrace();
            	} catch (IOException e) {
            		// TODO Auto-generated catch block
            		e.printStackTrace();
            	} 
            } else {
                throw new IllegalArgumentException(
                        "Object is not Instance of IFile");
            }
        } else {
            throw new IllegalArgumentException(
                    "Selection is not an IStructuredSelection");
        }
		
	}
		
	

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
