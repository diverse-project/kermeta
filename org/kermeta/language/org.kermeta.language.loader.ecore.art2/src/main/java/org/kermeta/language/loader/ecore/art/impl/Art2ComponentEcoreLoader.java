package org.kermeta.language.loader.ecore.art.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortEcoreLoader;
import org.osgi.framework.Bundle;

@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api"),
    @ThirdParty(name = "org.kermeta.emf", url = "mvn:org.kermeta.emf/emf.lib")
})
@Requires({
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})
@Provides({
    @ProvidedPort(name = "EcoreLoader", type = PortType.SERVICE, className = PortEcoreLoader.class)
})


@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentEcoreLoader extends AbstractComponentType implements PortEcoreLoader {
    protected UnifiedMessageFactory mFactory 	= UnifiedMessageFactory.getInstance();
    protected String bundleSymbolicName 		= "";
    protected Bundle bundle;
    protected SimpleLogger logger;
    
    
    /**
     * method called when an instance of this component is instantiated and started
     */
    @Start
    public void start() {
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Succesfully started " + bundleSymbolicName);
    }

    /**
     * method called when an instance of this component is stopped
     */
    @Stop
    public void stop() {
    	//
    }

    
    @Port(name = "EcoreLoader", method = "load")
    public List<EPackage> load(final String uriEcoreModel) {
    	ResourceSet resourceSet 	= new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m 		= f.getExtensionToFactoryMap();
		m.put("ecore",new XMIResourceFactoryImpl());
		
		URI uri 			= URI.createURI(uriEcoreModel);
		Resource resource	= resourceSet.getResource(uri, true);
		List<EPackage> pkgs = new ArrayList<EPackage>();
		
		for(EObject o : resource.getContents())
			if(o instanceof EPackage)
				pkgs.add((EPackage)o);

		return pkgs;
    }
    
    
    
    /**
     * This operation should pass everything that ART2 initialize before calling the usual start method
     * This is used for test purpose
     * @param bundleSymbName
     */
    public void simulatedStart(String bundleSymbName) {
        this.bundleSymbolicName = bundleSymbName;
        logger = new SimpleLogger(this, bundleSymbName, "log");
        logger.debug("Successfully started "+bundleSymbName);
    }
}
