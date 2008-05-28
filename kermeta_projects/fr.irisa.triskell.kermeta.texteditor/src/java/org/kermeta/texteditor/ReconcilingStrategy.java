

/*$Id: ReconcilingStrategy.java,v 1.6 2008-05-28 09:25:06 ftanguy Exp $
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
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KermetaUnitHost;
import org.kermeta.kpm.KpmManager;
import org.kermeta.texteditor.folding.FoldingStrategyHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class ReconcilingStrategy implements IReconcilingStrategy {

	private KermetaTextEditor editor = null;
	
	private Unit kpmUnit = null;
	
	private Job modelCheckingJob = null;
	
	public ReconcilingStrategy(KermetaTextEditor editor) {
		this.editor = editor;
		IFile file = editor.getFile();
		if ( file != null ) {
			kpmUnit = KpmManager.getDefault().getUnit( file.getFullPath().toString() );
		}
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

	private void setJobForKermetaProject() {
		modelCheckingJob = new Job("Model Checking " + kpmUnit.getName()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				int value = TexteditorPlugin.getDefault().getModelCheckingStrategy();
				
				switch (value) {
				case ModelcheckingStrategy.INPUT_CHANGED:
					HashMap<String, Object> args = new HashMap<String, Object>();
					args.put("forceTypechecking", true);
					args.put("content", getFileContent());
					EventDispatcher.sendEvent(kpmUnit, "update", args, monitor);
					break;

				default:
					break;
				}
				
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
					try {
						LoaderPlugin.getDefault().unload( "platform:/resource" + editor.getFile().getFullPath().toString() );
						KermetaUnit kermetaUnit = KermetaUnitChecker.check( editor.getFile(), getFileContent() );
						KermetaUnitHost.getInstance().updateValue(editor.getFile(), kermetaUnit);
					} catch (NotRegisteredURIException e) {
						e.printStackTrace();
					} catch (URIMalformedException e) {
						e.printStackTrace();
					} catch (IdNotFoundException e) {
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
	
	public String getFileContent() {
		return document.get();
	}
}


