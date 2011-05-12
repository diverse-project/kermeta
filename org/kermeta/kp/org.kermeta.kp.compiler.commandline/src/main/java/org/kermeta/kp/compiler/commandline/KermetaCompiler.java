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
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
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
import org.kermeta.kp.loader.kp.api.KpLoaderImpl;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaCompiler;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Tag;
//import scala.collection.JavaConversions.JListWrapper;
//import scala.collection.JavaConversions.JListWrapper;
//import org.embedded.EmbeddedMavenHelper;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.TextReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;


/**
 * Basic compilation process for Kermeta2
 * This class is a facade for producing bytecode from a kermeta2 project
 */
public class KermetaCompiler {

	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String INTERMEDIATE_SUBFOLDER = "intermediate";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER+ "/scala";
	
	
	public boolean checkingEnabled = true;
	public boolean stopOnError = true;
	
	public boolean runInEclipse = false;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	public MessagingSystem logger;
	// public List<String> additionalClassPath = new java.util.ArrayList<String>();
	// public String projectName = "project";
	public KpVariableExpander variableExpander;
        public Boolean useFSC = false;  // separate compilation server

        public Boolean hasFailed = false;
        public String errorMessage = "";
	

	
	/**
	 * Simple constructor 
	 * @param registerProtocols if set to true, the constructor will take care to register some URL handler
	 * @param logger is the MessagingSystem that must be used to log message, problem and progression
	 */
	public KermetaCompiler( Boolean registerProtocols, MessagingSystem logger, Boolean willRunInEclipse) {
		super();
		this.logger = logger;
		if(registerProtocols){
			registerMVNUrlHandler();
		}
		this.runInEclipse = willRunInEclipse;
	}
	
	/**
	 * 
	 * @param registerProtocols if set to true, the constructor will take care to register some URL handler
	 * @param logger is the MessagingSystem that must be used to log message, problem and progression 
	 * @param saveIntermediateFiles indicates if the compilation must also produce intermediate files  
	 * @param targetIntermediateFolder indicates where the intermediate files must be generated
	 * @param willRunInEclipse indicates if it is run in eclipse
	 * @param checkingEnabled indicates wether modeling units will be checked or not
	 * @param stopOnError indicates wether the process should be stopped when an error occurs or not
	 */
	public KermetaCompiler( Boolean registerProtocols, MessagingSystem logger, Boolean saveIntermediateFiles, String targetIntermediateFolder, Boolean willRunInEclipse, Boolean checkingEnabled, Boolean stopOnError) {
		super();
		System.err.println("checking enabled ("+checkingEnabled+") stop on error ("+ stopOnError +")" );
		this.logger = logger;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
		this.runInEclipse = willRunInEclipse;
		this.checkingEnabled = checkingEnabled;
		this.stopOnError = stopOnError;
		if(registerProtocols){
			registerMVNUrlHandler();
		}
	}


	private void registerMVNUrlHandler() {
		StringBuffer results = new StringBuffer();
		try {
			results.append("Trying to get java.protocol.handler.pkgs\r\n");
			String s = System.getProperty("java.protocol.handler.pkgs");
			if (s == null) s = "no such property";
			s += "; get succeeded\r\n";
			results.append(s);
		}
		catch (Throwable e) {
			results.append(e.toString() + "\r\n");
		}
		try {
			results.append("Trying to set java.protocol.handler.pkgs with protocols from org.ops4j.pax.url\r\n");
			System.setProperty("java.protocol.handler.pkgs", "org.ops4j.pax.url");
		}
		catch (Throwable e) {
			results.append(e.toString() + "\r\n");
		}
		org.ops4j.pax.url.mvn.Handler h =new org.ops4j.pax.url.mvn.Handler();
		ExtensibleURLStreamHandlerFactory.installUrlStreamHandlerFactory();
		ExtensibleURLStreamHandlerFactory.registerHandler("mvn", h);
		logger.debug(results.toString(), this.getClass().getName());
		
	}

	/**
	 * This initialization must be called before everything related to eclipse when run outside of eclipse 
	 */
	public static void initializeFactory(){
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory$.MODULE$);
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();
		
	}
	
