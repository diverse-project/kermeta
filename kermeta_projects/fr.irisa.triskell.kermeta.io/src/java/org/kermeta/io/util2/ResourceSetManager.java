/* $Id: ResourceSetManager.java,v 1.2 2007-07-20 15:08:14 ftanguy Exp $
 * Project   : Kermeta 
 * File      : ResourceSetManager.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 15 nov. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
/** 
 *
 */
package org.kermeta.io.util2;

import java.util.Collection;
import java.util.Hashtable;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.kermeta.io.plugin.IOPlugin;


/**
 * this class provides some management methods used to work with a given ResourceSet 
 *
 */
public class ResourceSetManager {

	/**
	 * the ResourceSet that is managed
	 */
	protected ResourceSet resourceSet;
	
	public ResourceSetManager(ResourceSet resource_set){
		resourceSet = resource_set;
	}
	/** add the resource to this resourceSet, save its resourceSet for a restore later
	 * @param resource_set
	 */
	public void addResource(Resource res){
		savedResourceSetForResources.put(res,res.getResourceSet());
		resourceSet.getResources().add(res);
	}

	/** add the resource of StandardLib to this resourceSet, save its resourceSet for a restore later
	 * @param resource_set
	 */
	public void addStdLibResource(){
		addResource( IOPlugin.getDefault().getFramework().getModelingUnit().eResource() );
	}
	
	/** add the resources to this resourceSet, save their resourceSet for a restore later
	 * @param resource_set
	 */
	public void addResources(Collection<Resource> ressources){
		for(Resource res : ressources){
			addResource(res);
			//savedResourceSetForResources.put(res,res.getResourceSet());
			//resourceSet.getResources().add(res);
			
		}
	}
	
	/** remove the internal resources of the interpreter to this resourceSet 
	 * and put them back to their original resourceSet
	 * @param resource_set
	 */
	public void restoreInterpreterInternalResources(){
		for(Resource res : savedResourceSetForResources.keySet()){
			ResourceSet resSet = savedResourceSetForResources.get(res);
			resSet.getResources().add(res);
		}
		// can be restored only once ...
		savedResourceSetForResources.clear();
	}
	/**
	 * structure used to store the original resourceSet  for the Resources
	 */
	protected Hashtable<Resource,ResourceSet> savedResourceSetForResources =  new Hashtable<Resource,ResourceSet>();
	
}
