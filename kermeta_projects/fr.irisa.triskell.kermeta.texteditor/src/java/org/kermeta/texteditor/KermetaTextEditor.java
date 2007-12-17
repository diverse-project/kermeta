

/*$Id: KermetaTextEditor.java,v 1.1 2007-12-17 14:05:08 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaTextEditor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;
import org.kermeta.texteditor.context.TextEditorContext;
import org.kermeta.texteditor.folding.FoldingStrategyHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.texteditor.outline.KermetaOutline;

public class KermetaTextEditor extends TextEditor implements Interest {

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
		
    	initializeProject();
    	/*
    	 * 
    	 * If the current project has the kermeta nature, calculate the unit.
    	 * 
    	 */
    	UIJob job = new UIJob("Opening File") {
    		public IStatus runInUIThread(IProgressMonitor monitor) {
    	    	if ( project != null ) {
    	    		initializeUnit();
    	    		if ( unit != null )
    					try {
    						initializeInterest();
    					} catch (KermetaIOFileNotFoundException e) {
    						e.printStackTrace();
    					} catch (URIMalformedException e) {
    						e.printStackTrace();
    					}
    	    	} else {
    	    		try {
    					KermetaUnit kermetaUnit = KermetaUnitChecker.check( ((IFileEditorInput) getEditorInput()).getFile() );
    					updateValue(kermetaUnit);
    	    		} catch (KermetaIOFileNotFoundException e) {
    					e.printStackTrace();
    				} catch (URIMalformedException e) {
    					e.printStackTrace();
    				}
    	    		
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
	
	/*@Override
	protected void createActions() {
		super.createActions();
		setAction( FormatAction.ID, new FormatAction() );
		
		//ResourceBundle bundle = TexteditorPlugin.getDefault().getResourceBundle();
		//setAction("ContentFormatProposal", new TextOperationAction(bundle, "ContentFormatProposal.", this,
		//		ISourceViewer.FORMAT));
		//setAction("ContentAssistProposal", new TextOperationAction(bundle, "ContentAssistProposal.", this,
		//		ISourceViewer.CONTENTASSIST_PROPOSALS));
		//setAction("ContentAssistTip", new TextOperationAction(bundle, "ContentAssistTip.", this,
		//		ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION));
	}
	
	
	class FormatAction extends Action {
		public static final String ID = "FormatAction";

		public FormatAction() {
			setEnabled(true);
			setId(ID);
			setText("&Format");
		}

		public void run() {
			SourceViewer viewer = (SourceViewer) getSourceViewer();
			viewer.setSelection(new TextSelection(viewer.getSelectedRange().x,
					0));
			if (!viewer.canDoOperation(SourceViewer.FORMAT)) {
				return;
			}
			viewer.doOperation(SourceViewer.FORMAT);
			// Update marker visuals.
			IDocument doc = viewer.getDocument();
			IAnnotationModel model = viewer.getAnnotationModel();
			model.disconnect(doc);
			model.connect(doc);
		}
	}*/
	
	
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
	
    
  /*  @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    	super.init(site, input);
    	initializeProject();*/
    	/*
    	 * 
    	 * If the current project has the kermeta nature, calculate the unit.
    	 * 
    	 */
    /*	if ( project != null ) {
    		initializeUnit();
    		if ( unit != null )
				try {
					initializeInterest();
				} catch (KermetaIOFileNotFoundException e) {
					e.printStackTrace();
				} catch (URIMalformedException e) {
					e.printStackTrace();
				}
    	}
    }*/
        
    /**
     * @see org.eclipse.ui.texteditor.AbstractTextEditor#editorContextMenuAboutToShow(IMenuManager)
     */
   /* protected void editorContextMenuAboutToShow(IMenuManager menu) {
       super.editorContextMenuAboutToShow(menu);
       SourceViewer viewer = (SourceViewer) getSourceViewer();
       IAction action;
       //
       action = getAction(FormatAction.ID);
       action.setEnabled(viewer.canDoOperation(SourceViewer.FORMAT));
       menu.appendToGroup(ITextEditorActionConstants.MB_ADDITIONS, action);
    }*/
    
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
    
	private void initializeInterest() throws KermetaIOFileNotFoundException, URIMalformedException {
		KermetaUnitHost.getInstance().declareInterest(this, unit);
		updateValue( KermetaUnitChecker.check( getFile() ) );
		
		KermetaMarkersHelper.clearMarkers(getFile());
		KermetaMarkersHelper.createMarkers(getFile(), kermetaUnit);
		
		KPMHelper.addOpenDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addUpdateDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addCloseDependencyOnKMTFile(project.getKpm(), unit);
		
		project.save();
	}

	@Override
	public void dispose() {
		super.dispose();
		if ( project != null )
			KermetaUnitHost.getInstance().undeclareInterest(this, unit);
	}
	
	//private IDocument oldDocument = null;
	
	public void updateValue(Object newValue) {
		if ( newValue != null ) {
			KermetaUnit currentKermetaUnit = (KermetaUnit) newValue;
			if ( ! currentKermetaUnit.isErroneous() && currentKermetaUnit != kermetaUnit ) {
				
				currentKermetaUnit.setLocked(true);
				
				if ( kermetaUnit != null ) {
					kermetaUnit.setLocked(false);
					IOPlugin.getDefault().unload( kermetaUnit.getUri() );
				}
				
				IFile file = ((IFileEditorInput) getEditorInput()).getFile();
				String uri = "platform:/resource" + file.getProject().getFullPath().toString() + "/" + file.getName();
				uri = uri.substring(0, uri.length()-4) + "_text_editor_.kmt";
				
				currentKermetaUnit.setUri( uri );
				kermetaUnit = currentKermetaUnit;IOPlugin.getDefault();
				
				if ( outline != null )
					outline.update();
			}	
		}
	}
	
	@Override
	public void doSave(final IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
		if ( project == null ) {
			IFile file = ((IFileEditorInput) getEditorInput()).getFile();
			KermetaMarkersHelper.clearMarkers( file );
			IOPlugin.getDefault().unload( file );
			
			KermetaUnit kermetaUnit;
			try {
				kermetaUnit = KermetaUnitChecker.check( file, getSourceViewer().getDocument().get() );
				if (progressMonitor.isCanceled())
					return;
		
				updateValue(kermetaUnit);
				KermetaMarkersHelper.createMarkers( file, kermetaUnit );	
				kermetaUnit.setLocked(false);
			} catch (KermetaIOFileNotFoundException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
		} /*else {
			final Interest interest = this;
			UIJob job = new UIJob("") {
				public IStatus runInUIThread(IProgressMonitor monitor) {
					KermetaUnitHost.getInstance().declareInterest(interest, unit);
					HashMap<String, Object> args = new HashMap<String, Object>();
					args.put("forceTypechecking", true);
					args.put("content", getSourceViewer().getDocument().get());
					unit.receiveSynchroneEvent("update", args, progressMonitor);					
					KermetaUnitHost.getInstance().undeclareInterest(interest, unit);
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		}*/

	}	
	
}


