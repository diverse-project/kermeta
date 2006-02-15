/* $Id: WizardHelper.java,v 1.1 2006-02-15 18:20:23 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta (First iteration)
 * File      : WizardHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 14, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.tools.wizards.util;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.ListDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import fr.irisa.triskell.kermeta.KermetaMessages;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.tools.wizards.dialogs.BasicLabelProvider;
import fr.irisa.triskell.kermeta.tools.wizards.dialogs.CustomContentProvider;

/**
 * Compiles a set of methods that can be shared by any wizard page.
 *
 */
public class WizardHelper {

	/** The page useing this helper */
	protected WizardPage page;
	protected Listener listener; // should be equal to page...
	protected ILabelProvider labelProvider;
	
	/** Basic constructor */
	public WizardHelper(WizardPage p_page)
	{
		page = p_page;
		if (page instanceof Listener) listener = (Listener)page;
		else listener = null; // not very tidy.
		labelProvider = new BasicLabelProvider();
	}

    /**
	 * This is a tree view browser to choose a set of resources.
	 * You can call it to display a popup-dialog that will contains a browser.
	 * @param allowMultipleSelection allow user to select many files at a time 
	 * @return the resource selected by the user.
	 */
	protected IResource handleBrowseResources(boolean showOnlyContainers, String fileExtension) {
	    IResource result = null;
	    
		// Now, create the tree
		//WorkbenchContentProvider contentProvider = new WorkbenchContentProvider();
	    CustomContentProvider contentProvider = new CustomContentProvider();
	    contentProvider.showOnlyFileTypesString(fileExtension);
	    contentProvider.showOnlyContainers(showOnlyContainers);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(page.getShell(), labelProvider, contentProvider);
		dialog.setTitle(KermetaMessages.getString("ArgTab.PROJECTSELECT"));
		dialog.setInput(ResourcesPlugin.getWorkspace());
		dialog.setAllowMultiple(false);
		
		// Set the default selection to currently selected resource
		ISelection sresource = 
		KermetaPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (sresource instanceof IStructuredSelection)
		{ 
		    if (((IStructuredSelection)sresource).getFirstElement() instanceof IResource )
			{ dialog.setInitialSelections(new Object[] {((IStructuredSelection)sresource).getFirstElement()});}
		}

		if (dialog.open() == Window.OK)
		{
			result = (IResource) dialog.getFirstResult(); 
		}
		return result;
		
	}
	
	 /**
	 * Open a tree hierarchy of the current workspace folder, and update content
	 * by displaying the resource that the user selected in the given field.
	 */
	public IResource handleBrowseFolders(StringDialogField field) {
		// Get the first resource selected by the user
		IResource result = handleBrowseResources(true, "");
		if (result != null)
			field.setText(result.getFullPath().toString());
		return result;
	}
	
	/**
	 * Open a tree hierarchy of the current workspace folder, and update content
	 * by displaying the resource that the user selected in the given field.
	 * @param
	 * @param
	 * @param index If 0, then it means that there is an element to remove. If 1, then
	 * there is an element to add
	 */
	public void handleBrowseEcoreFiles(ListDialogField field, List<IFile> files, int index) {
		// Get the first resource selected by the user
		IResource resource = handleBrowseResources(false, "ecore");
		if (resource != null && resource instanceof IFile)
		{
			field.addElement(resource.getFullPath().toString());
			files.add((IFile)resource);
		}
	}
	
}
