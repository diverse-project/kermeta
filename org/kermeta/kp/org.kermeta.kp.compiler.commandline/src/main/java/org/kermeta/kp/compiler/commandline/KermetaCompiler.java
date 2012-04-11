/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.compilo.scala.GlobalConfiguration;
import org.kermeta.diagnostic.Constraint;
import org.kermeta.diagnostic.ConstraintDiagnostic;
import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.diagnostic.InvariantProxy;
import org.kermeta.diagnostic.ModelReference;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.kp.Source;
import org.kermeta.kp.compiler.commandline.callable.CallableGenmodelGenerator;
import org.kermeta.kp.compiler.commandline.callable.CallableLogProblem;
import org.kermeta.kp.compiler.commandline.callable.CallableModelingUnitLoader;
import org.kermeta.kp.compiler.commandline.urlhandler.ExtensibleURLStreamHandlerFactory;
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
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.utils.aether.AetherUtil;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.helpers.StringHelper;
import org.kermeta.utils.helpers.emf.EMFUriHelper;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.reference.FileReference;
import org.kermeta.utils.systemservices.api.reference.TextReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;

/**
 * Basic compilation process for Kermeta2 This class is a facade for producing
 * bytecode from a kermeta2 project
 */
public class KermetaCompiler {

	public final static String LOG_MESSAGE_GROUP = "org.kermeta.kp.compiler.commandline";
	
	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_REFLEXIVITY_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String DEFAULT_KP_LOCATION_IN_FOLDER = "/project.kp";
	public static String DEFAULT_BINARY_LOCATION_IN_ECLIPSE = "/target/scalaclasses";
	public static String DEFAULT_EMFBINARY_LOCATION_IN_ECLIPSE = "/target/emfclasses";
	public static String INTERMEDIATE_SUBFOLDER = "";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER + "/scala";


	public boolean checkingEnabled = false;
	public boolean stopOnError = true;

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

	//private ExecutorService threadExector = Executors.newCachedThreadPool();
	// this kind of executor should be able to queue any number of parallel tasks and run them on the available Threads in the pool
	// it is tuned to accept a burst of request and process them ...
	// see http://docs.oracle.com/javase/1.5.0/docs/api/java/util/concurrent/ThreadPoolExecutor.html
	private ExecutorService threadExector = new ThreadPoolExecutor(16, 16, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
	
	private ExecutorService singleThreadExector = Executors.newSingleThreadExecutor();
	
	
	
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
		this.fileSystemConverter = uriPhysicalConverter;
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
		errorHandlingHelper = new ErrorHandlingHelper(logger, LOG_MESSAGE_GROUP, getMainProgressGroup(), threadExector);
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
		this.fileSystemConverter = uriPhysicalConverter;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.runInEclipse = willRunInEclipse;
		this.checkingEnabled = checkingEnabled;
		this.stopOnError = stopOnError;
		if (registerProtocols) {
			registerMVNUrlHandler();
		}
		/*if (threadExector instanceof ThreadPoolExecutor)
		    ((ThreadPoolExecutor) threadExector).setMaximumPoolSize(32);*/
		
		errorHandlingHelper = new ErrorHandlingHelper(logger, LOG_MESSAGE_GROUP, getMainProgressGroup(), threadExector);
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

	public synchronized ModelingUnit kp2bytecode(String kpFileURL, HashMap<URL, ModelingUnit> dirtyMU, List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
		try {
			lock.lock();
			this.hasFailed = false;
			flushProblems(FileHelpers.StringToURL(kpFileURL));
			String projectName = "project";
	
			int workUnit = 4;
			if(checkingEnabled) workUnit = workUnit+4;
			if(!generateKmOnly) workUnit = workUnit+2;
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
	
			if (kp.getName() == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Invalid kp file. Missing project name", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Invalid kp file. Missing Project name";
				this.hasFailed = true;
				return null;
			}
			
			if (!kp.getName().isEmpty()) {
				projectName = kp.getName();
			}

			logger.progress(getMainProgressGroup()+".kp2bytecode", "Identifing sources to load...", LOG_MESSAGE_GROUP, 1);
			KpVariableExpander varExpander = new KpVariableExpander(kpFileURL, kp, fileSystemConverter, logger);
			ArrayList<TracedURL> kpSources = getSources(kp,kpFileURL, varExpander);
			if (kpSources.size() == 0) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Invalid kp file. No sources detected.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Invalid kp file. No sources detected.";
				this.hasFailed = true;
				return null;
			}
			
			flushProblems(kpSources);
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Loading "+kpSources.size()+" sources...", LOG_MESSAGE_GROUP, 1);
			
			List<ModelingUnit> modelingUnits = getSourceModelingUnits(kp, kpSources, kp.getName(), dirtyMU);
	
			if (modelingUnits.size() == 0) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Kermeta project invalid. There is no modeling unit to compile.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "Kermeta project invalid.  There is no modeling unit to compile.";
				this.hasFailed = true;
				return null;
			}
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Merging " + modelingUnits.size() + " files...", LOG_MESSAGE_GROUP, 1);
			ErrorProneResult<ModelingUnit> mergedUnit = mergeModelingUnits(kp, modelingUnits);
	
			// Did errors occur during the merge ?
			if (mergedUnit.getProblems().size() > 0) {
				errorHandlingHelper.processErrors(mergedUnit, FileHelpers.StringToURL(kpFileURL));
				if (stopOnError) {
					logger.logProblem(MessagingSystem.Kind.UserERROR, "Unable to merge the files. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
					this.errorMessage = "Unable to merge the files. Compilation not complete for this project.";
					this.hasFailed = true;
					return null;
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
						logger.logProblem(MessagingSystem.Kind.UserERROR, "The merged result is not valid. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						this.errorMessage = "The merged result is not valid. Compilation not complete for this project.";
						this.hasFailed = true;
						return null;
					}
				}
			}
	
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			logger.progress(getMainProgressGroup()+".kp2bytecode", "Resolving...", LOG_MESSAGE_GROUP, 1);
			ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit.getResult()/*convertedModelingUnit*/, kpFileURL);
	
			if (resolvedUnit == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "The resolved result is not valid. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				this.errorMessage = "The resolved result is not valid. Compilation not complete for this project.";
				this.hasFailed = true;
				return null;
			}
			

			// checking existence and conformance of the defaultMainClass and default MainOperation
			new KpChecker(this).checkDefaultMain(kpFileURL, kp, resolvedUnit);
			if(this.hasFailed){
				return null;
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
						logger.logProblem(MessagingSystem.Kind.UserERROR, "The resolved result is not valid. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						this.errorMessage = "The resolved result is not valid. Compilation not complete for this project.";
						this.hasFailed = true;
						return null;
					}
				}
			}
	
