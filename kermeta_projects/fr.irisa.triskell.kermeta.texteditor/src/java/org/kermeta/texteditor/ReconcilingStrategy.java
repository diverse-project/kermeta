

/*$Id: ReconcilingStrategy.java,v 1.1 2007-12-17 14:05:08 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	FoldingStrategy.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 23 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.texteditor.folding.FoldingStrategyHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class ReconcilingStrategy implements IReconcilingStrategy, Interest {

	private KermetaTextEditor editor = null;
	
	private Unit kpmUnit = null;
	
	private Job modelCheckingJob = null;
	
	public ReconcilingStrategy(KermetaTextEditor editor) {
		this.editor = editor;
		IFile file = editor.getFile();
		KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( file.getProject() );
		if ( project != null )
			kpmUnit = project.getKpm().findUnit( file.getFullPath().toString() );
	}
	
	private IDocument document = null;
	
	public void reconcile(IRegion partition) {
		
		try {
			FoldingStrategyHelper.updateFoldingPositions(editor, document.get());
		} catch (RecognitionException e) {
		} catch (TokenStreamException e) {
		}
	
		
		/*
		 * 
		 * If one job is still executing, let's cancel it and wait for its end.
		 * 
		 */
		if ( modelCheckingJob != null ) {
			modelCheckingJob.cancel();
			try {
				modelCheckingJob.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if ( kpmUnit != null )
			setJobForKermetaProject();
		else
			setJobForNonKermetaProject();
		
		modelCheckingJob.schedule();
		
	}

	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {}

	public void setDocument(IDocument document) {
		this.document = document;
	}

	public void updateValue(Object newValue) {}
	
	private void setJobForKermetaProject() {
		final Interest interest = this;
		modelCheckingJob = new Job("Model Checking " + kpmUnit.getValue()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				KermetaUnitHost.getInstance().declareInterest(interest, kpmUnit);

				int value = TexteditorPlugin.getDefault().getModelCheckingStrategy();
				
				switch (value) {
				case ModelcheckingStrategy.INPUT_CHANGED:
					HashMap<String, Object> args = new HashMap<String, Object>();
					args.put("forceTypechecking", true);
					args.put("content", editor.getDocumentProvider().getDocument(editor.getEditorInput()).get());
					kpmUnit.receiveSynchroneEvent("update", args, monitor);					
					break;

				default:
					break;
				}
				
				KermetaUnitHost.getInstance().undeclareInterest(interest, kpmUnit);
				
				return Status.OK_STATUS;
			}
		};
	}
	
	private void setJobForNonKermetaProject() {
		modelCheckingJob = new Job("Model Checking " + editor.getFile().getFullPath().toString()) {
			
			public IStatus run(IProgressMonitor monitor) {

				int value = TexteditorPlugin.getDefault().getModelCheckingStrategy();
				
				switch (value) {
				case ModelcheckingStrategy.INPUT_CHANGED:
					KermetaMarkersHelper.clearMarkers(editor.getFile());
					IOPlugin.getDefault().unload( editor.getFile() );
					
					KermetaUnit kermetaUnit;
					try {
						kermetaUnit = KermetaUnitChecker.check( editor.getFile(), editor.getDocumentProvider().getDocument(null).get() );
						
						if (monitor.isCanceled())
							return Status.CANCEL_STATUS;
				
						editor.updateValue(kermetaUnit);
						KermetaMarkersHelper.createMarkers(editor.getFile(), kermetaUnit);	
						kermetaUnit.setLocked(false);
					} catch (KermetaIOFileNotFoundException e) {
						e.printStackTrace();
					} catch (URIMalformedException e) {
						e.printStackTrace();
					} 

					break;
					
				default:
					break;
				}
				
				return Status.OK_STATUS;
			}
			
		};
	}
}


