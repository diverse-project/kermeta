/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.compilo.scala.GlobalConfiguration;
import org.kermeta.diagnostic.Constraint;
import org.kermeta.diagnostic.ConstraintDiagnostic;
import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.diagnostic.InvariantProxy;
import org.kermeta.diagnostic.ModelReference;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.SourceQuery;
import org.kermeta.kp.compiler.commandline.urlhandler.ExtensibleURLStreamHandlerFactory;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.checker.CheckerImpl;
import org.kermeta.language.checker.CheckerImpl4Eclipse;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaCompiler;
import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaRunner;
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
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.helpers.StringHelper;
import org.kermeta.utils.helpers.emf.EMFUriHelper;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
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
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String DEFAULT_KP_LOCATION_IN_FOLDER = "/project.kp";
	public static String DEFAULT_BINARY_LOCATION_IN_ECLIPSE = "/target/classes";
	public static String INTERMEDIATE_SUBFOLDER = "";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER + "/scala";

	public static String TRACEABILITY_TEXT_REFERENCE = "traceability_text_reference";

	public boolean checkingEnabled = false;
	public boolean stopOnError = true;

	public boolean runInEclipse = false;
	public boolean runResultInSeparateVM = true;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	public MessagingSystem logger;
	public LocalFileConverter fileSystemConverter;
	// public List<String> additionalClassPath = new
	// java.util.ArrayList<String>();
	// public String projectName = "project";
	//public KpVariableExpander variableExpander;
	public Boolean useFSC = false; // separate compilation server

	public Boolean hasFailed = false;
	public String errorMessage = "";
	private static final Lock lock = new ReentrantLock();

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
		if (registerProtocols) {
			registerMVNUrlHandler();
		}
		this.runInEclipse = willRunInEclipse;
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
	public KermetaCompiler(Boolean registerProtocols, MessagingSystem logger, LocalFileConverter uriPhysicalConverter,  Boolean saveIntermediateFiles, String targetIntermediateFolder, Boolean willRunInEclipse, Boolean checkingEnabled, Boolean stopOnError) {
		super();
		System.err.println("checking enabled (" + checkingEnabled + ") stop on error (" + stopOnError + ")");
		this.logger = logger;
		this.fileSystemConverter = uriPhysicalConverter;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
		this.runInEclipse = willRunInEclipse;
		this.checkingEnabled = checkingEnabled;
		this.stopOnError = stopOnError;
		if (registerProtocols) {
			registerMVNUrlHandler();
		}
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

	/*
	 * public KermetaCompiler(String targetFolder){ // make sure initialize has
	 * been call : note that if some other EMF related things have // been done
	 * before, the initialize should be done earlier too initializeFactory();
	 * this.targetFolder = targetFolder; }
	 */

	public synchronized ModelingUnit kp2bytecode(String kpFileURL, HashMap<URL, ModelingUnit> dirtyMU, String targetFolder, String targetGeneratedSourceFolder, String targetGeneratedResourcesFolder, List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
		try {
			lock.lock();
			logger.flushProblem(LOG_MESSAGE_GROUP, FileHelpers.StringToURL(kpFileURL));
			String projectName = "project";
	
			logger.initProgress("KermetaCompiler.kp2bytecode", "Compiling " + kpFileURL, LOG_MESSAGE_GROUP, 6);
			KpLoaderImpl ldr = new KpLoaderImpl();
	
			// Load KP file
			KermetaProject kp = ldr.loadKp(kpFileURL);
			if (kp == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Kermeta project invalid.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				return null;
			}
	
			if (kp.getName() == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Kermeta project invalid.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				return null;
			}
			
			if (!kp.getName().isEmpty()) {
				projectName = kp.getName();
			}
			KpVariableExpander varExpander = new KpVariableExpander(kpFileURL);
			ArrayList<URL> kpSources = getSources(kp, varExpander);
			if (kpSources.size() == 0) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Kermeta project invalid.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				return null;
			}
			flushProblems(kpSources);
			List<ModelingUnit> modelingUnits = getSourceModelingUnits(kp, kpSources, kp.getName(), dirtyMU);
	
			if (modelingUnits.size() == 0) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Kermeta project invalid. There is no modeling unit to compile.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				return null;
			}
			
			logger.progress("KermetaCompiler.kp2bytecode", "Merging " + modelingUnits.size() + " files...", LOG_MESSAGE_GROUP, 1);
			ErrorProneResult<ModelingUnit> mergedUnit = mergeModelingUnits(modelingUnits);
	
			// Did errors occur during the merge ?
			if (mergedUnit.getProblems().size() > 0) {
				processErrors(mergedUnit);
				if (stopOnError) {
					logger.logProblem(MessagingSystem.Kind.UserERROR, "Unable to merge the files. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
					return null;
				}
			}
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
	
			// Check mergedUnit for scope MERGED
			if (checkingEnabled) {
				logger.progress("KermetaCompiler.kp2bytecode", "Checking merged file...", LOG_MESSAGE_GROUP, 1);
				DiagnosticModel results = checkModelingUnit(mergedUnit.getResult()/*convertedModelingUnit*/, CheckerScope.MERGED);
				if (results != null) {
					logger.progress("KermetaCompiler.kp2bytecode", "Processing check diagnostic...", LOG_MESSAGE_GROUP, 1);
					processCheckingDiagnostics(results, FileHelpers.StringToURL(kpFileURL));
		
					if (stopOnError && results.getDiagnostics().size() > 0) {
						logger.logProblem(MessagingSystem.Kind.UserERROR, "The merged result is not valid. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						return null;
					}
				}
			}
	
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			logger.progress("KermetaCompiler.kp2bytecode", "Resolving...", LOG_MESSAGE_GROUP, 1);
			ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit.getResult()/*convertedModelingUnit*/);
	
			if (resolvedUnit == null) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "The resolved result is not valid. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				return null;
			}
			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			// Check resolvedUnit for scope RESOLVED
			if (checkingEnabled) {

				logger.progress("KermetaCompiler.kp2bytecode", "Checking resolved file...", LOG_MESSAGE_GROUP, 1);
				DiagnosticModel results = checkModelingUnit(resolvedUnit, CheckerScope.RESOLVED);
				if (results != null) {
					logger.progress("KermetaCompiler.kp2bytecode", "Processing check diagnostic...", LOG_MESSAGE_GROUP, 1);
					processCheckingDiagnostics(results, FileHelpers.StringToURL(kpFileURL));
					
					if (stopOnError && results.getDiagnostics().size() > 0) {
						logger.logProblem(MessagingSystem.Kind.UserERROR, "The resolved result is not valid. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
						return null;
					}
				}
			}
	
			// save resolvedUnit to the META-INF/kermeta/merged.km
			URI uri = URI.createURI((resolvedUnit.getNamespacePrefix() + "." + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
			File mergedFile = new File(targetGeneratedResourcesFolder + DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + projectName + ".km");
			if (!mergedFile.getParentFile().exists()) {
				mergedFile.getParentFile().mkdirs();
			}
			FileWriter writer = new FileWriter(mergedFile);
	
			writer.write(new ModelingUnitConverter(logger).saveMu(resolvedUnit, uri).toString());
			writer.close();
			

			// workaround cache problem in compiler
			kermeta.standard.JavaConversions.cleanCache();
			
			if (!generateKmOnly) {
				// deal with km to scala
				// compiler require a file location not an URL
				logger.progress("KermetaCompiler.kp2bytecode", "Generating scala...", LOG_MESSAGE_GROUP, 1);
				logger.debug("Generating scala for "+kpFileURL, LOG_MESSAGE_GROUP);
				String fileLocation = mergedFile.toURI().toURL().getFile();
				km2Scala(kp, varExpander, fileLocation, targetGeneratedSourceFolder, targetFolder);
				logger.progress("KermetaCompiler.kp2bytecode", "Generating bytecode...", LOG_MESSAGE_GROUP, 1);
				List<String> fullBinaryDependencyClassPath = getBinaryDependencyClasspath(kp, varExpander);
				fullBinaryDependencyClassPath.addAll(additionalClassPath);
				// deal with scala to bytecode
				int result =scala2bytecode(fullBinaryDependencyClassPath);
				if(result != 0){
					logger.logProblem(MessagingSystem.Kind.UserERROR, "Error detected during bytecode generation. Compilation not complete for this project.", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));					
				}
			} else {
				logger.info("generateKmOnly flag set => Ignore scala generation", LOG_MESSAGE_GROUP);
			}
			return resolvedUnit;
		} finally {
			logger.doneProgress(LOG_MESSAGE_GROUP, "End of compilation for " +kpFileURL , LOG_MESSAGE_GROUP);
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
	public ModelingUnit kp2bytecode(String kpFileURL, String targetFolder, String targetGeneratedSourceFolder, String targetGeneratedResourcesFolder, List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
		return kp2bytecode(kpFileURL, new HashMap<URL, ModelingUnit>(), targetFolder, targetGeneratedSourceFolder, targetGeneratedResourcesFolder, additionalClassPath, generateKmOnly);
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

	public ArrayList<URL> getSources(String kpString) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl();
		KermetaProject kp = ldr.loadKp(kpString);
		if (kp != null) {
			return getSources(kp, new KpVariableExpander(kpString));
		} else {
			return new ArrayList<URL>();
		}
	}

	public ArrayList<URL> getSources(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl();
		// Note that source is relative to the kp file not the jvm current dir
		List<Source> srcs = kp.getSources();
		ArrayList<URL> kpSources = new ArrayList<URL>();
		for (Source src : srcs) {

			if (src instanceof SourceQuery) {
				// deal with srcQuery
				SourceQuery srcQuery = (SourceQuery) src;
				String fromDependencyUrl = varExpander.expandVariables(srcQuery.getFrom().getUrl());
				String indirectURL = "jar:" + fromDependencyUrl + "!" + varExpander.expandVariables(srcQuery.getQuery());
				logger.debug("SourceQuery : " + srcQuery + " from " + srcQuery.getFrom().getUrl() + " (expanded to : " + indirectURL + ")", LOG_MESSAGE_GROUP);
				kpSources.add(FileHelpers.StringToURL(indirectURL));
			} else {
				String sourceURLWithVariable = src.getUrl();
				sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default
																									// set
																									// to
																									// emptyString
																									// rather
																									// than
																									// null
				String sourceURL = varExpander.expandVariables(sourceURLWithVariable);
				if (sourceURLWithVariable.contains("${")) {
					// deal with variable expansion
					logger.debug("sourceURL : " + sourceURLWithVariable + " (expanded to : " + sourceURL + ")", LOG_MESSAGE_GROUP);
				} else {
					logger.debug("sourceURL : " + sourceURLWithVariable, LOG_MESSAGE_GROUP);
				}
				kpSources.add(FileHelpers.StringToURL(sourceURL));
			}
		}

		// get dependencies
		List<Dependency> dependencies = kp.getDependencies();
		for (Dependency dep : dependencies) {
			String dependencyURLWithVariable = dep.getUrl();
			String dependencyURLString = varExpander.expandVariables(dependencyURLWithVariable);
			if (dependencyURLWithVariable.contains("${")) {
				// deal with variable expansion
				logger.debug("dependency : " + dependencyURLWithVariable + " ( expanded to : " + dependencyURLString + ")", LOG_MESSAGE_GROUP);
			} else {
				logger.debug("dependency : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
			}

			KermetaProject dependencyKP = null;


			// deal with URL : might be a Jar or a folder

			// is this a folder ?
			URI dependencyKPURI = null;
			boolean isDirectory = false;
			try{
				URI depURI = URI.createURI(dependencyURLString);
				if(depURI.isPlatformResource() && ! depURI.fileExtension().equals("jar")){
					/*logger.debug("current URIMAP", LOG_MESSAGE_GROUP);
					for( Entry<URI, URI> entry : ExtensibleURIConverterImpl.URI_MAP.entrySet()){
						logger.debug("     "+entry.getKey().toString() + " is resolved into " +entry.getValue().toString(), LOG_MESSAGE_GROUP);
						
					}*/
					//logger.debug("ExtensibleURIConverterImpl.INSTANCE.normalize = "+ExtensibleURIConverterImpl.INSTANCE.normalize(depURI), LOG_MESSAGE_GROUP);
					//URIUtil util;
					
						dependencyKPURI = EMFUriHelper.convertToEMFUri(fileSystemConverter.convertSpecialURItoFileURI(java.net.URI.create(dependencyURLString+DEFAULT_KP_LOCATION_IN_FOLDER)));
						logger.debug("fileSystemConverter.convertSpecialURItoFileURI = "+dependencyKPURI, LOG_MESSAGE_GROUP);
						isDirectory = true;
						/*if(!dependencyKPURI.isFile()) {
							logger.logProblem(MessagingSystem.Kind.UserERROR, "Dependency "+dependencyURLString+" not found", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
						}*/
						// TODO check that this folder exists ...
				}
			}catch( Exception e){
				logger.error(e.toString()+ " on " +URI.createURI(dependencyURLString).toFileString(), LOG_MESSAGE_GROUP,e);
			}
			
			if(!isDirectory){
				// let's try as a zip
				URL jar = new URL(dependencyURLString);
				try {
					ZipInputStream zip = new ZipInputStream(jar.openStream());
					ZipEntry ze;
					while ((ze = zip.getNextEntry()) != null) {
						if (("/" + ze.getName()).equals(DEFAULT_KP_LOCATION_IN_JAR)) {

							dependencyKPURI = URI.createURI("jar:" + dependencyURLString + "!/" + ze.getName());
						}
					}

				} catch (Exception e) {
					logger.logProblem(MessagingSystem.Kind.UserERROR, "Dependency "+dependencyURLString+" not found", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
					return  new ArrayList<URL>();
				}
			}

			if(dependencyKPURI != null){
				// load dependencyKP
				logger.debug("loading dependency kp : "+dependencyKPURI.toString(), LOG_MESSAGE_GROUP);
				ldr = new KpLoaderImpl();				
				dependencyKP = ldr.loadKp(dependencyKPURI);
			}
			if (dependencyKP == null) {
				if(findSourceQueryUsingDependency(kp,dep) != null){
					logger.debug("dependency used at least for one srcQuery", LOG_MESSAGE_GROUP);
				}
				else{
					logger.log(MessagingSystem.Kind.UserWARNING, "   dependency neither contains a kp file nor is used in a srcQuery, maybe you use it as a binary classpath complement only ? ", LOG_MESSAGE_GROUP);
				}
			} else {
				String dependencyMergedKMUrl;
				if(isDirectory){
					if(runInEclipse){
						// TODO read an optional preference about where the binary are really located in this specific eclipse project
						dependencyMergedKMUrl = dependencyURLString + DEFAULT_BINARY_LOCATION_IN_ECLIPSE +DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
					} else {
						dependencyMergedKMUrl = dependencyURLString + DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
					}
				} else {
					dependencyMergedKMUrl = "jar:" + dependencyURLString + "!" + DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
				}
				kpSources.add(FileHelpers.StringToURL(dependencyMergedKMUrl));
			}
		}
		return kpSources;
	}

	// TODO move to a kp helper project/class
	protected SourceQuery findSourceQueryUsingDependency(KermetaProject kp, Dependency dep){
		List<Source> srcs = kp.getSources();		
		for (Source src : srcs) {
			if (src instanceof SourceQuery) {
				if(((SourceQuery)src).getFrom() == dep){
					return (SourceQuery) src;
				}
			}
		}
		return null;
	}
	
	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, ArrayList<URL> kpSources, String projectName, HashMap<URL, ModelingUnit> dirtyMU) {
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();

		for (URL oneURL : kpSources) {
			if (dirtyMU.get(oneURL) != null) {
				modelingUnits.add(dirtyMU.get(oneURL));
			} else {
				ModelingUnit mu = null;
				try {
					ModelingUnitLoader muLoader = new ModelingUnitLoader(logger, this.runInEclipse, this.saveIntermediateFiles, this.targetIntermediateFolder);
					mu = muLoader.loadModelingUnitFromURL(oneURL.toString());
					if (mu != null) {
						if (mu.getName() == null) {
							// force ModelingUnit name to the one provided in the kp
							mu.setName(projectName);
						}
						modelingUnits.add(mu);
					} else {
						logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + oneURL + " "+muLoader.lastLoadErrorMessage, LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
					}
				} catch (Exception e) {
					try {					
						logger.logProblem(MessagingSystem.Kind.UserERROR, "Source "+oneURL+" not found", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
					} catch (MalformedURLException f) {}
				}
			}
		}

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
		// TODO currently deal only with dependecies on the disk (no mvn:/ dependencies)
		List<Dependency> dependencies = kp.getDependencies();
		for (Dependency dep : dependencies) {
			String dependencyURLWithVariable = dep.getUrl();
			String dependencyURL = varExpander.expandVariables(dependencyURLWithVariable);
			if (dependencyURLWithVariable.contains("${")) {
				// deal with variable expansion
				logger.debug("dependency : " + dependencyURLWithVariable + " ( expanded to : " + dependencyURL + ")", LOG_MESSAGE_GROUP);
			} else {
				logger.debug("dependency : " + dependencyURLWithVariable, LOG_MESSAGE_GROUP);
			}
			URL jarURL = new URL(dependencyURL);
			if( jarURL.getProtocol().equals("file")){
				File theFile;
				try {
					theFile = new File(jarURL.toURI());
					if (theFile!=null) {
						result.add(theFile.getAbsolutePath());
					}
				} catch (URISyntaxException e) {
					// ignore URI that cannot be translated into a local file ... 
					// TODO
				}
			}
		}
		return result;
	}
	
	
	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, KpVariableExpander varExpander, HashMap<URL, ModelingUnit> dirtyMU) throws IOException {
		ArrayList<URL> kpSources = getSources(kp, varExpander);
		return getSourceModelingUnits(kp, kpSources, kp.getName(), dirtyMU);
	}

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		return getSourceModelingUnits(kp, varExpander, new HashMap<URL, ModelingUnit>());
	}

	public ErrorProneResult<ModelingUnit> mergeModelingUnits(List<ModelingUnit> modelingUnits) throws IOException {
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
				mergedMU = theMerger.merge(mergedMU.getResult(), convertedModellingUnits.get(i));

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

	public ModelingUnit resolveModelingUnit(ModelingUnit mu) throws IOException {
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
			processErrors(resolvedMU);
			if (stopOnError) {
				logger.error("Errors have occured during resolving, stop compilation process", LOG_MESSAGE_GROUP, new Throwable());
				this.hasFailed = true; // message for the caller of the compiler
				this.errorMessage = "Errors have occured during resolving";
				return null;
			}
		}

		if (resolvedMU.getResult() != null) {
			convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeSetting.km", logger).convert(resolvedMU.getResult());

			// StaticSetting
			ErrorProneResult<ModelingUnit> staticsettedMU = theResolver.doStaticSetting(convertedModelingUnit);

			// Did errors occur during the resolving ?
			if (staticsettedMU.getProblems().size() > 0) {
				processErrors(staticsettedMU);
				if (stopOnError) {
					logger.error("Errors have occured during static setting, stop compilation process", LOG_MESSAGE_GROUP, new Throwable());
					this.hasFailed = true; // message for the caller of the compiler
					this.errorMessage = "Errors have occured during static setting";
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

	synchronized public void km2Scala(KermetaProject kp, KpVariableExpander varExpander, String kmFileURL, String targetGeneratedSourceFolder, String targetFolder) {
		initializeforBuilding(kp, targetGeneratedSourceFolder, targetFolder);
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
		org.kermeta.compilo.scala.Compiler km2ScalaCompiler = new org.kermeta.compilo.scala.Compiler();
		km2ScalaCompiler.compile(kmFileURL);
	}

	private void initializeforBuilding(KermetaProject kp, String targetGeneratedSourceFolder, String targetFolder) {
		GlobalConfiguration.outputFolder_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SCALA_SUBFOLDER);
		GlobalConfiguration.outputProject_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SUBFOLDER);
		//If classes is modified, please impact it on method checkIfBuildIsNeeded on KPBuilder.java
		//*************
		GlobalConfiguration.outputBinFolder_$eq(targetFolder + "/classes");
		//*************
		GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit." + kp.getGroup() + "." + kp.getName());
		GlobalConfiguration.props_$eq(new Properties());
		GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
		GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
		GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");
		// GroupId and ArtifactId are used to prefix the generated code
		GlobalConfiguration.props().setProperty("project.group.id", kp.getGroup());
		GlobalConfiguration.props().setProperty("project.artefact.id", kp.getName());

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

		/*
		 * //Display check results
		 * logger.log(MessagingSystem.Kind.UserINFO,"There are " +
		 * diags.getDiagnostics().size() + " failed constraints",
		 * LOG_MESSAGE_GROUP);
		 * 
		 * for (ConstraintDiagnostic diag : diags.getDiagnostics()) {
		 * 
		 * String message = ""; Constraint failedConstraint =
		 * diag.getFailedConstraint(); if ( failedConstraint instanceof
		 * InvariantProxy ) { message = message + "Invariant " +
		 * ((InvariantProxy)failedConstraint).getInvariantName() + " on object "
		 * +
		 * ((ModelReference)diag.getAppliesTo()).getReferencedObject().toString
		 * (); } //String message = diag.getFailedConstraint().; if
		 * (diag.isIsWarning()) { logger.log(MessagingSystem.Kind.UserWARNING,
		 * message, LOG_MESSAGE_GROUP); } else {
		 * logger.log(MessagingSystem.Kind.UserERROR, message,
		 * LOG_MESSAGE_GROUP); }
		 * 
		 * 
		 * // retrieve the referenced EObject tag sourceLocation EObject
		 * myObject =
		 * ((ModelReference)diag.getAppliesTo()).getReferencedObject();
		 * KermetaModelElement kme = (KermetaModelElement) myObject;
		 * 
		 * // Check if there is a sourceLocation tag for (Tag t :
		 * kme.getKOwnedTags() ) {
		 * 
		 * //logger.log(MessagingSystem.Kind.UserINFO, "Tag : " + t.getName(),
		 * ""); if (t.getName().equals("source.location")) {
		 * //logger.log(MessagingSystem.Kind.UserINFO, "   -> value :(" +
		 * t.getValue() +")   ", ""); createTextReference(t); } }
		 * 
		 * 
		 * 
		 * }
		 */

		return diags;
	}

	protected void processErrors(ErrorProneResult<ModelingUnit> eprMu) {
		// TODO Retrieve faulty objects text reference and logProblem

		for (ResultProblemMessage prob : eprMu.getProblems()) {
			logger.log(MessagingSystem.Kind.UserERROR, prob.getMessage(), LOG_MESSAGE_GROUP);

			// retrieve faulty object
			// KermetaModelElement kme = (Kermeprob.getCauseObject();
			if (prob.getCauseObject() != null) {
				System.err.println("faultyObject is : " + prob.getCauseObject().toString());

				org.kermeta.utils.systemservices.api.reference.ModelReference mref = (org.kermeta.utils.systemservices.api.reference.ModelReference) prob.getCauseObject();

				if (mref.getModelRef() != null) {
					System.err.println(mref.getModelRef().toString());

					// The object is a KermetaModelElement
					try {
						KermetaModelElement kme = (KermetaModelElement) mref.getModelRef();
	
						System.err.println("The error involves " + kme.toString());
	
						// Check if there is a sourceLocation tag
						Boolean tagFound = false;
	
						for (Tag t : kme.getKOwnedTags()) {
	
							System.err.println("Tag found. Name : " + t.getName() + ", value : (" + t.getValue() + ")");
	
							// logger.log(MessagingSystem.Kind.UserINFO, "Tag : " +
							// t.getName(), "");
							if (t.getName().equals(TRACEABILITY_TEXT_REFERENCE)) {
								tagFound = true;
								// logger.log(MessagingSystem.Kind.UserINFO,
								// "   -> value :(" + t.getValue() +")   ", "");
								TextReference ref = createTextReference(t);
	
								if (ref != null) {
									logger.logProblem(MessagingSystem.Kind.UserERROR, prob.getMessage(), LOG_MESSAGE_GROUP, ref);
								}
							}
						}
						if (!tagFound) {
							// Try to retrieve the model element's container
							Tag t = searchForNearestTaggedContainingKME(kme);
	
							if (t == null) {
								System.err.println("Impossible to retrieve a container with text traceability");
							} else {
								TextReference ref = createTextReference(t);
								if (ref != null) {
									logger.logProblem(MessagingSystem.Kind.UserERROR, prob.getMessage(), LOG_MESSAGE_GROUP, ref);
								}
	
							}
	
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	protected void processCheckingDiagnostics(DiagnosticModel diags, URL kpFile) {

		if (diags == null) {
			return;
		}
		
		// System.err.println("processing diagnostics : " +
		// diags.getDiagnostics().size());

		// Display check results
		if (diags.getDiagnostics().size() > 0) {
			logger.log(MessagingSystem.Kind.UserINFO, "There are " + diags.getDiagnostics().size() + " failed constraints", LOG_MESSAGE_GROUP);
		}

		for (ConstraintDiagnostic diag : diags.getDiagnostics()) {

			String message = "";
			Constraint failedConstraint = diag.getFailedConstraint();
			if (failedConstraint instanceof InvariantProxy) {
				message = message + "Invariant " + ((InvariantProxy) failedConstraint).getInvariantName() + " on object " + ((ModelReference) diag.getAppliesTo()).getReferencedObject().toString();
			}
			if (diag.isIsWarning()) {
				logger.log(MessagingSystem.Kind.UserWARNING, message, LOG_MESSAGE_GROUP);
			} else {
				logger.log(MessagingSystem.Kind.UserERROR, message, LOG_MESSAGE_GROUP);
			}

			// retrieve the referenced EObject tag sourceLocation
			EObject myObject = ((ModelReference) diag.getAppliesTo()).getReferencedObject();
			KermetaModelElement kme = (KermetaModelElement) myObject;

			InvariantProxy proxy = (InvariantProxy) failedConstraint;
			String errorMsg = "Kermeta invariant " + proxy.getInvariantName() + " failed : ";
			errorMsg += StringHelper.trimDocumentation(proxy.getMessage());

			// Check if there is a sourceLocation tag
			Boolean tagFound = false;

			for (Tag t : kme.getKOwnedTags()) {

				// System.err.println("Tag found. Name : " + t.getName() +
				// ", value : (" + t.getValue() + ")");

				logger.log(MessagingSystem.Kind.UserINFO, "Tag : " + t.getName(), "");
				if (t.getName().equals(TRACEABILITY_TEXT_REFERENCE)) {
					tagFound = true;
					logger.log(MessagingSystem.Kind.UserINFO, "   -> value :(" + t.getValue() + ")   ", "");
					TextReference ref = createTextReference(t);
					if (ref != null) {
						if (diag.isIsWarning()) {
							logger.logProblem(MessagingSystem.Kind.UserWARNING, errorMsg, LOG_MESSAGE_GROUP, ref);
						} else {
							logger.logProblem(MessagingSystem.Kind.UserERROR, errorMsg, LOG_MESSAGE_GROUP, ref);
						}
					}
				}
			}

			if (!tagFound) {
				// Try to retrieve the model element's container
				Tag t = searchForNearestTaggedContainingKME(kme);

				if (t == null) {
					System.err.println("Impossible to retrieve a container with text traceability");
					// In this case, place the error on the kp file
					FileReference ref = new FileReference(kpFile);
					if (diag.isIsWarning()) {
						logger.logProblem(MessagingSystem.Kind.UserWARNING, errorMsg, LOG_MESSAGE_GROUP, ref);
					} else {
						logger.logProblem(MessagingSystem.Kind.UserERROR, errorMsg, LOG_MESSAGE_GROUP, ref);
					}
					
				} else {
					TextReference ref = createTextReference(t);
					if (ref != null) {
						if (diag.isIsWarning()) {
							logger.logProblem(MessagingSystem.Kind.UserWARNING, errorMsg, LOG_MESSAGE_GROUP, ref);
						} else {
							logger.logProblem(MessagingSystem.Kind.UserERROR, errorMsg, LOG_MESSAGE_GROUP, ref);
						}
					}

				}

			}

		}

	}

	/**
	 * Flush the problems marker related to this kp
	 */
	protected void flushProblems(ArrayList<URL> kpSources) {

		for (URL oneURL : kpSources) {
			// flush compiler general problems
			logger.flushProblem(LOG_MESSAGE_GROUP, oneURL);
			// flush parser problems
			logger.flushProblem(KMTparser.LOG_MESSAGE_GROUP, oneURL);
			// flush merger problems
			// flush resolver problems
			logger.flushProblem(KmResolver.LOG_MESSAGE_GROUP, oneURL);
			// flush km2scala problems
			// flush scala2bytecode problems
		}
	}

	protected Tag searchForNearestTaggedContainingKME(KermetaModelElement kme) {

		KermetaModelElement currentElement = null;
		KermetaModelElement container = (KermetaModelElement) kme.eContainer();

		while (container != null) {

			for (Tag t : container.getKOwnedTags()) {
				if (t.getName().equals(TRACEABILITY_TEXT_REFERENCE)) {
					return t;
				}
			}
			// Tag hasn't been found, keep on searching higher in the model

			currentElement = container;
			container = (KermetaModelElement) currentElement.eContainer();
		}

		return null;
	}

	private TextReference createTextReference(Tag tag) {

		String value = tag.getValue();

		// System.err.println(tag.getValue());

		String[] values = value.split(";");

		// logger.log(MessagingSystem.Kind.UserINFO, "Source File (" + values[0]
		// + ")", "");
		// logger.log(MessagingSystem.Kind.UserINFO, "beginOffset (" + values[1]
		// + ")", "");
		// logger.log(MessagingSystem.Kind.UserINFO, "endOffset   (" + values[2]
		// + ")", "");

		TextReference ref = null;

		try {
			ref = new TextReference(new URL(values[0]), new Integer(values[1]), new Integer(values[2]));
			// ref.setBeginLine(new Integer(values[1]));
			// ref.setBeginOffset(new Integer(values[2]));

			// new TextReference()

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref;
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
		KpLoaderImpl ldr = new KpLoaderImpl();
		KermetaProject kp = ldr.loadKp(kpFileURL);
		initializeforBuilding(kp, targetGeneratedSourceFolder, targetFolder);
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
	
	
}
