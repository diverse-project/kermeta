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
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
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
	public static String INTERMEDIATE_SUBFOLDER = "intermediate";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER + "/scala";

	public static String TRACEABILITY_TEXT_REFERENCE = "traceability_text_reference";

	public boolean checkingEnabled = false;
	public boolean stopOnError = true;

	public boolean runInEclipse = false;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	public MessagingSystem logger;
	// public List<String> additionalClassPath = new
	// java.util.ArrayList<String>();
	// public String projectName = "project";
	public KpVariableExpander variableExpander;
	public Boolean useFSC = false; // separate compilation server

	public Boolean hasFailed = false;
	public String errorMessage = "";

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
	public KermetaCompiler(Boolean registerProtocols, MessagingSystem logger, Boolean willRunInEclipse) {
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
	public KermetaCompiler(Boolean registerProtocols, MessagingSystem logger, Boolean saveIntermediateFiles, String targetIntermediateFolder, Boolean willRunInEclipse, Boolean checkingEnabled, Boolean stopOnError) {
		super();
		System.err.println("checking enabled (" + checkingEnabled + ") stop on error (" + stopOnError + ")");
		this.logger = logger;
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
		logger.debug(results.toString(), this.getClass().getName());

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

	public ModelingUnit kp2bytecode(String kpFileURL, HashMap<URL, ModelingUnit> dirtyMU, String targetFolder, String targetGeneratedSourceFolder, String targetGeneratedResourcesFolder, List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
		logger.flushProblem(LOG_MESSAGE_GROUP, FileHelpers.StringToURL(kpFileURL));
		String projectName = "project";

		logger.initProgress("KermetaCompiler.kp2bytecode", "Compiling " + kpFileURL, this.getClass().getName(), 6);
		KpLoaderImpl ldr = new KpLoaderImpl();

		// Load KP file
		KermetaProject kp = ldr.loadKp(kpFileURL);
		if (kp == null) {
			return null;
		}

		if (!kp.getName().isEmpty()) {
			projectName = kp.getName();
		}
		KpVariableExpander varExpander = new KpVariableExpander(kpFileURL);
		ArrayList<URL> kpSources = getSources(kp, varExpander);
		if (kpSources.size() == 0) {
			return null;
		}
		flushProblems(kpSources);
		List<ModelingUnit> modelingUnits = getSourceModelingUnits(kpSources, kp.getName(), dirtyMU);

		logger.progress("KermetaCompiler.kp2bytecode", "Merging " + modelingUnits.size() + " files...", this.getClass().getName(), 1);
		ErrorProneResult<ModelingUnit> mergedUnit = mergeModelingUnits(modelingUnits);

		// Did errors occur during the merge ?
		if (mergedUnit.getProblems().size() > 0) {
			processErrors(mergedUnit);
			if (stopOnError) {
				logger.info("Errors have occured during merge, stop compilation process", this.getClass().getName());
				return null;
			}
		}

		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeChecking_afterMerging.km").convert(mergedUnit.getResult());

		// Check mergedUnit for scope MERGED
		if (checkingEnabled) {
			DiagnosticModel results = checkModelingUnit(convertedModelingUnit, CheckerScope.MERGED);
			processCheckingDiagnostics(results);

			if (stopOnError && results.getDiagnostics().size() > 0) {
				logger.info("Errors have occured during check for scope MERGED, stop compilation process", this.getClass().getName());
				return null;
			}

		}

		ModelingUnit resolvedUnit = resolveModelingUnit(convertedModelingUnit);

		// Check resolvedUnit for scope RESOLVED
		if (checkingEnabled) {

			DiagnosticModel results = checkModelingUnit(resolvedUnit, CheckerScope.RESOLVED);
			processCheckingDiagnostics(results);

			if (stopOnError && results.getDiagnostics().size() > 0) {
				logger.info("Errors have occured during check for scope RESOLVED, stop compilation process", this.getClass().getName());
				return null;
			}
		}

		// save resolvedUnit to the META-INF/kermeta/merged.km
		URI uri = URI.createURI((resolvedUnit.getNamespacePrefix() + "." + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
		File mergedFile = new File(targetGeneratedResourcesFolder + DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + projectName + ".km");
		if (!mergedFile.getParentFile().exists()) {
			mergedFile.getParentFile().mkdirs();
		}
		FileWriter writer = new FileWriter(mergedFile);

		logger.progress("KermetaCompiler.kp2bytecode", "Resolving...", this.getClass().getName(), 1);
		writer.write(new ModelingUnitConverter().saveMu(resolvedUnit, uri).toString());
		writer.close();

		if (!generateKmOnly) {
			// deal with km to scala
			// compiler require a file location not an URL
			logger.progress("KermetaCompiler.kp2bytecode", "Generating scala...", this.getClass().getName(), 1);
			String fileLocation = mergedFile.toURI().toURL().getFile();
			km2Scala(kp, varExpander, fileLocation, targetGeneratedSourceFolder, targetFolder);
			logger.progress("KermetaCompiler.kp2bytecode", "Generating bytecode...", this.getClass().getName(), 1);
			// deal with scala to bytecode
			scala2bytecode(additionalClassPath);
		} else {
			logger.info("generateKmOnly flag set => Ignore scala generation", this.getClass().getName());
		}
		logger.doneProgress("KermetaCompiler.kp2bytecode", kpFileURL + " has been compiled", this.getClass().getName());
		return resolvedUnit;
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
				logger.debug("SourceQuery : " + srcQuery + " from " + srcQuery.getFrom().getUrl() + " (expanded to : " + indirectURL + ")", this.getClass().getName());
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
					logger.debug("sourceURL : " + sourceURLWithVariable + " (expanded to : " + sourceURL + ")", this.getClass().getName());
				} else {
					logger.debug("sourceURL : " + sourceURLWithVariable, this.getClass().getName());
				}
				kpSources.add(FileHelpers.StringToURL(sourceURL));
			}
		}

		// get dependencies
		List<Dependency> dependencies = kp.getDependencies();
		for (Dependency dep : dependencies) {
			String dependencyURLWithVariable = dep.getUrl();
			String dependencyURL = varExpander.expandVariables(dependencyURLWithVariable);
			if (dependencyURLWithVariable.contains("${")) {
				// deal with variable expansion
				logger.debug("dependency : " + dependencyURLWithVariable + " ( expanded to : " + dependencyURL + ")", this.getClass().getName());
			} else {
				logger.debug("dependency : " + dependencyURLWithVariable, this.getClass().getName());
			}

			KermetaProject dependencyKP = null;

			URL jar = new URL(dependencyURL);
			try {
				ZipInputStream zip = new ZipInputStream(jar.openStream());
				ZipEntry ze;
				while ((ze = zip.getNextEntry()) != null) {
					if (("/" + ze.getName()).equals(DEFAULT_KP_LOCATION_IN_JAR)) {
						// load dependencyKP
						ldr = new KpLoaderImpl();
						dependencyKP = ldr.loadKp(URI.createURI("jar:" + dependencyURL + "!/" + ze.getName()));
					}
				}

				if (dependencyKP == null) {
					logger.log(MessagingSystem.Kind.UserWARNING, "   dependency doesn't contains a kp file, maybe you use it as input for srcQuery ? ", this.getClass().getName());
				} else {
					String dependencyMergedKMUrl = "jar:" + dependencyURL + "!" + DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
					kpSources.add(FileHelpers.StringToURL(dependencyMergedKMUrl));
				}
			} catch (Exception e) {
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Dependency "+dependencyURL+" not found", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
				return  new ArrayList<URL>();
			}
		}

		return kpSources;
	}

	public List<ModelingUnit> getSourceModelingUnits(ArrayList<URL> kpSources, String projectName, HashMap<URL, ModelingUnit> dirtyMU) throws IOException {
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();

		for (URL oneURL : kpSources) {
			if (dirtyMU.get(oneURL) != null) {
				modelingUnits.add(dirtyMU.get(oneURL));
			} else {
				ModelingUnit mu = null;
				mu = new ModelingUnitLoader(logger, this.runInEclipse, this.saveIntermediateFiles, this.targetIntermediateFolder).loadModelingUnitFromURL(oneURL.toString());
				if (mu != null) {
					if (mu.getName() == null) {
						// force ModelingUnit name to the one provided in the kp
						mu.setName(projectName);
					}
					modelingUnits.add(mu);
				} else {
					logger.log(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + oneURL, this.getClass().getName());
				}
			}
		}

		return modelingUnits;
	}

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, KpVariableExpander varExpander, HashMap<URL, ModelingUnit> dirtyMU) throws IOException {
		ArrayList<URL> kpSources = getSources(kp, varExpander);
		return getSourceModelingUnits(kpSources, kp.getName(), dirtyMU);
	}

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		return getSourceModelingUnits(kp, varExpander, new HashMap<URL, ModelingUnit>());
	}

	public ErrorProneResult<ModelingUnit> mergeModelingUnits(List<ModelingUnit> modelingUnits) throws IOException {
		List<ModelingUnit> convertedModellingUnits = new ArrayList<ModelingUnit>();
		KmBinaryMerger theMerger = null;
		ModelingUnitConverter muc = new ModelingUnitConverter();

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

		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeResolving.km").convert(mu);

		// Resolving
		ErrorProneResult<ModelingUnit> resolvedMU = theResolver.doResolving(convertedModelingUnit);

		// Did errors occur during the resolving ?
		if (resolvedMU.getProblems().size() > 0) {
			processErrors(resolvedMU);
			if (stopOnError) {
				logger.error("Errors have occured during resolving, stop compilation process", this.getClass().getName(), new Throwable());
				return null;
			}
		}

		if (resolvedMU.getResult() != null) {
			convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetIntermediateFolder + "/beforeSetting.km").convert(resolvedMU.getResult());

			// StaticSetting
			ErrorProneResult<ModelingUnit> staticsettedMU = theResolver.doStaticSetting(convertedModelingUnit);

			// Did errors occur during the resolving ?
			if (staticsettedMU.getProblems().size() > 0) {
				processErrors(staticsettedMU);
				if (stopOnError) {
					logger.error("Errors have occured during static setting, stop compilation process", this.getClass().getName(), new Throwable());
					return null;
				}
			}

			// End of Resolving
			return staticsettedMU.getResult();
		}
		logger.error("Errors have occured during resolve. StaticSetting not executable", this.getClass().getName(), new Throwable());
		return convertedModelingUnit;
	}

	synchronized public void km2Scala(KermetaProject kp, KpVariableExpander varExpander, String kmFileURL, String targetGeneratedSourceFolder, String targetFolder) {
		GlobalConfiguration.outputFolder_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SCALA_SUBFOLDER);
		GlobalConfiguration.outputProject_$eq(targetGeneratedSourceFolder + "/" + INTERMEDIATE_SUBFOLDER);
		GlobalConfiguration.outputBinFolder_$eq(targetFolder + "/classes");
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

	public DiagnosticModel checkModelingUnit(ModelingUnit mu, CheckerScope scope) throws IOException {

		Checker theChecker;

		if (runInEclipse) {
			theChecker = new CheckerImpl4Eclipse();
		} else {
			theChecker = new CheckerImpl();
		}

		// Checking
		DiagnosticModel diags = theChecker.check(mu, scope, "", logger);

		/*
		 * //Display check results
		 * logger.log(MessagingSystem.Kind.UserINFO,"There are " +
		 * diags.getDiagnostics().size() + " failed constraints",
		 * this.getClass().getName());
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
		 * message, this.getClass().getName()); } else {
		 * logger.log(MessagingSystem.Kind.UserERROR, message,
		 * this.getClass().getName()); }
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
			logger.log(MessagingSystem.Kind.UserERROR, prob.getMessage(), this.getClass().getName());

			// retrieve faulty object
			// KermetaModelElement kme = (Kermeprob.getCauseObject();
			if (prob.getCauseObject() != null) {
				System.err.println("faultyObject is : " + prob.getCauseObject().toString());

				org.kermeta.utils.systemservices.api.reference.ModelReference mref = (org.kermeta.utils.systemservices.api.reference.ModelReference) prob.getCauseObject();

				if (mref.getModelRef() != null) {
					System.err.println(mref.getModelRef().toString());

					// The object is a KermetaModelElement
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
								logger.logProblem(MessagingSystem.Kind.UserERROR, prob.getMessage(), this.getClass().getName(), ref);
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
								logger.logProblem(MessagingSystem.Kind.UserERROR, prob.getMessage(), this.getClass().getName(), ref);
							}

						}

					}
				}
			}
		}
	}

	protected void processCheckingDiagnostics(DiagnosticModel diags) {

		// System.err.println("processing diagnostics : " +
		// diags.getDiagnostics().size());

		// Display check results
		if (diags.getDiagnostics().size() > 0) {
			logger.log(MessagingSystem.Kind.UserINFO, "There are " + diags.getDiagnostics().size() + " failed constraints", this.getClass().getName());
		}

		for (ConstraintDiagnostic diag : diags.getDiagnostics()) {

			String message = "";
			Constraint failedConstraint = diag.getFailedConstraint();
			if (failedConstraint instanceof InvariantProxy) {
				message = message + "Invariant " + ((InvariantProxy) failedConstraint).getInvariantName() + " on object " + ((ModelReference) diag.getAppliesTo()).getReferencedObject().toString();
			}
			// String message = diag.getFailedConstraint().;
			if (diag.isIsWarning()) {
				logger.log(MessagingSystem.Kind.UserWARNING, message, this.getClass().getName());
			} else {
				logger.log(MessagingSystem.Kind.UserERROR, message, this.getClass().getName());
			}

			// retrieve the referenced EObject tag sourceLocation
			EObject myObject = ((ModelReference) diag.getAppliesTo()).getReferencedObject();
			KermetaModelElement kme = (KermetaModelElement) myObject;

			// System.err.println("The diagnostic involves " + kme.toString());

			// System.err.println("KermetaModelElement succesfully casted !!");

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
						logger.logProblem(MessagingSystem.Kind.UserERROR, ((InvariantProxy) failedConstraint).getMessage(), this.getClass().getName(), ref);
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
						logger.logProblem(MessagingSystem.Kind.UserERROR, ((InvariantProxy) failedConstraint).getMessage(), this.getClass().getName(), ref);
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
			logger.flushProblem(this.getClass().getName(), oneURL);
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

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(File.pathSeparator);

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

		logger.info("Compiling generated scala to bytecode in " + GlobalConfiguration.outputBinFolder(), this.getClass().getName());
		logger.debug("Classpath: " + classpath.size(), this.getClass().getName());
		for (String path : classpath) {

			logger.debug("\t" + path, this.getClass().getName());
		}
		logger.debug("End Classpath: " + classpath.size(), this.getClass().getName());

		int result = EmbeddedScalaCompiler.compile(GlobalConfiguration.outputFolder(), GlobalConfiguration.outputBinFolder(), true, classpath, useFSC);
		if (result != 0) {
			hasFailed = true;
			errorMessage = "Failed to generate bytecode from intermediate scala";
		}
		return result;
	}

	public void runK2Program(List<String> classpath, List<String> params) {
		StringBuffer f = new StringBuffer();
		for (String s : classpath) {
			f.append(s);
			f.append(File.pathSeparator);

		}
		EmbeddedScalaRunner.run(f.toString() + GlobalConfiguration.outputBinFolder(), GlobalConfiguration.scalaAspectPrefix() + "runner.MainRunner", params);

		if (GlobalConfiguration.createPackage()) {
			File fo;
			try {
				fo = new File(GlobalConfiguration.outputProject() + File.separator + "target").getCanonicalFile();
				fo.mkdirs();
				org.kermeta.language.km2bytecode.embedded.scala.JarCreatorScala.run(GlobalConfiguration.outputBinFolder(), GlobalConfiguration.outputProject() + File.separator + "target" + File.separator + GlobalConfiguration.scalaAspectPrefix() + ".jar", GlobalConfiguration.outputFolder() + File.separator + ".." + File.separator + "resources" + File.separator + GlobalConfiguration.scalaAspectPrefix() + "Reflexivity.km");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
