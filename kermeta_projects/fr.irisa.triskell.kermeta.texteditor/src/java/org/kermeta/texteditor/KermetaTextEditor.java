

/*$Id: KermetaTextEditor.java,v 1.12 2008-06-10 11:41:25 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaTextEditor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KermetaUnitHost;
import org.kermeta.kpm.KpmManager;
import org.kermeta.texteditor.folding.FoldingStrategyHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.outline.KermetaOutline;

public class KermetaTextEditor extends TextEditor implements InterestedObject {

	private KermetaOutline outline;
	
	private ProjectionSupport projectionSupport;

	private ProjectionAnnotationModel annotationModel;

	public KermetaTextEditor() {
		super();
		setSourceViewerConfiguration( new KermetaSourceViewerConfiguration(this) );
		setDocumentProvider( new KermetaDocumentProvider() );
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
	    ProjectionViewer viewer =(ProjectionViewer) getSourceViewer();
	    projectionSupport = new ProjectionSupport(viewer,getAnnotationAccess(),getSharedColors());
	    projectionSupport.install();
	    //turn projection mode on
	    viewer.doOperation(ProjectionViewer.TOGGLE);
	    annotationModel = viewer.getProjectionAnnotationModel();
	    
    	try {
			FoldingStrategyHelper.updateFoldingPositions(this, getDocumentProvider().getDocument(getEditorInput()).get() );
		} catch (RecognitionException e) {
			TexteditorPlugin.logWarningMessage("Error while updateFoldingPositions of " + getFile().getFullPath().toString() , e);
		} catch (TokenStreamException e) {
			TexteditorPlugin.logWarningMessage("Error while updateFoldingPositions of " + getFile().getFullPath().toString() , e);
		}
		
    	/*
    	 * 
    	 * If the current project has the kermeta nature, calculate the unit.
    	 * 
    	 */
    	Job job = new Job("Opening File " + getFileName()) {
    		public IStatus run(IProgressMonitor monitor) {
    			try {
   					initializeInterestWithKPM(monitor);
    	    	} catch (KermetaIOFileNotFoundException e) {
					TexteditorPlugin.logErrorMessage("Error while opening " + getFile().getFullPath().toString() , e);
				} catch (URIMalformedException e) {
					TexteditorPlugin.logErrorMessage("Error while opening " + getFile().getFullPath().toString() , e);
				} catch (IdNotFoundException e) {
					TexteditorPlugin.logErrorMessage("Error while opening " + getFile().getFullPath().toString() , e);
				} catch (NotRegisteredURIException e) {
					TexteditorPlugin.logErrorMessage("Error while opening " + getFile().getFullPath().toString() , e);
				} catch (Throwable e) {
					TexteditorPlugin.logErrorMessage("Error while opening " + getFile().getFullPath().toString() , e);
				}
    	    	return Status.OK_STATUS;
    		}
    	};
    	job.schedule();		
	}

	private String getFileName() {
    	if( getEditorInput() instanceof IFileEditorInput ) {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile().getFullPath().toString();
        } else if ( getEditorInput() instanceof KLocalFileEditorInput ) {
        	KLocalFileEditorInput input = (KLocalFileEditorInput)getEditorInput();
            try {
				return input.getStorage().getFullPath().toString();
			} catch (CoreException e) {
				e.printStackTrace();
			}
        }
    	return "";
	}
	
	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new KermetaSourceViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(), styles);
		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
		return viewer;
	}
	
	
	public Object getAdapter(Class required) {
		if ( required == IContentOutlinePage.class ) {
			if (outline == null) {
				outline = new KermetaOutline(this);
				outline.update();
			}
			return outline;
		}
		return super.getAdapter(required);
	}
	
	private Annotation[] oldAnnotations;
	
	public void updateFoldingStructure(List<Position> positions) {
	//	Annotation[] annotations = new Annotation[positions.size()];
		List<Annotation> annotations = new ArrayList<Annotation>();
		//this will hold the new annotations along
		//with their corresponding positions
		HashMap<Annotation, Position> newAnnotations = new HashMap<Annotation, Position> ();
		
		for ( Position p : positions ) {
			ProjectionAnnotation annotation = new ProjectionAnnotation();
			newAnnotations.put(annotation,p);
			annotations.add(annotation);
		}
		
		annotationModel.modifyAnnotations(oldAnnotations,newAnnotations,null);
		
		oldAnnotations = annotations.toArray( new Annotation[annotations.size()] );
	}

    public IFile getFile() {
    	if( getEditorInput() instanceof IFileEditorInput ) {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile();
        }
    	return null;
    }
	    
    private Unit unit = null;
    
    private boolean initializeUnit() {
   		unit = KpmManager.getDefault().getUnit( getFile() );
		return true;
    }
    
    /**
     * 
     * The Kermeta Unit associated to the current file.
     * 
     */
    private KermetaUnit kermetaUnit = null;
    
    public KermetaUnit getKermetaUnit() {
    	return kermetaUnit;
    }
    
	private void initializeInterestWithKPM(IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException, IdNotFoundException, NotRegisteredURIException {
    	// getFile can return null when the editor is on a file coming from a plugin.
		IFile file = getFile();
		if ( file != null ) {
			initializeUnit();	
			KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit( file );
			if ( kermetaUnit != null ) {
				KermetaUnitHost.getInstance().declareInterest(this, file);
				updateValue( kermetaUnit );
			} else {
				KermetaUnitHost.getInstance().declareInterest(this, file);
				unit.setLastTimeModified( new Date(0) );
				EventDispatcher.sendEvent(unit, "update", null, monitor);
			}
		}
	}
	
	@Override
	public void dispose() {
		super.dispose();
		// We are not interested in that file anymore.
		KermetaUnitHost.getInstance().undeclareInterest(this, getFile());
	}
	
	public void updateValue(Object newValue) {
		if ( newValue != null ) {
			KermetaUnit currentKermetaUnit = (KermetaUnit) newValue;
			if ( currentKermetaUnit != null ) {
				setKermetaUnit( currentKermetaUnit );
				if ( outline != null )
					outline.update();
			}
		}
	}
	
	private void setKermetaUnit(KermetaUnit newKermetaUnit) {
		WeakReference<KermetaUnit> wr = new WeakReference<KermetaUnit>(newKermetaUnit);
		kermetaUnit = wr.get();
	}
		
}


