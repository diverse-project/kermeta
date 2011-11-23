/* $Id: $
 * Project    : org.kermeta.kp.loader.kp
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 22 févr. 2011
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.kp.loader.kp;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.editor.mopp.KpResourceFactory;
import org.kermeta.kp.loader.kp.api.KpLoader;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class KpLoaderImpl implements KpLoader{
	
	MessagingSystem logger;
	
	public KpLoaderImpl(MessagingSystem logger){
		this.logger = logger;
	}
	
	
	/**
	 * @param uriKpResource
	 */
	public KermetaProject loadKp(String uriKpResource) {
		return loadKp(URI.createURI(uriKpResource));
	}
	
	/**
	 * @param uriKpResource
	 */
	public KermetaProject loadKpFromPath(String pathToKpResource) {
		return loadKp(URI.createFileURI(pathToKpResource));
	}


	public KermetaProject loadKp(URI uriKpResource) {
		KermetaProject result = null;
		KpResourceFactory factory = new KpResourceFactory();
		logger.debug("factory reached : " + factory.toString(),  this.getClass().getName());
		// create resource set
		ResourceSet rs = new ResourceSetImpl() ;
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("kp", factory);
		
		Resource resource = rs.createResource(uriKpResource);
		logger.debug("Call to EMF  on : "+resource.toString()+" from repository : ",  this.getClass().getName());
		
		try {
			resource.load(Collections.EMPTY_MAP);
			Iterator<EObject> i = resource.getAllContents();
			
			while (i.hasNext()){
				EObject o = i.next();
				System.out.println(o.toString());
				if (o instanceof KermetaProject){
					result = (KermetaProject) o;
				}
			}
		} catch (IOException e) {
			logger.debug(e.getMessage(), this.getClass().getName());
		}
		
		if(result == null)
			logger.debug("KermetaProject model result is null",  this.getClass().getName());
		else
			logger.debug("Succesfully loaded " + result.toString(), this.getClass().getName());
		return result;
	}
}

