/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.common.util.URI;
import org.kermeta.compilo.scala.GlobalConfiguration;
import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.kp.ImportBytecodeJar;
import org.kermeta.kp.ImportProjectJar;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.kp.compiler.commandline.urlhandler.ExtensibleURLStreamHandlerFactory;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.checker.CheckerImpl;
import org.kermeta.language.checker.CheckerImpl4Eclipse;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaCompiler;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl4Eclipse;
import org.kermeta.language.merger.binarymerger.api.KmBinaryMerger;
import org.kermeta.language.resolver.KmResolverImpl;
import org.kermeta.language.resolver.KmResolverImpl4Eclipse;
import org.kermeta.language.resolver.api.KmResolver;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.aether.LocalFileConverterForAether;
import org.kermeta.utils.helpers.CompositeLocalFileConverter;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.FileReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;

/**
 * Basic compilation process for Kermeta2 This class is a facade for producing
 * bytecode from a kermeta2 project
 */
public class KermetaCompiler {

	public final static String LOG_MESSAGE_GROUP = "org.kermeta.kp.compiler.commandline";
	
	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_REFLEXIVITY_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_REFLEXIVITY_LOCATION_IN_ECLIPSE = "/target";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String DEFAULT_KP_LOCATION_IN_FOLDER = "/project.kp";
	public static String DEFAULT_BINARY_LOCATION_IN_ECLIPSE = "/target/scalaclasses";
	public static String DEFAULT_EMFBINARY_LOCATION_IN_ECLIPSE = "/target/emfclasses";
	public static String DEFAULT_ALL_IMPORTFILE_RESULT_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/all_importFiles_merged.km";
	public static String DEFAULT_ALL_IMPORTFILE_RESULT_LOCATION_IN_ECLIPSE = "/target/all_importFiles_merged.km";
	public static String INTERMEDIATE_SUBFOLDER = "";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER + "/scala";


	
	public static String PHASE_COLLECT_SOURCES = "COLLECT_SOURCES";
	public static String PHASE_MERGE = "MERGE";
	public static String PHASE_RESOLVE = "RESOLVE";
	public static String PHASE_TYPE_SET = "TYPE_SET";
	public static String PHASE_GENERATE_LEGACY_SOURCE = "GENERATE_LEGACY_SOURCE";
	public static String PHASE_GENERATE_LEGACY_SOURCE_BYTECODE = "GENERATE_LEGACY_SOURCE_BYTECODE";
	public static String PHASE_GENERATE_SCALA = "GENERATE_SCALA";
	public static String PHASE_GENERATE_SCALA_BYTECODE = "GENERATE_SCALA_BYTECODE";
	
	public boolean checkingEnabled = false;
	public boolean stopOnError = true;

	/**
	 * An ordered Map associating with each file extension its Modeling Unit loader.<br/>
	 */
	public NavigableMap<String,ModelingUnitLoaderFactory> muLoaders;
	
	public boolean runInEclipse = false;
	public boolean runResultInSeparateVM = true;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	public MessagingSystem logger;
	public LocalFileConverter fileSystemConverter;
	public ErrorHandlingHelper errorHandlingHelper;
	
	
	// public List<String> additionalClassPath = new
	// java.util.ArrayList<String>();
	// public String projectName = "project";
	//public KpVariableExpander variableExpander;
	public Boolean useFSC = false; // separate compilation server

	public Boolean hasFailed = false;
	public String errorMessage = "";
	private static final Lock lock = new ReentrantLock();
	
	protected String contributedProgressGroup = ""; 
	
	public String getContributedProgressGroup() {
		return contributedProgressGroup;
	}

	public void setContributedProgressGroup(String contributedProgressGroup) {
		this.contributedProgressGroup = contributedProgressGroup;
	}

	/**
	 * @return the singleThreadExector
	 */
	public ExecutorService getSingleThreadExector() {
		if(singleThreadExector == null) singleThreadExector = Executors.newSingleThreadExecutor();
		return singleThreadExector;
	}

