/*$Id: EMFRegisterAction.java,v 1.2 2007-12-13 15:23:11 dvojtise Exp $
* Project : org.eclipse.emf.ecoretools.registration
* File : 	EMFRegisterAction.java
* License : EPL
* Copyright : INRIA
* ----------------------------------------------------------------------------
* Creation date : 29 mai 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/
package org.eclipse.emf.ecoretools.registration.popup.actions;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecoretools.registration.RegistrationPlugin;
import org.eclipse.emf.ecoretools.registration.view.RegisteredPackageView;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * Action on the RegisteredPackageView that register a Ns uri 
 * and the corresponding children
 *
 */
public class EMFRegisterAction implements IObjectActionDelegate {
	
	protected StructuredSelection currentSelection;
    //protected IFile ecoreFile;
    protected ArrayList<IFile> ecoreFiles; // = new ArrayList<IFile>();

	/**
	 * 
	 */
	public EMFRegisterAction() {
		ecoreFiles = new ArrayList<IFile>();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// The selection could be a set of Ecore files
			currentSelection = (StructuredSelection) selection;
			Iterator it = currentSelection.iterator();

			ecoreFiles.clear(); // remove the previous selection, else the old selected packages will be re-registered
			while(it.hasNext()) {
				ecoreFiles.add( (IFile) it.next() );
			}
		}
	}

	
	/**
	 * 
	 */
	protected void displayRegisteredPackages() {
		try {
			RegisteredPackageView view;
			view = (RegisteredPackageView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView( RegisteredPackageView.ID );
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().bringToTop(view);
			view.refresh();
		} catch (PartInitException e) {
			RegistrationPlugin.getDefault().getLog().log(new Status(Status.WARNING, "org.eclipse.emf.ecoretools.registration",
                    Status.OK, 
                    "not able to open Registered Package View : \""+RegisteredPackageView.ID+"\"", 
                    e));
		}
	}
	
	
	/**
	 * @param p
	 * @return
	 */
	protected String getEPackageQualifiedName(EPackage p) {
		String result = null;
		if(p == null)
			result = "";
		else
			if(p.getESuperPackage() != null)
				result = getEPackageQualifiedName(p.getESuperPackage()) + "::" + p.getName();
			else
				result = p.getName();
		return result;
	}
	

}
