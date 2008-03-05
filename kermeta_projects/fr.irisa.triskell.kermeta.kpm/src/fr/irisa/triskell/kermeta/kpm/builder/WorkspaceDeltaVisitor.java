/*$Id: WorkspaceDeltaVisitor.java,v 1.17 2008-03-05 08:09:54 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaNature;


/**
 * This visitor is used to perform specific actions when the workspace has changed.
 * 
 * For the moment, the adding of kmt file, the adding and removing of kermeta project are handled.
 * 
 * @author paco
 *
 */

public class WorkspaceDeltaVisitor implements IResourceDeltaVisitor {
	
	/**		The current Kermeta project being processed.	*/
	private KermetaProject currentProject;
	
	/**		A list of Kermeta project to be received an open event.		*/
	private ArrayList<KermetaProject> projectsToOpen;
	
	
	/**
	 * 
	 * That class represents an event to be sent.
	 * 
	 * @author paco
	 *
	 */
	class EventToDispatch {
		
		/**		The file that has changed.		*/
		private IFile file = null;
		/**		The unit corresponding to the file.		*/
		private Unit unit = null;
		/**		The kind of event to send to the unit.		*/
		private String event = "";
		
		public EventToDispatch(IFile file, Unit unit, String event) {
			this.file = file;
			this.unit = unit;
			this.event = event;
		}
		
		public IFile getFile() {
			return file;
		}
		
		public String getEvent() {
			return event;
		}
		
		public Unit getUnit() {
			return unit;
		}
		
	};
	
	/**
	 * 
	 * @param projectsToOpen A list of Kermeta projects to fill for opening events.
	 */
	public WorkspaceDeltaVisitor(ArrayList<KermetaProject> projectsToOpen) {
		this.projectsToOpen = projectsToOpen;
	}
	
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		boolean mustContinue = true;
		
		/*
		 * 
		 * Depending on the change, just redirect the change handling part into specific methods.
		 * 
		 */
		switch ( delta.getKind() ) {
		
		case IResourceDelta.ADDED :
			mustContinue = processAdding (delta.getResource() );
			break;
			
		case IResourceDelta.CHANGED :
			mustContinue = processChanging( delta );
			break;

		case IResourceDelta.REMOVED :
			mustContinue = processRemoving( delta.getResource() );
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}

	private List <EventToDispatch> events = new ArrayList <EventToDispatch> ();
	
	private boolean processAdding(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE:
			/*
			 * 
			 * A file has been created into the workspace. Let's create a unit for it, add some rules, and finally send an update event
			 * to typecheck the file if needed.
			 * 
			 */
			Unit unit = KPMHelper.getOrCreateUnit(currentProject.getKpm(), resource.getFullPath().toString());
			currentProject.save();
			KPMHelper.addRules(currentProject.getKpm(), unit);
			if ( ! projectsToOpen.contains(currentProject) && ! unit.getValue().matches(".+/\\.bin/.+") )
				events.add( new EventToDispatch( (IFile)resource, unit, "update") );
			break;
			
		case IResource.FOLDER :
			/*
			 * 
			 * No actions have been created for folders; So just do nothing, continue the visit.
			 * 
			 */
			break;
			
		case IResource.PROJECT :
			/*
			 * 
			 * A new project has been created (or has been reopened). We need to create a new Kermeta project for it and to open it.
			 * 
			 */
			if ( NatureHelper.doesProjectHaveNature( (IProject) resource, KermetaNature.ID ) ) { 
				currentProject = KermetaWorkspace.getInstance().addKermetaProject( (IProject) resource );
				projectsToOpen.add(currentProject);
				currentProject.save();
			} else mustContinue = false;
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}
	
