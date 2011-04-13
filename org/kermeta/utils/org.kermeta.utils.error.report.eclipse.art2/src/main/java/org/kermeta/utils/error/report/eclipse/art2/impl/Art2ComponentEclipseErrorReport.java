/* $Id$
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 7 sept. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse.art2.impl;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.utils.error.report.eclipse.KermetaMarkerFactory;
import org.osgi.framework.Bundle;

@Provides({
    @ProvidedPort(name = "log", type=PortType.MESSAGE)
})

/**
 * Art2 component in charge of marking file resource for errors.
 * Provide a log port to process received messages (org.kermeta.language.api.messaging.ProblemMessage).
 * Filter messages according to sender group and error problem 
 */
@Library(name= "org.kermeta.utils")
@ComponentType
public class Art2ComponentEclipseErrorReport extends AbstractComponentType  {

	/**
	 * The art2 bundle symbolic name
	 */
	protected String bundleSymbolicName="";
	
	/**
	 * The bundle art2
	 */
	protected Bundle bundle;
	
	/**
	 * As it uses UI declaration via plugin.xml, this component is a singleton in Eclipse
	 */
	protected static Art2ComponentEclipseErrorReport instance;
	
	/**
	 * Process the messages received on the log port
	 * @param o the object received on the log port
	 */
	@Port(name="log",method="process")
	public void process(Object o) {
		if (o instanceof ProblemMessage){
			KermetaMarkerFactory.getInstance().treatProblemMsg((ProblemMessage) o);
		}
	}
	
	/**
	 * Retreive the singleton instance of the art2 component
	 * @return the instance
	 */
	public static Art2ComponentEclipseErrorReport getDefault(){
		return instance;
	}
	
	/**
	 * Retrieve the osgi component symbolic name
	 * @return the symbolic name
	 */
	public String getBundleSymbolicName(){
		return bundleSymbolicName;
	}
	
	/**
	 * Retrieve the osgi component bundle
	 * @return the bundle
	 */
	public Bundle getBundle(){
		return bundle;
	}

	/**
	 * Method called when an instance of this component is instantiated and started
	 */
	@Start
	public void start(){
		// set the singleton instance
		instance =  this;
		// store some useful data
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
			
				//System.out.println("Successfully added Error Report contribution to UI");
				//logPort.log(mFactory.createDebugMessage("Successfully added Error Report contribution to UI" + pluginLocation, bundleSymbolicName));
			}
			/*else{
				//System.out.println("Failed to start Error Report due to : Cannot find " + pluginLocation);
				//logPort.log(mFactory.createErrorMessage("Failed to start Error Report due to : Cannot find " + pluginLocation, bundleSymbolicName));
			}*/
			
		}
		catch (Exception e) {
			//System.out.println("Failed to start Error Report");
		}
	}
	
	/**
	 * Method called when an instance of this component is stopped
	 */
	@Stop
	public void stop(){
		KermetaMarkerFactory.getInstance().flushGroupStore();
	}
}
