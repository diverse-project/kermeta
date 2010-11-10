/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.compiler.mavenplugin;

import fr.irisa.triskell.kermeta.compilo.scala.Compiler;
import fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration;
import java.io.File;
import java.util.Properties;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;


/**
 *
 * @author ffouque
 *
 * @goal generate
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @author <a href="mailto:ffouquet@irisa.fr">Fouquet Francois</a>
 * @version $Id$
 *
 */
public class K2CompilerMojo extends AbstractMojo {

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
     * Ecore file
     *
     * @parameter
     * @required
     */
    private File model;
    /**
     * Output Directory file
     *
     * @parameter expression="${project.build.directory}/generated-sources/kermeta"
     * @readonly
     * @required
     */
    private File output;

    public void execute() throws MojoExecutionException, MojoFailureException {

    	org.apache.log4j.BasicConfigurator.configure();
        Compiler compilo = new fr.irisa.triskell.kermeta.compilo.scala.Compiler();

        this.getLog().info(output.getAbsolutePath());

        GlobalConfiguration.outputFolder_$eq(output.getAbsolutePath());
        GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit.generated");
        GlobalConfiguration.props_$eq(new Properties());
        GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
        GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
        GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");

        checkFile(model.getAbsolutePath().toString());
        compilo.compile(model.getAbsolutePath().toString());
       
       

    }
    
    protected boolean checkFile(String filePath ) throws MojoExecutionException {
    	File file = new File(filePath);
    	if(!file.exists()){
    		this.getLog().error("File not found : " + filePath);
    		throw new MojoExecutionException("Failed to run kermeta compiler : File not found : " + filePath);
    		
    	}
    	return true;
    }
}
