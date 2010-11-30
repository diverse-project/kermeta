/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.merger.mavenplugin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.resolver.ArtifactCollector;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.merger.Art2MergerComponent;

/**
 *
 * @author ffouque
 *
 * @goal generate
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @author <a href="mailto:ffouquet@irisa.fr">Fouquet François</a>
 * @version $Id$
 *
 */
public class MergerMojo extends AbstractMojo {

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

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        if (model.isDirectory()) {
            for (File f : scanForArt2(model)) {
                mergeFile(f);
            }

        } else {
            mergeFile(model);
        }
    }

    private List<File> scanForArt2(File modelDir) {
        List<File> models = new ArrayList();
        for (File f : modelDir.listFiles()) {
            if (f.getName().endsWith(".art2")) {
                models.add(f);
            }
        }
        return models;
    }

    private void mergeFile(File modelInput) {

        this.getLog().info("Process Art2 File => "+modelInput);

        //CREATE NEW MERGER INSTANCE
        Art2MergerComponent merger = new Art2MergerComponent();

        //LOAD PREVIOUS MODEL OR CREATE ONE
        ContainerRoot root = null;
        if (modelInput.isFile()) {
            root = Art2XmiHelper.load("file:///" + modelInput.getAbsolutePath());
        } else {
            this.getLog().warn("Model File Empty, creating one !");
            root = Art2Factory.eINSTANCE.createContainerRoot();
        }

        //MERGE TO BY TO
        Iterator it2 = project.getDependencyArtifacts().iterator();
        while (it2.hasNext()) {
            Artifact d = (Artifact) it2.next();
            String artefactPath = local.getBasedir() + "/" + local.pathOf(d).toString();

            JarFile jar;
            try {
                jar = new JarFile(artefactPath);
                JarEntry entry = jar.getJarEntry("ART2-INF/art2Lib.art2");
                if (entry != null) {
                    String path = convertStreamToFile(jar.getInputStream(entry));
                    //Load
                    ContainerRoot nroot = Art2XmiHelper.load(path);
                    //Merge
                    this.getLog().info("Art2 Merge => " + artefactPath);
                    merger.merge(root, nroot);

                    //CREATE TEMP FILE FROM ACTUAL MODEL
                    /*
                    String baseDir = ("file:\\"+modelInput.getAbsolutePath()).substring(5).replace('\\', '/');
                    String result = "file:" + baseDir;
                    if (baseDir.indexOf(":") > 0) {
                    	result = "file:///" + baseDir;
                    }*/
                    this.getLog().info("ModelOutput => "+modelInput.getCanonicalPath());

                //    Art2XmiHelper.save(java.net.URLStreamHandler.toExternalForm(modelInput.getAbsoluteFile().g), root);

                    Art2XmiHelper.save("file:///"+modelInput.getCanonicalPath(), root);
                }
            } catch (IOException ex) {
                this.getLog().error(ex);
            }
        }

    }

    private String convertStreamToFile(InputStream inputStream) throws IOException {
        Random rand = new Random();
        File temp = File.createTempFile("art2loaderLib" + rand.nextInt(), ".xmi");
        // Delete temp file when program exits.
        temp.deleteOnExit();
        OutputStream out = new FileOutputStream(temp);
        int read = 0;
        byte[] bytes = new byte[1024];
        while ((read = inputStream.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
        inputStream.close();
        out.flush();
        out.close();

        return "file://" + temp.getAbsolutePath().toString();
    }
}
