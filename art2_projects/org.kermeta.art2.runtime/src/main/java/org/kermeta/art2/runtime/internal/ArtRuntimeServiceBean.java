/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.runtime.internal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import org.kermeta.art2.runtime.ArtRuntimeService;
import org.kermeta.artKomparator.LauncherAspect;
import runner.MainRunner;

/**
 *
 * @author ffouquet
 */
public class ArtRuntimeServiceBean implements ArtRuntimeService {


    public ArtRuntimeServiceBean(){
        System.out.println("Build bean"+this.hashCode());
    }


    private org.kermeta.artKomparator.LauncherAspect actualLaunch = null;
    private Properties dictionary = null;

    public LauncherAspect getActualLaunch() {
        return actualLaunch;
    }

    public void setActualLaunch(LauncherAspect actualLaunch) {
        this.actualLaunch = actualLaunch;
    }

    public Properties getDictionary() {
        return dictionary;
    }

    public void setDictionary(Properties dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void updateFromContent(String body) {
        //COPY TO A TEMP FILE
        FileWriter tempwriter = null;
        try {
            File temp = File.createTempFile("temp", System.nanoTime() + "");
            String newuri = temp.getAbsolutePath();

            tempwriter = new FileWriter(temp);
            tempwriter.write(body);
            tempwriter.close();
            System.out.println("File temp created => perform update on plateform");
            update(newuri);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (tempwriter != null) {
                try {
                    tempwriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    @Override
    public void update(String url) {
        actualLaunch.launchFromURL(url);
    }

    public void init() {
        System.out.println("INIT RUNTIME");

        //MainRunner runner = new MainRunner();
        MainRunner.init();
        //art2.Art2Package.eINSTANCE = art2.impl.Art2PackageImpl.init();

        actualLaunch = (LauncherAspect) org.kermeta.artKomparator.RichFactory.createLauncher();
        actualLaunch.KersetNodeName(dictionary.getProperty("node.name"));
        actualLaunch.KersetHotdeployPATH(dictionary.getProperty("deploy.path"));//"/Users/ffouquet/Servers/apache-felix-karaf-1.2.0/deploy")
        System.out.println("INIT ART RUNTIME");
        System.out.println("deploy path " + dictionary.getProperty("deploy.path"));
        System.out.println("node name " + dictionary.getProperty("node.name"));


        update("file:empty.xmi");

    }//fin init


    public void stop(){
        System.out.println("STOP RUNTIME");
        actualLaunch = null;

    }
}