	/**
	 * @return the threadExector
	 */
	public ExecutorService getThreadExector() {
		if(threadExector == null) threadExector = new ThreadPoolExecutor(16, 16, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		return threadExector;
	}


	//private ExecutorService threadExector = Executors.newCachedThreadPool();
	// this kind of executor should be able to queue any number of parallel tasks and run them on the available Threads in the pool
	// it is tuned to accept a burst of request and process them ...
	// see http://docs.oracle.com/javase/1.5.0/docs/api/java/util/concurrent/ThreadPoolExecutor.html
	private ExecutorService threadExector = null;
	
	private ExecutorService singleThreadExector = null;
	
	
	
	protected String targetRootFolder; 
	protected String targetGeneratedScalaSourceFolder; 
	protected String targetScalaBinaryFolder; 
	protected String targetGeneratedGenmodelFolder; 
	protected String targetGeneratedEMFSourceFolder; 
	protected String targetEMFBinaryFolder; 
	protected  String targetGeneratedResourcesFolder;

	/**
	 * Simple constructor
	 * 
	 * @param registerProtocols
	 *            if set to true, the constructor will take care to register
	 *            some URL handler
	 * @param logger
	 *            is the MessagingSystem that must be used to log message,
	 *            problem and progression
	 */
	public KermetaCompiler(Boolean registerProtocols, MessagingSystem logger, LocalFileConverter uriPhysicalConverter, Boolean willRunInEclipse) {
		super();
		this.logger = logger;
		this.fileSystemConverter = new CompositeLocalFileConverter(new ArrayList<LocalFileConverter>(
				Arrays.asList(uriPhysicalConverter, 
						new LocalFileConverterForAether(logger,getMainProgressGroup(),"http://maven.inria.fr/artifactory/repo"))));
		this.saveIntermediateFiles = false;
		this.runInEclipse = willRunInEclipse;
		this.checkingEnabled = true;
		this.stopOnError = true;
		if (registerProtocols) {
			registerMVNUrlHandler();
		}
		/*if (threadExector instanceof ThreadPoolExecutor)
		    ((ThreadPoolExecutor) threadExector).setMaximumPoolSize(32);*/
		
		this.runInEclipse = willRunInEclipse;
		errorHandlingHelper = new ErrorHandlingHelper(logger, LOG_MESSAGE_GROUP, getMainProgressGroup(), getThreadExector());
	}

	/**
	 * 
	 * @param registerProtocols
	 *            if set to true, the constructor will take care to register
	 *            some URL handler
	 * @param logger
	 *            is the MessagingSystem that must be used to log message,
	 *            problem and progression
	 * @param saveIntermediateFiles
	 *            indicates if the compilation must also produce intermediate
	 *            files
	 * @param targetIntermediateFolder
	 *            indicates where the intermediate files must be generated
	 * @param willRunInEclipse
	 *            indicates if it is run in eclipse
	 * @param checkingEnabled
	 *            indicates wether modeling units will be checked or not
	 * @param stopOnError
	 *            indicates wether the process should be stopped when an error
	 *            occurs or not
	 */
	public KermetaCompiler(Boolean registerProtocols, MessagingSystem logger, LocalFileConverter uriPhysicalConverter,  Boolean saveIntermediateFiles,  Boolean willRunInEclipse, Boolean checkingEnabled, Boolean stopOnError) {
		super();
		System.err.println("checking enabled (" + checkingEnabled + ") stop on error (" + stopOnError + ")");
		this.logger = logger;
		this.fileSystemConverter = new CompositeLocalFileConverter(Arrays.asList(uriPhysicalConverter, 
			    							new LocalFileConverterForAether(logger,getMainProgressGroup(), "http://maven.inria.fr/artifactory/repo")));
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.runInEclipse = willRunInEclipse;
		this.checkingEnabled = checkingEnabled;
		this.stopOnError = stopOnError;
		if (registerProtocols) {
			registerMVNUrlHandler();
		}
		/*if (threadExector instanceof ThreadPoolExecutor)
		    ((ThreadPoolExecutor) threadExector).setMaximumPoolSize(32);*/
		
		errorHandlingHelper = new ErrorHandlingHelper(logger, LOG_MESSAGE_GROUP, getMainProgressGroup(), getThreadExector());
	}

	private void registerMVNUrlHandler() {
		StringBuffer results = new StringBuffer();
		try {
			results.append("Trying to get java.protocol.handler.pkgs\r\n");
			String s = System.getProperty("java.protocol.handler.pkgs");
			if (s == null)
				s = "no such property";
			s += "; get succeeded\r\n";
			results.append(s);
		} catch (Throwable e) {
			results.append(e.toString() + "\r\n");
		}
		try {
			results.append("Trying to set java.protocol.handler.pkgs with protocols from org.ops4j.pax.url\r\n");
			System.setProperty("java.protocol.handler.pkgs", "org.ops4j.pax.url");
		} catch (Throwable e) {
			results.append(e.toString() + "\r\n");
		}
		org.ops4j.pax.url.mvn.Handler h = new org.ops4j.pax.url.mvn.Handler();
		ExtensibleURLStreamHandlerFactory.installUrlStreamHandlerFactory();
		ExtensibleURLStreamHandlerFactory.registerHandler("mvn", h);
		logger.debug(results.toString(), LOG_MESSAGE_GROUP);

	}

	/**
	 * This initialization must be called before everything related to eclipse
	 * when run outside of eclipse
	 */
	public static void initializeFactory() {
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE).setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory$.MODULE$);
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();

	}

	
	
	
	
	/**
	 * This method must be called to initialize all the folders where the compilation will take place
	 * @param targetRootFolder
	 * @param targetGeneratedScalaSourceFolder
	 * @param targetScalaBinaryFolder
	 * @param targetGeneratedGenmodelFolder
	 * @param targetGeneratedEMFSourceFolder
	 * @param targetEMFBinaryFolder
	 * @param targetGeneratedResourcesFolder
	 */
	public void initializeTargetFolders(String targetRootFolder,
			String targetIntermediateFolder,
			String targetGeneratedScalaSourceFolder,
			String targetScalaBinaryFolder,
			String targetGeneratedGenmodelFolder,
			String targetGeneratedEMFSourceFolder,
			String targetEMFBinaryFolder, String targetGeneratedResourcesFolder) {
		this.targetRootFolder = targetRootFolder;
		this.targetIntermediateFolder = targetIntermediateFolder;
		this.targetGeneratedScalaSourceFolder = targetGeneratedScalaSourceFolder;
		this.targetScalaBinaryFolder = targetScalaBinaryFolder;
		this.targetGeneratedGenmodelFolder = targetGeneratedGenmodelFolder;
		this.targetGeneratedEMFSourceFolder = targetGeneratedEMFSourceFolder;
		this.targetEMFBinaryFolder = targetEMFBinaryFolder;
		this.targetGeneratedResourcesFolder = targetGeneratedResourcesFolder;
		
	}

	/*
	 * public KermetaCompiler(String targetFolder){ // make sure initialize has
	 * been call : note that if some other EMF related things have // been done
	 * before, the initialize should be done earlier too initializeFactory();
	 * this.targetFolder = targetFolder; }
	 */

	
	/**
	 * Build a km suitable form being imported as a library (ie. doesn't includes the dependencies)
	 * It merely only merge the sources files
	 * @param kpFileURL
	 * @param dirtyMU
	 * @param additionalClassPath
	 * @param stopAfterPhase
	 * @return
	 * @throws IOException
	 */
	public synchronized ModelingUnit kp2bytecode4library(String kpFileURL, HashMap<URL, ModelingUnit> dirtyMU, List<String> additionalClassPath, String stopAfterPhase) throws IOException {
		try {
			lock.lock();
			this.hasFailed = false;
			//String projectName = "project";
			logger.initProgress(getMainProgressGroup()+".kp2bytecode", "Building library from " + kpFileURL, LOG_MESSAGE_GROUP, 2);
			KpLoaderImpl ldr = new KpLoaderImpl(logger);
			// Load KP file
			KermetaProject kp = ldr.loadKp(kpFileURL);
			if (kp == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Invalid kp file.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Invalid kp file.";
				this.hasFailed = true;
				return null;
			}
	
			if (!checkKP(kp, kpFileURL) ) return null;			
			/*if (!kp.getEclipseName().isEmpty()) {
				projectName = kp.getEclipseName();
			}*/
			
			CollectSourcesHelper collectSourceHelper = new CollectSourcesHelper(this, logger);
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Identifing sources to load...", LOG_MESSAGE_GROUP, 1);
			//KpVariableExpander varExpander = new KpVariableExpander(kpFileURL, kp, fileSystemConverter, logger);
			ArrayList<TracedURL> kpSources = collectSourceHelper.getResolvedImportProjectSources(kp,kpFileURL);
			if (kpSources.size() == 0) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Invalid kp file. No sources detected.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Invalid kp file. No sources detected.";
				this.hasFailed = true;
				return null;
			}
			List<ModelingUnit> sourceModelingUnits = collectSourceHelper.getSourceModelingUnits(kp, kpSources, dirtyMU);				
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Merging " + sourceModelingUnits.size() + " files...", LOG_MESSAGE_GROUP, 1);
			ErrorProneResult<ModelingUnit> mergedUnit = mergeModelingUnits(kp, sourceModelingUnits);
	
			// Did errors occur during the merge ?
			if (mergedUnit.getProblems().size() > 0) {
				errorHandlingHelper.processErrors(mergedUnit, FileHelpers.StringToURL(kpFileURL));
				if (stopOnError) {
					this.errorMessage = "Unable to merge the files. Compilation not complete for this project.";
					logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
					logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
					this.hasFailed = true;
					return mergedUnit.getResult();
				}
			}
			
			// TODO if we merge a dummy kmt file that only declares aspect class Object, the resolver should work and this we can provide this resolved km instead of only the merged km 
			
			ModelingUnit resultingUnit = mergedUnit.getResult();
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Saving merged file as a library...", LOG_MESSAGE_GROUP, 1);
			
			// save resolvedUnit to the META-INF/kermeta/merged.km
			URI uri = URI.createURI(( resultingUnit.getName() + ".km_in_memory").replaceAll("::", "."));
			File mergedFile = new File(targetGeneratedResourcesFolder + DEFAULT_KP_METAINF_LOCATION_IN_JAR + File.separatorChar+ kp.getMetamodelName() + ".km");
			if (!mergedFile.getParentFile().exists()) {
				mergedFile.getParentFile().mkdirs();
			}
			FileWriter writer = new FileWriter(mergedFile);
	
			writer.write(new ModelingUnitConverter(logger).saveMu(resultingUnit, uri).toString());
			writer.close();
			
			return resultingUnit;
		} finally {
			logger.doneProgress(getMainProgressGroup()+".kp2bytecode", "End of compilation for " +kpFileURL , LOG_MESSAGE_GROUP);
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			lock.unlock();
		}
	}
	
	/**
	 * returns the best modeling unit that has been computed
	 * if there are error, we need to check for 
	 * this.hasFailed
	 * @param kpFileURL
	 * @param dirtyMU
	 * @param additionalClassPath
	 * @param stopAfterPhase
	 * @return
	 * @throws IOException
	 */
	public synchronized ModelingUnit kp2bytecode(String kpFileURL, HashMap<URL, ModelingUnit> dirtyMU, List<String> additionalClassPath, String stopAfterPhase) throws IOException {
		try {
			lock.lock();
			this.hasFailed = false;
			if(this.checkingEnabled){
				flushProblems(FileHelpers.StringToURL(kpFileURL));
			}
			//String projectName = "project";

			int workUnit = phaseRank(stopAfterPhase);
			
			if(checkingEnabled && phaseRank(stopAfterPhase) >= 2) workUnit+=1;
			if(checkingEnabled && phaseRank(stopAfterPhase) >= 4) workUnit+=1;
			
			logger.initProgress(getMainProgressGroup()+".kp2bytecode", "Compiling " + kpFileURL, LOG_MESSAGE_GROUP, workUnit);
			KpLoaderImpl ldr = new KpLoaderImpl(logger);
	
			// Load KP file
			KermetaProject kp = ldr.loadKp(kpFileURL);
			if (kp == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Invalid kp file.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Invalid kp file.";
				this.hasFailed = true;
				return null;
			}
	
			if (!checkKP(kp, kpFileURL) ) return null;
			
			/*if (!kp.getEclipseName().isEmpty()) {
				projectName = kp.getEclipseName();
			}*/

			CollectSourcesHelper collectSourceHelper = new CollectSourcesHelper(this, logger);
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Identifing sources to load...", LOG_MESSAGE_GROUP, 1);
			ArrayList<TracedURL> kpSources = collectSourceHelper.getSources4Merge(kp,kpFileURL);
			if (kpSources.size() == 0) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Invalid kp file. No sources detected.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Invalid kp file. No sources detected.";
				this.hasFailed = true;
				return null;
			}
			
			
			// deal with preresolve process
			logger.debug("Preparing preresolve : "+targetIntermediateFolder+"/preresolve/preresolved.km",LOG_MESSAGE_GROUP);
			String preResolveCacheUrl = URI.createFileURI(targetIntermediateFolder+"/preresolve/preresolved.km").toString();
			String preResolveSrcListUrl = URI.createFileURI(targetIntermediateFolder+"/preresolve/srcList.txt").toString();
			if (dirtyMU != null && !dirtyMU.isEmpty()){
				logger.info("dirty mode  "+dirtyMU.size()+" dirty modeling units (ie. units being modified by the user)", LOG_MESSAGE_GROUP);
				for(URL u : dirtyMU.keySet()){
					logger.devInfo("   dirty file "+u, LOG_MESSAGE_GROUP);
				}
			}
						
			ArrayList<TracedURL> kpPreResolveSources = collectSourceHelper.getAllButLastModifiedFile(kpSources,dirtyMU);
			if (collectSourceHelper.getLastModifiedFile(kpSources,dirtyMU) != null){
				logger.info("Preresolve all but : "+collectSourceHelper.getLastModifiedFile(kpSources,dirtyMU).getUrl(),LOG_MESSAGE_GROUP);
			}
			else{
				StringBuilder dirtyUnits = new StringBuilder();
				for(URL u : dirtyMU.keySet()){
					dirtyUnits.append(u.toString());
					dirtyUnits.append(", ");
				}
				logger.info("Preresolve all but dirty units: "+dirtyUnits,LOG_MESSAGE_GROUP);
			}
			ModelingUnit preResolvedUnit = null;
			if( isPreresolveUpToDate(kpPreResolveSources, preResolveCacheUrl, preResolveSrcListUrl)){
				logger.info("Reusing  : "+preResolveCacheUrl,LOG_MESSAGE_GROUP);
				if (runInEclipse) {
					new KmBinaryMergerImpl4Eclipse();
				} else {
					new KmBinaryMergerImpl();
				}
				ModelingUnitCacheHelper cacheHelper = new ModelingUnitCacheHelper(logger);
				preResolvedUnit = cacheHelper.getCachedModelingUnit(preResolveCacheUrl);
			}
			else
			{
				flushProblems(kpPreResolveSources);
				logger.progress(getMainProgressGroup()+".kp2bytecode", "PreresolveLoading "+kpPreResolveSources.size()+" sources...", LOG_MESSAGE_GROUP, 1);
				
				if (kpPreResolveSources.size() != 0) {
					List<ModelingUnit> preresolveModelingUnits = collectSourceHelper.getSourceModelingUnits(kp, kpPreResolveSources, dirtyMU);				
					logger.progress(getMainProgressGroup()+".kp2bytecode", "PreresolveMerging " + preresolveModelingUnits.size() + " files...", LOG_MESSAGE_GROUP, 1);
					ErrorProneResult<ModelingUnit> preresolvedMergedUnit = mergeModelingUnits(kp, preresolveModelingUnits);
			
					// Did errors occur during the merge ?
					if (preresolvedMergedUnit.getProblems().size() > 0) {
						errorHandlingHelper.processErrors(preresolvedMergedUnit, FileHelpers.StringToURL(kpFileURL));
						if (stopOnError) {
							this.errorMessage = "Unable to merge the files. Compilation not complete for this project.";
							logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
							logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
							this.hasFailed = true;
							return preresolvedMergedUnit.getResult();
						}
					}

					// workaround cache problem in compiler
					kermeta.standard.JavaConversions.cleanCache();

					// adding kermeta::standard::Objet if necessary					
					addStandardObjectIfRequired(preresolvedMergedUnit.getResult());
					
					
					logger.progress(getMainProgressGroup()+".kp2bytecode", "PreResolving...", LOG_MESSAGE_GROUP, 1);
					preResolvedUnit = resolveModelingUnit(preresolvedMergedUnit.getResult(), kpFileURL, true);
			
					if (preResolvedUnit == null) {
						this.errorMessage = "The preresolved result is not valid. Compilation not complete for this project.";
						logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
						this.hasFailed = true;
						return preResolvedUnit;
					}
					else{
						URI saveKMURI = URI.createURI(preResolveCacheUrl);
						preResolvedUnit.setName(saveKMURI.lastSegment());
						new ModelingUnitConverter(true,saveKMURI.toFileString(), logger).saveMu(preResolvedUnit, saveKMURI);
						
						savePreResolveSrcList(preResolveSrcListUrl,kpPreResolveSources);
					}
			
				}
			}
			
			// deal with the remaining merge an resolve
			ArrayList<TracedURL> remainingSources = new ArrayList<TracedURL>();
			TracedURL lastModifiedFileTracedUrl = collectSourceHelper.getLastModifiedFile(kpSources, dirtyMU);
			if(lastModifiedFileTracedUrl!= null){
				remainingSources.add(collectSourceHelper.getLastModifiedFile(kpSources, dirtyMU));
			}
			
			flushProblems(remainingSources);
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Loading "+remainingSources.size()+" remaining sources...", LOG_MESSAGE_GROUP, 1);
			
			List<ModelingUnit> modelingUnits = collectSourceHelper.getSourceModelingUnits(kp, remainingSources,  dirtyMU);
	
			if (modelingUnits.size() == 0 && preResolvedUnit == null) {
				this.errorMessage = "Kermeta project invalid.  There is no modeling unit to compile.";
				logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				logger.error(this.errorMessage, LOG_MESSAGE_GROUP);
				this.hasFailed = true;
				return null;
			}
			if(stopOnError && this.hasFailed){
				this.errorMessage = "Not able to load all expected sources or dependencies. " +this.errorMessage;
				logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
				return null;
			}			
			if(phaseRank(stopAfterPhase) <= phaseRank(PHASE_COLLECT_SOURCES)){
				logger.debug("stopping after phase "+PHASE_COLLECT_SOURCES, LOG_MESSAGE_GROUP);
				return null;
			}
			
			if(preResolvedUnit!= null){
				modelingUnits.add(preResolvedUnit);
			}
			if(dirtyMU != null && ! dirtyMU.isEmpty()){
				logger.info("adding  "+dirtyMU.size()+" dirty modeling units (ie. unit being modified by the user)", LOG_MESSAGE_GROUP);
				for(URL u : dirtyMU.keySet()){
					logger.devInfo("   dirty file "+u, LOG_MESSAGE_GROUP);
				}
				modelingUnits.addAll(dirtyMU.values());
			}
			
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Merging " + modelingUnits.size() + " files...", LOG_MESSAGE_GROUP, 1);
			ErrorProneResult<ModelingUnit> mergedUnit = mergeModelingUnits(kp, modelingUnits);
	
			// Did errors occur during the merge ?
			if (mergedUnit.getProblems().size() > 0) {
				errorHandlingHelper.processErrors(mergedUnit, FileHelpers.StringToURL(kpFileURL));
				if (stopOnError) {
					this.errorMessage = "Unable to merge the files. Compilation not complete for this project.";
					logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
					logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
					this.hasFailed = true;
					return mergedUnit.getResult();
				}
			}
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
	
			// Check mergedUnit for scope MERGED
			if (checkingEnabled) {
				logger.progress(getMainProgressGroup()+".kp2bytecode", "Checking merged file...", LOG_MESSAGE_GROUP, 1);
				DiagnosticModel results = checkModelingUnit(mergedUnit.getResult()/*convertedModelingUnit*/, CheckerScope.MERGED);
				if (results != null) {
					logger.progress(getMainProgressGroup()+".kp2bytecode", "Processing check diagnostic...", LOG_MESSAGE_GROUP, 1);
					errorHandlingHelper.processCheckingDiagnostics(results, FileHelpers.StringToURL(kpFileURL));
		
					
					if (stopOnError && results.containsErrors()) {
						this.errorMessage = "The merged result is not valid. Compilation not complete for this project.";
						logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
						this.hasFailed = true;
						return mergedUnit.getResult();
					}
				}
			}
			else{
				logger.debug("Ignore checking of merged file ", LOG_MESSAGE_GROUP);
			}
			if(phaseRank(stopAfterPhase) <= phaseRank(PHASE_MERGE)){
				logger.debug("stopping after phase "+PHASE_MERGE, LOG_MESSAGE_GROUP);
				return mergedUnit.getResult();
			}
	
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Resolving...", LOG_MESSAGE_GROUP, 1);
			ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit.getResult(), kpFileURL, false);
	
			if (resolvedUnit == null) {
				this.errorMessage = "The resolved result is not valid. Compilation not complete for this project.";
				logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
				this.hasFailed = true;
				return resolvedUnit;
			}

			// checking existence and conformance of the defaultMainClass and default MainOperation
			new KpChecker(this).checkAll(kpFileURL, kp, resolvedUnit);
			if(this.hasFailed){
				return resolvedUnit;
			}
						
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			// Check resolvedUnit for scope RESOLVED
			if (checkingEnabled) {

				logger.progress(getMainProgressGroup()+".kp2bytecode", "Checking resolved file...", LOG_MESSAGE_GROUP, 1);
				DiagnosticModel results = checkModelingUnit(resolvedUnit, CheckerScope.RESOLVED);
				if (results != null) {
					logger.progress(getMainProgressGroup()+".kp2bytecode", "Processing check diagnostic...", LOG_MESSAGE_GROUP, 1);
					errorHandlingHelper.processCheckingDiagnostics(results, FileHelpers.StringToURL(kpFileURL));
					
					if (stopOnError && results.containsErrors()) {
						this.errorMessage = "The resolved result is not valid. Compilation not complete for this project.";
						logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						logger.log(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP);
						this.hasFailed = true;
						return resolvedUnit;
					}
				}
			}
			else{
				logger.debug("Ignore checking of resolved file ", LOG_MESSAGE_GROUP);
			}
				
			// save resolvedUnit to the META-INF/kermeta/merged.km
			URI uri = URI.createURI((resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
			File mergedFile = new File(targetGeneratedResourcesFolder + DEFAULT_KP_METAINF_LOCATION_IN_JAR + File.separatorChar+ kp.getMetamodelName() + ".km");
			if (!mergedFile.getParentFile().exists()) {
				mergedFile.getParentFile().mkdirs();
			}
			FileWriter writer = new FileWriter(mergedFile);
	
			writer.write(new ModelingUnitConverter(logger).saveMu(resolvedUnit, uri).toString());
			writer.close();
			
			if(phaseRank(stopAfterPhase) <= phaseRank(PHASE_TYPE_SET)){
				logger.debug("stopping after phase "+PHASE_TYPE_SET, LOG_MESSAGE_GROUP);
				return resolvedUnit;
			}
			
			
			

			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			KpVariableExpander varExpander = new KpVariableExpander(kpFileURL, kp, fileSystemConverter, logger);

			List<String> fullBinaryDependencyClassPath = getImportProjetJarClasspath(kp, varExpander);
			fullBinaryDependencyClassPath.addAll(getImportByteCodeJarClasspath(kp, varExpander));
			fullBinaryDependencyClassPath.addAll(additionalClassPath);
			// generating 
			ArrayList<URL> ecoreForGenerationURLs = getEcoreNeedingGeneration(kp, varExpander );
			Ecore2Bytecode ecore2Bytecode = new Ecore2Bytecode(logger, getMainProgressGroup(), kp, ecoreForGenerationURLs, targetRootFolder ,targetGeneratedGenmodelFolder, targetGeneratedEMFSourceFolder, targetEMFBinaryFolder, additionalClassPath, runInEclipse);
			Future<Boolean> genmodelFuture = ecore2Bytecode.ecore2java(getSingleThreadExector());
			if(phaseRank(stopAfterPhase) <= phaseRank(PHASE_GENERATE_LEGACY_SOURCE)){
				// manually join the previously launched ecore2java() (this is normally done by ecorejava2bytecode)
				try {
					/*Boolean res =*/ genmodelFuture.get();
					 
				} catch (InterruptedException e) {
					logger.error("Generation of java code from ecore interrupted", KermetaCompiler.LOG_MESSAGE_GROUP, e);
				} catch (ExecutionException e) {
					logger.error("Generation of java code from ecore failed "+ e, KermetaCompiler.LOG_MESSAGE_GROUP, e);
				}
				logger.debug("stopping after phase "+PHASE_GENERATE_LEGACY_SOURCE, LOG_MESSAGE_GROUP);
				return resolvedUnit;
			}
			Future<Boolean> ecorejava2bytecode = ecore2Bytecode.ecorejava2bytecode(genmodelFuture, getThreadExector());
			// process java diagnostic and ensure this thread is finished
			ecore2Bytecode.processDiagnostic(ecorejava2bytecode);
			if(phaseRank(stopAfterPhase) <= phaseRank(PHASE_GENERATE_LEGACY_SOURCE_BYTECODE)){
				logger.debug("stopping after phase "+PHASE_GENERATE_LEGACY_SOURCE_BYTECODE, LOG_MESSAGE_GROUP);
				return resolvedUnit;
			}
			
			// deal with km to scala
			// compiler require a file location not an URL
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Generating scala...", LOG_MESSAGE_GROUP, 1);
			
			fullBinaryDependencyClassPath.add(0,targetEMFBinaryFolder+"/"); // add the path to java code frome generated emf
			
			logger.debug("Generating scala for "+kpFileURL, LOG_MESSAGE_GROUP);
			String fileLocation = mergedFile.toURI().toURL().getFile(); 
			StringBuilder fullBinaryDependencyClassPathSB = new StringBuilder(); 
			for(String singlePath : fullBinaryDependencyClassPath){
				fullBinaryDependencyClassPathSB.append(singlePath);
				fullBinaryDependencyClassPathSB.append(System.getProperty("path.separator"));
			}
			km2Scala(kp, varExpander, fileLocation, targetGeneratedScalaSourceFolder, targetRootFolder, fullBinaryDependencyClassPathSB.toString());
			
			
			if(phaseRank(stopAfterPhase) <= phaseRank(PHASE_GENERATE_SCALA)){
				logger.debug("stopping after phase "+PHASE_GENERATE_SCALA, LOG_MESSAGE_GROUP);
				return resolvedUnit;
			}
			

			logger.progress(getMainProgressGroup()+".kp2bytecode", "Generating bytecode...", LOG_MESSAGE_GROUP, 1);
			
			// deal with scala to bytecode
			int result =scala2bytecode(fullBinaryDependencyClassPath);
			if(result != 0){
				this.errorMessage = "Error detected during bytecode generation. Compilation not complete for this project.";
				logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				// this error is important enough to be reported in the logger
				logger.error(this.errorMessage, LOG_MESSAGE_GROUP);
				this.hasFailed = true;
			}
			
			return resolvedUnit;
		} finally {
			logger.doneProgress(getMainProgressGroup()+".kp2bytecode", "End of compilation for " +kpFileURL , LOG_MESSAGE_GROUP);
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			lock.unlock();
		}
	}

	

	/**
	 * Main process
	 * 
	 * @param kpFileURL
	 * @throws IOException
	 */
	public ModelingUnit kp2bytecode(String kpFileURL, List<String> additionalClassPath, String stopAfterPhase) throws IOException {
		return kp2bytecode(kpFileURL, new HashMap<URL, ModelingUnit>(), additionalClassPath, stopAfterPhase);
	}
	public ModelingUnit kp2bytecode4library(String kpFileURL, List<String> additionalClassPath, String stopAfterPhase) throws IOException {
		return kp2bytecode4library(kpFileURL, new HashMap<URL, ModelingUnit>(), additionalClassPath, stopAfterPhase);
	}
	
	public ModelingUnit parse(URL uri) {
		logger.flushProblem(KMTparser.LOG_MESSAGE_GROUP, uri);
		KMTparser theParser = new KMTparser();
		return theParser.load(uri, "", logger);
	}

	public ModelingUnit parse(URL uri, String content) {
		logger.flushProblem(KMTparser.LOG_MESSAGE_GROUP, uri);
		KMTparser theParser = new KMTparser();
		return theParser.load(uri, content, logger);
	}

	/**
	 * computes the list of all the sources for this project
	 * @param kpString
	 * @return
	 * @throws IOException
	 */
	public ArrayList<TracedURL> getAllResolvedProjectSources(String kpString) throws IOException {
		CollectSourcesHelper sourceHelper = new CollectSourcesHelper(this, logger);
		ArrayList<TracedURL> result = sourceHelper.getResolvedImportProjectSources(kpString);
		result.addAll(sourceHelper.getDirectImportFiles(kpString));
		return result;
	}
	

	/**
	 * return a list of available jar on the file system corresponding to the kp dependencies
	 * @param kp
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String> getImportProjetJarClasspath(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		for(ImportProjectJar dep : kp.getImportedProjectJars()){
			result.add(convertUrlToclassPath(varExpander.expandVariables(dep.getUrl())));
		}
		return result;
	}
	
	public ArrayList<String> getImportByteCodeJarClasspath(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		for(ImportBytecodeJar dep : kp.getImportedBytecodeJars()){
			result.add(convertUrlToclassPath(varExpander.expandVariables(dep.getUrl())));
		}
		return result;
	}
	
	public String convertUrlToclassPath(String urlString){
		try {
			URL jarURL = new URL(urlString);
			/*if (jarURL.getProtocol().equals("jar") && jarURL.getFile().endsWith("!/")){
				// this is something like jar:file:/C:/eclipse3.7_base/eclipse/plugins/org.eclipse.emf.ecore_2.7.0.v20110912-0920.jar!/
				jarURL = new URL(jarURL.getFile().replaceAll("!/", ""));
			}*/
			if( jarURL.getProtocol().equals("file")){ 
				File theFile = new File(jarURL.toURI());
				if (theFile!=null) {
					if(theFile.exists()){
						if(theFile.getName().equals("bundlefile")){
							//some version of scala compiler doesn't accept classpath to jar that doesn't end with .jar
							// so bundlefile that are used by OSGI doesn't works correctly
							// create a copy with the correct name
							
							File outFile = new File(java.net.URI.create(jarURL+".jar"));
							if(!outFile.exists()){
								// copy the file to have the correct extension
								InputStream inputStream = new FileInputStream(theFile);					
								OutputStream out = new FileOutputStream(outFile);
								 
								int read = 0;
								byte[] bytes = new byte[1024];
							 
								while ((read = inputStream.read(bytes)) != -1) {
									out.write(bytes, 0, read);
								}
							 
								inputStream.close();
								out.flush();
								out.close();
							}
							theFile = outFile;
						}
						return theFile.getAbsolutePath();
					}
				}
			
			}
		} catch (URISyntaxException e) {}
		catch (java.net.MalformedURLException e) {}
		catch(IOException e){}
		// ignore URI that cannot be translated into a local file ...
		return urlString;
	}
	
