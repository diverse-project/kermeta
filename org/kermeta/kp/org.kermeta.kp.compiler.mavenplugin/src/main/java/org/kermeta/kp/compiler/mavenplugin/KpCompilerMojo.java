/* $Id:$ 
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Francois Fouquet
 *            Didier Vojtisek
 * 
 */
package org.kermeta.kp.compiler.mavenplugin;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.eclipse.emf.common.util.URI;
//import org.kermeta.kp.KermetaProject;
//import org.kermeta.kp.compiler.commandline.KermetaCompiler;
//import org.kermeta.kp.compiler.commandline.KermetaRunner;
//import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.utils.aether.AetherUtil;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kevoree.kcl.KevoreeJarClassLoader;

/**
 * This class implement a maven plugin that compiles a kermeta project into scala files and then bytecode
 * 
 * Be careful annotations in the comments are used by maven...
 * 
 * @goal generate
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @author <a href="mailto:ffouquet@irisa.fr">Francois Fouquet</a>
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * @version $Id$
 *
 */
public class KpCompilerMojo extends AbstractMojo {

    /**
     * List of Remote Repositories used by the resolver
     *
     * @parameter expression="${project.remoteArtifactRepositories}"
     * @readonly
     * @required
     */
    protected java.util.List remoteRepos;
    /**
     * Location of the local repository.
     *
     * @parameter expression="${localRepository}"
     * @readonly
     * @required
     */
    protected org.apache.maven.artifact.repository.ArtifactRepository local;
    /**
     * POM
     *
     * @parameter expression="${project}"
     * @readonly
     * @required
     */
    protected MavenProject project;
    /**
     * Input kermeta project (kp) file
     * @parameter default-value="${basedir}/project.kp"
     */
    private File kp;
    
    /**
    * The directory to place processor and generated resources files. 
    * for apt.
    *
    * @parameter default-value="${project.build.directory}/generated-resources/kermeta"
    */
   private File resourceOutputDirectory;

   /**
    * The directory root under which generated source files will be placed; files are placed in
    * subdirectories based on package namespace. 
    *
    * @parameter default-value="${project.build.directory}/generated-sources/kermeta"
    */
   private File sourceOutputDirectory;
   
   /**
    * The directory root under which generated class files will be placed;  
    *
    * @parameter default-value="${project.build.directory}"
    */
   private File targetDirectory;


   /**
    * stopAfterPhase : The compilation will stop after the given phase;
    * Valid phase values are :
    * 	COLLECT_SOURCES,
	*	MERGE,
	*	RESOLVE,
	*	TYPE_SET,
	*	GENERATE_LEGACY_SOURCE,
	*	GENERATE_LEGACY_SOURCE_BYTECODE,
	*	GENERATE_SCALA,
	*	GENERATE_SCALA_BYTECODE  
    *
    * @parameter default-value="GENERATE_SCALA_BYTECODE"
    */
    private String stopAfterPhase;
    
    /**
     * intermediateFilesRequired : write to disk the intermediate files (useful for debugging), default is true
     * Recommanded for efficient incremental build.
     * @parameter expression="true"
     */
    private Boolean intermediateFilesRequired;
    
    /**
     * checkingEnabled : check modeling units after phases MERGE and TYPE_SET 
     *
     * @parameter expression="true"
     */
    private Boolean checkingEnabled;
    