			// save resolvedUnit to the META-INF/kermeta/merged.km
			URI uri = URI.createURI(((resolvedUnit.getNamespacePrefix().isEmpty() ?"":resolvedUnit.getNamespacePrefix() + ".") + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
			File mergedFile = new File(targetGeneratedResourcesFolder + DEFAULT_KP_METAINF_LOCATION_IN_JAR + File.separatorChar+ projectName + ".km");
			if (!mergedFile.getParentFile().exists()) {
				mergedFile.getParentFile().mkdirs();
			}
			FileWriter writer = new FileWriter(mergedFile);
	
			writer.write(new ModelingUnitConverter(logger).saveMu(resolvedUnit, uri).toString());
			writer.close();
			
			
			
			
			

			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			if (!generateKmOnly) {

				List<String> fullBinaryDependencyClassPath = getBinaryDependencyClasspath(kp, varExpander);
				fullBinaryDependencyClassPath.addAll(additionalClassPath);
				// generating 
				ArrayList<URL> ecoreForGenerationURLs = getEcoreNeedingGeneration(kp, varExpander );
				Ecore2Bytecode ecore2Bytecode = new Ecore2Bytecode(logger, getMainProgressGroup(), kp, ecoreForGenerationURLs, targetGeneratedGenmodelFolder, targetGeneratedEMFSourceFolder, targetEMFBinaryFolder, additionalClassPath);
				Future<Boolean> genmodelFuture = ecore2Bytecode.ecore2java(singleThreadExector);
				Future<Boolean> ecorejava2bytecode = ecore2Bytecode.ecorejava2bytecode(genmodelFuture, threadExector);
				
				
				
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
				
				
				
				// process java diagnostic and ensure this thread is finished
				ecore2Bytecode.processDiagnostic(ecorejava2bytecode);

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
			} else {
				logger.info("generateKmOnly flag set => Ignore scala generation", LOG_MESSAGE_GROUP);
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
	public ModelingUnit kp2bytecode(String kpFileURL, List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
		return kp2bytecode(kpFileURL, new HashMap<URL, ModelingUnit>(), additionalClassPath, generateKmOnly);
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

	public ArrayList<TracedURL> getSources(String kpString) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		KermetaProject kp = ldr.loadKp(kpString);
		if (kp != null) {
			return getSources(kp, kpString, new KpVariableExpander(kpString, kp,fileSystemConverter, logger));
		} else {
			return new ArrayList<TracedURL>();
		}
	}

	public ArrayList<TracedURL> getSources(KermetaProject kp, String kpFileUrl, KpVariableExpander varExpander) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		// Note that source is relative to the kp file not the jvm current dir
		List<Source> srcs = kp.getSources();
		ArrayList<TracedURL> kpSources = new ArrayList<TracedURL>();
		for (Source src : srcs) {
			String currentUrl=null;
			try{
				String sourceURLWithVariable = src.getUrl();
				sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
				String sourceURL = varExpander.expandSourceVariables(sourceURLWithVariable);
				if (sourceURLWithVariable.contains("${")) {
					// deal with variable expansion
					logger.debug("sourceURL : " + sourceURLWithVariable + " (expanded to : " + sourceURL + ")", LOG_MESSAGE_GROUP);
				} else {
					logger.debug("sourceURL : " + sourceURLWithVariable, LOG_MESSAGE_GROUP);
				}
				currentUrl = sourceURL;
				kpSources.add(new TracedURL(src, FileHelpers.StringToURL(sourceURL)));
				logger.debug("     FileHelpers.StringToURL(sourceURL) : " + FileHelpers.StringToURL(sourceURL), LOG_MESSAGE_GROUP);
			}
			catch(IOException e){
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Cannot load source "+currentUrl+ " "+e.getMessage(), 
						KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(src));
			}
		}

		// get km from dependencies
		List<Dependency> dependencies = kp.getDependencies();
		for (Dependency dep : dependencies) {
			// ignore dependencies that are meant to be used in a require
			if(!dep.isSourceOnly()){
				
				String baseUriForDependency = varExpander.expandSourceVariables("${"+dep.getName()+KpVariableExpander.BASEURI_VARIABLE+"}");
				boolean isDirectory = false;
				try{
					URI depURI = URI.createURI(baseUriForDependency+"/");
					if((depURI.isPlatformResource() && depURI.fileExtension() == null) || (depURI.isPlatformResource() && ! depURI.fileExtension().equals("jar"))){
						isDirectory = true;
					}
				}catch( Exception e){
					logger.error(e.toString()+ " on " +baseUriForDependency, LOG_MESSAGE_GROUP,e);
				}
				
				
				URI	dependencyKPURI = URI.createURI(baseUriForDependency+DEFAULT_KP_LOCATION_IN_JAR);
				logger.debug("loading dependency kp : "+dependencyKPURI.toString(), LOG_MESSAGE_GROUP);
				ldr = new KpLoaderImpl(logger);				
				KermetaProject dependencyKP = ldr.loadKp(dependencyKPURI);
				
				if (dependencyKP == null) {
					if(findSourceUsingDependency(kp,dep) != null){
						logger.debug("\tdependency used at least for one require", LOG_MESSAGE_GROUP);
					}
					else if(!dep.isByteCodeOnly()){
						logger.logProblem(MessagingSystem.Kind.UserWARNING, "dependency neither contains a kp file nor is used in a require. If you use it as a binary classpath complement only, please add the byteCodeOnly modifier. ", 
								KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(dep));
					}
				} else {
					String dependencyMergedKMUrl;
					if(isDirectory && runInEclipse){
						dependencyMergedKMUrl = baseUriForDependency + DEFAULT_BINARY_LOCATION_IN_ECLIPSE +DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
						
					} else {
						dependencyMergedKMUrl = baseUriForDependency + DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
					}
					kpSources.add(new TracedURL(dep, FileHelpers.StringToURL(dependencyMergedKMUrl)));
				}
				
			}
		}
		return kpSources;
	}

	// TODO move to a kp helper project/class
	protected Source findSourceUsingDependency(KermetaProject kp, Dependency dep){
		List<Source> srcs = kp.getSources();		
		for (Source src : srcs) {
			if(src.getUrl().contains("${"+dep.getName()+KpVariableExpander.BASEURI_VARIABLE+"}")){
				return src;
			}
		}
		return null;
	}
	
	
	
	
	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, ArrayList<TracedURL> kpSources, String projectName, HashMap<URL, ModelingUnit> dirtyMU) {
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();

		
		// load similar compatible files in parallel
		logger.initProgress(getMainProgressGroup()+".getSourceModelingUnits", "Loading "+kpSources.size()+" sources...", LOG_MESSAGE_GROUP, 3);
		ArrayList<TracedURL> ecoreURLs = new ArrayList<TracedURL>();
		ArrayList<TracedURL> normalLoadURLs = new ArrayList<TracedURL>();
	
		ArrayList<TracedURL> umlProfilesURLs = new ArrayList<TracedURL>();
		
		for (TracedURL oneURL : kpSources) {
			if (dirtyMU.get(oneURL) != null) {
				modelingUnits.add(dirtyMU.get(oneURL));
			} else {
				if(oneURL.getUrl().getFile().endsWith(".ecore")){
					ecoreURLs.add(oneURL);
				}
				else if (oneURL.getUrl().getFile().endsWith(".profile.uml")){
					umlProfilesURLs.add(oneURL);
				}
				else{
					normalLoadURLs.add(oneURL);
				}
			}
		}
		
		
		// launch uml profile threads
		ArrayList<Future<Collection<ModelingUnit>>> umlprofileFutures = new ArrayList<Future<Collection<ModelingUnit>>>();
		for (TracedURL umlprofileURL : umlProfilesURLs) {
			umlprofileFutures.add(singleThreadExector.submit(new CallableModelingUnitLoader(umlprofileURL, this, kp, projectName)));
		}
		// join
		for(Future<Collection<ModelingUnit>> future : umlprofileFutures){
			try {
				Collection<ModelingUnit> mus = future.get();
				//ModelingUnit mu = future.get();
				//if(mu!= null) modelingUnits.add(mu); // no need to log, this has been already done by the thread
				if (mus!=null) {
					for (ModelingUnit mu : mus) {
						modelingUnits.add(mu);
					}
				}
			} catch (InterruptedException e) {
				logger.error("Load of an UML Profile interrupted", LOG_MESSAGE_GROUP, e);
			} catch (ExecutionException e) {
				logger.error("Load of an UML Profile failed "+ e, LOG_MESSAGE_GROUP, e);
			}
		}
		logger.doneProgress(getMainProgressGroup()+".getSourceModelingUnits", "All "+umlProfilesURLs.size()+" UML profile loaded.", LOG_MESSAGE_GROUP);

				
		
		// launch ecore threads
		ArrayList<Future<Collection<ModelingUnit>>> ecoreFutures = new ArrayList<Future<Collection<ModelingUnit>>>();
		for(TracedURL ecoreURL : ecoreURLs){
			// TODO EMF isn't thread safe, cannot even run the same transfo in parallel ! => singleThreadExecutor
			ecoreFutures.add(singleThreadExector.submit(new CallableModelingUnitLoader(ecoreURL, this, kp, projectName)));
		}
		// join
		for(Future<Collection<ModelingUnit>> future : ecoreFutures){
			try {
				Collection<ModelingUnit> mus = future.get();
				if (mus!=null) {
					for (ModelingUnit mu : mus) {
						modelingUnits.add(mu);
					}
				}
				/*ModelingUnit mu = future.get();
				if(mu!= null) modelingUnits.add(mu); // no need to log, this has been already done by the thread*/
			} catch (InterruptedException e) {
				logger.error("Load of an Ecore ModelingUnit interrupted", LOG_MESSAGE_GROUP, e);
			} catch (ExecutionException e) {
				logger.error("Load of a ModelingUnit failed "+ e, LOG_MESSAGE_GROUP, e);
			}
		}
		logger.progress(getMainProgressGroup()+".getSourceModelingUnits", "All "+ecoreURLs.size()+" ecore loaded", LOG_MESSAGE_GROUP, 1);
		// launch normalLoad threads
		ArrayList<Future<Collection<ModelingUnit>>> normalLoadFutures = new ArrayList<Future<Collection<ModelingUnit>>>();
		for(TracedURL normalLoadURL : normalLoadURLs){
			normalLoadFutures.add(threadExector.submit(new CallableModelingUnitLoader(normalLoadURL, this, kp, projectName)));
		}
		// join
		for(Future<Collection<ModelingUnit>> future : normalLoadFutures){
			try {
				Collection<ModelingUnit> mus = future.get();
				if (mus!=null) {
					for (ModelingUnit mu : mus) {
						modelingUnits.add(mu);
					}
				}
				/*ModelingUnit mu = future.get();
				if(mu!= null) modelingUnits.add(mu); // no need to log, this has been already done by the thread*/
			} catch (InterruptedException e) {
				logger.error("Load of a ModelingUnit interrupted", LOG_MESSAGE_GROUP, e);
			} catch (ExecutionException e) {
				logger.error("Load of a ModelingUnit failed "+ e, LOG_MESSAGE_GROUP, e);
			}
		}
		logger.doneProgress(getMainProgressGroup()+".getSourceModelingUnits", "All "+kpSources.size()+" sources loaded.", LOG_MESSAGE_GROUP);

		
		
		return modelingUnits;
	}