/*	public String getResolvedDependencyURL(Dependency dep,  KpVariableExpander varExpander)  throws IOException {
		// for a dependency use the first URL that works			
		for(String dependencyURLWithVariable : dep.getUrl()){
			String dependencyURL = varExpander.expandSimpleVariables(dependencyURLWithVariable);
			// try to convert it into a file URI
			java.net.URI fileURI = fileSystemConverter.convertSpecialURItoFileURI(java.net.URI.create(dependencyURL));
			if(fileURI != null){					
				dependencyURL = fileURI.toString();
			}
			if (dependencyURLWithVariable.contains("${")) {
				// deal with variable expansion
				logger.debug("dependency : " + dependencyURLWithVariable + " ( expanded to : " + dependencyURL + ")", LOG_MESSAGE_GROUP);
			} else {
				logger.debug("dependency : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
			}
			try {
				URL jarURL = new URL(dependencyURL);
				if (jarURL.getProtocol().equals("jar") && jarURL.getFile().endsWith("!/")){
					// this is something like jar:file:/C:/eclipse3.7_base/eclipse/plugins/org.eclipse.emf.ecore_2.7.0.v20110912-0920.jar!/
					jarURL = new URL(jarURL.getFile().replaceAll("!/", ""));
				}
				if( jarURL.getProtocol().equals("file")){ 
					File theFile = new File(jarURL.toURI());
					if (theFile!=null) {
						if(theFile.exists()){
							if(theFile.getName().equals("bundlefile")){
								//some version of scala compiler doesn't accept classpath to jar that doesn't end with .jar
								// so bundlefile that are used by OSGI doesn't works correctly
								// create a copy with the correct name
								
								File outFile = new File(java.net.URI.create(jarURL+".jar"));
								if(!outFile.exists()){
									// copy the file to have the correct extension
									InputStream inputStream = new FileInputStream(theFile);					
									OutputStream out = new FileOutputStream(outFile);
									 
									int read = 0;
									byte[] bytes = new byte[1024];
								 
									while ((read = inputStream.read(bytes)) != -1) {
										out.write(bytes, 0, read);
									}
								 
									inputStream.close();
									out.flush();
									out.close();
								}
								theFile = outFile;
							}
							return theFile.getAbsolutePath();
						}
						else{
							// try next URL fo this dependency
							continue;
						}
					}
				
				}
				else if(jarURL.getProtocol().equals("mvn")){
					File theFile;
					//logger.debug("aether retreiveing : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
					AetherUtil aetherUtil = new AetherUtil(logger,getMainProgressGroup());
					try{
						theFile = aetherUtil.resolveMavenArtifact(jarURL.toString(), "http://maven.inria.fr/artifactory/repo");
						if(theFile.exists()){
							return theFile.getAbsolutePath();
							//logger.debug("Retreived : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
						}
						else{
							logger.debug("File not found using aether : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
							// try next URL fo this dependency
							continue;
						}
					}
					catch(Throwable e){
						logger.error("File not found using aether : " + dependencyURLWithVariable +" "+e.getMessage(), LOG_MESSAGE_GROUP,e);
					}
				}
			} catch (URISyntaxException e) {
				// ignore URI that cannot be translated into a local file ...
				continue;
				// TODO deal with mvn url in convertSpecialURItoFileURI
			}
			catch (java.net.MalformedURLException e) {
				// ignore URI that cannot be translated into a local file ...
				continue;
				// TODO deal with mvn url in convertSpecialURItoFileURI
			}
		}
		return null;
	}
*/
	public ErrorProneResult<ModelingUnit> mergeModelingUnits(KermetaProject kp, List<ModelingUnit> modelingUnits) throws IOException {
		List<ModelingUnit> convertedModellingUnits = new ArrayList<ModelingUnit>();
		KmBinaryMerger theMerger = null;
		//ModelingUnitConverter muc = new ModelingUnitConverter(logger);

		if (runInEclipse) {
			theMerger = new KmBinaryMergerImpl4Eclipse();
		} else {
			theMerger = new KmBinaryMergerImpl();
		}

		
		
		for (ModelingUnit mu : modelingUnits) {
			// no need to preconvert and save, the merger already has a way to convert unit if necessary
			// since we don't really use their serialized version now
			//convertedModellingUnits.add(muc.convert(mu));			
			convertedModellingUnits.add(mu);
		}
		
		// merge
		ErrorProneResult<ModelingUnit> mergedMU = new ErrorProneResult<ModelingUnit>(convertedModellingUnits.get(0));

		if (convertedModellingUnits.size() > 1) {
			// Use KmBinaryMerger to be able to use ErrorProneResults to track
			// problems

			List<ResultProblemMessage> problems = new ArrayList<ResultProblemMessage>();

			for (int i = 1; i < convertedModellingUnits.size(); i++) {
				logger.debug("merging "+mergedMU.getResult().getName()+" + "+convertedModellingUnits.get(i).getName(), LOG_MESSAGE_GROUP);
				mergedMU = theMerger.merge(mergedMU.getResult(), convertedModellingUnits.get(i));
				mergedMU.getResult().setName(kp.getMetamodelName());
				// Save previous problems
				for (ResultProblemMessage prob : mergedMU.getProblems()) {
					problems.add(prob);
				}
			}

			// Add all previous problems to the last mergedMU ErrorProneResult.
			mergedMU.getProblems().addAll(problems);

		}

		// return mergedMU.getResult();
		return mergedMU;
	}

	public ModelingUnit resolveModelingUnit(ModelingUnit mu, String kpFileURL, boolean isPreResolve) throws IOException {
		KmResolver theResolver;

		if (runInEclipse) {
			theResolver = new KmResolverImpl4Eclipse(logger);
		} else {
			theResolver = new KmResolverImpl(logger);
		}

		String nameAddition = isPreResolve ? "Preresolve" : "";
		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/before"+nameAddition+"Resolving.km", logger).convert(mu);

		// Resolving
		ErrorProneResult<ModelingUnit> resolvedMU = theResolver.doResolving(convertedModelingUnit);

		if(! isPreResolve){
			// Did errors occur during the resolving ?
			if (resolvedMU.getProblems().size() > 0) {
				errorHandlingHelper.processErrors(resolvedMU, FileHelpers.StringToURL(kpFileURL));
				if (stopOnError) {
					logger.error("Errors have occured during resolving, stop compilation process", LOG_MESSAGE_GROUP, new Throwable());
					this.hasFailed = true; // message for the caller of the compiler
					this.errorMessage = "Errors have occured during resolving";
					if(saveIntermediateFiles)
						new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeSetting.km", logger).convert(resolvedMU.getResult());
					return null;
				}
			}
		}
		else{
			// TODO can probably go further that just the resolve and also prepare the setter too.
			// currently cannot prepare more than that because if we apply the Setter, 
			// then a new run on the resolver will fail because it will forget to update the use of the types it will resolve now
			//  
			return resolvedMU.getResult();
		}

		if (resolvedMU.getResult() != null) {
			convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/before"+nameAddition+"Setting.km", logger).convert(resolvedMU.getResult());

			// StaticSetting
			ErrorProneResult<ModelingUnit> staticsettedMU = theResolver.doStaticSetting(convertedModelingUnit);
			if(! isPreResolve){
				// Did errors occur during the resolving ?
				if (staticsettedMU.getProblems().size() > 0) {
					errorHandlingHelper.processErrors(staticsettedMU, FileHelpers.StringToURL(kpFileURL));
					if (stopOnError) {
						logger.error("Errors have occured during static setting, stop compilation process", LOG_MESSAGE_GROUP, new Throwable());
						this.hasFailed = true; // message for the caller of the compiler
						this.errorMessage = "Errors have occured during static setting";
						if(saveIntermediateFiles)
							new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeCheckingforScopeRESOLVED.km", logger).convert(staticsettedMU.getResult());
						
						return null;
					}
				}
			}
			// End of Resolving
			return staticsettedMU.getResult();
		}
		logger.error("Errors have occured during resolve. StaticSetting not executable", LOG_MESSAGE_GROUP, new Throwable());
		this.hasFailed = true; // message for the caller of the compiler
		this.errorMessage = "Errors have occured during static setting";
		return convertedModelingUnit;
	}

	
	
	private ArrayList<URL> getEcoreNeedingGeneration(KermetaProject kp,  KpVariableExpander varExpander){

		ArrayList<URL> ecoreURLs = new ArrayList<URL>();
		CollectSourcesHelper helper = new CollectSourcesHelper(this, logger);
		try {
			ArrayList<TracedURL> importedProjectSources = helper.getResolvedImportProjectSources(kp, kp.eResource().getURI().toString());
			for (TracedURL src : importedProjectSources) {
				if(src.getUrl().toString().endsWith(".ecore"))
					ecoreURLs.add(src.getUrl());
			}
		} catch (Exception e) {	
			logger.error("Pb retrieving ecore sources", LOG_MESSAGE_GROUP, e);
		}
		return ecoreURLs;
	}
	
	
	synchronized public void km2Scala(KermetaProject kp, KpVariableExpander varExpander, String kmFileURL, String targetGeneratedSourceFolder, String targetFolder, String userAdditionalClassPath) throws UnsupportedEncodingException {
		initializeforBuilding(kp, URLDecoder.decode(targetFolder,"UTF-8"), URLDecoder.decode(targetFolder,"UTF-8"), userAdditionalClassPath);
		/*
		 * if(packageEquivalences != null){ for (int i = 0; i <
		 * packageEquivalences.length; i++) { PackageEquivalence equivalence =
		 * packageEquivalences[i];
		 * this.getLog().info("   PackageEquivalence found: " +
		 * equivalence.getEcorePackageName() + " -> "
		 * +equivalence.getJavaPackageName());
		 * kermeta.utils.TypeEquivalence.packageEquivelence
		 * ().put(equivalence.getEcorePackageName(),
		 * equivalence.getJavaPackageName()); } }
		 */
		CollectSourcesHelper helper = new CollectSourcesHelper(this, logger);
		for( PackageEquivalence packEquivalence : helper.collectAllPackageEquivalences(kp)){
			if(packEquivalence.getEcorePackage() !=  null && packEquivalence.getJavaPackage() !=  null &&
					(!packEquivalence.getEcorePackage().isEmpty()) && (!packEquivalence.getJavaPackage().isEmpty()))	{
				logger.debug("\tadding package equivalence "+packEquivalence.getEcorePackage() +"="+ packEquivalence.getJavaPackage(), LOG_MESSAGE_GROUP);
				k2.utils.TypeEquivalence.packageEquivelence().put(packEquivalence.getEcorePackage(), packEquivalence.getJavaPackage());
			}
			else{
				logger.warn("ignoring invalid (empty) package equivalence", LOG_MESSAGE_GROUP);
			}
			
		}
		org.kermeta.compilo.scala.Compiler km2ScalaCompiler = new org.kermeta.compilo.scala.Compiler();
		km2ScalaCompiler.compile(URLDecoder.decode(kmFileURL,"UTF-8"));
	}

	private void initializeforBuilding(KermetaProject kp, String targetGeneratedSourceFolder, String targetFolder, String userAdditionalClassPath) {
		
		GlobalConfiguration.outputFolder_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SCALA_SUBFOLDER);
		GlobalConfiguration.outputProject_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SUBFOLDER);
		//If classes is modified, please impact it on method checkIfBuildIsNeeded on KPBuilder.java
		//*************
		GlobalConfiguration.outputBinFolder_$eq(targetScalaBinaryFolder);
		//*************
		GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit." + kp.getMetamodelName());
		GlobalConfiguration.props_$eq(new Properties());
		GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
		GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
		GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");
		// GroupId and ArtifactId are used to prefix the generated code
		//GlobalConfiguration.props().setProperty("project.group.id", kp.getGroup());
		GlobalConfiguration.props().setProperty("project.artefact.id", kp.getMetamodelName());
		
		GlobalConfiguration.props().setProperty("user.additional.classpath",userAdditionalClassPath);

		// default baseClass and baseOperation
		if (kp.getDefaultMainClass() != null) {
			GlobalConfiguration.props().setProperty("baseClass", kp.getDefaultMainClass());
		}
		if (kp.getDefaultMainOperation() != null) {
			GlobalConfiguration.props().setProperty("baseOperation", kp.getDefaultMainOperation());
		}

		// GlobalConfiguration.load(GlobalConfiguration.props());
		GlobalConfiguration.setScalaAspectPrefix(kp.getMetamodelName());
	}

	public DiagnosticModel checkModelingUnit(ModelingUnit mu, CheckerScope scope) throws IOException {

		logger.debug("checkModelingUnit " + mu.getName() + " for scope " + scope.toString(), LOG_MESSAGE_GROUP);
		
		Checker theChecker;

		if (runInEclipse) {
			theChecker = new CheckerImpl4Eclipse();
		} else {
			theChecker = new CheckerImpl();
		}

		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, 
					targetIntermediateFolder + "/beforeCheckingforScope"+scope.toString()+".km", logger).convert(mu);

		
		// Checking
		DiagnosticModel diags = null;
		try {
			diags = theChecker.check(convertedModelingUnit, scope, "", logger);
		} catch (Exception e) {
			
			e.printStackTrace();
			logger.error("Internal error in the checker; ", LOG_MESSAGE_GROUP,e);
			
			this.hasFailed = true; // message for the caller of the compiler
			this.errorMessage = "Internal error in the checker; " +e.getMessage();
		}

		return diags;
	}

	

	
	/**
	 * Flush the problems marker related to this kp
	 */
	protected void flushProblems(ArrayList<TracedURL> kpSources) {

		for (TracedURL oneURL : kpSources) {
			flushProblems(oneURL.getUrl());
		}
	}
	protected void flushProblems(URL kpSource) {
		//logger.log(Kind.DevDEBUG, "flushProblems on "+kpSource, LOG_MESSAGE_GROUP, new Exception());
		// flush compiler general problems
		logger.flushProblem(LOG_MESSAGE_GROUP, kpSource);
		// flush parser problems
		logger.flushProblem(KMTparser.LOG_MESSAGE_GROUP, kpSource);
		// flush merger problems
		// flush resolver problems
		logger.flushProblem(KmResolver.LOG_MESSAGE_GROUP, kpSource);
		// flush km2scala problems
		// flush scala2bytecode problems
	}

	


	
	private int scala2bytecode(List<String> additionalClassPath) {

		List<String> classpath = new ArrayList<String>();
		/*
		 * System.out.println("TOTO" +System.getProperty("java.classpath"));
		 * System.out.println("TOTO" +System.getProperty("java.class.path"));
		 * 
		 * if(System.getProperty("java.classpath") != null ) { for (String s :
		 * System.getProperty("java.classpath").split(File.pathSeparator)){
		 * classpath.add(s); } } if(System.getProperty("java.class.path") !=
		 * null ) { for (String s :
		 * System.getProperty("java.class.path").split(File.pathSeparator)){
		 * classpath.add(s); } }
		 */
		classpath.addAll(additionalClassPath);

		// java.util.List<String> additionalClassPath = new
		// java.util.ArrayList<String>();
		// additionalClassPath.add("mvn:org.scala-lang/scala-library/2.8.1");
		// additionalClassPath.add("C:/Users/dvojtise/.m2/repository/org/scala-lang/scala-library/2.8.1/scala-library-2.8.1.jar");

		// s1.add("toto");

		/*
		 * EmbeddedMavenHelper.run(GlobalConfiguration.clean(),
		 * GlobalConfiguration.createPackage(),
		 * GlobalConfiguration.standalone(), GlobalConfiguration.exec(),
		 * additionalClassPathWrapper.toList(), System.out);
		 */

		logger.info("Compiling generated scala to bytecode in " + GlobalConfiguration.outputBinFolder(), LOG_MESSAGE_GROUP);
		logger.debug("Classpath: " + classpath.size(), LOG_MESSAGE_GROUP);
		for (String path : classpath) {

			logger.debug("\t" + path, LOG_MESSAGE_GROUP);
		}
		logger.debug("End Classpath: " + classpath.size(), LOG_MESSAGE_GROUP);

		int result = EmbeddedScalaCompiler.compile(GlobalConfiguration.outputFolder(), GlobalConfiguration.outputBinFolder(), true, classpath, useFSC);
		if (result != 0) {
			hasFailed = true;
			errorMessage = "Failed to generate bytecode from intermediate scala";
		}
		return result;
	}
	
	
	public boolean  checkKP(KermetaProject kp, String kpFileURL) throws MalformedURLException{
		//KpResourceHelper.createFileReference(kp.getName())
		if (kp.getMetamodelName() == null) {
			this.errorMessage = "Invalid kp file. Missing project name";
			this.hasFailed = true;
		}
		if (kp.getMetamodelName().isEmpty()) {
			this.errorMessage = "Invalid kp file. Missing project name";
			this.hasFailed = true;
		}

		if (kp.getMetamodelName().contains("-")) {
			this.errorMessage = "Forbidden character '-' in project name";
			this.hasFailed = true;
		}
		
		if (kp.getMetamodelName().contains(" ")) {
			this.errorMessage = "Forbidden character ' ' in project name";
			this.hasFailed = true;
		}
		
		
		String firstChar = kp.getMetamodelName().substring(0, 1);
		if ("0123456789".contains(firstChar)) {
			this.errorMessage = "cannot use an integer as first character of the project name";
			this.hasFailed = true;
		}
		if(this.hasFailed){
			logger.logProblem(MessagingSystem.Kind.UserERROR, this.errorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
			
			return false;
		}
		return true;
	}
	
	public void createJar(String kpFileURL, String targetGeneratedSourceFolder, String targetFolder){
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		KermetaProject kp = ldr.loadKp(kpFileURL);
		initializeforBuilding(kp, targetGeneratedSourceFolder, targetFolder, "");
		if (GlobalConfiguration.createPackage()) {
			File fo;
			try {
				fo = new File(GlobalConfiguration.outputProject() + File.separator + "target").getCanonicalFile();
				fo.mkdirs();
				org.kermeta.language.km2bytecode.embedded.scala.JarCreatorScala.run(GlobalConfiguration.outputBinFolder(), GlobalConfiguration.outputProject() + File.separator + "target" + File.separator + GlobalConfiguration.scalaAspectPrefix() + ".jar", GlobalConfiguration.outputFolder() + File.separator + ".." + File.separator + "resources" + File.separator + GlobalConfiguration.scalaAspectPrefix() + "Reflexivity.km");
			} catch (IOException e) {
				this.logger.error(e.toString(), KermetaCompiler.LOG_MESSAGE_GROUP, e);
			}
		}
	}
	
	public String getMainProgressGroup(){
		if(contributedProgressGroup.equals(""))
			return "KermetaCompiler["+this.hashCode()+"]";
		else
			return contributedProgressGroup+".KermetaCompiler["+this.hashCode()+"]";
	}

	public void failWithMessage(String msg){
		this.hasFailed = true;
		this.errorMessage = msg;
	}
	
	public static  int phaseRank(String phase){
		if(phase.equals(PHASE_COLLECT_SOURCES)) return 1;
		if(phase.equals(PHASE_MERGE)) return 2;
		if(phase.equals(PHASE_RESOLVE)) return 3;
		if(phase.equals(PHASE_TYPE_SET)) return 4;
		if(phase.equals(PHASE_GENERATE_LEGACY_SOURCE)) return 5;
		if(phase.equals(PHASE_GENERATE_LEGACY_SOURCE_BYTECODE)) return 6;
		if(phase.equals(PHASE_GENERATE_SCALA)) return 7;
		if(phase.equals(PHASE_GENERATE_SCALA_BYTECODE)) return 8;
		return 8;
	}
	
	
	protected boolean isPreresolveUpToDate(ArrayList<TracedURL> kpPreResolveSources, String preResolveCacheUrl, String preResolveSrcListUrl){
		try {
			File preResolveSrcListfile = new java.io.File(FileHelpers.StringToURI(preResolveSrcListUrl));
			File preResolveCachefile = new java.io.File(FileHelpers.StringToURI(preResolveCacheUrl));
			if(preResolveSrcListfile.exists() && preResolveCachefile.exists()){
				String olderOutFile;
				if(preResolveSrcListfile.lastModified()<preResolveCachefile.lastModified()){
					olderOutFile=preResolveSrcListUrl;					
				}
				else{
					olderOutFile=preResolveCacheUrl;	
				}
				ModelingUnitCacheHelper cacheHelper = new ModelingUnitCacheHelper(logger);
				ArrayList<String> inputfilesUrls = readPreviousPreResolveSrcList(preResolveSrcListUrl);
				// if this list is the same as the previous one
				if(inputfilesUrls.size() != kpPreResolveSources.size()){
					return false;
				}
				for(TracedURL tracedUrl: kpPreResolveSources){
					if(!inputfilesUrls.contains(tracedUrl.getUrl().toString())){
						logger.debug("cannot reuse preresolved due to unmatched source for "+tracedUrl.getUrl(), LOG_MESSAGE_GROUP);
						return false;
					}
				}
				// check that non of the input file is newer
				return cacheHelper.isCacheUpTodate(inputfilesUrls, olderOutFile);
			}
			return false;
		} 
		catch(Exception e){
			return false;
		}
	}
	
	protected void savePreResolveSrcList(String preResolveSrcListUrl, ArrayList<TracedURL> kpPreResolveSources)  {
		
		try {
			File f = new java.io.File(FileHelpers.StringToURI(preResolveSrcListUrl));
			FileWriter fstream = new FileWriter(f);
			BufferedWriter out = new BufferedWriter(fstream);
			for(TracedURL tracedURL : kpPreResolveSources){
				out.write(tracedURL.getUrl().toString()+"\n");
			}
			//Close the output stream
			out.close();			
		} catch (Exception e) {
			logger.error("cannot save "+preResolveSrcListUrl, LOG_MESSAGE_GROUP, e);
		}
	}
	protected ArrayList<String> readPreviousPreResolveSrcList(String preResolveSrcListUrl)  {
		ArrayList<String> result = new ArrayList<String>();
		try {
			File f = new java.io.File(FileHelpers.StringToURI(preResolveSrcListUrl));
			Scanner scanner = new Scanner(new FileInputStream(f));
		    try {
		      while (scanner.hasNextLine()){
		    	  result.add(scanner.nextLine());
		      }
		    }
		    finally{
		      scanner.close();
		    }	

		} catch (Exception e) {
			logger.error("cannot read "+preResolveSrcListUrl, LOG_MESSAGE_GROUP, e);
		}
	    return result;
	}
	
	public void setModelingUnitLoaders(NavigableMap<String,ModelingUnitLoaderFactory> muLoaders){
		this.muLoaders = muLoaders;
	}
	
	/**
	 * In case the modelingUnit doesn't have kermeta::standard::Object create it as aspect
	 * @param mu
	 * @return
	 */
	protected ModelingUnit addStandardObjectIfRequired(ModelingUnit mu){
		org.kermeta.language.structure.Metamodel kermetaMM = null;
		for(org.kermeta.language.structure.Metamodel mm : mu.getMetamodels()){
			if(mm.getName().equals("kermeta_standard")) kermetaMM = mm;
		}
		if(kermetaMM == null) {
			kermetaMM = org.kermeta.language.structure.StructureFactory.eINSTANCE.createMetamodel();
			kermetaMM.setName("kermeta_standard");
			mu.getMetamodels().add(kermetaMM);
		}
		org.kermeta.language.structure.Package kermetaPackage = null;
		for(org.kermeta.language.structure.Package pack : kermetaMM.getPackages()){
			if(pack.getName().equals("kermeta")) kermetaPackage = pack;
		}
		if(kermetaPackage == null) {
			kermetaPackage = org.kermeta.language.structure.StructureFactory.eINSTANCE.createPackage();
			kermetaPackage.setName("kermeta");
			kermetaMM.getPackages().add(kermetaPackage);
		}
		org.kermeta.language.structure.Package standardPackage = null;
		for(org.kermeta.language.structure.Package pack : kermetaPackage.getNestedPackage()){
			if(pack.getName().equals("standard")) standardPackage = pack;
		}
		if(standardPackage == null) {
			standardPackage = org.kermeta.language.structure.StructureFactory.eINSTANCE.createPackage();
			standardPackage.setName("standard");
			kermetaPackage.getNestedPackage().add(standardPackage);
		}
		
		org.kermeta.language.structure.ClassDefinition objectCD = null;
		for(org.kermeta.language.structure.TypeDefinition td : standardPackage.getOwnedTypeDefinition()){
			if(td instanceof ClassDefinition){
				if(((ClassDefinition)td).getName().equals("Object")){
					objectCD = (ClassDefinition) td;
				}
			}
		}
		if(objectCD == null){
			logger.debug("adding kermeta_standard#kermeta::standard::Objet to ModelingUnit that doesn't have it", LOG_MESSAGE_GROUP);
			objectCD = org.kermeta.language.structure.StructureFactory.eINSTANCE.createClassDefinition();
			objectCD.setName("Object");
			objectCD.setIsAspect(true);
			standardPackage.getOwnedTypeDefinition().add(objectCD);
		}
		
		return mu;
	}
}
