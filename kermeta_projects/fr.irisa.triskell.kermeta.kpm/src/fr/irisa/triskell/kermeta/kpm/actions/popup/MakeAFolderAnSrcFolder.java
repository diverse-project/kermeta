package fr.irisa.triskell.kermeta.kpm.actions.popup;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.builder.KermetaResourceVisitor;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.workspace.*;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

public class MakeAFolderAnSrcFolder implements IActionDelegate {

	private IFolder folder;
	
	StructuredSelection currentSelection;
	
	public void run(IAction action) {
		Directory directory = KermetaWorkspace.getInstance().getKpm().findDirectory( folder );
		
		try {

			if ( directory != null ) {
			
				if ( directory.isSource() ) {
				
					directory.setSource( "false" );
					/*SrcDirectoryVisitor visitor = new SrcDirectoryVisitor( directory.getKpm(), SrcDirectoryVisitor.REMOVING);
					folder.accept(visitor);*/
					directory.getKpm().removeSafelyDirectory(directory);
			
				} 
			} else {
		    	directory = KermetaWorkspace.getInstance().getKpm().createDirectory( folder );
				directory.setSource( "true" );				
				SrcDirectoryVisitor visitor = new SrcDirectoryVisitor( directory.getKpm(), SrcDirectoryVisitor.ADDING);
				folder.accept(visitor);
		
			}
			KermetaWorkspace.getInstance().save();
			
			SrcFolderDecorator.getDecorator().refresh( folder );
			
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
