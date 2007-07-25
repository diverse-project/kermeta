/* $Id: OpenWithEMFTouchGraphAction.java,v 1.5 2007-07-25 07:10:21 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : Ecore2kmtAction.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 juil. 2005
 * Authors : 
 * 		  ffleurey 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        action that launch a pretty print of ecore files into kmt files 
 */
package fr.irisa.triskell.kermeta.touchnavigator.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.touchnavigator.views.TouchEMFModelView;

public class OpenWithEMFTouchGraphAction implements IObjectActionDelegate, IActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile file;
    
	/**
	 * Constructor for Ecore2KermetaAction.
	 */
	public OpenWithEMFTouchGraphAction() {
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
		Shell shell = new Shell();
	   
		String fileLocation = file.getFullPath().toOSString();
		if(TouchEMFModelView.currentView == null){
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
			try {
				page.showView(TouchNavigatorPlugin.EMFModelTouchView_ID);
			} catch (PartInitException e) {
				MessageDialog.openWarning( shell, "Error", "not able to open view\n" + 
						TouchNavigatorPlugin.EMFModelTouchView_ID);
				TouchNavigatorPlugin.internalLog.error("not able to open view " + 
						TouchNavigatorPlugin.EMFModelTouchView_ID, e);
			}
			if(TouchEMFModelView.currentView == null){
				MessageDialog.openWarning( shell, "Error", "not able to open view and load file at the same time !?\n" + 
						TouchNavigatorPlugin.EMFModelTouchView_ID);
				
			}
			else TouchEMFModelView.currentView.loadFile(fileLocation);
		}
		else{
			/*MessageDialog.openInformation(
					shell,
					"Touchnavigator Plug-in",
					"Opening "+fileLocation);
					*/
			TouchEMFModelView.currentView.loadFile(fileLocation);
		}
	}
		
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				file = (IFile)it.next();
			}

		}
	}

/*
	public Object getAdapter(Class adapter) {
        if (adapter == IActionFilter.class) {
                return EMFLoadableFilter.getSingleton();
        }
        return null;
    }
	*/
	
}
