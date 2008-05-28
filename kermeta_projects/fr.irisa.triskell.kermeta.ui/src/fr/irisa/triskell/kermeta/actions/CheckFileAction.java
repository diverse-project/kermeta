

/*$Id: CheckFileAction.java,v 1.4 2008-05-28 09:25:42 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.ui
* File : 	CheckFileAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 févr. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.actions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KpmManager;
import org.kermeta.texteditor.KermetaTextEditor;

import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.ui.KermetaUIPlugin;

public class CheckFileAction implements IEditorActionDelegate {

	private IFile file = null;
	
	private IDocument document = null;
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		file = null;
		document = null;
		if ( targetEditor != null ) {
			if ( targetEditor instanceof KermetaTextEditor ) {
				KermetaTextEditor kte = (KermetaTextEditor) targetEditor;
				document = kte.getDocumentProvider().getDocument( kte.getEditorInput() );
				file = kte.getFile();
			}
		}
	}

	public void run(IAction action) {
		
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {		
				if ( file != null ) {
					Unit unit = KpmManager.getDefault().getUnit( file );
					unit.setLastTimeModified( new Date(0) );
					Map<String, Object> options = new HashMap<String, Object>();
					if ( document != null )
						options.put("content", document.get());
					EventDispatcher.sendEvent(unit, "update", options, monitor);
				}
			}
		};
		try {
			ResourcesPlugin.getWorkspace().run(r, new NullProgressMonitor());
		} catch (CoreException e) {
			KermetaUIPlugin.logErrorMessage("Error checking " + file.getFullPath().toString(),e);
		}

	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

}


