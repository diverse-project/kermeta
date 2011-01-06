package org.kermeta.language.loader.km.art.impl;

import java.util.List;

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
import org.kermeta.language.api.port.PortKmLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;
import runner.MainRunner;
import org.kermeta.language.loader.KmLoader;

@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
})
@Requires({
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})
@Provides({
    @ProvidedPort(name = "KmLoader", type = PortType.SERVICE, className = PortKmLoader.class)
})


@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentKmLoader extends AbstractComponentType implements PortKmLoader {
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


    @Stop
    public void stop() {
    	//
    }

    
    @Port(name = "KmLoader", method = "load")
    public ModelingUnit load(final String uriKmModel) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
        MainRunner.init();

        KmLoader loader = org.kermeta.language.loader.RichFactory.createKmLoader();
        return loader.load(uriKmModel);
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
