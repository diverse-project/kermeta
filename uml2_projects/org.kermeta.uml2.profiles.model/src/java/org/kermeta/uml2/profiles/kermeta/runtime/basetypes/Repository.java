/*$Id: Repository.java,v 1.2 2008-02-11 16:48:35 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	Repository.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 févr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.uml2.profiles.kermeta.runtime.basetypes;


import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * This class is intended to "wrap" the repository management from kermeta.
 */
public class Repository extends fr.irisa.triskell.kermeta.runtime.basetypes.Repository {

	/** tells to the createResource that it must create a UMLResource instead of the standard EMFResource
	 * 
	 * @param emfRes
	 * @param repRO
	 * @param mmUriRO
	 * @return
	 */
	protected static RuntimeObject createRuntimeObjectFromResource(Resource emfRes, RuntimeObject repRO, RuntimeObject mmUriRO)
    {
    	return repRO.getFactory().createRuntimeObjectFromResource(emfRes, repRO, mmUriRO, "kermeta::persistence::UMLResource");
    	
    }

}
