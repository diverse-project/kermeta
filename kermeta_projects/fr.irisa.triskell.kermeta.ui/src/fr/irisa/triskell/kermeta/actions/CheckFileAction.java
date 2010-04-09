

/*$Id: CheckFileAction.java,v 1.5 2008-08-07 11:47:14 dvojtise Exp $
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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
		Job job = new Job("Check File") {
			public IStatus run(IProgressMonitor monitor) {
				try {
					if ( file != null ) {
						Unit unit = KpmManager.getDefault().getUnit( file );
						if(unit == null){						
							KermetaUIPlugin.logWarningMessage("Cannot retrieve a unit for " +file.getName() + " in KPM manager", new Exception("OutofdateKPM"));
							// the file wasn't know/managed by kpm, add it
				   			KpmManager.getDefault().conditionalAddUnit(file);
				   			unit = KpmManager.getDefault().getUnit( file );
						}
						unit.setLastTimeModified( new Date(0) );
						Map<String, Object> options = new HashMap<String, Object>();
						if ( document != null )
							options.put("content", document.get());
						EventDispatcher.sendEvent(unit, "update", options, monitor);
						
					}
				} finally {
					monitor.done();
				}
				return Status.OK_STATUS;
			}
		};
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.schedule();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

}