	private boolean processChanging(IResourceDelta delta) throws CoreException {
		
		boolean mustContinue = true;
		IResource resource = delta.getResource();
				
		switch ( resource.getType() ) {
			
		case IResource.PROJECT :
			/*
			 * 
			 * Getting the current Kermeta project.
			 * 
			 */
			if ( NatureHelper.doesProjectHaveNature( (IProject) resource, KermetaNature.ID ) ) { 
				currentProject = KermetaWorkspace.getInstance().getKermetaProject( (IProject) resource);
			} else mustContinue = false;
			break;
			
		case IResource.FILE :
			
			IFile file = (IFile) resource;
			
			/*
			 * 
			 * We must be in a kermeta project.
			 * 
			 */
			if ( currentProject != null ) {
				
				/*
				 * 
				 * If the file is the kpm file of the project, we reload it.
				 * 
				 */
				if ( file.equals(currentProject.getKpmIFile()) ) {
					
					currentProject.reinitialize();
					KPMHelper.addRulesForAll( currentProject.getKpm() );
					
				} else {
				
					Unit unit = currentProject.getKpm().findUnit( file.getFullPath().toString() );
				
					/*
					 * 
					 * Must unit be updated ?
					 * 
					 */
					boolean mustBeUpdated = false;
					if ( unit != null && file.getLocalTimeStamp() != unit.getLastTimeModified().getTime() )
						mustBeUpdated = true;
					
					if ( mustBeUpdated )
						// Pay attention not to send events to some units corresponding to files that are in the bin directory of the project.
						if ( ! unit.getValue().matches(".+/\\.bin/.+") )
							events.add( new EventToDispatch( (IFile)resource, unit, "update") );
				}
			}
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}
	
	private boolean processRemoving(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
			
		case IResource.PROJECT :
			currentProject = KermetaWorkspace.getInstance().getKermetaProject( (IProject) resource);
			if ( currentProject != null ) {
				Unit unit = currentProject.getKpm().findUnit( resource.getFullPath().toString() );
				unit.receiveAsynchroneEvent("close", null, null);
				//sendEvent("delete", unit);
				KermetaWorkspace.getInstance().removeKermetaProject( (IProject) resource );
				mustContinue = false;
			}
			break;
			
		case IResource.FILE :
			currentProject = KermetaWorkspace.getInstance().getKermetaProject( resource.getProject() );
			if ( currentProject != null ) {
				Unit unit = currentProject.getKpm().findUnit( resource.getFullPath().toString() );
				if ( resource.getName().matches("\\.project\\.kpm") ) {
					currentProject.reinitialize();
				} else if ( unit != null ) {
					unit.receiveAsynchroneEvent("delete", null, null);
					//sendEvent("delete", unit);
					currentProject.getKpm().removeUnit( resource.getFullPath().toString() );
					currentProject.save();
					IOPlugin.getDefault().unload( (IFile) resource );
				}
			}
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}

	/**
	 * 
	 *	Send the events created during the changes' delta processing.
	 * 
	 */
	public void dispatchEvents() {

		/*
		 * 
		 * Use a job to get a monitor.
		 * 
		 * IMPORTANT : Use of a IWorkspaceRunnable to generate one delta if some events modifies the workspace.
		 * Otherwise some loop can appear here, because changing produces changing and so on. So here, only change will be produced.
		 * 
		 */
		
		
		Job job = new Job("Dispatching Events") {
			@Override
			public IStatus run(IProgressMonitor monitor) {

			    IWorkspaceRunnable runnable= new IWorkspaceRunnable() {
			    	public void run(IProgressMonitor monitor) throws CoreException {
					    	
			    		Iterator <EventToDispatch> iterator = events.iterator();
			    		while ( iterator.hasNext() ) {
			    			EventToDispatch event = iterator.next();
			    			event.getUnit().receiveSynchroneEvent(event.getEvent(), null, monitor );			    			
			    		}
					    		
			    	}
			    };
				  
			    try {
					ResourcesPlugin.getWorkspace().run(runnable, monitor);
				} catch (CoreException e) {
					e.printStackTrace();
				}

				return Status.OK_STATUS;
			}
		};
		
		job.schedule();
		
	}
	
}
