/*$Id: OpenKmInKmdiAction.java,v 1.3 2007-08-23 07:56:33 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.graphicaleditor
* File : 	OpenKmInKmdiAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 jul. 07
* Authors : cfaucher
*/


package fr.irisa.triskell.kermeta.graphicaleditor.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.graphicaleditor.wizards.NewKmDiagrams;;

public class OpenKmInKmdiAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile kmfile;
    
	/**
	 * Constructor for Ecore2KmAction.
	 */
	public OpenKmInKmdiAction() {
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
	   
    	if(kmfile.exists()) {
    		IPath kmdiPath = kmfile.getLocation().removeFileExtension().addFileExtension("kmdi");
    		IPath kmdiLocation = kmfile.getFullPath().removeFileExtension().addFileExtension("kmdi");
    		if(kmdiPath.toFile().exists()) {
    			IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor("test.kmdi");
    			try {
    				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
    				      new FileEditorInput(ResourceHelper.getIFile(kmdiLocation.toString())),
    				      desc.getId());
    			} catch (PartInitException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			};
    		}
    		else {
        		NewKmDiagrams wizard =  new NewKmDiagrams();
            	wizard.init(PlatformUI.getWorkbench(),currentSelection);
            	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
            	wizDialog.open();
        	}
    	}
    	
	}

    /**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			currentSelection = (StructuredSelection)selection;
			
			// the selection should be a single *.km file and we choose the first one
			kmfile = (IFile) currentSelection.getFirstElement();
		}
	}

}
