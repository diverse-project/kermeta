/* $Id: $
 * Project    : org.kermeta.kp.loader.kp
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 24 janv. 2011
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.kp.loader.kp.art2.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
//import org.kermeta.language.api.port.PortKpLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;
import org.kermeta.kp.editor.mopp.KpResourceFactory;

@ThirdParties( { 
		@ThirdParty(name = "org.kermeta.kp.model", url = "mvn:org.kermeta.kp/kp.model")
	})
		
@Requires( { 
		@RequiredPort(name = "log", type = PortType.MESSAGE) 
	})

//@Provides( { 
		//@ProvidedPort(name = "KpLoader", type = PortType.SERVICE, className = PortKpLoader.class)
	//})

@Library(name = "org.kermeta.kp")
@ComponentType
public class ArtComponentLoaderKp extends AbstractComponentType  {

	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	protected String bundleSymbolicName = "";
	protected Bundle bundle;
	protected SimpleLogger logger;

	/**
	 * method called when an instance of this component is instantiated and
	 * started
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
	}

	/*@Port(name = "KpLoader", method = "load")
	public KermetaProject load(final String uriKpResource) {
		logger.debug("Loading resouce at : " + uriKpResource);
		KermetaProject result = null;
		KpResourceFactory factory = new KpResourceFactory();
		logger.debug("factory reached : " + factory.toString());
		// create resource set
		ResourceSet rs = new ResourceSetImpl() ;
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("kpt", factory);
		
		Resource resource = rs.getResource(URI.createFileURI(uriKpResource), true);
		logger.debug("Call to EMF  on : "+resource.toString()+" from repository : ");
		EObject toto = (EObject) new EPackageRegistryImpl();
		logger.debug("toto :  " + toto.toString());
		try {
			resource.load(Collections.EMPTY_MAP);
			Iterator<EObject> i = resource.getAllContents();
			
			while (i.hasNext()){
				EObject o = i.next();
				if (o instanceof KermetaProject){
					result = (KermetaProject) o;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result != null){
			logger.debug("Succesfully loaded " + result.toString());
		}else {
			logger.warning("KermetaProject result is null");
		}
		
		return result;
	}*/
}
