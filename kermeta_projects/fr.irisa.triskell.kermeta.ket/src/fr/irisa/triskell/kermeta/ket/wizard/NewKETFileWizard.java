

/*$Id: NewKETFileWizard.java,v 1.1 2008-02-18 08:13:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.ket
* File : 	NewKETFileWizard.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 févr. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.ket.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * 
 * This class has the responsibilities to create a new KET File in the workspace.
 * 
 * It is quite simpler because a template is used.
 * 
 * @author paco
 *
 */
public class NewKETFileWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	
	private WizardNewKETFileCreationPage page;
	
	public NewKETFileWizard() {
	}
	
	@Override
	public void addPages() {
		super.addPages();
		page = new WizardNewKETFileCreationPage("New KET File", selection);
		addPage( page );
	}

	@Override
	public boolean performFinish() {
		page.createNewFile();
		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

}


