/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

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
import org.kermeta.kp.loader.kp.KpLoader;
import org.kermeta.language.compiler.commandline.urlhandler.ExtensibleURLStreamHandlerFactory;
import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaCompiler;
import org.kermeta.language.structure.ModelingUnit;
//import scala.collection.JavaConversions.JListWrapper;
//import scala.collection.JavaConversions.JListWrapper;
//import org.embedded.EmbeddedMavenHelper;


/**
 * Basic compilation process for Kermeta2
 * This class is a facade for producing bytecode from a kermeta2 project
 */
public class KermetaCompiler {

	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String INTERMEDIATE_SUBFOLDER = "intermediate";
	public static String INTERMEDIATE_SCALA_SUBFOLDER = INTERMEDIATE_SUBFOLDER+ "/scala";
	
	
	public Boolean saveIntermediateFiles = false;
	public Boolean generateKmOnly = false;
	public String targetFolder;
	public String targetGeneratedSourceFolder;
	public String targetIntermediateFolder;
	public List<String> additionalClassPath = new java.util.ArrayList<String>();
	public String projectName = "project";
	public KpVariableExpander variableExpander;
        public Boolean useFSC = false;  // separate compilation server

        public Boolean hasFailed = false;
        public String errorMessage = "";
	
	/**
	 * Constructor
	 * @param targetFolder
	 * @param saveIntermediateFiles
	 */
	public KermetaCompiler(String targetFolder, String targetGeneratedSourceFolder, Boolean generateKmOnly, Boolean saveIntermediateFiles) {
		super();
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.generateKmOnly = generateKmOnly;
		this.targetGeneratedSourceFolder = targetGeneratedSourceFolder;
		this.targetFolder = targetFolder;
		registerMVNUrlHandler();
	}
	/**
	 * Constructor
	 * @param targetFolder
	 * @param saveIntermediateFiles
	 */
	public KermetaCompiler(String targetFolder, String targetGeneratedSourceFolder, Boolean generateKmOnly, Boolean saveIntermediateFiles, List<String> additionalClassPath) {
		super();
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.generateKmOnly = generateKmOnly;
		this.targetFolder = targetFolder;
		this.targetGeneratedSourceFolder = targetGeneratedSourceFolder;
		this.additionalClassPath.addAll(additionalClassPath);
		
		registerMVNUrlHandler();
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
		System.out.println(results);
		
	}

	/**
	 * This initialization must be called before everything related to eclipse 
	 */
	public static void initializeFactory(){
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();		
	}
	
	public KermetaCompiler(String targetFolder){
		// make sure initialize has been call : note that if some other EMF related things have 
		// been done before, the initialize should be done earlier too
		initializeFactory();
		this.targetFolder = targetFolder;
	}
	
