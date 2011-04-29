/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.eclipse.builder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

public class KPBuilder {
	protected IFile kpProjectFile;
	
	protected KPNeedBuildDeltaVisitor needBuildVisitor;
	
	public KPBuilder(IFile kpProjectFile) {
		super();
		this.kpProjectFile = kpProjectFile;
		needBuildVisitor = new KPNeedBuildDeltaVisitor(kpProjectFile);
	}


	public boolean isBuildNeeded(IResourceDelta delta){
		needBuildVisitor.setBuildNeeded(false);
		try {
			delta.accept(needBuildVisitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return needBuildVisitor.isBuildNeeded();
	}

	
	public void conditionalBuild(IResourceDelta delta){
		if(isBuildNeeded(delta)){
			build();
		}
	}
	synchronized public void build(){
		Job job = new Job("Kermeta builder job for "+kpProjectFile.getRawLocation()) {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					// currently don't know how to selectively put and flush markers, need to find a way to create dynamically markers or add an attribute in it ?
					// or calculate where the marker may be put and remove only those ones ?
					String kpFileURL = kpProjectFile.getRawLocation().toString();
					File f = new File(kpFileURL);
					String projectUri = f.getParentFile().getCanonicalPath();
					String outputFolder = projectUri+"/target";
					KermetaCompiler compiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(), true,outputFolder );
					Activator.getDefault().getMessaggingSystem().flushAllProblems(FileHelpers.StringToURL(kpFileURL));				
					compiler.kp2bytecode(kpFileURL, outputFolder,outputFolder, new ArrayList<String>(),true);
				} catch (IOException e) {
					Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR,"builder failed", this.getClass().getName(), e);
				}
				return Status.OK_STATUS;
	        }
	    };
	    job.setPriority(Job.LONG);
	    job.schedule(); // start as soon as possible
	}


	public void refreshFileIndex() {
		needBuildVisitor.refreshFileIndex();
	}
}
