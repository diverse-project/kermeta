/*$Id: DependenciesDoubleClickListener.java,v 1.4 2008-05-28 09:25:42 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.ui.TreeItem;

public class DependenciesDoubleClickListener implements IDoubleClickListener {

	public void doubleClick(DoubleClickEvent event) {
		
		TreeSelection treeSelection = (TreeSelection) event.getSelection();
		TreeItem item = (TreeItem) treeSelection.getFirstElement();
		Unit unit = (Unit) item.getValue();
		IFile file = ResourceHelper.getIFile( unit.getName() );
		
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
			      new FileEditorInput(file),
			      desc.getId());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}

}
