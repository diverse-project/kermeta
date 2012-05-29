/* $Id:$ 
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Francois Fouquet
 *            Didier Vojtisek
 * 
 */
package org.kermeta.language.gendoc.mavenplugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * This class implement a maven plugin that compiles a kermeta project into scala files and then bytecode
 * 
 * Be careful annotations in the comments are used by maven...
 * 
 * @goal generate
 * @phase generate-resources
 * @requiresDependencyResolution compile
 * @author <a href="mailto:ffouquet@irisa.fr">Francois Fouquet</a>
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * @version $Id$
 *
 */
public class KMDocGeneratorMojo extends AbstractMojo {

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
     * Input kermeta model (km) file
     * @required
     * @parameter
     */
    private File kmFile;
    
    /**
    * The directory to place generated files. 
    * for apt.
    *
    * @parameter default-value="${project.build.directory}/documentation"
    */
   private File outputDirectory;
   
   /**
    * Package that are excluded from the html documentation generation
    * @parameter
    */
   private String[] excludedPackages;

       
    

    
    public void execute() throws MojoExecutionException, MojoFailureException {
    	try {
	        org.apache.log4j.BasicConfigurator.configure();
	
	        this.getLog().info("Generating documentation in "+outputDirectory.getAbsolutePath());
	        String kmFileURL = kmFile.toURI().toString();
	        this.getLog().info("kpFileURL= "+kmFileURL);
	        
	        checkFile(kmFile.getAbsolutePath().toString());
	        
	        
	        org.kermeta.language.gendoc.km2html.Km2Html generator = new org.kermeta.language.gendoc.km2html.Km2HtmlImpl4Eclipse();
			
	        StringBuilder excludedPackagesString = new StringBuilder();
	        if(excludedPackages != null)
		        for(String excludedPack : excludedPackages){
		        	excludedPackagesString.append(excludedPack+" ");
		        }
	        else excludedPackagesString.append("");
	        
	        
			generator.genHtmlDoc4File(kmFileURL, outputDirectory.toURI().toString(), excludedPackagesString.toString().trim());	        
	        
    	} catch (Exception e) {
			this.getLog().error(e);
			throw new MojoFailureException(e.toString());
		}
        
    }
    
    protected boolean checkFile(String filePath) throws MojoExecutionException {
        File file = new File(filePath);
        if (!file.exists()) {
            this.getLog().error("File not found : " + filePath);
            throw new MojoExecutionException("Failed to generate documentation : File not found : " + filePath);

        }
        return true;
    }
    
    
}
