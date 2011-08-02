/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.builder.eclipse.internal;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.eclipse.ResourceHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.reference.FileReference;
import org.osgi.framework.Bundle;

public class KPBuilder {
	
	protected KermetaCompiler compiler = null;
	protected IFile kpProjectFile;
	
	protected KPNeedBuildDeltaVisitor needBuildVisitor;
	
	public ModelingUnit kp_last_modelingunit = null;
	public HashMap<String,KPFilesContainer> kpFiles = new HashMap<String,KPFilesContainer>();	
	
	private String outputResourceFolder;
	private String outputFolder;
	private String kpFileURL;
	
	public KPBuilder(IFile kpProjectFile) {
		super();
		this.kpProjectFile = kpProjectFile;
		needBuildVisitor = new KPNeedBuildDeltaVisitor(kpProjectFile);
		//FileHelpers.
		kpFileURL = kpProjectFile.getRawLocation().toString();
		File f = new File(kpFileURL);
		try {
			String projectUri = f.getParentFile().getCanonicalPath();
			outputFolder = projectUri+"/target";
			outputResourceFolder = outputFolder+"/resources";
			compiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(),true,outputFolder, true, true, false);
			refreshFileIndex();
		} catch (IOException e) {
			Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR,"KPBuilder initialization failed", this.getClass().getName(), e);
		}
	}


	public boolean isBuildNeeded(IResourceDelta delta){
		needBuildVisitor.setBuildNeeded(false);
		try {
			delta.accept(needBuildVisitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return needBuildVisitor.isBuildNeeded();
	}

	
	public void conditionalBuild(IResourceDelta delta){
		if(isBuildNeeded(delta)){
			Job job = new Job("Kermeta builder job") {
				protected IStatus run(IProgressMonitor monitor) {
					compile();
					return Status.OK_STATUS;
				}
			};
		    job.setPriority(Job.LONG);
		    job.schedule(); // start as soon as possibl
		}
	}
	
	synchronized public void compile(){
		try {		
			ArrayList<String> additionalCalssPath = new ArrayList<String>();		
			
			// for reflexivity set the bundle context
			ModelingUnit result = compiler.kp2bytecode(kpFileURL,getDirtyFiles(),outputFolder,outputFolder,outputResourceFolder, additionalCalssPath,true);
			if (result != null) {
				kp_last_modelingunit = result;
			}
			kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (Exception e) {
			try {
				Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Compilation failed : "+e.getMessage(), KermetaBuilder.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
			} catch (Exception f) {
				e.printStackTrace();
			}
		}
	}


	private HashMap<URL,ModelingUnit> getDirtyFiles() {
		HashMap<URL,ModelingUnit> dirtyFiles = new HashMap<URL,ModelingUnit>();
		for (KPFilesContainer aKPFilesContainer : this.kpFiles.values()) {
			dirtyFiles.put(aKPFilesContainer.filePath, aKPFilesContainer.modelingUnit);
		}
		
		return dirtyFiles;
	}

	synchronized public void build(boolean andRun){
		try {		
			ArrayList<String> additionalClassPath = new ArrayList<String>();

			findBundleLocationForClassPath("org.kermeta.scala.scala-library", additionalClassPath);
			findBundleLocationForClassPath("org.kermeta.language.library.core", additionalClassPath);
			findBundleLocationForClassPath("org.eclipse.emf.common", additionalClassPath);
			findBundleLocationForClassPath("org.eclipse.emf.ecore", additionalClassPath);
			findBundleLocationForClassPath("org.eclipse.emf.ecore.xmi", additionalClassPath);
			findBundleLocationForClassPath("org.kermeta.language.model", additionalClassPath);

			ModelingUnit result = compiler.kp2bytecode(kpFileURL,getDirtyFiles(),outputFolder,outputFolder,outputResourceFolder,additionalClassPath,false);
			if (result != null) {
				kp_last_modelingunit = result;
				kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
				if (andRun) {
					ArrayList<String> params = new ArrayList<String>();
					params.add("toto");
					compiler.runK2Program(additionalClassPath, params);
				}
			}
		} catch (Exception e) {
			try {
				Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Build failed : "+e.getMessage(), KermetaBuilder.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
			} catch (Exception f) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void build(){
		build(false);
	}


	private void findBundleLocationForClassPath(String bundleSymbolicName, ArrayList<String> additionalClassPath) {
		try {
			StringBuffer thePath = new StringBuffer(FileLocator.resolve(Platform.getBundle(bundleSymbolicName).getEntry("/")).getFile());
			thePath = thePath.replace(thePath.length()-2, thePath.length(), "");
			File theFile = new File(new URI(thePath.toString().replaceAll(" ", "%20")));
			if (theFile!=null) {
				additionalClassPath.add(theFile.getAbsolutePath());
			}
		} catch (Exception e) {
			
		}
	}
	
	/**
	 * This operation refresh the files to compile.
	 * @throws IOException
	 */
	public void refreshFileIndex() throws IOException {
		ArrayList<URL> kpSources = compiler.getSources(kpFileURL);
		//This list allow to preserve old files ever parsed
		HashMap<String,KPFilesContainer> oldKpFiles = kpFiles;
		kpFiles = new HashMap<String, KPFilesContainer>();
		for (URL uneSource : kpSources) {
			KPFilesContainer container = new KPFilesContainer(uneSource, false, null);
			IFile resource = ResourceHelpers.getIFile(uneSource.toString());
			if (resource != null) {
				//Adding new files only
				if (oldKpFiles.get(KermetaBuilder.getDefault().generateIdentifier(resource)) != null) {
					kpFiles.put(KermetaBuilder.getDefault().generateIdentifier(resource),oldKpFiles.get(KermetaBuilder.getDefault().generateIdentifier(resource)));
				} else {
					kpFiles.put(KermetaBuilder.getDefault().generateIdentifier(resource),container);
				}
			}
		}
	}
	
	public IFile getKpProjectFile() {
		return kpProjectFile;
	}
	
	public String getKpFileURL() {
		return kpFileURL;
	}
}
