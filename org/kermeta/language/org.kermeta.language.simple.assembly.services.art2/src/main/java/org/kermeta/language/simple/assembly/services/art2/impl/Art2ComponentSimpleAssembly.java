/* $Id:$ 
 * Creation : 7 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.simple.assembly.services.art2.impl;

import java.util.Collection;
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
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.port.PortURIs2MergedKm;
import org.kermeta.language.api.port.PortKm2ScalaCompiler;
import org.kermeta.language.api.port.option.ServiceOption;
import org.kermeta.language.simple.assembly.services.SimpleURIs2KmMerger;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;
@Provides({
	//@ProvidedPort(name = "uris2mergedkm",  className= PortURIs2MergedKm.class),
	@ProvidedPort(name = "km2scala",  className= PortKm2ScalaCompiler.class)
})
@Requires({
	/** Log port for sending technical messages */
	@RequiredPort(name = "log", type = PortType.MESSAGE),
	
	/** port that is able to load KMT files into ModelingUnits */
	@RequiredPort(name = "kmtLoader", type = PortType.SERVICE, className = PortResourceLoader.class) ,
	
	/** port that is able to merge a set of ModelingUnit into one ModelingUnit */
	@RequiredPort(name = "kmMerger", type = PortType.SERVICE, className = PortKmMerger.class),
	
	/** port that is able to merge a set of ModelingUnit into one ModelingUnit */
	@RequiredPort(name = "kmMerger", type = PortType.SERVICE, className = PortKmMerger.class)

})
@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.kp.model", url = "mvn:org.kermeta.kp/kp.model"),
    @ThirdParty(name = "org.kermeta.language.traceability.model", url = "mvn:org.kermeta.traceability/traceability.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
})
@Library(name = "org.kermeta.language")
@ComponentType
/**
 * This class implements the ART2 interface for this component
 * It also provides convenient accessors to the ports 
 */
public class Art2ComponentSimpleAssembly extends AbstractComponentType  {

	protected String bundleSymbolicName = "";
    protected Bundle bundle;
    
    protected SimpleLogger logger;

	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();



    @Start
    public void start() {
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started "+ this.getClass().getName());        
    }

    @Stop
    public void stop() {
    }
  /*  
    @Port(name = "uris2mergedkm", method = "mergeURIs")
    public ModelingUnit uris2mergedkmMerge(List<String> URIs) {
    	try{
	       return new SimpleURIs2KmMerger(this).merge(URIs, null);
    	}
        catch (Exception e){
        	logger.error( e.getMessage(), e);
        }
        return null;
    }
    @Port(name = "uris2mergedkm", method = "mergeWithOptions")
    public ModelingUnit uris2mergedkmMergeWithOptions(List<String> URIs,  Collection<ServiceOption> options) {
    	try{
    		return new SimpleURIs2KmMerger(this).merge(URIs, options);
    	}
        catch (Exception e){
        	logger.error( e.getMessage(), e);
        }
        return null;
    }
    @Port(name = "uris2mergedkm", method = "mergeIntoURI")
    public void uris2mergedkmMergeIntoURI(List<String> URIs, String destURI) {
    	try{
    		new SimpleURIs2KmMerger(this).mergeIntoURI(URIs, destURI, null);
    	}
        catch (Exception e){
        	logger.error( e.getMessage(), e);
        }

    }
    @Port(name = "uris2mergedkm", method = "mergeIntoURIWithOptions")
    public void uris2mergedkmMergeIntoURIWithOptions(List<String> URIs, String destURI,  Collection<ServiceOption> options) {
    	try{
    		new SimpleURIs2KmMerger(this).mergeIntoURI(URIs, destURI, options);
    	}
        catch (Exception e){
        	logger.error( e.getMessage(), e);
        }

    }
 */   
    @Port(name = "km2scala", method = "compile")
    public void km2scalaCompile(ModelingUnit model, String outputPath) {
    	try{
    		//new SimpleURIs2KmMerger(this).mergeIntoURI(URIs, destURI, options);
    	}
        catch (Exception e){
        	logger.error( e.getMessage(), e);
        }

    }
    
    
    // --- Port accessors ---
    
    
    // --- GETTERS and SETTERS ---
    public SimpleLogger getLogger() {
		return logger;
	}

    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    public Bundle getBundle() {
        return bundle;
    }
}
