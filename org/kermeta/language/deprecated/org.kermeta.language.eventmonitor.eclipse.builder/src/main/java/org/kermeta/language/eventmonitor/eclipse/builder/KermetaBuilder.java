/*$Id : $
* Project : org.kermeta.language.eventmonitor.eclipse.builder
* File : 	KermetaBuilder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : 20 juil. 2010
* Authors : Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
*/
package org.kermeta.language.eventmonitor.eclipse.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.kevent.KEventFactory;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.eventmonitor.eclipse.builder.art2.impl.Art2ComponentEventMonitorEclipseBuilder;

//import scala.Option;

public class KermetaBuilder extends IncrementalProjectBuilder {

	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
					mFactory.createDebugMessage("Visit started for building" , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
			//System.out.println("in building");
			IResource resource = delta.getResource();
	        //send events to Kernel Kworkflow ie normalisation with ART
			//send modification events from workspace and send to KWF
			//definition des evenements
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkKermeta(resource);
				//handle 
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
			    checkKermeta(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkKermeta(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "org.kermeta.language.eventmonitor.eclipse.builder.KermetaBuilder";
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	protected KEventFactory evtFactory = KEventFactory.getInstance();
	//private static final String MARKER_TYPE = "org.kermeta.language.eventmonitor.eclipse.builder.xmlProblem";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	void checkKermeta(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".kmt")) {
			/*IFile file = (IFile) resource;
			deleteMarkers(file);
			//handle the ErrorLog service here
			//XMLErrorHandler reporter = new XMLErrorHandler(file);
			try {
				getParser().parse(file.getContents(), reporter);
			} catch (Exception e1) {
			}
			//System.out.println("call parser");
			KParser parser = new KParser();
			//System.out.println("parser created");
			//String s = resource.getLocationURI().toString();
			String s = resource.getLocation().toString();
			//System.out.println("url defined >> "+s);
			String sp = ParserUtil.loadFile(s);
			//System.out.println("parserUtil loaded");
			Option o = parser.parseSynch(sp);
			if (o.isDefined()) System.out.println("parsing succes"); else System.out.println("parsing fail");
			//if (o.exists(null)) System.out.println("object returned by parser exists"); else System.out.println("object returned by parser DOESNT exist");
			//if (o.isEmpty()) System.out.println("called parser fail"); else System.out.println("called parser succes");
*/		
			
			//update(resource.getLocation().toString());
			Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
					mFactory.createInfoMessage("Resource File Change on disk at : " + resource.getLocation().toString() + "an event should be triggered" , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
			KEvent e = evtFactory.createSimpleEvent(resource.getLocation().toString());
			Art2ComponentEventMonitorEclipseBuilder.getDefault().processKEvent(e);
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
}
