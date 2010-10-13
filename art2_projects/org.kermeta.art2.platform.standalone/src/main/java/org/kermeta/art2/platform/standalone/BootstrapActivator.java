/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.platform.standalone;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 *
 * @author ffouquet
 */
public class BootstrapActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {

        Art2StandaloneBootstrap.performArt2BootStrap(context);
        
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        
    }

}
