package org.kermeta.art2.platform.standalone;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmbeddedFelix felix = new EmbeddedFelix();
        felix.run();
        Art2StandaloneBootstrap.performArt2BootStrap(felix.getM_fwk());
        try {
            felix.getM_fwk().waitForStop(0);
           
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.exit(0);

    }
}
