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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Properties;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.kermeta.language.compiler.commandline.KermetaCompiler;

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
     * @parameter expression="${project.directory}/project.kp"
     * @parameter
     * @required
     */
    private File kp;
    /**
     * Output Directory file
     *
     * @parameter expression="${project.build.directory}/generated-sources/kermeta"
     * @readonly
     * @required
     */
    private File output;


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
     * packageEquivalence : used to indicate when a package in the ecore is different from the generated java code
     *
     * @parameter 
     */
    private PackageEquivalence[] packageEquivalences;

    public void execute() throws MojoExecutionException, MojoFailureException {

        org.apache.log4j.BasicConfigurator.configure();

        this.getLog().info(output.getAbsolutePath());
        
        checkFile(kp.getAbsolutePath().toString());
        KermetaCompiler compiler = new KermetaCompiler(output.toString(), intermediateFilesRequired);
		try {
			compiler.kp2bytecode(kp.toString());
		} catch (IOException e) {
			this.getLog().error(e);
			e.printStackTrace();
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
        
}
