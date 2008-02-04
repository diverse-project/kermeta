

/*$Id: KermetaTextEditor.java,v 1.6 2008-02-04 10:54:41 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaTextEditor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.texteditor.folding.FoldingStrategyHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
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
			e.printStackTrace();
		} catch (TokenStreamException e) {
			e.printStackTrace();
		}
		
    	/*
    	 * 
    	 * If the current project has the kermeta nature, calculate the unit.
    	 * 
    	 */
    	UIJob job = new UIJob("Opening File") {
    		public IStatus runInUIThread(IProgressMonitor monitor) {
    			try {
    				initializeProject();
    				if ( project != null )
    					initializeInterestWithKPM();
    				else
    	    			initializeInterest();
    	    	} catch (KermetaIOFileNotFoundException e) {
					e.printStackTrace();
				} catch (URIMalformedException e) {
					e.printStackTrace();
				} catch (IdNotFoundException e) {
					e.printStackTrace();
				}
    	    	return Status.OK_STATUS;
    		}
    	};
    	job.schedule();		
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
        } else
            return null;
    }
	
    /**
     * 
     * The Kermeta project associated to the project of the current IFile.
     * 
     */
    private KermetaProject project = null;
    
    /**
     * 
     * Try to get the Kermeta project if the current IProject has the kermeta nature.
     * 
     */
    private void initializeProject() {
    	project = KermetaWorkspace.getInstance().getKermetaProject( getFile().getProject() );
    }
    
    private Unit unit = null;
    
    private void initializeUnit() {
		unit = project.getKpm().findUnit(getFile().getFullPath().toString()); 
		if ( unit == null ) {
			unit = KPMHelper.getOrCreateUnit(project.getKpm(), getFile().getFullPath().toString());
			project.save();
		}
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
    
	private void initializeInterestWithKPM() throws KermetaIOFileNotFoundException, URIMalformedException, IdNotFoundException {
		initializeUnit();
		initializeInterest();
		/*
		 * 
		 * Adding dependencies if necessary.
		 * 
		 */
		KPMHelper.addOpenDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addUpdateDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addCloseDependencyOnKMTFile(project.getKpm(), unit);
		
		project.save();
	}

	private void initializeInterest() throws KermetaIOFileNotFoundException, URIMalformedException, IdNotFoundException {
		KermetaUnitHost.getInstance().declareInterest(this, getFile());
		KermetaUnitHost.getInstance().updateValue( getFile(), KermetaUnitChecker.check( getFile() ) );
		KermetaMarkersHelper.clearMarkers(getFile());
		KermetaMarkersHelper.createMarkers(getFile(), kermetaUnit);
	}

	
	@Override
	public void dispose() {
		super.dispose();
		KermetaUnitHost.getInstance().undeclareInterest(this, getFile());
	}
	
	//private IDocument oldDocument = null;
	
	public void updateValue(Object newValue) {
		if ( newValue != null ) {
			KermetaUnit currentKermetaUnit = (KermetaUnit) newValue;
			try {
				if ( ! currentKermetaUnit.isErroneous() && currentKermetaUnit != kermetaUnit ) {
					this.kermetaUnit = currentKermetaUnit.copy();
					if ( outline != null )
						outline.update();
				} else if ( kermetaUnit == null )
					this.kermetaUnit = currentKermetaUnit.copy();
			} finally {
				/*
				 * 
				 * If the project has not the kermeta nature, we must update the markers manually.
				 * 
				 */
				if ( project == null ) {
					KermetaMarkersHelper.clearMarkers(getFile());
					KermetaMarkersHelper.createMarkers(getFile(), currentKermetaUnit);					
				}
			}
		}
	}
	
	@Override
	public void doSave(final IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
		if ( project == null ) {
			try {
				IOPlugin.getDefault().unload( getFile() );
				KermetaUnit newKermetaUnit = KermetaUnitChecker.check( getFile() );
				KermetaUnitHost.getInstance().updateValue(getFile(), newKermetaUnit);
			} catch (KermetaIOFileNotFoundException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			} catch (IdNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			unit.setLastTimeModified( new Date() );
		}

	}	
	
}


