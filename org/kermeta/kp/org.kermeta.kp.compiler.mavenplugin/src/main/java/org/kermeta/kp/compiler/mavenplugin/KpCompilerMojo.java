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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.KermetaRunner;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

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
     * GroupId : used to prefix generated code by the  Kermeta Compiler
     *
     * @parameter expression="${project.groupId}"
     */
    private String targetGroupId;
    /**
     * artifactId : used to prefix generated code by the  Kermeta Compiler
     *
     * @parameter expression="${project.artifactId}"
     */
    private String targetArtifactId;
    
    /**
     * intermediateFilesRequired : write to disk the intermediate files (useful for debugging), default is true
     *
     * @parameter expression="true"
     */
    private Boolean intermediateFilesRequired;
    
    
    /**
     * generateKmOnly : generate only the km, will not compile the final bytecode classes, default is false
     *
     * @parameter expression="false"
     */
    private Boolean generateKmOnly;

    /**
     * run : run K2 programs, default is false
     *
     * @parameter expression="false"
     */
    private Boolean run;

    
    /**
     * checkingEnabled : check modeling units
     *
     * @parameter expression="true"
     */
    private Boolean checkingEnabled;
    
    /**
     * stopOnError : stop compilation process when an error occurs
     * 
     * @parameter expression="true"
     */
    private Boolean stopOnError;
    
    /**
     * packageEquivalence : used to indicate when a package in the ecore is different from the generated java code
     *
     * @parameter 
     */
    private PackageEquivalence[] packageEquivalences;

    /**
     * params : list of parameter strings that will be passed by default when running the kermeta program
     *
     * @parameter 
     */
    private String[] params;

    
    public void execute() throws MojoExecutionException, MojoFailureException {
    	try {
	        org.apache.log4j.BasicConfigurator.configure();
	
	        this.getLog().info("Generating sources in "+sourceOutputDirectory.getAbsolutePath());
	        this.getLog().info("Generating other resources in "+resourceOutputDirectory.getAbsolutePath());
	        
	        checkFile(kp.getAbsolutePath().toString());
	        
	        List<String> mavenClassPathList = project.getCompileClasspathElements();
	        List<String> classPathList = new ArrayList<String>(); 
	        if(mavenClassPathList.size() >=1){
	        	// ignore first entry wich correspond to current project target class folder
	        	classPathList.addAll(mavenClassPathList.subList(1, mavenClassPathList.size()));
	        }
	        
	        
	        KermetaCompiler.initializeFactory();
	        KermetaCompiler compiler = new KermetaCompiler(true,
	        		new StdioSimpleMessagingSystem(),
	        		new SimpleLocalFileConverter(),
	        		intermediateFilesRequired,
	        		sourceOutputDirectory.toString(),
	        		false,
	        		checkingEnabled,
	        		stopOnError);
			
			compiler.kp2bytecode(kp.toString(), targetDirectory.toString(), sourceOutputDirectory.toString(), resourceOutputDirectory.toString(), classPathList, generateKmOnly);
		if(compiler.hasFailed)	{
                    throw new MojoExecutionException(compiler.errorMessage);
                }
		else{
			if (run){
				KpLoaderImpl ldr = new KpLoaderImpl();
				
				// Load KP file
				KermetaProject kpModel = ldr.loadKp(kp.toString());
				KermetaRunner runner = new KermetaRunner(targetDirectory.toString()+"/classes", 
						kpModel.getGroup()+"."+kpModel.getName(), 
						classPathList, 
						new StdioSimpleMessagingSystem() );
				runner.runK2Program(  Arrays.asList(params),"");
			}
		}
	        // Add kp file and resolved km files in the resulting jar
			// tell maven to include generated META-INF
			Resource resource = new Resource();
	        resource.setDirectory(resourceOutputDirectory.getPath() + "/META-INF");
	        resource.setTargetPath("META-INF");
	        project.getResources().add(resource);
	        resource = new Resource();
	        resource.setDirectory(sourceOutputDirectory.getPath() + "/META-INF");
	        resource.setTargetPath("META-INF");
	        project.getResources().add(resource);
	        
	        // copy kp in the resources
	        copyFile(kp, new File(resourceOutputDirectory, KermetaCompiler.DEFAULT_KP_LOCATION_IN_JAR));
	        
	        
	        
	        
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
