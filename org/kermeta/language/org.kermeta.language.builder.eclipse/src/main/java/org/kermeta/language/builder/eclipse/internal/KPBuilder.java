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
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
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
import org.kermeta.kp.compiler.commandline.TracedURL;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.builder.eclipse.preferences.PreferenceConstants;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;
import org.kermeta.utils.helpers.eclipse.ResourceHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.reference.FileReference;

public class KPBuilder {
	
	protected KermetaCompiler compiler = null;
	protected URIMapFileBuilder uriMapFileBuilder = null;
	protected IFile kpProjectFile;
	
	protected KPNeedBuildDeltaVisitor needBuildVisitor;
	
	public ModelingUnit kp_last_modelingunit = null;
	public HashMap<String,KPFilesContainer> kpFiles = new HashMap<String,KPFilesContainer>();	
	
	private String outputResourceFolder;
	private String outputRootFolder;
	private String outputScalaFolder;
	private String outputScalaBinaryFolder;
	private String outputEMFJavaFolder;
	private String outputGenmodelFolder;
	private String outputEMFBinaryFolder;
	private String kpFileURL;
	
	public static final String DEFAULT_RESOURCE_LOCATION =  "resources";
	public static final String DEFAULT_SCALASOURCE_LOCATION =  "scala";
	public static final String DEFAULT_SCALABIN_LOCATION =  "scalaclasses";
	public static final String DEFAULT_GENMODEL_LOCATION =  "genmodel";
	public static final String DEFAULT_EMFSOURCES_LOCATION =  "emfjava";
	public static final String DEFAULT_EMFBIN_LOCATION =  "emfclasses";
	
