

/*$Id: ResourceChangeListener.java,v 1.12 2008-11-19 11:17:50 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	ResourceChangeListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
* 			Didier Vojtisek
*/

package org.kermeta.kpm.internal.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KpmManager;
import org.kermeta.kpm.internal.InternalKpmManager;
import org.kermeta.kpm.preferences.KPMPreferenceHelper;

import fr.irisa.triskell.eclipse.resources.ProjectBuilderHelper;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.string.EscapeChars;

/**
 * This class is used to handle Workspace level events
 * It must do has less as possible concrete work, it should only trigger action so the real work is done in a separate job
 * Projects and resources in projects that have the kpm builder action are handled separately (in KpmBuilderDeltaVisitor)
 * The role of this changelistener is to make sure that if we have some editor interested in the modified files, they will be triggered
 * additionnaly, it will update the kpm file in order to 
 */
public class WorkspaceResourceChangeListener implements IResourceChangeListener, IResourceDeltaVisitor {

	protected boolean needKpmSave = false;
	
	
	public void resourceChanged(IResourceChangeEvent event) {

		// Visiting the delta so every changes in the delta will be processed.
		if ( event.getDelta() != null ){
			final IResourceChangeEvent ev = event;
			final WorkspaceResourceChangeListener visitor = this;
			
			// check if there is something that might be done, otherwise do nothing, not event create a thread ...
			if(!hasResourceToProcess(event.getDelta())) 
				return;
			WorkspaceJob job = new WorkspaceJob("KPM inspecting changes of " + event.getDelta().getResource().getName()) {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException { 
					try {	
						KpmManager.getDefault().getKPMLock().acquire();
						ev.getDelta().accept(visitor);

						if(needKpmSave){
							KpmManager.getDefault().save();
							needKpmSave = false;
						}
					} catch (CoreException e) {
						KPMPlugin.logErrorMessage("Failed to process event delta", e);
					}
					finally {
						KpmManager.getDefault().getKPMLock().release();
					}
					return Status.OK_STATUS;
				}

			};
			//job.setRule(delta.getResource().getProject());
			
			
			job.schedule();
		}


	}

