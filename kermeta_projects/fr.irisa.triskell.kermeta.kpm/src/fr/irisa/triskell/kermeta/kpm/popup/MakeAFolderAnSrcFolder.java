package fr.irisa.triskell.kermeta.kpm.popup;

import java.util.Iterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
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
				
				final Directory d = directory;
				
				Job job = new Job("Building Directory " + d.getName()) {
					
					public IStatus run(IProgressMonitor monitor) {
						Iterator<Unit> itOnUnits = d.getContents().iterator();
						while ( itOnUnits.hasNext() ) {
							if ( ! monitor.isCanceled() )
								itOnUnits.next().changed(KermetaWorkspace.getInstance().changer(), new SubProgressMonitor(monitor, 1));
							else
								return Status.CANCEL_STATUS;
						}
						return Status.OK_STATUS;
					}
					
				};
				
				job.schedule();
				
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
