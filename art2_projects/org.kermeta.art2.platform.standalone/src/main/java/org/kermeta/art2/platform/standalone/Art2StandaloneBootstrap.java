/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.platform.standalone;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.felix.framework.Felix;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

/**
 *
 * @author ffouquet
 */
public class Art2StandaloneBootstrap {

    public static void performArt2BootStrap(Felix fw) {

        String bundles = System.getProperty("bootstrap.bundles");
        String version = System.getProperty("bootstrap.version");
        if (bundles != null && version != null) {
            System.out.println("Perform bootstrap "+bundles+"-"+version);
            try {
                fw.getBundleContext().installBundle("file:///" + bundles + "/scala-library-2.8.0.jar").start();

                Bundle slf4japi = fw.getBundleContext().installBundle("file:///" + bundles + "/slf4j-api-1.6.1.jar");
                fw.getBundleContext().installBundle("file:///" + bundles + "/logback-core-0.9.24.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/logback-classic-0.9.24.jar").start();
                
                slf4japi.start();

                fw.getBundleContext().installBundle("file:///" + bundles + "/pax-url-assembly-1.1.3.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/pax-url-mvn-1.1.3.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/emf.lib-2.6.0.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/org.apache.felix.shell-1.4.1.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/org.apache.felix.shell.tui-1.4.1.jar").start();

                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.model-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.adaptation.model-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.api-2.2.0-SNAPSHOT.jar").start();

                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.framework-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.framework.bus.netty-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.kompare-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.deploy.osgi-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.core-2.2.0-SNAPSHOT.jar").start();
                fw.getBundleContext().installBundle("file:///" + bundles + "/art2.framework.bus.jmdns-2.2.0-SNAPSHOT.jar").start();

                System.out.println(fw.getBundleContext().getBundles().length+"-Bundle installed");
                System.out.println("Perform bootstrap OK");
            } catch (BundleException ex) {
                Logger.getLogger(Art2StandaloneBootstrap.class.getName()).log(Level.SEVERE, null, ex);
            }

            


        }



    }
}