	/**
	 * Main process
	 * @param kpFileURL
	 * @throws IOException
	 */
	public void kp2bytecode(String kpFileURL) throws IOException {
		KpLoader ldr = new KpLoader();
		KermetaProject kp = ldr.loadKp(kpFileURL);
		if(!kp.getName().isEmpty()){
			projectName = kp.getName();
		}
		KpVariableExpander varExpander = new KpVariableExpander(kpFileURL);
		List<ModelingUnit> modelingUnits = getSourceModelingUnits(kp, varExpander);
		ModelingUnit mergedUnit = mergeModelingUnits(modelingUnits);
		ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit);
		//save resolvedUnit to the META-INF/kermeta/merged.km
		URI uri = URI.createURI((resolvedUnit.getNamespacePrefix() + "." + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
		File mergedFile = new File(targetGeneratedSourceFolder+DEFAULT_KP_METAINF_LOCATION_IN_JAR+"/"+projectName+".km");		
		if(!mergedFile.getParentFile().exists()){
			mergedFile.getParentFile().mkdirs();
		}
		FileWriter writer = new FileWriter(mergedFile);
		writer.write(new ModelingUnitConverter().saveMu(resolvedUnit, uri).toString());
		writer.close();
		
		if(!generateKmOnly){
			// deal with km to scala
				// compiler require a file location not an URL
			String fileLocation = mergedFile.toURI().toURL().getFile();
			km2Scala(kp, varExpander, fileLocation);
			// deal with scala to bytecode
			scala2bytecode();
		}
		else{
			System.out.println("generateKmOnly flag set => Ignore scala generation");
		}
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
				System.out.println("SourceQuery : " + srcQuery + " from "+srcQuery.getFrom().getUrl()+" (expanded to : " +indirectURL +")");
				
				ModelingUnit mu = new ModelingUnitLoader().loadModelingUnitFromURL(indirectURL);
				if (mu != null) {
					modelingUnits.add(mu);
				}
				else {
					System.err.println("Empty ModelingUnit, failed to load " +indirectURL);
				}
			}
			else{
				String sourceURLWithVariable = ((Source) src).getUrl();
				sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
				String sourceURL = varExpander.expandVariables(sourceURLWithVariable);
				if (sourceURLWithVariable.contains("${")){
					// deal with variable expansion
					
					System.out.println("sourceURL : " + sourceURLWithVariable + " (expanded to : " +sourceURL +")");
				}
				else{
					System.out.println("sourceURL : " + sourceURLWithVariable);
				}
				// usual internal source
				ModelingUnit mu = new ModelingUnitLoader().loadModelingUnitFromURL(sourceURL);
				if (mu != null) {
					if(mu.getName() == null){
						// force ModelingUnit name to the one provided in the kp
						mu.setName(kp.getName());
					}
					modelingUnits.add(mu);
				}
				else {
					System.err.println("Empty ModelingUnit, failed to load " +sourceURL);
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
				System.out.println("dependency : " + dependencyURLWithVariable + " ( expanded to : " +dependencyURL+")");
			}
			else{
				System.out.println("dependency : " + dependencyURLWithVariable);
			}
			
			KermetaProject dependencyKP = null;
			
			URL jar = new  URL(dependencyURL);
			ZipInputStream zip = new ZipInputStream(jar.openStream());
		    ZipEntry ze;
		    while ((ze = zip.getNextEntry()) != null){
		    	if(("/"+ze.getName()).equals(DEFAULT_KP_LOCATION_IN_JAR)){
		    		// load dependencyKP
		    		KpLoader ldr = new KpLoader();
		    		dependencyKP = ldr.loadKp(URI.createURI("jar:"+dependencyURL+"!/"+ze.getName()));
		    	}
		    }
		    
		    // try to load the associated merged km
		    if(dependencyKP == null){
		    	System.out.println("   dependency doesn't contains a kp file, maybe you use it as input for srcQuery ? ");
		    }
		    else{
		    	// load the km file resulting from the merge of the dependency
		    	String dependencyMergedKMUrl = "jar:"+dependencyURL+"!"+DEFAULT_KP_METAINF_LOCATION_IN_JAR+"/"+dependencyKP.getName()+".km";
		    	ModelingUnit mu = new ModelingUnitLoader().loadModelingUnitFromURL(dependencyMergedKMUrl);
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
		utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.merger.binarymerger");
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		for (ModelingUnit mu : modelingUnits){			
			convertedModellingUnits.add( new ModelingUnitConverter().convert(mu));
		}
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		
		// merge
		ModelingUnit mergedMU = convertedModellingUnits.get(0);		
		if (convertedModellingUnits.size()>1){
			org.kermeta.language.merger.BinaryMerger b = org.kermeta.language.merger.RichFactory
			.createBinaryMerger();
			for (int i = 1;i<convertedModellingUnits.size();i++){
				mergedMU = b.merge(mergedMU, convertedModellingUnits.get(i));
			}			
		}

		return mergedMU;
	}
	
	
	public ModelingUnit resolveModelingUnit(ModelingUnit mu) throws IOException{
		utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.resolver");
		org.kermeta.language.language.resolverrunner.MainRunner.init4eclipse();
		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetGeneratedSourceFolder+"/"+INTERMEDIATE_SUBFOLDER+"/beforeResolving.km").convert(mu);
		
		//Resolving
		org.kermeta.language.resolver.FullStaticResolver resolver = org.kermeta.language.resolver.RichFactory
		.createFullStaticResolver();
		
		ModelingUnit resolvedMU = resolver.doResolving(convertedModelingUnit);
				
		
		//StaticSetting
		ModelingUnit staticsettedMU = resolver.doStaticSetting(resolvedMU);
		resolver.checkUnresolved(resolvedMU);
		//End of Resolving
		return staticsettedMU;
	}
	
	

	public void km2Scala(KermetaProject kp, KpVariableExpander varExpander, String kmFileURL) {
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
	
    private void scala2bytecode() {
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
       
       System.out.println("Compiling generated scala to bytecode in "+GlobalConfiguration.outputBinFolder());
       System.out.println("Classpath:");
       for(String path : additionalClassPath){
           System.out.println("\t"+path);
       }
       if (EmbeddedScalaCompiler.compile(GlobalConfiguration.outputFolder(), GlobalConfiguration.outputBinFolder(),true,additionalClassPath,useFSC) != 0){
           hasFailed = true;
           errorMessage = "Failed to generate bytecode from intermediate scala";
       }
        
    }
}
