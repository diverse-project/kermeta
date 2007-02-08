package fr.irisa.triskell.kermeta.kpm.popup;

import java.util.Iterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.workspace.*;

public class MakeAFolderAnSrcFolder implements IActionDelegate {

	private IFolder folder;
	
	private StructuredSelection currentSelection;
	
	
	public void run(IAction action) {
		
		KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( folder.getProject() );
		
		Directory directory = project.getKpm().findDirectory( folder );

		try {

			if ( directory != null ) {
			
				directory.remove();
				
			} else {
		    	directory = project.getKpm().createDirectory( folder );				
				SrcDirectoryVisitor visitor = new SrcDirectoryVisitor( directory.getKpm(), SrcDirectoryVisitor.ADDING);
				folder.accept(visitor);
				
				Iterator<Unit> itOnUnits = directory.getContents().iterator();
				while ( itOnUnits.hasNext() ) {
					itOnUnits.next().changed(KermetaWorkspace.getInstance().changer(), null);
				}
				
			}
			project.save();
			
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
