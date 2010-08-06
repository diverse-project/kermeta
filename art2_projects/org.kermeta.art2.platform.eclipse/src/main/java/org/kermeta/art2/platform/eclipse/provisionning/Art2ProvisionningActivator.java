/*$Id$
 */
package org.kermeta.art2.platform.eclipse.provisionning;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 *
 * @author ffouquet
 */
public class Art2ProvisionningActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        
        URL bundleRootURL = context.getBundle().getEntry("pax-url-mvn-1.1.3.jar");
        URL pluginUrl = FileLocator.resolve(bundleRootURL);

        //Scanner sc = new Scanner(new File(pluginUrl.getPath()));
        //while (sc.hasNext()) {
            String deployPaxUri = "file://" + pluginUrl.getPath();// sc.nextLine();
            Bundle paxBundle = context.installBundle(deployPaxUri);
            paxBundle.start();
        //}

        URL baseConfig = context.getBundle().getEntry("config");
        URL baseConfigUrl = FileLocator.resolve(baseConfig);
        File directory = new File(baseConfigUrl.getPath());

        File[] configFile = directory.listFiles();
        for (int i = 0; i < configFile.length; i++) {
        	if(!configFile[i].getName().equals(".svn")){
	            File cFile = new File(configFile[i].getAbsolutePath());
	            if(cFile.isFile()){
		            Scanner csc = new Scanner(cFile);
		            while (csc.hasNext()) {
		            	
		                String deployUri = csc.nextLine();
		                Bundle b = context.installBundle(deployUri);
		                b.start();
		            }
	            }
        	}
        }


    }

    @Override
    public void stop(BundleContext context) throws Exception {
        //
        System.out.println("STOP");
    }
}
