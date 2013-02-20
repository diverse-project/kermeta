/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * This class provide load and save method for ModelingUnit using Stream which can be used to convert a ModelingUnit into another ModelingUnit conformant to a specific factory
 * Be careful the factories must not change during this process (ie. not thread safe)
 * @author dvojtise
 *
 */
public class ModelingUnitCacheHelper {

	
	
	public MessagingSystem logger;
	
	

	public ModelingUnitCacheHelper(MessagingSystem logger) {
		this.logger = logger;
	}


	public boolean isCacheUpTodate(Collection<String> inputfilesUrls, String outputCacheUrl){
		
		try {
			File outputCachefile = new java.io.File(FileHelpers.StringToURI(outputCacheUrl));
		
			long cacheDate = outputCachefile.lastModified();
		
			for(String inputfileUrl : inputfilesUrls){
				if(inputfileUrl.startsWith("jar:")&&inputfileUrl.contains("!")){
					inputfileUrl = inputfileUrl.substring(4, inputfileUrl.indexOf("!"));
				}
				File inputfile = new java.io.File(FileHelpers.StringToURI(inputfileUrl));
				if (inputfile.lastModified() > cacheDate) return false;
			}
		} catch (Exception e) {
			logger.warn("cannot compute cache ", getClass().getName(), e);
			return false;
		}
		return true;
	}
	public boolean isCacheUpTodate(String inputfileUrl, String outputCacheUrl){
		
		try {
			File outputCachefile = new java.io.File(FileHelpers.StringToURI(outputCacheUrl));
		
			long cacheDate = outputCachefile.lastModified();
		
			if(inputfileUrl.startsWith("jar:")&&inputfileUrl.contains("!")){
				inputfileUrl = inputfileUrl.substring(4, inputfileUrl.indexOf("!"));
			}
			File inputfile = new java.io.File(FileHelpers.StringToURI(inputfileUrl));
			if (inputfile.lastModified() > cacheDate) return false;
			
		} catch (Exception e) {
			logger.warn("cannot compute cache for "+inputfileUrl, getClass().getName(), e);
			return false;
		}
		return true;
	}
	
	public ModelingUnit getCachedModelingUnit(String outputCacheUrl) throws IOException{
		logger.debug(outputCacheUrl, getClass().toString());
		Map<String, String> options = null;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);

		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		m.put("km", new XMIResourceFactoryImpl());
		URI ruri =  URI.createURI(outputCacheUrl);
		Resource resource = resourceSet.createResource(ruri);
		resource.load(options);
		// let's get all applicable element
		ModelingUnit mu = new ModelingUnit(outputCacheUrl);
		for(EObject o : resource.getContents()){
			if(o instanceof Metamodel){
				mu.getMetamodels().add((Metamodel) o);
			}
		}
		return  mu;
	}
	
}
