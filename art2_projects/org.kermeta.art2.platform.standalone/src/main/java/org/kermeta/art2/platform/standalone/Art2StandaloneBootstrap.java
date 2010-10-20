/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.platform.standalone;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

/**
 *
 * @author ffouquet
 */
public class Art2StandaloneBootstrap {

    public static void performArt2BootStrap(BundleContext bc) {

        String bundles = System.getProperty("bootstrap.bundles");
        String version = System.getProperty("bootstrap.version");
        if (bundles != null && version != null) {
            System.out.println("Perform bootstrap "+bundles+"-"+version);
            try {
                bc.installBundle("file:///" + bundles + "/scala-library-2.8.0.jar").start();

                Bundle slf4japi = bc.installBundle("file:///" + bundles + "/slf4j-api-1.6.1.jar");
                bc.installBundle("file:///" + bundles + "/logback-core-0.9.24.jar").start();
                bc.installBundle("file:///" + bundles + "/logback-classic-0.9.24.jar").start();
                
                slf4japi.start();

                bc.installBundle("file:///" + bundles + "/pax-url-assembly-1.1.3.jar").start();
                bc.installBundle("file:///" + bundles + "/pax-url-mvn-1.1.3.jar").start();
                bc.installBundle("file:///" + bundles + "/emf.lib-2.6.0.jar").start();
                bc.installBundle("file:///" + bundles + "/org.apache.felix.shell-1.4.1.jar").start();
                bc.installBundle("file:///" + bundles + "/org.apache.felix.shell.tui-1.4.1.jar").start();

                bc.installBundle("file:///" + bundles + "/art2.model-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.adaptation.model-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.api-"+version+".jar").start();

                bc.installBundle("file:///" + bundles + "/art2.framework-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.framework.bus.netty-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.kompare-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.deploy.osgi-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.core-"+version+".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.framework.bus.jmdns-"+version+".jar").start();

                System.out.println(bc.getBundles().length+"-Bundle installed");
                System.out.println("Perform bootstrap OK");
            } catch (BundleException ex) {
                Logger.getLogger(Art2StandaloneBootstrap.class.getName()).log(Level.SEVERE, null, ex);
            }

            


        } else {
            System.out.println("Art2 BootStrap not performed => bootstrap properties not found ! ");
        }



    }
}