    /**
     * continueOnError : stop compilation process when an error occurs
     * 
     * @parameter expression="false"
     */
    private Boolean continueOnError;
    
    
    /**
     * useDefaultClasspath : if true, the final bytecode (phase GENERATE_SCALA_BYTECODE) will be compiled using the embedded scala library and kermeta dependencies
     * if false, the maven project dependencies will be used to compute the classpath 
     *
     * @parameter expression="true"
     */
    private Boolean useDefaultClasspath;
    
    

    

    
    public void execute() throws MojoExecutionException, MojoFailureException {
    	try {
	        org.apache.log4j.BasicConfigurator.configure();
	
	        this.getLog().info("Generating sources in "+sourceOutputDirectory.getAbsolutePath());
	        this.getLog().info("Generating other resources in "+resourceOutputDirectory.getAbsolutePath());
	        String kpFileURL = kp.toURI().toString();
	        this.getLog().info("kpFileURL= "+kpFileURL);
	        
	        checkFile(kp.getAbsolutePath().toString());
	        
	        List<String> mavenClassPathList = project.getCompileClasspathElements();
	        List<String> classPathList = new ArrayList<String>(); 
	        if(mavenClassPathList.size() >=1){
	        	// ignore first entry wich correspond to current project target class folder
	        	classPathList.addAll(mavenClassPathList.subList(1, mavenClassPathList.size()));
	        }
	        
	        String pluginVersion = "2.0.1";
	        for( org.apache.maven.model.Plugin plugin : project.getBuildPlugins()){
	        	if(plugin.getArtifactId().equals("kp.compiler.mavenplugin")){
	        		pluginVersion = plugin.getVersion();	        	
	        	}
	        }
	        
	        List<String> repositoryList = new ArrayList<String>();
	        repositoryList.add("http://maven.inria.fr/artifactory/public-release");
	        repositoryList.add("http://maven.inria.fr/artifactory/public-snapshot");
	        
	        AetherUtil aetherUtil = new AetherUtil();
	        File compilerJarFile = aetherUtil.resolveMavenArtifact4J("org.kermeta.kp", 
	        		"kp.compiler.commandline.standalone", 
	        		pluginVersion, 
	        		repositoryList);
	        
	        
	        KevoreeJarClassLoader kjcl = new KevoreeJarClassLoader();
	        kjcl.getParentLoader().setEnabled(false); // disable parent loader
	        //kjcl.add(this.getClass().getResourceAsStream("/kp.compiler.commandline.standalone.jar"));
	        kjcl.add(compilerJarFile.getAbsolutePath());
	        
	        try {
	        	
	        	this.getLog().info(" kjcl.loadClass");
	            Class<?> cls = kjcl.loadClass("org.kermeta.kp.compiler.commandline.KermetaCompilerCLI");
	            this.getLog().debug("cls.getName() = " + cls.getName());
	            
	            Object compilerCLI = cls.newInstance();
	            
	            
	            Method loadArgsMethod = cls.getDeclaredMethod("loadArgs", String[].class);
	            ArrayList<String> paramsArray = new ArrayList<String>();

	            if(continueOnError) paramsArray.add("-continueOnError");
	            paramsArray.add("-stopAfter");
	            paramsArray.add(stopAfterPhase);
	            if(intermediateFilesRequired) paramsArray.add("-intermediate");
	            if(!checkingEnabled) paramsArray.add("-ignoreCheck");
	            if(useDefaultClasspath){
	            	paramsArray.add("-cp");
	            	paramsArray.add(compilerJarFile.getAbsolutePath());
	            }
	            else {
	            	// TODO use maven dependencies to build the classpath
	            	// however, the preferred method is to stop after phase GENERATE_SCALA and then delegate the compilation to maven itself
	            	throw new MojoFailureException("Feature not implemented yet");
	            }
	            paramsArray.add(kpFileURL);
	            
	            
	            
	            String[] params = {};
	            params = paramsArray.toArray(params);
	            loadArgsMethod.invoke(compilerCLI, (Object) params);
	            System.out.println("loadArgsMethod.invoke(compilerCLI, (Object) params); " +compilerCLI+" "+ params);
	            this.getLog().info("loadArgsMethod.invoke(compilerCLI, (Object) params); " +compilerCLI+" "+ params);
	            Method runMethod = cls.getMethod("run");
	            boolean hasFailed = (Boolean)  runMethod.invoke(compilerCLI);
	            System.out.println("runMethod.invoke(compilerCLI); " +compilerCLI);
	            this.getLog().info("runMethod.invoke(compilerCLI); " +compilerCLI);
	            if(hasFailed){
	            	throw new MojoFailureException((String) cls.getMethod("getErrorMessage").invoke(compilerCLI));
	            }
	            
	            
	        } catch (Exception e) {
	        	getLog().error(e);
	            throw new MojoFailureException(e.toString());
	        }
	        
	        
	        /*
	        KermetaCompiler.initializeFactory();
	        KermetaCompiler compiler = new KermetaCompiler(true,
	        		new StdioSimpleMessagingSystem(),
	        		new SimpleLocalFileConverter(),
	        		intermediateFilesRequired,
	        		false,
	        		checkingEnabled,
	        		stopOnError);
			compiler.initializeTargetFolders(targetDirectory.toString(), sourceOutputDirectory.toString(), sourceOutputDirectory.toString(), targetDirectory.toString()+"/classes", targetDirectory.toString()+"/genmodel", sourceOutputDirectory.toString(), targetDirectory.toString()+"/classes", resourceOutputDirectory.toString());
			compiler.kp2bytecode(kpFileURL,  classPathList, generateKmOnly);
		if(compiler.hasFailed)	{
                    throw new MojoExecutionException(compiler.errorMessage);
                }
		else{
			if (run){
				KpLoaderImpl ldr = new KpLoaderImpl(new StdioSimpleMessagingSystem());
				
				// Load KP file
				KermetaProject kpModel = ldr.loadKp(kp.toString());
				KermetaRunner runner = new KermetaRunner(targetDirectory.toString()+"/classes", 
						kpModel.getGroup()+"."+kpModel.getName(), 
						classPathList, 
						new StdioSimpleMessagingSystem() );
				runner.runK2Program(  Arrays.asList(params),null);
			}
		}
		*/
	        // Add kp file and resolved km files in the resulting jar
			// tell maven to include generated resources
			Resource resource = new Resource();
	        resource.setDirectory(targetDirectory.getPath() + "/resources");
	        resource.setTargetPath(".");
	        project.getResources().add(resource);
	        
	        // copy kp in the resources using default name
	        copyFile(kp, new File(targetDirectory.getPath() + "/resources/META-INF/kermeta/project.kp"));
	        
	        
	        
	        
    	} catch (Exception e) {
			this.getLog().error(e);
			throw new MojoFailureException(e.toString());
		}
		
        /* CHECK IF GENERATION IF OK */
       /* if (!CheckSumFileUtils.compareCheckSum(model.getAbsolutePath(), output.getAbsolutePath())) {
            Compiler compilo = new fr.irisa.triskell.kermeta.compilo.scala.Compiler();

                        GlobalConfiguration.outputFolder_$eq(output.getAbsolutePath());
            GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit."+targetGroupId+"."+targetArtifactId);
            GlobalConfiguration.props_$eq(new Properties());
            GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
            GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
            GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");
                // GroupId and ArtifactId are used to prefix the generated code
            GlobalConfiguration.props().setProperty("project.group.id", targetGroupId);
            GlobalConfiguration.props().setProperty("project.artefact.id", targetArtifactId);
            //GlobalConfiguration.load(GlobalConfiguration.props());
            GlobalConfiguration.setScalaAspectPrefix(targetGroupId+"."+targetArtifactId);
            
            if(packageEquivalences != null){
	            for (int i = 0; i < packageEquivalences.length; i++) {
					PackageEquivalence equivalence = packageEquivalences[i];
					this.getLog().info("   (TODO)PackageEquivalence found: " + equivalence.getEcorePackageName() + " -> " +equivalence.getJavaPackageName());
					// TODO deal with package equivalence in the Kermeta2 compiler
					// kermeta.utils.TypeEquivalence.packageEquivelence().put(equivalence.getEcorePackageName(), equivalence.getJavaPackageName());
				}
            }
            
            
            checkFile(model.getAbsolutePath().toString());
            compilo.compile(model.getAbsolutePath().toString());
            try {
                CheckSumFileUtils.writeCheckSum(output.getAbsolutePath(), CheckSumFileUtils.checkSumFile(model.getAbsolutePath()));
            } catch (Exception ex) { ex.printStackTrace(); }
              
        }*/
    }

    protected boolean checkFile(String filePath) throws MojoExecutionException {
        File file = new File(filePath);
        if (!file.exists()) {
            this.getLog().error("File not found : " + filePath);
            throw new MojoExecutionException("Failed to run kermeta compiler : File not found : " + filePath);

        }
        return true;
    }
     
    protected void copyFile(File inputFile, File outputFile) throws IOException{
    	outputFile.getParentFile().mkdirs();
    	FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;

        while ((c = in.read()) != -1)
          out.write(c);

        in.close();
        out.close();
    }
        
    
}
