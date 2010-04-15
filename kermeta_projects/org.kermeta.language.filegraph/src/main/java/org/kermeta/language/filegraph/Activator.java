package org.kermeta.language.filegraph;

import java.util.Properties;

import org.kermeta.language.filegraph.impl.FileGraphService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * This bundle deploy boyh the implementation and its API in order to be automatically started when used 
 * in Eclipse. By the way in Eclipse context we don't expect to have more than one implementation, so accessing
 * the API will automatically start the bundle
 * 
 * @author dvojtise
 *
 */
public class Activator implements BundleActivator {

	public BundleContext context;
	
	public IFileGraphService fileGraphService;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		this.context = context;
		
		// initiates and registers the provided service
		fileGraphService =  new FileGraphService();
		Properties props = new Properties();
        // props.put("Factory", "org.kermeta.language.filegraph"); // no property required for this service
		context.registerService(
	            IFileGraphService.class.getName(), fileGraphService, props);
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
	}

}
