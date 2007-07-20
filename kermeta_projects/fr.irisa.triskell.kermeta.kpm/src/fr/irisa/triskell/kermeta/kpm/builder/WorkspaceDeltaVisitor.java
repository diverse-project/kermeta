/*$Id: WorkspaceDeltaVisitor.java,v 1.9 2007-07-20 15:08:48 ftanguy Exp $
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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
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

public class WorkspaceDeltaVisitor implements IResourceDeltaVisitor, Interest {
	
	
	private KermetaProject currentProject;
	private ArrayList<KermetaProject> projectsToOpen;
	
	
	class EventToDispatch {
		
		private Unit unit = null;
		private String event = "";
		
		public EventToDispatch(Unit unit, String event) {
			this.unit = unit;
			this.event = event;
		}
		
		public String getEvent() {
			return event;
		}
		
		public Unit getUnit() {
			return unit;
		}
		
	};
	
	
	public WorkspaceDeltaVisitor(ArrayList<KermetaProject> projectsToOpen) {
		this.projectsToOpen = projectsToOpen;
	}
	
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( delta.getKind() ) {
		
		case IResourceDelta.ADDED :
			mustContinue = processAdding (delta.getResource() );
			break;
			
		case IResourceDelta.CHANGED :
			mustContinue = processChanging( delta.getResource() );
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
			//if ( (resource.getFileExtension() != null) && resource.getFileExtension().equals("kmt") ) {
				final Unit unit = KPMHelper.getOrCreateUnit(currentProject.getKpm(), resource.getFullPath().toString());
				currentProject.save();
				/*KPMHelper.addCloseDependencyOnKMTFile(currentProject.getKpm(), unit);
				KPMHelper.addOpenDependencyOnKMTFile(currentProject.getKpm(), unit);
				KPMHelper.addUpdateDependencyOnKMTFile(currentProject.getKpm(), unit);*/
				KPMHelper.addRules(currentProject.getKpm(), unit);
				events.add( new EventToDispatch(unit, "update") );
				//sendEvent("update", unit);
	    		/*KermetaUnitHost.getInstance().declareInterest(this, unit);
	    		unit.receiveSynchroneEvent("update", null, new NullProgressMonitor() );
	    		KermetaUnitHost.getInstance().undeclareInterest(this, unit);*/
				
			//}
			break;
			
		case IResource.FOLDER :
			break;
			
		case IResource.PROJECT :
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
	
	private boolean processChanging(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
			
		case IResource.PROJECT :
			if ( NatureHelper.doesProjectHaveNature( (IProject) resource, KermetaNature.ID ) ) { 
				currentProject = KermetaWorkspace.getInstance().getKermetaProject( (IProject) resource);
			} else mustContinue = false;
			break;
			
		case IResource.FILE :
			IFile file = (IFile) resource;
			
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
				 * 
				 */
				boolean mustBeUpdated = false;
				if ( file.getLocalTimeStamp() != unit.getLastTimeModified().getTime() )
					mustBeUpdated = true;
				
				if ( mustBeUpdated )
					events.add( new EventToDispatch(unit, "update") );
		//			unit.receiveAsynchroneEvent("update", null, null);
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
				unit.receiveAsynchroneEvent("delete", null, null);
				//sendEvent("delete", unit);
				currentProject.getKpm().removeUnit( resource.getFullPath().toString() );
				currentProject.save();
				IOPlugin.getDefault().unload( (IFile) resource );
			}
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}


	public void updateValue(Object newValue) {}
	
	public void dispatchEvents() {
		
		final Interest interest = this;
		
		Runnable runnable = new Runnable() {

			public void run() {

			    IWorkspaceRunnable runnable= new IWorkspaceRunnable() {
			    	public void run(IProgressMonitor monitor) throws CoreException {
			    	
			    		Iterator <EventToDispatch> iterator = events.iterator();
			    		while ( iterator.hasNext() ) {
			    			EventToDispatch event = iterator.next();
			    			KermetaUnitHost.getInstance().declareInterest(interest, event.getUnit());
			    			event.getUnit().receiveSynchroneEvent(event.getEvent(), null, new NullProgressMonitor() );			    			
			    			KermetaUnitHost.getInstance().undeclareInterest(interest, event.getUnit());
			    		}
			    		
			    	}
			    };
			    try {
					ResourcesPlugin.getWorkspace().run(runnable, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t = new Thread(runnable);
		t.start();
		
	}
	
/*	private void sendEvent(final String event, final Unit unit) {
		final Interest interest = this;
		Runnable runnable = new Runnable() {

			public void run() {

			    IWorkspaceRunnable runnable= new IWorkspaceRunnable() {
			    	public void run(IProgressMonitor monitor) throws CoreException {
			    		KermetaUnitHost.getInstance().declareInterest(interest, unit);
			    		unit.receiveSynchroneEvent(event, null, new NullProgressMonitor() );
			    		KermetaUnitHost.getInstance().undeclareInterest(interest, unit);
			    	}
			    };
			    try {
					ResourcesPlugin.getWorkspace().run(runnable, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			
		};

		Thread t = new Thread(runnable);
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}*/
	
}
