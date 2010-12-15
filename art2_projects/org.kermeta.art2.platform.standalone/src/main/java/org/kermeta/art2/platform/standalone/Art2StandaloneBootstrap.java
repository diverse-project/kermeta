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
            System.out.println("Perform bootstrap " + bundles + "-" + version);
            try {
                bc.installBundle("file:///" + bundles + "/scala-library-2.8.1.jar").start();

                Bundle slf4japi = bc.installBundle("file:///" + bundles + "/slf4j-api-1.6.1.jar");
                bc.installBundle("file:///" + bundles + "/logback-core-0.9.24.jar").start();
                bc.installBundle("file:///" + bundles + "/logback-classic-0.9.24.jar").start();

                slf4japi.start();

                bc.installBundle("file:///" + bundles + "/pax-url-assembly-1.1.3.jar").start();
                bc.installBundle("file:///" + bundles + "/pax-url-mvn-1.1.3.jar").start();
                bc.installBundle("file:///" + bundles + "/emf.lib-2.6.0.jar").start();
                bc.installBundle("file:///" + bundles + "/org.apache.felix.shell-1.4.1.jar").start();
                bc.installBundle("file:///" + bundles + "/org.apache.felix.shell.tui-1.4.1.jar").start();

                bc.installBundle("file:///" + bundles + "/art2.model-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.adaptation.model-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.api-" + version + ".jar").start();

                bc.installBundle("file:///" + bundles + "/art2.framework-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.framework.bus.netty-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.kompare-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.deploy.osgi-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.core-" + version + ".jar").start();
                bc.installBundle("file:///" + bundles + "/art2.framework.bus.jmdns-" + version + ".jar").start();
                try {
                    bc.installBundle("file:///" + bundles + "/art2.framework.bus.jgroups-" + version + ".jar").start();
                } catch (BundleException ex) {
                    System.out.println("JGroups desactivate");
                }


                System.out.println(bc.getBundles().length + "-Bundle installed");
                System.out.println("Perform bootstrap OK");

                if (System.getProperty("eclipse.application") != null) {
                    bc.installBundle("mvn:org.kermeta.art2/art2.merger/2.2.1-SNAPSHOT").start();
                    bc.installBundle("file:/Users/ffouquet/NetBeansProjects/Art2/org.kermeta.art2.ui.framework/target/art2.ui.framework-2.2.1-SNAPSHOT.jar").start();
                    bc.installBundle("file:/Users/ffouquet/NetBeansProjects/Art2/org.kermeta.art2.ui.editor/target/art2.ui.editor-2.2.1-SNAPSHOT.jar").start();

                    try {
                        bc.installBundle("file:/Users/ffouquet/NetBeansProjects/Art2/org.kermeta.art2.editor.eclipse/target/art2.editor.eclipse-2.2.1-SNAPSHOT.jar").start();
                        //   bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.editor.eclipse/2.2.1-SNAPSHOT").start();
                    } catch (BundleException ex) {
                        Logger.getLogger(Art2StandaloneBootstrap.class.getName()).log(Level.SEVERE, "Eclipse Install Error", ex);
                    }
                }


            } catch (BundleException ex) {
                Logger.getLogger(Art2StandaloneBootstrap.class.getName()).log(Level.SEVERE, null, ex);
            }




        } else {
            System.out.println("Art2 BootStrap not performed => bootstrap properties not found ! ");

            System.out.println("Try to bootstrap from Kermeta.org version");
            try {

                //INSTALL URL HANDLER
                bc.installBundle("http://repository.atlassian.com/org.ops4j.pax.url/jars/pax-url-mvn-1.1.3.jar").start();

                System.out.println("mvnUrl handler installed");

                bc.installBundle("http://repository.atlassian.com/org.ops4j.pax.url/jars/pax-url-assembly-1.1.2.jar").start();
                bc.installBundle("mvn:http://scala-tools.org/repo-releases/!com.weiglewilczek.scala-lang-osgi/scala-library/2.8.1").start();

                System.out.println("Url handler installed");

                //INSTALL SLF4J
                Bundle bslf = bc.installBundle("mvn:org.slf4j/slf4j-api/1.6.1");
                bc.installBundle("mvn:ch.qos.logback/logback-core/0.9.24").start();
                bc.installBundle("mvn:ch.qos.logback/logback-classic/0.9.24").start();

                bslf.start();

                //INSTALL EMF LIB
                bc.installBundle("mvn:http://www.kermeta.org/maven2/!org.kermeta.emf/emf.lib/2.6.0").start();

                //INSTALL ART2 Core
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.model/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.adaptation.model/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.api/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.framework/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.framework.bus.netty/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.kompare/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.deploy.osgi/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.core/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.merger/2.2.1-SNAPSHOT").start();

                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.framework.bus.jmdns/2.2.1-SNAPSHOT").start();
                bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.framework.bus.jgroups/2.2.1-SNAPSHOT").start();

                //INSTALL ART2 Editor for Eclipse if it possible
                 bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.ui.framework/2.2.1-SNAPSHOT").start();
                  bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.ui.editor/2.2.1-SNAPSHOT").start();

               // bc.installBundle("file:/Users/ffouquet/NetBeansProjects/Art2/org.kermeta.art2.ui.framework/target/art2.ui.framework-2.2.1-SNAPSHOT.jar");
                //bc.installBundle("file:/Users/ffouquet/NetBeansProjects/Art2/org.kermeta.art2.ui.editor/target/art2.ui.editor-2.2.1-SNAPSHOT.jar");

                try {
               //     bc.installBundle("file:/Users/ffouquet/NetBeansProjects/Art2/org.kermeta.art2.editor.eclipse/target/art2.editor.eclipse-2.2.1-SNAPSHOT.jar");
                       bc.installBundle("mvn:http://www.kermeta.org/maven2-snapshots/!org.kermeta.art2/art2.editor.eclipse/2.2.1-SNAPSHOT").start();
                } catch (BundleException ex) {
                    Logger.getLogger(Art2StandaloneBootstrap.class.getName()).log(Level.SEVERE, "Eclipse Install Error", ex);
                }

            } catch (BundleException ex) {
                Logger.getLogger(Art2StandaloneBootstrap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }



    }
}
