

/*$Id: LoadResource.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	LoadResource.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.ecore;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.loader.action.EcoreLoadingAction;
import org.kermeta.io.loader.datas.EcoreLoadingDatas;

public class LoadResource extends EcoreLoadingAction {

	public void performAction(EcoreLoadingDatas datas, Map<?, ?> options) {
		/*
		 * 
		 * First check into the registry
		 * 
		 */
		EPackage p = (EPackage) Registry.INSTANCE.get( datas.getKermetaUnit().getUri() );
		if ( p != null )
			datas.contents.add(p);
		else {
			/*
			 * 
			 * If not, let's try to load the resource.
			 * 
			 */
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createURI( datas.getKermetaUnit().getUri() );
			Resource resource = resourceSet.createResource(uri);
			try {
				resource.load(null);
				EcoreUtil.resolveAll(resourceSet);
				for ( Resource r : resourceSet.getResources() ) {
					if ( r != resource )
						datas.getKermetaUnit().addRequire(r.getURI().toString(), null);
				}
				datas.contents.addAll( resource.getContents() );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}


