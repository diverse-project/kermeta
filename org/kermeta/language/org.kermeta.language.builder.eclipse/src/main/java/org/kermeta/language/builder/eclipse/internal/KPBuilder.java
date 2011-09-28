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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.KermetaRunner;
import org.kermeta.kp.compiler.commandline.KpVariableExpander;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;
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
			outputFolder = projectUri+File.separatorChar+"target";
			outputResourceFolder = outputFolder+"/resources";
			//compiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(),false,outputFolder, true, true, false);
			compiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(), new LocalFileConverterForEclipse(),true,outputFolder, true, true, false);
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
			Activator.getDefault().getMessaggingSystem().initProgress(KermetaBuilder.LOG_MESSAGE_GROUP, "Starting km generation of "+kpFileURL, KermetaBuilder.LOG_MESSAGE_GROUP, 0);
			// for reflexivity set the bundle context
			ModelingUnit result = compiler.kp2bytecode(kpFileURL,getDirtyFiles(),outputFolder,outputFolder,outputResourceFolder, additionalCalssPath,true);
			if (result != null) {
				kp_last_modelingunit = result;
			}
			kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (Exception e) {
			try {
				Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Compilation failed : "+(e.getMessage()!= null ? e.getMessage() : e.toString()), 
						KermetaBuilder.LOG_MESSAGE_GROUP, 
						e, 
						new FileReference(FileHelpers.StringToURL(kpFileURL)));
			} catch (Exception f) {
				e.printStackTrace();
			}
		}
		Activator.getDefault().getMessaggingSystem().doneProgress(KermetaBuilder.LOG_MESSAGE_GROUP, "End of km generation for "+kpFileURL, KermetaBuilder.LOG_MESSAGE_GROUP);
	}


	private HashMap<URL,ModelingUnit> getDirtyFiles() {
		HashMap<URL,ModelingUnit> dirtyFiles = new HashMap<URL,ModelingUnit>();
		for (KPFilesContainer aKPFilesContainer : this.kpFiles.values()) {
			dirtyFiles.put(aKPFilesContainer.filePath, aKPFilesContainer.modelingUnit);
		}
		
		return dirtyFiles;
	}

	synchronized private long getOldestTimeStamp(IResource theCurrent, long currentTimeStamp) throws CoreException {
		long result = currentTimeStamp;
		if (theCurrent instanceof IContainer) {
			for (IResource aResource : ((IContainer)theCurrent).members()) {
				long temp = getOldestTimeStamp(aResource, result);
				if (temp < result || result == -1) {
					result = temp;
				}
			}
		} else {
			long temp = theCurrent.getLocalTimeStamp();
			if (result == -1) {
				result = temp;
			} else {
				result = (result < temp)?result:temp;
			}
		}
		return result;		
	}
	
	synchronized private boolean checkIfBuildIsNeeded() {
		try {
			if (kp_last_modelingunit == null) {
				return true;
			}
			
			long timeStampOfClasses = 0;

			IResource theConcernedPath = kpProjectFile.getParent().findMember(File.separatorChar+"target"+File.separatorChar+"classes"+File.separatorChar);
			if (theConcernedPath != null) {
				if (theConcernedPath instanceof IFolder) {
					theConcernedPath.refreshLocal(IResource.DEPTH_INFINITE, null);
					timeStampOfClasses = getOldestTimeStamp(theConcernedPath, -1);
				}
			}
			
			if (timeStampOfClasses == 0) {
				return true;
			}
			
			if (timeStampOfClasses <= kpProjectFile.getLocalTimeStamp()) {
				return true;
			}
			
			ArrayList<URL> theSources = compiler.getSources(kpFileURL);
			for (URL oneURL : theSources) {
				IFile theFile = ResourceHelpers.getIFile(oneURL.toString());
				if (theFile != null) {
					if (theFile.getLocalTimeStamp() > timeStampOfClasses) {
						return true;
					}
				}
			}
			
			
		} catch (Exception e) {
			return true;
		}
		
		return false;
		
	}
	
	synchronized public void build(boolean andRun, ArrayList<String> params){
		try {		
			boolean isBuildNeeded = !andRun;
			
			if (andRun) {
				isBuildNeeded = checkIfBuildIsNeeded();
			}
			
			ArrayList<String> additionalClassPath = new ArrayList<String>();
			
			findBundleLocationForClassPath("org.kermeta.scala.scala-library", additionalClassPath);
			findBundleLocationForClassPath("org.kermeta.language.library.core", additionalClassPath);
			findBundleLocationForClassPath("org.kermeta.utils.systemservices.api", additionalClassPath);
			findBundleLocationForClassPath("org.eclipse.emf.common", additionalClassPath);
			findBundleLocationForClassPath("org.eclipse.emf.ecore", additionalClassPath);
			findBundleLocationForClassPath("org.eclipse.emf.ecore.xmi", additionalClassPath);
			findBundleLocationForClassPath("org.kermeta.language.model", additionalClassPath);
			
			// add resolvable kp depencies in classpath
			KpLoaderImpl ldr = new KpLoaderImpl();
			
			// Load KP file
			KermetaProject kp = ldr.loadKp(kpFileURL);
			ArrayList<String> fullClassPath = new ArrayList<String>();
			fullClassPath.addAll(additionalClassPath);
			fullClassPath.addAll(compiler.getBinaryDependencyClasspath(kp, new KpVariableExpander(kpFileURL)));
			
			ModelingUnit result = null;
			
			if (isBuildNeeded) {
	
				result = compiler.kp2bytecode(kpFileURL,new HashMap<URL, ModelingUnit>(),outputFolder,outputFolder,outputResourceFolder,additionalClassPath,false);
				
				// generate urimap file
				// TODO may be we can do that in background because we may have to update it if the user has opened or closed some projects
				generateURIMapFile(outputFolder);
				
				if (result != null) {
					kp_last_modelingunit = result;
					kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
					// copy resources to classes folder in order to ease the run ...
					IPath destFolder = kpProjectFile.getProject().findMember("target/classes").getFullPath();
					for ( IResource res : ((IFolder)(kpProjectFile.getProject().findMember("target/resources"))).members()){
						res.copy(destFolder.append("/"+res.getName()), true, new NullProgressMonitor());
					}					
				}
			}
			if (andRun) {
				//k2.io.StdIO._messagingSystem_$eq(Activator.getDefault().getMessaggingSystem4Runner(kp.getName()));
				/* k2.io.StdIO$.MODULE$.messagingSystem_$eq(Activator.getDefault().getMessaggingSystem4Runner(kp.getName()));
				Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).info("console test", "aGroup");
				k2.io.StdIO$.MODULE$.writeln("test message");*/
				
				
				
				
				KermetaRunner runner = new KermetaRunner(outputFolder+File.separator+"classes", kp.getGroup()+"."+kp.getName(),fullClassPath,Activator.getDefault().getMessaggingSystem4Runner(kp.getName()) );
				if (isBuildNeeded && result == null) {
					Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).error("Error in build, cannot run "+kpFileURL, this.getClass().getName());
				}
				else{
					runner.runK2Program(params,outputFolder+File.separator+"urimap.properties");
				}
				
			}
		} catch (Exception e) {
			try {
				Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Build failed : "+(e.getMessage()!= null ? e.getMessage() : e.toString()), 
						KermetaBuilder.LOG_MESSAGE_GROUP, 
						e,
						new FileReference(FileHelpers.StringToURL(kpFileURL)));
			} catch (Exception f) {
				e.printStackTrace();
			}
		}
	}
	
	private void generateURIMapFile(String outputFolder) {
		String localProgressGroup = getProgressGroup()+".generateURIMapFile";
		Properties props = new Properties();
		// fill map
		Activator.getDefault().getMessaggingSystem().initProgress(localProgressGroup, 
				"Generating urimap.properties...",  
				KermetaBuilder.LOG_MESSAGE_GROUP,
				3);
		Activator.getDefault().getMessaggingSystem().progress(localProgressGroup, "Retreiving workbench projects...", KermetaBuilder.LOG_MESSAGE_GROUP, 0);
		for( IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			String key = "platform:/resource"+project.getFullPath().toString();
			String value = project.getLocationURI().toString();
			props.put(key, value);
		}
		Activator.getDefault().getMessaggingSystem().progress(localProgressGroup, "Retreiving platform plugins...", KermetaBuilder.LOG_MESSAGE_GROUP, 0);
		for(Bundle bundle : Activator.getDefault().getMyContext().getBundles()){
			
			String key = "platform:/plugin/"+bundle.getSymbolicName()+"/";
			// String value = new LocalFileConverterForEclipse().convertSpecialURItoFileURI(java.net.URI.create(key)).toString();
			String value;
			try {
				//value = FileLocator.toFileURL(new java.net.URL(key)).toString();
				URL resolvedURL = Platform.resolve(new java.net.URL(key));
				value = resolvedURL.toString();
				props.put(key, value);
			} catch (Exception e) {
				Activator.getDefault().getMessaggingSystem().error("cannot find local file for bundle "+bundle.getSymbolicName(), KermetaBuilder.LOG_MESSAGE_GROUP, e);
			}
			
		}
		
		Activator.getDefault().getMessaggingSystem().progress(localProgressGroup, "Saving property file...", KermetaBuilder.LOG_MESSAGE_GROUP, 1);		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(outputFolder+File.separator+"urimap.properties");
			props.store(fos, "Simulating resolution of eclipse workbench URIs resolution using URI map translation");
			fos.close();
		} catch (Exception e) {
			Activator.getDefault().getMessaggingSystem().error("cannot generate "+outputFolder+File.separator+"urimap.properties", KermetaBuilder.LOG_MESSAGE_GROUP, e);
		}
		Activator.getDefault().getMessaggingSystem().doneProgress(localProgressGroup, "End of urimap.properties generation", KermetaBuilder.LOG_MESSAGE_GROUP);
	}


	synchronized public void build(){
		build(false, new ArrayList<String>());
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
	
	public String getDefaultMainClass(){
		KpLoaderImpl ldr = new KpLoaderImpl();
		if (ldr != null) {
			KermetaProject kp = ldr.loadKp(kpFileURL);
			if (kp != null) {
				return kp.getDefaultMainClass();
			}
		}
		return "";
	}
	
	public String getDefaultMainOperation(){
		KpLoaderImpl ldr = new KpLoaderImpl();
		if (ldr != null) {
			KermetaProject kp = ldr.loadKp(kpFileURL);
			if (kp != null) {
				return kp.getDefaultMainOperation();
			}
		}
		return "";
	}
	
	public String getProgressGroup(){
		return "KPBuilder"+this.hashCode();
	}
}
