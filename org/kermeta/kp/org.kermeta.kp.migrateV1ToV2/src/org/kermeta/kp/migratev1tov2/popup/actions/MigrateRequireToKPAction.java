/* $Id: $
* Project    : org.kermeta.kp.migrateV1ToV2
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 22 juin 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.kp.migratev1tov2.popup.actions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.migratev1tov2.require.MigrateRequireToKP;

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
		/*MessageDialog.openInformation(
			shell,
			"MigrateV1ToV2",
			"Create Kp file was executed."); */
		MigrateRequireToKP migrate = new MigrateRequireToKP();
		try {
			migrate.migrateRequireInKP("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\Class2RDBMS.kmt", "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo","C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace" );
			// Later refresh
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	/*	try {
			List<String> requiredFiles = new ArrayList();
			MigrateRequireToKP migrate = new MigrateRequireToKP();
			//requiredFiles = migrate.parseKMTFile("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\Class2RDBMS.kmt");
			requiredFiles = migrate.allRequires("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\Class2RDBMS.kmt", "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo","C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace"  );
			migrate.displayList(requiredFiles);
			List <String> l = new ArrayList <String> ();
			try {
				migrate.createNewKpFile ("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\project.kp", "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS", l);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