	public KPBuilder(IFile kpProjectFile) {
		super();
		this.kpProjectFile = kpProjectFile;
		needBuildVisitor = new KPNeedBuildDeltaVisitor(kpProjectFile);
		kpFileURL = kpProjectFile.getLocationURI().toString();
		String kpFilePath = kpProjectFile.getRawLocation().toString();
		File f = new File(kpFilePath); // file need a system path
		try {
			
			String projectUri = f.getParentFile().toString();//.getCanonicalPath(); f.exists()
			outputRootFolder = projectUri+File.separatorChar+"target";
			outputResourceFolder = outputRootFolder+File.separatorChar+DEFAULT_RESOURCE_LOCATION;
			outputScalaFolder = outputRootFolder+File.separatorChar+DEFAULT_SCALASOURCE_LOCATION;
			outputScalaBinaryFolder  = outputRootFolder+File.separatorChar+DEFAULT_SCALABIN_LOCATION;
			outputEMFJavaFolder  = outputRootFolder+File.separatorChar+DEFAULT_EMFSOURCES_LOCATION;
			outputGenmodelFolder  = outputRootFolder+File.separatorChar+DEFAULT_GENMODEL_LOCATION;
			outputEMFBinaryFolder  = outputRootFolder+File.separatorChar+DEFAULT_EMFBIN_LOCATION;
			
			
			//compiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(),false,outputFolder, true, true, false);
			boolean saveIntermediateFiles = Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_SAVE_BUILD_INTERMEDIATE_FILES_BOOLEAN);
			compiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(), new LocalFileConverterForEclipse(),saveIntermediateFiles, true, true, true);
			compiler.initializeTargetFolders(outputRootFolder, outputRootFolder, outputScalaFolder, outputScalaBinaryFolder, outputGenmodelFolder, outputEMFJavaFolder, outputEMFBinaryFolder, outputResourceFolder);
			refreshFileIndex();
		} catch (IOException e) {
			Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR,"KPBuilder initialization failed", this.getClass().getName(), e);
		}
		uriMapFileBuilder = new URIMapFileBuilder(getProgressGroup());
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
					compile(true, monitor);
					return Status.OK_STATUS;
				}
			};
		    job.setPriority(Job.LONG);
		    job.schedule(); // start as soon as possible
		}
	}
	
	synchronized public void compile(boolean mustCheck, IProgressMonitor monitor){
		try {		
			ArrayList<String> additionalCalssPath = new ArrayList<String>();
			compiler.setContributedProgressGroup(getProgressGroup());
			Activator.getDefault().getMessaggingSystem().addProgressMonitor(getProgressGroup(),monitor);
			Activator.getDefault().getMessaggingSystem().initProgress(getProgressGroup(), "Starting km generation of "+kpFileURL, KermetaBuilder.LOG_MESSAGE_GROUP, 3);

			/*ArrayList<URL> impactedFiles = new ArrayList<URL>();
			impactedFiles.add(FileHelpers.StringToURL(kpFileURL));
			KermetaBuilder.flushProblems(impactedFiles);
			*/
			// for reflexivity set the bundle context
			updateCompilerPreferences();
			compiler.checkingEnabled = mustCheck;
			ModelingUnit result = compiler.kp2bytecode(kpFileURL,getDirtyFiles(), additionalCalssPath,KermetaCompiler.PHASE_TYPE_SET);
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
		Activator.getDefault().getMessaggingSystem().doneProgress(getProgressGroup(), "End of km generation for "+kpFileURL, KermetaBuilder.LOG_MESSAGE_GROUP);
	}


	private void updateCompilerPreferences() {
		compiler.saveIntermediateFiles = Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_SAVE_BUILD_INTERMEDIATE_FILES_BOOLEAN);
	}


	private HashMap<URL,ModelingUnit> getDirtyFiles() {
		HashMap<URL,ModelingUnit> dirtyFiles = new HashMap<URL,ModelingUnit>();
		for (KPFilesContainer aKPFilesContainer : this.kpFiles.values()) {
			if(aKPFilesContainer.dirtyFile && aKPFilesContainer.modelingUnit != null){
				dirtyFiles.put(aKPFilesContainer.filePath, aKPFilesContainer.modelingUnit);
			}
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
			/*if (kp_last_modelingunit == null) {
				return true;
			}*/
			
			long timeStampOfClasses = 0;

			IResource theConcernedPath = kpProjectFile.getParent().findMember(File.separatorChar+"target"+File.separatorChar+DEFAULT_SCALABIN_LOCATION+File.separatorChar);
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
			
			ArrayList<TracedURL> theSources = compiler.getSources(kpFileURL);
			for (TracedURL oneURL : theSources) {
				IFile theFile = ResourceHelpers.getIFile(oneURL.getUrl().toString());
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
	
	public ArrayList<String> getBuildAdditionalClassPath(){
		ArrayList<String> additionalClassPath = new ArrayList<String>();
		
		findBundleLocationForClassPath("org.kermeta.scala.scala-library", additionalClassPath);
		findBundleLocationForClassPath("org.kermeta.language.library.core", additionalClassPath);
		findBundleLocationForClassPath("org.kermeta.utils.systemservices.api", additionalClassPath);
		findBundleLocationForClassPath("org.eclipse.emf.common", additionalClassPath);
		findBundleLocationForClassPath("org.eclipse.emf.ecore", additionalClassPath);
		findBundleLocationForClassPath("org.eclipse.emf.ecore.xmi", additionalClassPath);
		findBundleLocationForClassPath("org.kermeta.language.model", additionalClassPath);
		findBundleLocationForClassPath("org.kermeta.utils.helpers", additionalClassPath);
		return additionalClassPath;
	}
	
	public ArrayList<String> getFullClassPath() throws IOException{
		// add resolvable kp depencies in classpath
		KpLoaderImpl ldr = new KpLoaderImpl(compiler.logger);
		
		// Load KP file
		KermetaProject kp = ldr.loadKp(kpFileURL);
		ArrayList<String> fullClassPath = new ArrayList<String>();
		fullClassPath.addAll(getBuildAdditionalClassPath());
		fullClassPath.addAll(compiler.getBinaryDependencyClasspath(kp, new KpVariableExpander(kpFileURL, kp, compiler.fileSystemConverter, compiler.logger )));
		fullClassPath.add(outputEMFBinaryFolder);
		
		return fullClassPath;
	}
	
	synchronized public boolean build(boolean andRun, ArrayList<String> params, IProgressMonitor monitor){
		boolean isBuildNeeded = !andRun;
		ModelingUnit result = null;
		try {		
			
			// full build required so clear the consoles
			Activator.getDefault().getMessaggingSystem().clearLog();
			org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem().clearLog();
			org.kermeta.utils.systemservices.eclipse.Activator.getDefault().clearConsole();
			

			compiler.setContributedProgressGroup(getProgressGroup());
			Activator.getDefault().getMessaggingSystem().addProgressMonitor(getProgressGroup(),monitor);
			
			if (andRun) {
				isBuildNeeded = checkIfBuildIsNeeded();
				Activator.getDefault().getMessaggingSystem().initProgress(getProgressGroup(), "Building before run "+kpFileURL, this.getClass().toString(), 5);				
			}
			else{
				Activator.getDefault().getMessaggingSystem().initProgress(getProgressGroup(), "Building "+kpFileURL, this.getClass().toString(), 5);				
			}

			
			
			ArrayList<String> additionalClassPath = getBuildAdditionalClassPath();
			
			// add resolvable kp depencies in classpath
			//KpLoaderImpl ldr = new KpLoaderImpl(compiler.logger);
			
			// Load KP file
			//KermetaProject kp = ldr.loadKp(kpFileURL);
			//ArrayList<String> fullClassPath = getFullClassPath();
			
			
			
			if (isBuildNeeded) {
				ArrayList<URL> impactedFiles = new ArrayList<URL>();
				impactedFiles.add(FileHelpers.StringToURL(kpFileURL));
				KermetaBuilder.flushProblems(impactedFiles);

				updateCompilerPreferences();	
				
				// make sure that the outputfolder exist and is known by eclipse
				if( kpProjectFile.getParent() instanceof IFolder){
					if(!((IFolder)kpProjectFile.getParent()).getFolder("target").exists())
						((IFolder)kpProjectFile.getParent()).getFolder("target").create(true, true, null);
				}
				if( kpProjectFile.getParent() instanceof IProject){
					if(!((IProject)kpProjectFile.getParent()).getFolder("target").exists())
						((IProject)kpProjectFile.getParent()).getFolder("target").create(true, true, null);
				}
				
				compiler.stopOnError = !Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_IGNORE_BUILD_ERROR_BOOLEAN);
				compiler.checkingEnabled = true;
				result = compiler.kp2bytecode(kpFileURL,new HashMap<URL, ModelingUnit>(),additionalClassPath,KermetaCompiler.PHASE_GENERATE_SCALA_BYTECODE);
				
				
				
				if (result != null && !compiler.hasFailed) {
					
					// generate urimap file
					// TODO may be we can do that in background because we may have to update it if the user has opened or closed some projects
					uriMapFileBuilder.generateURIMapFile(outputRootFolder);
					
					kp_last_modelingunit = result;
					Activator.getDefault().getMessaggingSystem().debug("copy resources to class folders to ease the run from Eclipse", this.getClass().getName());
					
					kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
					// copy resources to classes folders in order to ease the run ...
					IPath destScalaBinFolder = kpProjectFile.getParent().findMember("target/"+DEFAULT_SCALABIN_LOCATION).getFullPath();
					IPath destEmfBinFolder = null;
					if(kpProjectFile.getParent().findMember("target/"+DEFAULT_EMFBIN_LOCATION) != null){
						destEmfBinFolder =kpProjectFile.getParent().findMember("target/"+DEFAULT_EMFBIN_LOCATION).getFullPath();
					}
					for ( IResource res : ((IFolder)(kpProjectFile.getParent().findMember("target/"+DEFAULT_RESOURCE_LOCATION))).members()){
						IResource targetScalaBinFolder =  kpProjectFile.getWorkspace().getRoot().findMember(destScalaBinFolder.append("/"+res.getName()));
						if(targetScalaBinFolder != null && targetScalaBinFolder.exists()){
							targetScalaBinFolder.delete(true, null);
						}
						res.copy(destScalaBinFolder.append("/"+res.getName()), true, new NullProgressMonitor());
						if(destEmfBinFolder != null){
							IResource targetEmfBinFolder =  kpProjectFile.getWorkspace().getRoot().findMember(destEmfBinFolder.append("/"+res.getName()));						
							if(targetEmfBinFolder != null && targetEmfBinFolder.exists()){
								targetEmfBinFolder.delete(true, null);
							}
							res.copy(destEmfBinFolder.append("/"+res.getName()), true, new NullProgressMonitor());
						}
					}					
				}
			}
			
		/*	if (andRun) {
				// full build required so clear the consoles
				Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).clearLog();
				//k2.io.StdIO._messagingSystem_$eq(Activator.getDefault().getMessaggingSystem4Runner(kp.getName()));
				/* k2.io.StdIO$.MODULE$.messagingSystem_$eq(Activator.getDefault().getMessaggingSystem4Runner(kp.getName()));
				Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).info("console test", "aGroup");
				k2.io.StdIO$.MODULE$.writeln("test message");*/
				
				
				
			/*	
				KermetaRunner runner = new KermetaRunner(outputScalaBinaryFolder, kp.getGroup()+"."+ kp.getName(),fullClassPath,Activator.getDefault().getMessaggingSystem4Runner(kp.getName()) );
				if (isBuildNeeded && result == null) {
					Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).error("Error in build, cannot run "+kpFileURL, this.getClass().getName());
				}
				else{
					runner.runK2Program(params,outputRootFolder+File.separator+"urimap.properties");
					kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null); // refresh local project in case a file is created there
				}
				
			}*/
		} catch (Exception e) {
			try {
				Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Build failed : "+(e.getMessage()!= null ? e.getMessage() : e.toString()), 
						KermetaBuilder.LOG_MESSAGE_GROUP, 
						e,
						new FileReference(FileHelpers.StringToURL(kpFileURL)));
			} catch (Exception f) {
				Activator.getDefault().getMessaggingSystem().error( "failed to mark Failed build on : "+kpFileURL+ " due to"+f.getMessage(), 
						KermetaBuilder.LOG_MESSAGE_GROUP, 
						e);
			}
		}
		finally{
			Activator.getDefault().getMessaggingSystem().doneProgress(getProgressGroup(), "kpFileURL", this.getClass().toString());
		}
		if (isBuildNeeded && result == null) {
			return false;
		}
		else return true;
	}
	synchronized public void runKP( ArrayList<String> params, IProgressMonitor monitor){
		KpLoaderImpl ldr = new KpLoaderImpl(compiler.logger);
		
		// Load KP file
		KermetaProject kp = ldr.loadKp(kpFileURL);
		// full build required so clear the consoles
		Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).clearLog();
		//k2.io.StdIO._messagingSystem_$eq(Activator.getDefault().getMessaggingSystem4Runner(kp.getName()));
		/* k2.io.StdIO$.MODULE$.messagingSystem_$eq(Activator.getDefault().getMessaggingSystem4Runner(kp.getName()));
		Activator.getDefault().getMessaggingSystem4Runner(kp.getName()).info("console test", "aGroup");
		k2.io.StdIO$.MODULE$.writeln("test message");*/
		
		
		try {
			KermetaRunner runner = new ProgressCancellableKermetaRunner(outputScalaBinaryFolder, 
					kp.getGroup()+"."+ kp.getName(),
					getFullClassPath(),
					Activator.getDefault().getMessaggingSystem4Runner(kp.getName()), 
					monitor);
			runner.runK2Program(params,outputRootFolder+File.separator+"urimap.properties");
			kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null); // refresh local project in case a file is created there
			
		} catch (IOException e) {
			Activator.getDefault().getMessaggingSystem().error( "Run failed "+kpFileURL+ " due to"+e.getMessage(), 
					KermetaBuilder.LOG_MESSAGE_GROUP, 
					e);
		} catch (CoreException e) {
			Activator.getDefault().getMessaggingSystem().error( "Run failed "+kpFileURL+ " due to"+e.getMessage(), 
					KermetaBuilder.LOG_MESSAGE_GROUP, 
					e);
		}
		
	}
	
	/**
	 * Implemnt the Runner that can be stopped using the monitor button
	 *
	 */
	public class ProgressCancellableKermetaRunner extends KermetaRunner{

		IProgressMonitor monitor;
		public ProgressCancellableKermetaRunner(String outputBinFolder,
				String scalaAspectPrefix, List<String> classpath,
				MessagingSystem logger, IProgressMonitor monitor) {
			super(outputBinFolder, scalaAspectPrefix, classpath, logger);
			this.monitor = monitor;
		}
		@Override
		public boolean mustCancelRun() {			
			return  monitor.isCanceled();
		}
	}
	
	synchronized public void build(IProgressMonitor monitor){
		build(false, new ArrayList<String>(), monitor);
	}
	synchronized public void clean(IProgressMonitor monitor) throws CoreException{
		kpProjectFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		IFolder targetFolder = null;
		if( kpProjectFile.getParent() instanceof IFolder){
			targetFolder = ((IFolder)kpProjectFile.getParent()).getFolder("target");
			
		}
		if( kpProjectFile.getParent() instanceof IProject){
			targetFolder = ((IProject)kpProjectFile.getParent()).getFolder("target");
		}
		if(targetFolder != null && targetFolder.exists()){
			targetFolder.delete(true, monitor);
		}
		
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
			Activator.getDefault().getMessaggingSystem().warn("cannot find local file location for bundle "+bundleSymbolicName,  KermetaBuilder.LOG_MESSAGE_GROUP, e);
		}
	}
	
	/**
	 * This operation refresh the files to compile.
	 * @throws IOException
	 */
	public void refreshFileIndex() throws IOException {
		ArrayList<TracedURL> kpSources = compiler.getSources(kpFileURL);
		//This list allow to preserve old files ever parsed
		HashMap<String,KPFilesContainer> oldKpFiles = kpFiles;
		kpFiles = new HashMap<String, KPFilesContainer>();
		for (TracedURL uneSource : kpSources) {
			KPFilesContainer container = new KPFilesContainer(uneSource.getUrl(), false, null);
			IFile resource = ResourceHelpers.getIFile(uneSource.getUrl().toString());
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
		KpLoaderImpl ldr = new KpLoaderImpl(compiler.logger);
		if (ldr != null) {
			KermetaProject kp = ldr.loadKp(kpFileURL);
			if (kp != null) {
				return kp.getDefaultMainClass();
			}
		}
		return "";
	}
	
	public String getDefaultMainOperation(){
		KpLoaderImpl ldr = new KpLoaderImpl(compiler.logger);
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
