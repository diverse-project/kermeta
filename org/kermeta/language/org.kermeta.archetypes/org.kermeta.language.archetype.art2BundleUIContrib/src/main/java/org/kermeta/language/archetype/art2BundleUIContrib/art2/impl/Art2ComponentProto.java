/* $Id: $
 * Project    : org.kermeta.language.archetype.art2BundleUIContrib
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 sept. 2010
 * Authors : 
 *            username <usermail@inria.fr>
 */

package org.kermeta.language.archetype.art2BundleUIContrib.art2.impl;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;

import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;

import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKEvent;
import org.kermeta.language.api.port.PortLog;

import org.osgi.framework.Bundle;

/**
 * Define an art2 bundle template for illustration purpose : 
 * The bundle provides a Kevent port for processing kermeta events and requires a log port for the log messages
 * the bundle also contributes to the eclipse UI
 * 
 * @author username
 */

@ThirdParties({
	/**
	 * Declare some needed third parties bundle that should be started
	 */
	@ThirdParty(name="org.kermeta.language.model", url="mvn:org.kermeta.language/language.model")
	}
)
@Provides( {
	/**
	 * Kevent port for handling kermeta events
	 */
	// @ProvidedPort(name = "asynclog", type=PortType.MESSAGE),
	@ProvidedPort(name = "kevent", type = PortType.SERVICE, className = PortKEvent.class) 
	}
)

@Requires( {
	/**
	 * Log port for sending technical messages
	 */
	@RequiredPort(name = "log", type = PortType.SERVICE, className = PortLog.class) 
	}
)
@Library(name= "org.kermeta.language")
@ComponentType
public class Art2ComponentProto extends AbstractComponentType {

	/**
	 * The log port used to send technical log messages
	 */
	protected PortLog logPort = null;

	/**
	 * The symbolic name of this bundle
	 */
	protected String bundleSymbolicName = "";

	/**
	 * This bundle
	 */
	protected Bundle bundle;

	/**
	 * The factory to create technical messages
	 */
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory
			.getInstance();

	/**
	 * As it uses UI declaration via plugin.xml, this component is a singleton in Eclipse
	 */
	protected static Art2ComponentProto instance;
	public static Art2ComponentProto getDefault(){
		return instance;
	}
	
	/**
	 * Handle the actions to be performed when some object o(Kevent) are
	 * received
	 * 
	 * @param o the received kermeta event (Kevent)
	 */
	// @port(name="asynclog", method="process")
	@Port(name = "kevent", method = "processKEvent")
	public void processKEvent(Object o) {
		//TODO
	}

	/**
	 * Start this bundle dynamically
	 * method called when an instance of this component is instantiated and started
	 */
	@Start
	public void start() {
		// set the singleton instance
		instance =  this;
		logPort = getPortByName("log", PortLog.class);
		bundle = (Bundle) this.getDictionary().get("osgi.bundle");
		bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
		logPort.log(mFactory.createDebugMessage("Successfully started Art2ComponentProto", bundleSymbolicName));
		try{
			String pluginLocation = "/instance_config/plugin.xml";
			//this.getClass().getClassLoader().getResourceAsStream(name)
			//URL pluginURL = bundle.getResource(pluginLocation);
			URL pluginURL = this.getClass().getClassLoader().getResource(pluginLocation);
			if(pluginURL!= null){
				// code inspired from http://www.ibm.com/developerworks/opensource/library/os-ecl-dynext/
				// TODO add bundle listener to make sure this is call only when the bundle is really started (see AbstractUIPlugin code )
				//InputStream inputStream = pluginURL.openStream();
				InputStream inputStream =  this.getClass().getClassLoader().getResourceAsStream(pluginLocation);
				IExtensionRegistry registry = RegistryFactory.getRegistry( );
				Object key = ((ExtensionRegistry) registry).getTemporaryUserToken( );
		
				boolean b = registry.addContribution(inputStream, ContributorFactoryOSGi.createContributor(bundle), false, null, null, key);
			
				logPort.log(mFactory.createDebugMessage("Successfully added <Art2Component bundle name> contribution to UI" + pluginLocation, bundleSymbolicName));
			}
			else{
				logPort.log(mFactory.createErrorMessage("Failed to start <Art2Component bundle name> due to : Cannot find " + pluginLocation, bundleSymbolicName));
			}
			
		}
		catch (Exception e) {
			System.out.println("Failed to start <Art2Component bundle name>");
			logPort.log(mFactory.createErrorMessage("Failed to start <Art2Component bundle name>", bundleSymbolicName));
		}
	}

	/**
	 * Stop this bundle dynamically
	 * Method called when an instance of this component is stopped
	 */
	@Stop
	public void stop() {
		//TODO
	}

	/**
	 * Get the bundle symbolic name
	 * 
	 * @return the bundle symbolic name
	 */
	public String getBundleSymbolicName() {
		return bundleSymbolicName;
	}

	/**
	 * Get the bundle
	 * 
	 * @return the bundle
	 */
	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * Get the log port to send technical messages
	 * 
	 * @return the log port
	 */
	public PortLog getLogPort() {
		return logPort;
	}
}
