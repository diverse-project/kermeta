package fr.irisa.triskell.kermeta.kpm.actions.popup;

import java.util.Iterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.workspace.*;

public class MakeAFolderAnSrcFolder implements IActionDelegate {

	private IFolder folder;
	
	private StructuredSelection currentSelection;
	
	
	public void run(IAction action) {
		Directory directory = KermetaWorkspace.getInstance().getKpm().findDirectory( folder );

		try {

			if ( directory != null ) {
			
				directory.remove();
				
			} else {
		    	directory = KermetaWorkspace.getInstance().getKpm().createDirectory( folder );				
				SrcDirectoryVisitor visitor = new SrcDirectoryVisitor( directory.getKpm(), SrcDirectoryVisitor.ADDING);
				folder.accept(visitor);
		
			}
			KermetaWorkspace.getInstance().save();
			
			SrcFolderDecorator.getDecorator();
			
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				folder = (IFolder)it.next();
			}

		}
	}
	
}
