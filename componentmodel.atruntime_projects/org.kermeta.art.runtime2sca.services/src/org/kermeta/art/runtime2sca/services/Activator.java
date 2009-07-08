/*$Id: ResourceHelper.java,v 1.21 2008-04-28 11:51:03 ftanguy Exp $
 * Project : org.kermeta.art.runtime2sca.services
 * File : 	Activator.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 2009
 * Authors : dvojtise
 */

package org.kermeta.art.runtime2sca.services;


import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import eu.ict_diva.services.DiVACurrentSCAService;

public class Activator implements BundleActivator {

	private ServiceTracker currentSCAServiceTracker;
	private DiVACurrentSCAService currentSCAService;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register the service
		// metadata for the service
		Properties props = new Properties();
        props.put("Provider", "INRIA");
        props.put("isStub", "false");
		context.registerService(
				DiVACurrentSCAService.class.getName(), 
				new Runtime2SCACurrentSCAServiceImpl(), 
				props);
		
		// create a tracker and track the log service
		currentSCAServiceTracker = 
			new ServiceTracker(context, DiVACurrentSCAService.class.getName(), null);
		currentSCAServiceTracker.open();
		
		// grab the service
		currentSCAService = (DiVACurrentSCAService) currentSCAServiceTracker.getService();
		
		//currentSCAServiceTracker.
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		
		
		// close the service tracker
		currentSCAServiceTracker.close();
		currentSCAServiceTracker = null;
		
		currentSCAService = null;
	}

}
