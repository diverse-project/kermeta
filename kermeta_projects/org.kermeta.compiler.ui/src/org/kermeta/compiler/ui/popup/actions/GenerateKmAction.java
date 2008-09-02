

/*$Id: GenerateKmAction.java,v 1.2 2008-09-02 21:57:37 cfaucher Exp $
* Project : org.kermeta.compiler.ui
* File : 	GenerateKmAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 mai 08
* Authors : paco
*/

package org.kermeta.compiler.ui.popup.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

@Deprecated
public class GenerateKmAction implements IActionDelegate, IResourceVisitor {

	private List<IFolder> _folders = new ArrayList<IFolder>();
	
	private List<IFile> _files = new ArrayList<IFile>();
	
	public GenerateKmAction() {
	}

	public void run(IAction action) {
		final GenerateKmAction instance = this;
		Job job = new Job("Generating KM Files") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					// Calculating the list of IFile
					for ( IFolder f : _folders ) {
						try {
							f.accept(instance);
						} catch (CoreException e) {
							e.printStackTrace();
						}	
					}				
					// Starting a task
					monitor.beginTask("", _files.size());
	
					for ( IFile file : _files ) {
						SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 1);
						try {
							subMonitor.beginTask(file.getFullPath().toString(), 1);
							generateKm(file);
							subMonitor.worked(1);
						} catch (Exception e) {
							e.printStackTrace();
							subMonitor.done();
						}
					}
				} finally {
					monitor.done();
					_folders.clear();
					_files.clear();
				}
				return Status.OK_STATUS;
			}
		};
		
		job.schedule();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if ( selection instanceof TreeSelection ) {
			TreeSelection s = (TreeSelection) selection;
			for ( TreePath path : s.getPaths() )
				_folders.add( (IFolder) path.getLastSegment() );
		}
	}

	public boolean visit(IResource resource) throws CoreException {
		boolean goOn = false;
		switch( resource.getType() ) {
		case IResource.FILE :
			IFile file = (IFile) resource;
			if ( file.getFileExtension().equals("kmt") )
				_files.add( file );
			break;
			
		case IResource.FOLDER :
			goOn = true;
			break;
			
		default :
			break;
		}
		return goOn;
	}

	private void generateKm(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		String mergedURI = getURI(file);

		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true);
		try {
			KermetaUnit unit = LoaderPlugin.getDefault().load(uri, options);
			HashSet<KermetaUnit> s = new HashSet<KermetaUnit>();
			s.add(unit);
			s.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(unit) );
			
			Merger merger = new Merger();
			merger.process(s, mergedURI, false, false );	
			
		} catch (Exception e) {
			// We can catch any exception so that the execution will  not stop.
			e.printStackTrace();
		} finally {
			LoaderPlugin.getDefault().unload( mergedURI );			
		}
	}
	
	private String getURI(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		int i = uri.lastIndexOf(".");
		return uri.substring(0, i) + ".km";
	}
	
}


