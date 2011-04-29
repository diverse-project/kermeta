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
import org.kermeta.compilo.scala.GlobalConfiguration;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.SourceQuery;
import org.kermeta.kp.compiler.commandline.urlhandler.ExtensibleURLStreamHandlerFactory;
import org.kermeta.kp.loader.kp.api.KpLoaderImpl;
import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaCompiler;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.structure.ModelingUnit;
//import scala.collection.JavaConversions.JListWrapper;
//import scala.collection.JavaConversions.JListWrapper;
//import org.embedded.EmbeddedMavenHelper;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


/**
 * Basic compilation process for Kermeta2
 * This class is a facade for producing bytecode from a kermeta2 project
 */
public class KermetaCompiler {

	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String INTERMEDIATE_SUBFOLDER = "intermediate";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER+ "/scala";
	
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
	public KermetaCompiler( Boolean registerProtocols, MessagingSystem logger) {
		super();
		this.logger = logger;
		if(registerProtocols){
			registerMVNUrlHandler();
		}
	}
	
	/**
	 * 
	 * @param registerProtocols if set to true, the constructor will take care to register some URL handler
	 * @param logger is the MessagingSystem that must be used to log message, problem and progression 
	 * @param saveIntermediateFiles indicates if the compilation must also produce intermediate files  
	 * @param targetIntermediateFolder indicates where the intermediate files must be generated
	 * @param willRunInEclipse indicates if it is run in eclipse
	 */
	public KermetaCompiler( Boolean registerProtocols, MessagingSystem logger, Boolean saveIntermediateFiles, String targetIntermediateFolder, Boolean willRunInEclipse) {
		super();
		this.logger = logger;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
		this.runInEclipse = willRunInEclipse;
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
	public void kp2bytecode(String kpFileURL, String targetGeneratedSourceFolder, String targetFolder,List<String> additionalClassPath, Boolean generateKmOnly) throws IOException {
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
		ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit);
		//save resolvedUnit to the META-INF/kermeta/merged.km
		URI uri = URI.createURI((resolvedUnit.getNamespacePrefix() + "." + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
		File mergedFile = new File(targetGeneratedSourceFolder+DEFAULT_KP_METAINF_LOCATION_IN_JAR+"/"+projectName+".km");		
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
		KMTparser theParser = new KMTparser();
		return theParser.load(uri, "", logger);
	}
	
	public ModelingUnit parse(URL uri, String content){
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
				
				ModelingUnit mu = new ModelingUnitLoader(logger,this.runInEclipse).loadModelingUnitFromURL(indirectURL);
				if (mu != null) {
					modelingUnits.add(mu);
				}
				else {
					logger.error("Empty ModelingUnit, failed to load " +indirectURL, this.getClass().getName(), new Exception());
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
				ModelingUnit mu = new ModelingUnitLoader(logger,this.runInEclipse).loadModelingUnitFromURL(sourceURL);
				if (mu != null) {
					if(mu.getName() == null){
						// force ModelingUnit name to the one provided in the kp
						mu.setName(kp.getName());
					}
					modelingUnits.add(mu);
				}
				else {
					logger.error("Empty ModelingUnit, failed to load " +sourceURL, this.getClass().getName(), new Exception());
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
		    	logger.warn("   dependency doesn't contains a kp file, maybe you use it as input for srcQuery ? ", this.getClass().getName(), new Exception());
		    }
		    else{
		    	// load the km file resulting from the merge of the dependency
		    	String dependencyMergedKMUrl = "jar:"+dependencyURL+"!"+DEFAULT_KP_METAINF_LOCATION_IN_JAR+"/"+dependencyKP.getName()+".km";
		    	ModelingUnit mu = new ModelingUnitLoader(logger,this.runInEclipse).loadModelingUnitFromURL(dependencyMergedKMUrl);
				if (mu != null) {
					modelingUnits.add(mu);
				}
				else {
					System.err.println("Empty ModelingUnit, failed to load " +dependencyMergedKMUrl);
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
