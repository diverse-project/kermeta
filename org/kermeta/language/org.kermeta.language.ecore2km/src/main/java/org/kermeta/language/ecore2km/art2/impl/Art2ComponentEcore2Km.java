/* $Id: $
 * Project    : org.kermeta.language.ecore2km
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 25 nov. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.language.ecore2km.art2.impl;

import org.eclipse.emf.ecore.EPackage;
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
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.api.port.PortLexer;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.merger.binarymerger.art2.impl.BinaryMerger;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;
import java.util.List;

@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
})
@Provides({
    @ProvidedPort(name = "ecore2km", type = PortType.SERVICE, className = PortEcore2Km.class)
})
@Requires({
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})


@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentEcore2Km extends AbstractComponentType implements org.kermeta.language.api.port.PortEcore2Km {

	protected MessagePort logPort = null;
    protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
    protected String bundleSymbolicName = "";
    protected Bundle bundle;

    public MessagePort getLogPort() {
        return logPort;
    }

    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }
    
    /**
     * method called when an instance of this component is instantiated and started
     */
    @Start
    public void start() {
        System.out.println("Art2ComponentTexteditorEclipse.start ...");

        // store some useful data
        logPort = getPortByName("log", MessagePort.class);

        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
    }

    /**
     * method called when an instance of this component is stopped
     */
    @Stop
    public void stop() {
    }

    
    @Port(name = "ecore2km", method = "convertFromUri")
    public ModelingUnit convertFromUri(String fileUri) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
        MainRunner.init();

        Ecore2km converter = org.kermeta.language.ecore2km.RichFactory.createEcore2km();
        return converter.convertFromUri(fileUri);

    }
    
    @Port(name = "ecore2km", method = "convertPackage")
    public ModelingUnit convertPackage(EPackage rootPackage ) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
        MainRunner.init();

        Ecore2km converter = org.kermeta.language.ecore2km.RichFactory.createEcore2km();
        return converter.convertPackage(rootPackage);

    }
    
    @Port(name = "ecore2km", method = "convertPackageCollection")
    public ModelingUnit convertPackageCollection(List<EPackage> packageCollection ) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
        MainRunner.init();

        Ecore2km converter = org.kermeta.language.ecore2km.RichFactory.createEcore2km();
        return converter.convertPackageCollection(packageCollection);

    }
}
