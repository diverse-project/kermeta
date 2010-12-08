/* $Id:$ 
 * Creation : 8 dec. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.ui.eclipse.art2.impl;

import java.io.InputStream;
import java.net.URL;


import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.osgi.framework.Bundle;


@Provides({
})
@Requires({
    /**
     * Log port for sending technical messages
     */
    @RequiredPort(name = "log", type = PortType.MESSAGE),
    @RequiredPort(name = "kevent", type = PortType.MESSAGE)
})
@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
})
@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentKermetaUI4Eclipse extends AbstractComponentType{
	protected String bundleSymbolicName = "";
    protected Bundle bundle;
    protected SimpleLogger logger;

    /**
     * As it uses UI declaration via plugin.xml, this component is a singleton in Eclipse
     */
    protected static Art2ComponentKermetaUI4Eclipse defaultInstance;
    
	@Start
    public void start() {
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        defaultInstance = this;
        try {
            String pluginLocation = "/instance_config/plugin.xml";
            //this.getClass().getClassLoader().getResourceAsStream(name)
            //URL pluginURL = bundle.getResource(pluginLocation);
            URL pluginURL = this.getClass().getClassLoader().getResource(pluginLocation);
            if (pluginURL != null) {
                // code inspired from http://www.ibm.com/developerworks/opensource/library/os-ecl-dynext/
                // TODO add bundle listener to make sure this is call only when the bundle is really started (see AbstractUIPlugin code )
                //InputStream inputStream = pluginURL.openStream();
                InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(pluginLocation);
                IExtensionRegistry registry = RegistryFactory.getRegistry();
                Object key = ((ExtensionRegistry) registry).getTemporaryUserToken();

                boolean b = registry.addContribution(inputStream, ContributorFactoryOSGi.createContributor(bundle), false, null, null, key);

                logger.debug("Successfully added plugin.xml contribution to UI using " + pluginLocation);
            } else {
            	logger.error("Failed to start UI due to : Cannot find " + pluginLocation, null);
            }

        } catch (Exception e) {
        	logger.error("Failed to start UI due to " + e.getMessage(), e);
        }
        logger.debug("Successfully started " + bundleSymbolicName);
    }

    @Stop
    public void stop() {
    }
    
    public MessagePort getKEventPort() {
		return getPortByName("kevent", MessagePort.class);
	}
    
    /**
     * This component contributes to the Eclipse UI, it must be unique in memory
     * @return
     */
    public static Art2ComponentKermetaUI4Eclipse getDefault(){
    	return defaultInstance;
    }
    
    // --- GETTERS and SETTERS ---    
    /**
     * get SimpleLogger for this component
     */
    public SimpleLogger getLogger() {
		return logger;
	}
    /**
     * get BundleSymbolicName of this component
     */
    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    /**
     * get osgi bundle of this component
     */
    public Bundle getBundle() {
        return bundle;
    }
    
    
}
