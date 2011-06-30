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

public class KpLoaderImpl implements org.kermeta.kp.loader.kp.api.KpLoader{

	/**
	 * @param uriKpResource
	 */
	public KermetaProject loadKp(String uriKpResource) {
		
		return loadKp(URI.createFileURI(uriKpResource));
		
	}
	public KermetaProject loadKp(URI uriKpResource) {
		KermetaProject result = null;
		KpResourceFactory factory = new KpResourceFactory();
		System.out.println("factory reached : " + factory.toString());
		// create resource set
		ResourceSet rs = new ResourceSetImpl() ;
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("kp", factory);
		
		Resource resource = rs.createResource(uriKpResource);
		System.out.println("Call to EMF  on : "+resource.toString()+" from repository : ");
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result != null){
			System.out.println("Succesfully loaded " + result.toString());
		}else {
			System.out.println("KermetaProject model result is null");
		}
		return result;
	}
	
}
