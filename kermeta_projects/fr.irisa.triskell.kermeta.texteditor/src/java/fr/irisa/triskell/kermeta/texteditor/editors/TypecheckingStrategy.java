package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.utils.KermetaUnitHelper;

public class TypecheckingStrategy implements IReconcilingStrategy, Interest {

	private KMTEditor editor;

	private Job job = null;
	
	public TypecheckingStrategy(KMTEditor editor) {
		this.editor = editor;
	}
	
	public void reconcile(IRegion partition) {	
		typecheck();
	}

	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {}

	public void setDocument(IDocument document) {
	}

	public void updateValue(Object newValue) {
	}

	private void typecheck() {
	
		if ( editor.getMustBeTypechecked() ) {
		
			if ( editor.project == null ) {
				if ( job != null ) {
					job.cancel();
					try {
						job.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				job = new Job("Typechecking " + editor.getFile().getFullPath().toString()) {
					
					public IStatus run(IProgressMonitor monitor) {
						KermetaUnitHelper.unloadAllKermetaUnit();
						//KermetaUnitHelper.unloadKermetaUnit( editor.getMcunit() );
						KermetaMarkersHelper.clearMarkers(editor.getFile());
						KMTUnit kermetaUnit = (KMTUnit) KermetaUnitHelper.typecheckFile( editor.getFile(), editor.getFileContent() );
						
						if ( ! kermetaUnit.messages.hasError() ) {
							KermetaConstraintChecker checker = new KermetaConstraintChecker(kermetaUnit);
							checker.checkUnit();
						}
						
						if (monitor.isCanceled())
							return Status.CANCEL_STATUS;
				
						editor.setMcunit(kermetaUnit);
						KermetaMarkersHelper.createMarkers(editor.getFile(), kermetaUnit);
						return Status.OK_STATUS;
					}
					
				};
				
				job.setPriority(Job.SHORT);
				job.schedule();

			} else {
				
				final Interest interest = this;
				if (job != null) {
					job.cancel();
					try {
						job.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				job = new Job("Building Workspace") {
					
					public IStatus run(IProgressMonitor monitor) {
			
						KermetaUnitHelper.abortTypechecking(editor.getFile());
		
						KermetaUnitHelper.unloadAllKermetaUnit();
						
						Unit unit = editor.getUnit();
						KermetaUnitHost.getInstance().declareInterest(interest, unit);
						
						HashMap args = new HashMap();
						args.put("content", editor.getFileContent());
						unit.receiveSynchroneEvent("update", args, monitor);
						
						KermetaUnitHost.getInstance().undeclareInterest(interest, unit);
						return Status.OK_STATUS;
					}
					
				};
				
				job.setPriority(Job.LONG);
				job.schedule();
			}
			editor.setMustBeTypechecked(false);
		}		
	}
	
}
