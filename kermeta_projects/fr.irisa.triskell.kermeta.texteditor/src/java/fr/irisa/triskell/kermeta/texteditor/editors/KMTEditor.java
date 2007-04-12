/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.outline.KermetaOutline;
import fr.irisa.triskell.kermeta.utils.KermetaUnitHelper;

import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMTEditor extends TextEditor implements Interest {
	
	protected KermetaUnit mcunit; 
	protected KermetaOutline outline;
	
	public KermetaProject project;
	
	public ProjectionAnnotationModel annotationModel;
	
	private Unit unit = null;
	
	private String savedContent = "";
	private String currentContent = "";
	
	public void setCurrentContent(String value) {
		currentContent = value;
	}
	
	/**
	 * Constructor
	 */
	public KMTEditor() {
		super();
		setSourceViewerConfiguration(new EditorConfiguration(this));
		TexteditorPlugin.getDefault().setEditor(this);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		//getSourceViewer().addTextInputListener( new KMTTextInputListener() );
		getSourceViewer().addTextListener( new KMTTextListener(this) );
	}
	
	private boolean mustBeTypechecked = false;
	
	synchronized public void setMustBeTypechecked(boolean value) {
		if ( value && (unit != null) )
			unit.setLastTimeModified( new Date() );			
		mustBeTypechecked = value;
	}
	
	synchronized public boolean getMustBeTypechecked() {
		return mustBeTypechecked;
	}
	
	private void initializeInterest() {
		
		unit = project.getKpm().findUnit(getFile().getFullPath().toString()); 
		if ( unit == null ) {
			unit = KPMHelper.getOrCreateUnit(project.getKpm(), getFile().getFullPath().toString());
			project.save();
		}
			
		KermetaUnitHelper.unloadAllKermetaUnit();
		KMTUnit kermetaUnit = (KMTUnit) KermetaUnitHelper.typecheckFile( getFile() );

		setMcunit(kermetaUnit);
		KermetaUnitHost.getInstance().declareInterest(this, unit, kermetaUnit);
		
		KPMHelper.addOpenDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addUpdateDependencyOnKMTFile(project.getKpm(), unit);
		KPMHelper.addCloseDependencyOnKMTFile(project.getKpm(), unit);
		
		project.save();
	}
	
    public IFile getFile()
    {
    	
    	if(getEditorInput() instanceof IFileEditorInput)
        {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile();
        } else
        {
            return null;
        }
    }
    
    public Object getAdapter(Class type) {
    	   if (type == IContentOutlinePage.class) {
    	     // Installing Outline
    	     if (outline == null) outline = new KermetaOutline(this);
    	       return outline;                       
    	   }
    	   return super.getAdapter(type);
    	  }
	
	/**********************************
	 * 			ACTIONS
	 **********************************/
	
	private static final String RESOURCE_BUNDLE= "org.eclipse.ui.editors.text.TextEditorMessages";
	private static ResourceBundle fgResourceBundle= ResourceBundle.getBundle(RESOURCE_BUNDLE);

	protected void createActions() {
		super.createActions();
			
		IAction a= new TextOperationAction(fgResourceBundle, "ContentAssistProposal.", this, ISourceViewer.CONTENTASSIST_PROPOSALS); 
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("ContentAssistProposal", a); 
		
		a= new TextOperationAction(fgResourceBundle, "ContentAssistTip.", this, ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION); 
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
		setAction("ContentAssistTip", a); 
		
	}


	/**
	 * @return Returns the mcunit.
	 */
	public KermetaUnit getMcunit() {
		return mcunit;
	}
	/**
	 * @param mcunit The mcunit to set.
	 */
	protected void setMcunit(KMTUnit mcunit) {
		this.mcunit = mcunit;
		if (outline != null)
			outline.update();
	}
	
	public void setFocus() {
		super.setFocus();
		
		Iterator it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
		while(it.hasNext())
		{
			KermetaEditorEventListener listener = (KermetaEditorEventListener)it.next();
			listener.unitGotFocus(this);
		}
	}
	
	public fr.irisa.triskell.kermeta.language.structure.Object getFObjectForNode(KermetaASTNode node) {
        
        KermetaASTNode currentNode = node;
        fr.irisa.triskell.kermeta.language.structure.Object result = null;

        
        while (result == null && currentNode != null) {
            
            result = (fr.irisa.triskell.kermeta.language.structure.Object)this.mcunit.getModelElementByNode(currentNode);
            
            currentNode = (KermetaASTNode)currentNode.getParent();
            
        }
        return result;
    }

	
	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	public Unit getUnit() {
		return unit;
	}
	
	public String getFileContent() {
		if ( getSourceViewer() == null )
			return "";
		else if (getSourceViewer().getDocument() != null )
			return getSourceViewer().getDocument().get();
		else
			return "";
	}
	
	public String getSavedContent() {
		return savedContent;
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Accessors		//
	//////////////////////////////////
	//////////////////////////////////
	
	public void updateValue(Object newValue) {
		setMcunit( (KMTUnit) newValue );
	}
	
	@Override
	public void dispose() {
		if ( project == null ) {
			if ( ! savedContent.equals( currentContent ) ) {
				KermetaUnitHelper.unloadAllKermetaUnit();
				KermetaMarkersHelper.clearMarkers(getFile());
				KMTUnit kermetaUnit = null;
				if ( ! savedContent.equals("") )
					kermetaUnit = (KMTUnit) KermetaUnitHelper.typecheckFile( getFile(), savedContent );
				else
					kermetaUnit = (KMTUnit) KermetaUnitHelper.typecheckFile( getFile() );
				KermetaMarkersHelper.createMarkers(getFile(), kermetaUnit);
			}
		} else {
			KermetaUnitHost.getInstance().undeclareInterest(this, unit);
			mcunit = null;
			if ( ! savedContent.equals( currentContent ) ) {
				final Interest interest = this;
				Job job = new Job("Building Workspace") {
					
					public IStatus run(IProgressMonitor monitor) {
			
						KermetaUnitHelper.abortTypechecking( getFile() );
	
						KermetaUnitHelper.unloadAllKermetaUnit();
						//KermetaUnitHelper.unloadKermetaUnit( getMcunit() );
						
						Unit unit = getUnit();
						KermetaUnitHost.getInstance().declareInterest(interest, unit);
						
						HashMap<String, Object> args = new HashMap<String, Object>();
						if ( ! savedContent.equals("") )
							args.put("content", savedContent);
						else
							args.put("forceTypechecking", true);
						
						unit.receiveSynchroneEvent("update", args, monitor);
	
						KermetaUnitHost.getInstance().undeclareInterest(interest, unit);
						return Status.OK_STATUS;
					}
					
				};
				
				job.setPriority(Job.LONG);
				job.setUser(true);
				job.schedule();
				
				if ( PlatformUI.getWorkbench().isClosing() ) {
					try {
						job.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		super.dispose();
	}
	
	@Override
	protected void performSave(boolean overwrite, IProgressMonitor progressMonitor) {
		savedContent = currentContent;
		super.performSave(overwrite, progressMonitor);
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);

		Job job = new Job("Opening File") {
			
			public IStatus run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Waiting for the Outline", 100);
				
					project = KermetaWorkspace.getInstance().getKermetaProject( getFile().getProject() );
					if ( project != null ) {
						monitor.subTask("Initializing Interest");
						initializeInterest();
					} else {
						KermetaUnitHelper.unloadAllKermetaUnit();
						KMTUnit kermetaUnit = (KMTUnit) KermetaUnitHelper.typecheckFile( getFile() );
						setMcunit(kermetaUnit);
						KermetaMarkersHelper.clearMarkers(getFile());
						KermetaMarkersHelper.createMarkers(getFile(), kermetaUnit);
					}
					monitor.worked(100);
				} finally {
					monitor.done();
				}
					return Status.OK_STATUS;
			}
		};
		job.schedule();
		
	}
	
}