/*	public KermetaCompiler(String targetFolder){
		// make sure initialize has been call : note that if some other EMF related things have 
		// been done before, the initialize should be done earlier too
		initializeFactory();
		this.targetFolder = targetFolder;
	}*/
	
	/**
	 * Main process
	 * @param kpFileURL
	 * @throws IOException
	 */
	public void kp2bytecode(String kpFileURL, String targetFolder, String targetGeneratedSourceFolder, String targetGeneratedResourcesFolder,List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
		String projectName = "project";
		
		logger.initProgress("KermetaCompiler.kp2bytecode", "Compiling "+kpFileURL, this.getClass().getName(), 6);
		KpLoaderImpl ldr = new KpLoaderImpl();
		KermetaProject kp = ldr.loadKp(kpFileURL);
		if(!kp.getName().isEmpty()){
			projectName = kp.getName();
		}
		KpVariableExpander varExpander = new KpVariableExpander(kpFileURL);
		List<ModelingUnit> modelingUnits = getSourceModelingUnits(kp, varExpander);
		logger.progress("KermetaCompiler.kp2bytecode", "Merging "+ modelingUnits.size()+" files...", this.getClass().getName(), 1);
		
		ModelingUnit mergedUnit = mergeModelingUnits(modelingUnits);
	
		if (mergedUnit instanceof ErrorProneResult<?>) {
			System.err.println("This is a errorproneresult");
		}
		else {
			System.err.println("This is no error prone result");
		}
		
		// Check mergedUnit for scope MERGED
		if (checkingEnabled) {
			DiagnosticModel results = checkModelingUnit(mergedUnit, CheckerScope.MERGED);
			processCheckingDiagnostics(results);
			
			if (stopOnError && results.getDiagnostics().size()>0) {
				logger.info("Errors have risen during check for scope MERGED, stop compilation process", this.getClass().getName());
				return;
			}
			
		}
		
		ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit);
		// Check resolvedUnit for scope RESOLVED
		if (checkingEnabled) {
			DiagnosticModel results = checkModelingUnit(resolvedUnit, CheckerScope.RESOLVED);
			processCheckingDiagnostics(results);
			
			if (stopOnError && results.getDiagnostics().size()>0) {
				logger.info("Errors have risen during check for scope RESOLVED, stop compilation process", this.getClass().getName());
				return;
			}		
		}
		
		//save resolvedUnit to the META-INF/kermeta/merged.km
		URI uri = URI.createURI((resolvedUnit.getNamespacePrefix() + "." + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
		File mergedFile = new File(targetGeneratedResourcesFolder+DEFAULT_KP_METAINF_LOCATION_IN_JAR+"/"+projectName+".km");		
		if(!mergedFile.getParentFile().exists()){
			mergedFile.getParentFile().mkdirs();
		}
		FileWriter writer = new FileWriter(mergedFile);

		logger.progress("KermetaCompiler.kp2bytecode", "Resolving...", this.getClass().getName(), 1);
		writer.write(new ModelingUnitConverter().saveMu(resolvedUnit, uri).toString());
		writer.close();
		
		if(!generateKmOnly){
			// deal with km to scala
				// compiler require a file location not an URL
			logger.progress("KermetaCompiler.kp2bytecode", "Generating scala...", this.getClass().getName(), 1);
			String fileLocation = mergedFile.toURI().toURL().getFile();
			km2Scala(kp, varExpander, fileLocation, targetGeneratedSourceFolder, targetFolder);
			logger.progress("KermetaCompiler.kp2bytecode", "Generating bytecode...", this.getClass().getName(), 1);
			// deal with scala to bytecode
			scala2bytecode(additionalClassPath);
		}
		else{
			logger.info("generateKmOnly flag set => Ignore scala generation", this.getClass().getName());
		}
		logger.doneProgress("KermetaCompiler.kp2bytecode", kpFileURL + " has been compiled", this.getClass().getName());
	}	


	public ModelingUnit parse(URL uri){
		logger.flushProblem(KMTparser.LOG_MESSAGE_GROUP, uri);
		KMTparser theParser = new KMTparser();
		return theParser.load(uri, "", logger);
	}
	
	public ModelingUnit parse(URL uri, String content){
		logger.flushProblem(KMTparser.LOG_MESSAGE_GROUP, uri);
		KMTparser theParser = new KMTparser();
		return theParser.load(uri, content, logger);
	}

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();
		
		// Note that source is relative to the kp file not the jvm current dir
		List<Source> srcs = kp.getSources();
		for (Source src : srcs ){
			
			if (src instanceof SourceQuery){
				// deal with srcQuery
				SourceQuery srcQuery = (SourceQuery) src;
				String fromDependencyUrl = varExpander.expandVariables(srcQuery.getFrom().getUrl());
				String indirectURL = "jar:"+fromDependencyUrl+"!"+varExpander.expandVariables(srcQuery.getQuery());
				logger.debug("SourceQuery : " + srcQuery + " from "+srcQuery.getFrom().getUrl()+" (expanded to : " +indirectURL +")", this.getClass().getName());
				
				ModelingUnit mu = new ModelingUnitLoader(logger,this.runInEclipse,this.saveIntermediateFiles, this.targetIntermediateFolder+"/"+srcQuery.getFrom().getName()).loadModelingUnitFromURL(indirectURL);
				if (mu != null) {
					modelingUnits.add(mu);
					if(this.saveIntermediateFiles){
						
					}
				}
				else {
					logger.log(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " +indirectURL, this.getClass().getName());
				}
			}
			else{
				String sourceURLWithVariable = ((Source) src).getUrl();
				sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
				String sourceURL = varExpander.expandVariables(sourceURLWithVariable);
				if (sourceURLWithVariable.contains("${")){
					// deal with variable expansion
					
					logger.debug("sourceURL : " + sourceURLWithVariable + " (expanded to : " +sourceURL +")", this.getClass().getName());
				}
				else{
					logger.debug("sourceURL : " + sourceURLWithVariable, this.getClass().getName());
				}
				// usual internal source
				ModelingUnit mu = new ModelingUnitLoader(logger,this.runInEclipse,this.saveIntermediateFiles, this.targetIntermediateFolder).loadModelingUnitFromURL(sourceURL);
				if (mu != null) {
					if(mu.getName() == null){
						// force ModelingUnit name to the one provided in the kp
						mu.setName(kp.getName());
					}
					modelingUnits.add(mu);
				}
				else {
					logger.log(MessagingSystem.Kind.UserERROR,"Empty ModelingUnit, failed to load " +sourceURL, this.getClass().getName());
				}
			}
		}
			
		// get dependencies
		List<Dependency> dependencies = kp.getDependencies();
		for(Dependency  dep : dependencies){
			String dependencyURLWithVariable =  dep.getUrl();
			String dependencyURL = varExpander.expandVariables(dependencyURLWithVariable);
			if (dependencyURLWithVariable.contains("${")){
				// deal with variable expansion
				logger.debug("dependency : " + dependencyURLWithVariable + " ( expanded to : " +dependencyURL+")", this.getClass().getName());
			}
			else{
				logger.debug("dependency : " + dependencyURLWithVariable, this.getClass().getName());
			}
			
			KermetaProject dependencyKP = null;
			
			URL jar = new  URL(dependencyURL);
			ZipInputStream zip = new ZipInputStream(jar.openStream());
		    ZipEntry ze;
		    while ((ze = zip.getNextEntry()) != null){
		    	if(("/"+ze.getName()).equals(DEFAULT_KP_LOCATION_IN_JAR)){
		    		// load dependencyKP
		    		KpLoaderImpl ldr = new KpLoaderImpl();
		    		dependencyKP = ldr.loadKp(URI.createURI("jar:"+dependencyURL+"!/"+ze.getName()));
		    	}
		    }
		    
		    // try to load the associated merged km
		    if(dependencyKP == null){
		    	logger.log(MessagingSystem.Kind.UserWARNING,"   dependency doesn't contains a kp file, maybe you use it as input for srcQuery ? ", this.getClass().getName());
		    }
		    else{
		    	// load the km file resulting from the merge of the dependency
		    	String dependencyMergedKMUrl = "jar:"+dependencyURL+"!"+DEFAULT_KP_METAINF_LOCATION_IN_JAR+"/"+dependencyKP.getName()+".km";
		    	ModelingUnit mu = new ModelingUnitLoader(logger,this.runInEclipse).loadModelingUnitFromURL(dependencyMergedKMUrl);
				if (mu != null) {
					modelingUnits.add(mu);
				}
				else {
					logger.log(MessagingSystem.Kind.UserWARNING," Empty ModelingUnit, failed to load " +dependencyMergedKMUrl, this.getClass().getName());
					
				}
		    }
		}
		return modelingUnits;
	}
	
	
	
	public ModelingUnit mergeModelingUnits(List<ModelingUnit> modelingUnits) throws IOException {
		List<ModelingUnit> convertedModellingUnits = new ArrayList<ModelingUnit>();
		// Convert Modellingunit For Merger
		// not useful now ? utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.merger.binarymerger");
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		for (ModelingUnit mu : modelingUnits){			
			convertedModellingUnits.add( new ModelingUnitConverter().convert(mu));
		}
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		
		// merge
		ModelingUnit mergedMU = convertedModellingUnits.get(0);		
		if (convertedModellingUnits.size()>1){
			org.kermeta.language.merger.BinaryMerger b = org.kermeta.language.merger.KerRichFactory
			.createBinaryMerger();
			for (int i = 1;i<convertedModellingUnits.size();i++){
				mergedMU = b.merge(mergedMU, convertedModellingUnits.get(i));
			}			
		}

		return mergedMU;
	}
	
	
	public ModelingUnit resolveModelingUnit(ModelingUnit mu) throws IOException{
		//utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.resolver");
		org.kermeta.language.language.resolverrunner.MainRunner.init4eclipse();
		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles,targetIntermediateFolder+"/beforeResolving.km").convert(mu);
		
		//Resolving
		org.kermeta.language.resolver.FullStaticResolver resolver = org.kermeta.language.resolver.KerRichFactory
		.createFullStaticResolver();
		
		ModelingUnit resolvedMU = resolver.doResolving(convertedModelingUnit);
				
		
		//StaticSetting
		ModelingUnit staticsettedMU = resolver.doStaticSetting(resolvedMU);
		resolver.checkUnresolved(resolvedMU);
		//End of Resolving
		return staticsettedMU;
	}
	
	

	synchronized public void km2Scala(KermetaProject kp, KpVariableExpander varExpander, String kmFileURL, String targetGeneratedSourceFolder, String targetFolder) {
            GlobalConfiguration.outputFolder_$eq(targetGeneratedSourceFolder+"/"+INTERMEDIATE_SCALA_SUBFOLDER);
            GlobalConfiguration.outputProject_$eq(targetGeneratedSourceFolder+"/"+INTERMEDIATE_SUBFOLDER);
            GlobalConfiguration.outputBinFolder_$eq(targetFolder+"/classes");
            GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit."+kp.getGroup()+"."+kp.getName());
            GlobalConfiguration.props_$eq(new Properties());
            GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
            GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
            GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");
                // GroupId and ArtifactId are used to prefix the generated code
            GlobalConfiguration.props().setProperty("project.group.id", kp.getGroup());
            GlobalConfiguration.props().setProperty("project.artefact.id", kp.getName());

            // default baseClass and baseOperation
            if(kp.getDefaultMainClass() != null){
            	GlobalConfiguration.props().setProperty("baseClass", kp.getDefaultMainClass());
            }
            if(kp.getDefaultMainOperation() != null){
            	GlobalConfiguration.props().setProperty("baseOperation", kp.getDefaultMainOperation());
            }
            
            //GlobalConfiguration.load(GlobalConfiguration.props());
            GlobalConfiguration.setScalaAspectPrefix(kp.getGroup()+"."+kp.getName());
          /*
            if(packageEquivalences != null){
                for (int i = 0; i < packageEquivalences.length; i++) {
                                    PackageEquivalence equivalence = packageEquivalences[i];
                                    this.getLog().info("   PackageEquivalence found: " + equivalence.getEcorePackageName() + " -> " +equivalence.getJavaPackageName());
                                    kermeta.utils.TypeEquivalence.packageEquivelence().put(equivalence.getEcorePackageName(), equivalence.getJavaPackageName());
                            }
            }*/
            org.kermeta.compilo.scala.Compiler km2ScalaCompiler = new org.kermeta.compilo.scala.Compiler();
            km2ScalaCompiler.compile(kmFileURL);
	}
	
	public DiagnosticModel checkModelingUnit(ModelingUnit mu, CheckerScope scope) throws IOException {
		
		org.kermeta.language.language.checkerrunner.MainRunner.init4eclipse();
		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles,targetIntermediateFolder+"/beforeCheckingScopeMerged.km").convert(mu);
		
		//Checking
		org.kermeta.language.checker.Checker checker = org.kermeta.language.checker.KerRichFactory
		.createChecker();
				
		DiagnosticModel diags = checker.checkObject(convertedModelingUnit, scope.toString());
		
		/*
		//Display check results
		logger.log(MessagingSystem.Kind.UserINFO,"There are " + diags.getDiagnostics().size() + " failed constraints", this.getClass().getName());

		for (ConstraintDiagnostic diag : diags.getDiagnostics()) {
			
			String message = "";
			Constraint failedConstraint = diag.getFailedConstraint();
			if ( failedConstraint instanceof InvariantProxy ) {
				message = message + "Invariant " + ((InvariantProxy)failedConstraint).getInvariantName() 
						+ " on object " + ((ModelReference)diag.getAppliesTo()).getReferencedObject().toString();
			}
			//String message = diag.getFailedConstraint().;
			if (diag.isIsWarning()) {
				logger.log(MessagingSystem.Kind.UserWARNING, message, this.getClass().getName());
			} 
			else {
				logger.log(MessagingSystem.Kind.UserERROR, message, this.getClass().getName());
			}
				
			
			// retrieve the referenced EObject tag sourceLocation
			EObject myObject = ((ModelReference)diag.getAppliesTo()).getReferencedObject();
			KermetaModelElement kme = (KermetaModelElement) myObject;
			
			// Check if there is a sourceLocation tag
			for (Tag t : kme.getKOwnedTags() ) {
				
				//logger.log(MessagingSystem.Kind.UserINFO, "Tag : " + t.getName(), "");
				if (t.getName().equals("source.location")) {
					//logger.log(MessagingSystem.Kind.UserINFO, "   -> value :(" + t.getValue() +")   ", "");
					createTextReference(t);
				}
			}
			
			
			
		}*/
		
		return diags;
	}
	
	private void processCheckingDiagnostics(DiagnosticModel diags) {

		//Display check results
		logger.log(MessagingSystem.Kind.UserINFO,"There are " + diags.getDiagnostics().size() + " failed constraints", this.getClass().getName());

		for (ConstraintDiagnostic diag : diags.getDiagnostics()) {
			
			String message = "";
			Constraint failedConstraint = diag.getFailedConstraint();
			if ( failedConstraint instanceof InvariantProxy ) {
				message = message + "Invariant " + ((InvariantProxy)failedConstraint).getInvariantName() 
						+ " on object " + ((ModelReference)diag.getAppliesTo()).getReferencedObject().toString();
			}
			//String message = diag.getFailedConstraint().;
			if (diag.isIsWarning()) {
				logger.log(MessagingSystem.Kind.UserWARNING, message, this.getClass().getName());
			} 
			else {
				logger.log(MessagingSystem.Kind.UserERROR, message, this.getClass().getName());
			}
				
			
			// retrieve the referenced EObject tag sourceLocation
			EObject myObject = ((ModelReference)diag.getAppliesTo()).getReferencedObject();
			KermetaModelElement kme = (KermetaModelElement) myObject;
			
			// Check if there is a sourceLocation tag
			for (Tag t : kme.getKOwnedTags() ) {
				
				//logger.log(MessagingSystem.Kind.UserINFO, "Tag : " + t.getName(), "");
				if (t.getName().equals("source.location")) {
					//logger.log(MessagingSystem.Kind.UserINFO, "   -> value :(" + t.getValue() +")   ", "");
					createTextReference(t);
				}
			}
			
			
			
		}
		
		
	}
	
	
	private void createTextReference(Tag tag) {
		
		String value = tag.getValue();
		String[] values = value.split(";");
		
		logger.log(MessagingSystem.Kind.UserINFO, "Source File (" + values[0] + ")", "");
		logger.log(MessagingSystem.Kind.UserINFO, "Line   (" + values[1] + ")", "");
		logger.log(MessagingSystem.Kind.UserINFO, "Column (" + values[2] + ")", "");
	
		try {
			TextReference ref = new TextReference(new URL(values[0]),new Integer(values[1]),new Integer(values[2]));
			logger.logProblem(MessagingSystem.Kind.UserERROR, "error on", this.getClass().getName(), ref);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
    private void scala2bytecode(List<String> additionalClassPath) {
       // scala.collection.immutable.List<String> classpath = org.embedded.EmbettedScalaCompiler.getActualClasspath();
       //java.util.List<String> additionalClassPath = new java.util.ArrayList<String>();
      // additionalClassPath.add("mvn:org.scala-lang/scala-library/2.8.1");
      // additionalClassPath.add("C:/Users/dvojtise/.m2/repository/org/scala-lang/scala-library/2.8.1/scala-library-2.8.1.jar");
       // s1.add("toto");
      
        /*EmbeddedMavenHelper.run(GlobalConfiguration.clean(),
                                GlobalConfiguration.createPackage(),
                                GlobalConfiguration.standalone(),
                                GlobalConfiguration.exec(),
                                additionalClassPathWrapper.toList(),
                                System.out);
        */
       
       logger.info("Compiling generated scala to bytecode in "+GlobalConfiguration.outputBinFolder(), this.getClass().getName());
       logger.debug("Classpath:",this.getClass().getName());
       for(String path : additionalClassPath){
           logger.debug("\t"+path, this.getClass().getName());
       }
       if (EmbeddedScalaCompiler.compile(GlobalConfiguration.outputFolder(), GlobalConfiguration.outputBinFolder(),true,additionalClassPath,useFSC) != 0){
           hasFailed = true;
           errorMessage = "Failed to generate bytecode from intermediate scala";
       }
        
    }
}
