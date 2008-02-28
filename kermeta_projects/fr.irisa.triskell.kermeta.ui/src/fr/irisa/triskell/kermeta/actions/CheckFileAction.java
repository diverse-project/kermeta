

/*$Id: CheckFileAction.java,v 1.3 2008-02-28 09:35:47 dvojtise Exp $
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
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.texteditor.KermetaTextEditor;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
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
					/*
					 * 
					 * Try to get a kermeta project.
					 * 
					 */
					KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( file.getProject() );
					if ( project != null ) {
						Unit unit = project.getKpm().findUnit( file.getFullPath().toString() );
						unit.setLastTimeModified( new Date(0) );
						Map<String, Object> options = new HashMap<String, Object>();
						if ( document != null )
							options.put("content", document.get());
						unit.receiveSynchroneEvent("update", options, monitor);
					} else {
						LoaderPlugin.getDefault().unload( "platform:/resource" + file.getFullPath().toString() );
						try {
							KermetaUnit kermetaUnit = KermetaUnitChecker.check(file, document.get());
							KermetaUnitHost.getInstance().updateValue(file, kermetaUnit);
						} catch (NotRegisteredURIException e) {
							KermetaUIPlugin.logErrorMessage("Error checking " + file.getFullPath().toString(),e);
						} catch (URIMalformedException e) {
							KermetaUIPlugin.logErrorMessage("Error checking " + file.getFullPath().toString(),e);
						} catch (IdNotFoundException e) {
							KermetaUIPlugin.logErrorMessage("Error checking " + file.getFullPath().toString(),e);
						}
					}
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