	protected boolean hasResourceToProcess(IResourceDelta delta) {
		
		for(String pattern : KPMPreferenceHelper.getIncludedFilePatterns()){
			if(delta.getResource().getName().matches(EscapeChars.forSimpleRegex(pattern)))
				return true;
		}
		IResourceDelta[] children =delta.getAffectedChildren();
		for (int i = 0; i < children.length; i++) {
			if(hasResourceToProcess(children[i]))
				return true;
		}
		return false;
	}
	
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		// Flag stating whether to continue the visit or not.
		boolean processResourceChildren = true;
		switch( delta.getResource().getType() ) {		
		// Only handling project changes.
		case IResource.PROJECT :
			handleProject(delta);
			IProject project = (IProject) delta.getResource();
			processResourceChildren = project.isOpen();
			break;

		case IResource.FILE :
			handleFile( delta );
			processResourceChildren = false;
			break;
			
		case IResource.FOLDER :
			// nothing to do with folder
			processResourceChildren = true;
			break;
			
		default :
			break;
		}
		return processResourceChildren;
	}
	
	/**
	 * Add or remove units coming from a project.
	 * @param delta
	 * @returns true if we should continue to process the project children in the delta
	 */
	private boolean handleProject(final IResourceDelta delta) {
		switch( delta.getKind() ) {
		case IResourceDelta.ADDED :
			// nothing to do
			break;
		case IResourceDelta.REMOVED :
			// TODO must remove all related entries in kpm file
			break;
		default :
			// TODO what is the event for closing/opening a project ?
			break;
		}
		return true;
	}
		//_projectChangeKind = delta.getKind();	
	/*	WorkspaceJob job = new WorkspaceJob("KPM inspecting changes of " + delta.getResource().getName()) {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				if ( delta.getKind() == IResourceDelta.ADDED ) {
					if(delta.getResource().isAccessible()){
						// Project addition, let's add a builder to it.
						ProjectVisitor v = new ProjectVisitor();
						delta.getResource().accept(v);
					}
					else{
						KPMPlugin.internalLog.debug("ResourceChangeListener ignoring addition of closed project " + delta.getResource().getName());
						// DVK note, this is because it may be created, but creation will create a closed project, it may be opened later ...
					}
				} else if ( delta.getKind() == IResourceDelta.REMOVED ) {
					// Project deletion, let's remove any units coming from that project.
					KpmBuilderDeltaVisitor v = new KpmBuilderDeltaVisitor(InternalKpmManager.getDefault().getKpm(), monitor);
					delta.accept(v);
				} 
				return Status.OK_STATUS;
			}
		};
		// reserves exclusive write access to the resource we are updating by associating a scheduling rule with the job
		//job.setRule(IWorkspace.getRuleFactory().buildRule());
		//job.setRule(delta.getResource());
		//job.setRule(delta.getResource().getWorkspace().getRoot());
		//Must reserve the whole workspace in case the change need it  
		// DVK: maybe an analysis of the resource kind  may allow  a finer grain ?
		job.setRule(delta.getResource().getWorkspace().getRuleFactory().buildRule());
		//job.setRule(delta.getResource()); 
		//job.setRule(delta.getResource().getProject());
		job.schedule();
		return true;
	}
	*/
	private void handleFile(final IResourceDelta delta) throws CoreException {
		// handle only files that are not in a project with kpmBuilder action
		IProject project = delta.getResource().getProject();
		if(!ProjectBuilderHelper.doesProjectHaveBuilder(project, KpmProjectBuilder.ID)){
			String name = "platform:/resource" + delta.getResource().getFullPath().toString();
			Unit kpmUnit = KpmManager.getDefault().getKpm().getUnit(name);
			
			switch( delta.getKind() ) {
			case IResourceDelta.ADDED :
				// there is no way that this new resource is known by an existing kpm file, so ignore the addition
				// DVK except in the case where the unit is require by a faulty kmt, adding this unit: fixes the faulty kmt ...
				//    in order to enable this scenario, we need to create unit even for non existing files
				//			but then the question is how to remove such ghost unit ...
				break;
			case IResourceDelta.REMOVED :
				// must remove entries in kpm file				
				needKpmSave = needKpmSave || InternalKpmManager.getDefault().getKpm().removeUnit(name);
				break;			
			case IResourceDelta.CHANGED :
				// if this file was used by another that is declared in kpm or if an editor is listening it, then send an event to compile it
				int flags = delta.getFlags();
				// get only changes that affect the content of the file (otherwise markers changes will generate an infinite loop
			    if (((flags & IResourceDelta.CONTENT) != 0) ||
			    		((flags & IResourceDelta.REPLACED) != 0))	{			            
			    	if(kpmUnit != null)
						EventDispatcher.sendEvent(kpmUnit, "update", null, new NullProgressMonitor());
			    }
			    //else {
			    //	System.out.println("--> ignored change");
			    //}

				break;
			default :
				// TODO what is the event for closing/opening a project ?
				if(kpmUnit != null)
					delta.getKind();
				break;
			}
		}
	}
	
	/* *
	 * When the .project file is modified, we cannot be sure that the KPM builder is still present.
	 * So to be sure, we call the ProjectVisitor to add a new builder if necessary.
	 * @param file
	 * @throws CoreException 
	 */
/*	private void handleFile(final IFile file) throws CoreException {
		// Do not handle the change of the .project file if the project is being removed.
		if ( file.getFileExtension().equals("project") && _projectChangeKind != IResourceDelta.REMOVED ) {
			// Do it in a job because it will provoke a change in the workspace.
			WorkspaceJob job = new WorkspaceJob("Add KPM builder to " + file.getProject().getFullPath().toString()) {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
					ProjectVisitor v = new ProjectVisitor();
					file.getProject().accept(v);
					return Status.OK_STATUS;
				}
			};
			job.setRule(file.getWorkspace().getRoot());
			//job.setRule(file.getProject()); 
			job.schedule();
		}
	} */

}


