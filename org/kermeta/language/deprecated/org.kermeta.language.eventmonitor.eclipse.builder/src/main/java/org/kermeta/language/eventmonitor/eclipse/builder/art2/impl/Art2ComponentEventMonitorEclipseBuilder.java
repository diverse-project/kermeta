/* $Id$
 * Project    : ${project_name}
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : ${date}
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.language.eventmonitor.eclipse.builder.art2.impl;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKEvent;
import org.osgi.framework.Bundle;

@ThirdParties({
	@ThirdParty(name="org.kermeta.language.model", url="mvn:org.kermeta.language/language.model"),
	@ThirdParty(name="org.kermeta.language.kp.model", url="mvn:org.kermeta.kp/kp.model"),
	@ThirdParty(name="org.kermeta.language.traceability.model", url="mvn:org.kermeta.traceability/traceability.model"),
	@ThirdParty(name="org.kermeta.language.api", url="mvn:org.kermeta.language/language.api")
	//@ThirdParty(name="org.kermeta.language.loader.scala", url="mvn:org.kermeta.language/language.loader.scala")
})

@Requires({
	@RequiredPort(name="kevent", type=PortType.SERVICE,  className=PortKEvent.class),
	/**
	 * Log port for sending technical messages
	 */
	//@RequiredPort(name = "log", type=PortType.MESSAGE)
	@RequiredPort(name = "log", type=PortType.MESSAGE)
})

@Library(name= "org.kermeta.language")
@ComponentType
public class Art2ComponentEventMonitorEclipseBuilder extends AbstractComponentType {

	protected String bundleSymbolicName="";
	protected Bundle bundle;
	protected MessagePort logPort = null;
	protected PortKEvent keventPort = null;
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	//protected KEventFactory evtFactory = KEventFactory.getInstance();
	
	/**
	 * As it uses UI declaration via plugin.xml, this component is a singleton in Eclipse
	 */
	protected static Art2ComponentEventMonitorEclipseBuilder instance;
	public static Art2ComponentEventMonitorEclipseBuilder getDefault(){
		return instance;
	}
	
	public String getBundleSymbolicName(){
		return bundleSymbolicName;
	}
	public Bundle getBundle(){
		return bundle;
	}

	public void processKEvent(KEvent e) {
		//throw the event to KWF
		keventPort.processKEvent(e);
		logPort.process(mFactory.createInfoMessage("File Resource Modification detected at" + e, bundleSymbolicName));
	}
	
	/**
	 * method called when an instance of this component is instantiated and started
	 */
	@Start
	public void start(){
		//System.out.println("Art2ComponentEventMonitorEclipseBuilder.start ...");
		// set the singleton instance
		instance =  this;
		// store some useful data
		logPort = getPortByName("log", MessagePort.class);
		keventPort = getPortByName("kevent", PortKEvent.class);
	//	System.out.println("Art2ComponentEventMonitorEclipseBuilder.start logPort="+logPort.toString());
		
		bundle = (Bundle) this.getDictionary().get("osgi.bundle");
		bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
		
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
			
				System.out.println("Successfully added builder contribution to UI");
				logPort.process(mFactory.createDebugMessage("Successfully added builder contribution to UI" + pluginLocation, bundleSymbolicName));
			}
			else{
				System.out.println("Failed to start builder due to : Cannot find " + pluginLocation);
				logPort.process(mFactory.createErrorMessage("Failed to start builder due to : Cannot find " + pluginLocation, bundleSymbolicName));
			}
			
		}
		catch (Exception e) {
			System.out.println("Failed to start Builder");
			logPort.process(mFactory.createErrorMessage("Failed to start Builder", bundleSymbolicName));
		}
	}
	
	/**
	 * method called when an instance of this component is stopped
	 */
	@Stop
	public void stop(){
		
	}

	public MessagePort getLogPort(){
		return logPort;
	}
	
	public PortKEvent getKeventPort() {
		return keventPort;
	}



}