	/**
	 * return a list of available jar on the file system corresponding to the kp dependencies
	 * @param kp
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String> getBinaryDependencyClasspath(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		// TODO currently deal only with dependencies on the disk (no mvn:/ dependencies)
		List<Dependency> dependencies = kp.getDependencies();
		for (Dependency dep : dependencies) {
			// ignore dependencies that are used only for importing sources or for importing a merged km
			if(! dep.isIgnoreByteCode() && !dep.isSourceOnly()){
				// for each dependency use the first URL that works			
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
					URL jarURL = new URL(dependencyURL);
					if (jarURL.getProtocol().equals("jar") && jarURL.getFile().endsWith("!/")){
						// this is something like jar:file:/C:/eclipse3.7_base/eclipse/plugins/org.eclipse.emf.ecore_2.7.0.v20110912-0920.jar!/
						jarURL = new URL(jarURL.getFile().replaceAll("!/", ""));
					}
					if( jarURL.getProtocol().equals("file")){ 
						File theFile;
						try {
							theFile = new File(jarURL.toURI());
							if (theFile!=null) {
								if(theFile.exists()){
									result.add(theFile.getAbsolutePath());
								}
								else{
									// try next URL fo this dependency
									continue;
								}
							}
						} catch (URISyntaxException e) {
							// ignore URI that cannot be translated into a local file ...
							continue;
							// TODO deal with mvn url in convertSpecialURItoFileURI
						}
					}
					else if(jarURL.getProtocol().equals("mvn")){
						File theFile;
						//logger.debug("aether retreiveing : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
						AetherUtil aetherUtil = new AetherUtil(logger,getMainProgressGroup());
						try{
							theFile = aetherUtil.resolveMavenArtifact(jarURL.toString(), "http://maven.inria.fr/artifactory/repo");
							if(theFile.exists()){
								result.add(theFile.getAbsolutePath());
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
				}
			}
		}
		return result;
	}
	
	
	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, String kpFileURL, KpVariableExpander varExpander, HashMap<URL, ModelingUnit> dirtyMU) throws IOException {
		ArrayList<TracedURL> kpSources = getSources(kp,kpFileURL, varExpander);
		return getSourceModelingUnits(kp, kpSources, kp.getName(), dirtyMU);
	}

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, String kpFileURL, KpVariableExpander varExpander) throws IOException {
		return getSourceModelingUnits(kp, kpFileURL, varExpander, new HashMap<URL, ModelingUnit>());
	}

	public ErrorProneResult<ModelingUnit> mergeModelingUnits(KermetaProject kp, List<ModelingUnit> modelingUnits) throws IOException {
		List<ModelingUnit> convertedModellingUnits = new ArrayList<ModelingUnit>();
		KmBinaryMerger theMerger = null;
		ModelingUnitConverter muc = new ModelingUnitConverter(logger);

		if (runInEclipse) {
			theMerger = new KmBinaryMergerImpl4Eclipse();
		} else {
			theMerger = new KmBinaryMergerImpl();
		}

		for (ModelingUnit mu : modelingUnits) {
			convertedModellingUnits.add(muc.convert(mu));
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
				mergedMU.getResult().setName(kp.getName());
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

	public ModelingUnit resolveModelingUnit(ModelingUnit mu, String kpFileURL) throws IOException {
		KmResolver theResolver;

		if (runInEclipse) {
			theResolver = new KmResolverImpl4Eclipse(logger);
		} else {
			theResolver = new KmResolverImpl(logger);
		}

		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeResolving.km", logger).convert(mu);

		// Resolving
		ErrorProneResult<ModelingUnit> resolvedMU = theResolver.doResolving(convertedModelingUnit);

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

		if (resolvedMU.getResult() != null) {
			convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeSetting.km", logger).convert(resolvedMU.getResult());

			// StaticSetting
			ErrorProneResult<ModelingUnit> staticsettedMU = theResolver.doStaticSetting(convertedModelingUnit);

			// Did errors occur during the resolving ?
			if (staticsettedMU.getProblems().size() > 0) {
				errorHandlingHelper.processErrors(staticsettedMU, FileHelpers.StringToURL(kpFileURL));
				if (stopOnError) {
					logger.error("Errors have occured during static setting, stop compilation process", LOG_MESSAGE_GROUP, new Throwable());
					this.hasFailed = true; // message for the caller of the compiler
					this.errorMessage = "Errors have occured during static setting";
					if(saveIntermediateFiles)
						new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforebeforeCheckingforScopeRESOLVED.km", logger).convert(staticsettedMU.getResult());
					
					return null;
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

	
	
	private ArrayList<URL> getEcoreNeedingGeneration(KermetaProject kp,KpVariableExpander varExpander){
		List<Source> srcs = kp.getSources();
		ArrayList<URL> ecoreURLs = new ArrayList<URL>();
		for (Source src : srcs) {
			if(!src.isByteCodeFromADependency()){
				try{
					String sourceURLWithVariable = src.getUrl();
					sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
					String sourceURLString = varExpander.expandSourceVariables(sourceURLWithVariable);
					if (sourceURLWithVariable.contains("${")) {
						// deal with variable expansion
					//	logger.debug("sourceURL : " + sourceURLWithVariable + " (expanded to : " + sourceURLString + ")", LOG_MESSAGE_GROUP);
					} else {
					//	logger.debug("sourceURL : " + sourceURLWithVariable, LOG_MESSAGE_GROUP);
					}
					URL sourceURL = FileHelpers.StringToURL(sourceURLString);
					if(sourceURL.getFile().endsWith(".ecore"))
						ecoreURLs.add(sourceURL);
				}
				catch(IOException e){
					//logger.logProblem(MessagingSystem.Kind.UserERROR, "Cannot load source "+src.getUrl()+ " "+e.getMessage(), 
					//		KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(src));
				}
			}
		}
		return ecoreURLs;
	}
	
	
	synchronized public void km2Scala(KermetaProject kp, KpVariableExpander varExpander, String kmFileURL, String targetGeneratedSourceFolder, String targetFolder, String userAdditionalClassPath) {
		initializeforBuilding(kp, targetFolder, targetFolder, userAdditionalClassPath);
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
		for( PackageEquivalence packEquivalence : kp.getPackageEquivalences()){
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
		km2ScalaCompiler.compile(kmFileURL);
	}

	private void initializeforBuilding(KermetaProject kp, String targetGeneratedSourceFolder, String targetFolder, String userAdditionalClassPath) {
		
		GlobalConfiguration.outputFolder_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SCALA_SUBFOLDER);
		GlobalConfiguration.outputProject_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SUBFOLDER);
		//If classes is modified, please impact it on method checkIfBuildIsNeeded on KPBuilder.java
		//*************
		GlobalConfiguration.outputBinFolder_$eq(targetScalaBinaryFolder);
		//*************
		GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit." + kp.getGroup() + "." + kp.getName());
		GlobalConfiguration.props_$eq(new Properties());
		GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
		GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
		GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");
		// GroupId and ArtifactId are used to prefix the generated code
		GlobalConfiguration.props().setProperty("project.group.id", kp.getGroup());
		GlobalConfiguration.props().setProperty("project.artefact.id", kp.getName());
		
		GlobalConfiguration.props().setProperty("user.additional.classpath",userAdditionalClassPath);

		// default baseClass and baseOperation
		if (kp.getDefaultMainClass() != null) {
			GlobalConfiguration.props().setProperty("baseClass", kp.getDefaultMainClass());
		}
		if (kp.getDefaultMainOperation() != null) {
			GlobalConfiguration.props().setProperty("baseOperation", kp.getDefaultMainOperation());
		}

		// GlobalConfiguration.load(GlobalConfiguration.props());
		GlobalConfiguration.setScalaAspectPrefix(kp.getGroup() + "." + kp.getName());
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

	
	
	
}
