/* $Id: EMFRegistryHelper.java,v 1.10 2008-04-28 11:51:03 ftanguy Exp $
 * Project   : Kermeta 
 * File      : ResourceHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : jun 2009
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.eclipse.emf;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Helper that provides operations dealing with EMF Resource
 *
 */
public class ResourceHelper {

	/**
	 * Retrieves the resources on which that Resource 
	 * This function looks only for direct dependencies
	 * @param initialResource
	 * @return
	 */
	public static Set<Resource> findResourceDependencies(Resource initialResource){
		Set<Resource> resSet = new HashSet<Resource>();
		Map<EObject, Collection<EStructuralFeature.Setting>> xRefMap = EcoreUtil.ExternalCrossReferencer.find(initialResource);
		for (EObject eObj : xRefMap.keySet()){
			Collection<EStructuralFeature.Setting> eStrucFeatSettings = xRefMap.get(eObj);
			for(EStructuralFeature.Setting setting : eStrucFeatSettings){
				Object o = setting.get(true);
				if(o != null && o instanceof EObject){
					EObject eo = (EObject)o;
					if(eo.eResource() != null)
						resSet.add(eo.eResource());
				}
			}
		}
		return resSet;
	
	}
	/**
	 * Retrieves the resources on which that Resource 
	 * This function drills into the resources found in order to get all dependencies
	 * @param initialResource
	 * @return
	 */
	public static Set<Resource>  findAllResourceDependencies(Resource initialResource){
		Set<Resource> resSet = new HashSet<Resource>();
		return resSet;
	
	}
}