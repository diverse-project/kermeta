

/*$Id: KermetaTextEditor.java,v 1.8 2008-02-29 16:13:57 dvojtise Exp $
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
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.texteditor.folding.FoldingStrategyHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
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
    	UIJob job = new UIJob("Opening File " + getFile().getFullPath().toString()) {
    		public IStatus runInUIThread(IProgressMonitor monitor) {
    			try {
    				initializeProject();
    				if ( project != null )
    					initializeInterestWithKPM(monitor);
    				else
    	    			initializeInterest();
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
    
    private boolean initializeUnit() {
		boolean result = false;
    	unit = project.getKpm().findUnit(getFile().getFullPath().toString()); 
		if ( unit == null ) {
			unit = KPMHelper.getOrCreateUnit(project.getKpm(), getFile().getFullPath().toString());
			project.save();
			result = true;
		} else if ( unit.getLastTimeModified().equals( new Date(0)) )
			result = true;
		return result;
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
		boolean mustBeChecked = initializeUnit();	
		/*
		 * 
		 * Adding dependencies if necessary.
		 * 
		 */
		KPMHelper.addOpenDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addUpdateDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addCloseDependencyOnKMTFile(project.getKpm(), unit);		
		project.save();
		
		if ( mustBeChecked ) {
			/*
			 * 
			 * Force the typechecking.
			 * 
			 */
			KermetaUnitHost.getInstance().declareInterest(this, getFile());
			unit.setLastTimeModified( new Date(0) );
			unit.receiveSynchroneEvent("update", null, monitor);
		} else
			initializeInterest();
	}

	private void initializeInterest() throws KermetaIOFileNotFoundException, URIMalformedException, IdNotFoundException, NotRegisteredURIException {
		KermetaUnitHost.getInstance().declareInterest(this, getFile());
		KermetaUnitHost.getInstance().updateValue( getFile(), KermetaUnitChecker.check( getFile() ) );
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
				if ( ! currentKermetaUnit.isErroneous() ) {
					setKermetaUnit( currentKermetaUnit );
					if ( outline != null )
						outline.update();
				} else if ( kermetaUnit == null ) {
					setKermetaUnit( currentKermetaUnit );
				} else
					kermetaUnit = null;
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
	
	private void setKermetaUnit(KermetaUnit newKermetaUnit) {
		WeakReference<KermetaUnit> wr = new WeakReference<KermetaUnit>(newKermetaUnit);
		kermetaUnit = wr.get();
/*		if ( kermetaUnit != null ) {
			kermetaUnit.getAspects().clear();
			kermetaUnit.getBaseAspects().clear();
			kermetaUnit.getImportedKermetaUnits().clear();
			kermetaUnit.getTypeDefinitionCache().getEntries().clear();
			kermetaUnit.setTypeDefinitionCache(null);
		}
				
		kermetaUnit = (KermetaUnit) EcoreUtil.copy( newKermetaUnit );
		KermetaUnitHelper.reconstructCache(kermetaUnit);
		kermetaUnit.getImportedKermetaUnits().addAll( KermetaUnitHelper.getAllImportedKermetaUnits(newKermetaUnit) );*/

	}
	
	@Override
	public void doSave(final IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
		if ( project == null ) {
			switch ( TexteditorPlugin.getDefault().getModelCheckingStrategy() ) {
			case ModelcheckingStrategy.SAVING_TIME :
				try {
					LoaderPlugin.getDefault().unload( "platform:/resource" + getFile().getFullPath().toString() );
					KermetaUnit newKermetaUnit = KermetaUnitChecker.check( getFile() );
					KermetaUnitHost.getInstance().updateValue(getFile(), newKermetaUnit);
				} catch (NotRegisteredURIException e) {
					TexteditorPlugin.logErrorMessage("Error while saving " + getFile().getFullPath().toString() , e);
				} catch (URIMalformedException e) {
					TexteditorPlugin.logErrorMessage("Error while saving " + getFile().getFullPath().toString() , e);
				} catch (IdNotFoundException e) {
					TexteditorPlugin.logErrorMessage("Error while saving " + getFile().getFullPath().toString() , e);
				}
				break;
			default :
				// Do nothing
				break;
			}
		} else {
			unit.setLastTimeModified( new Date() );
		}

	}	
	
}


