/*$Id: UMLRepositorySingleton.java,v 1.1 2008-02-25 16:53:36 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	UMLRespositorySingleton.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 13 févr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.uml2.profiles.kermeta.runtime.basetypes;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.EMFRepositorySingleton;

public class UMLRepositorySingleton extends EMFRepositorySingleton {

	/* singleton implementation */
	protected static UMLRepositorySingleton UMLRepositorySingletonInstance = new UMLRepositorySingleton();	
	protected UMLRepositorySingleton(){		
	}
	public static UMLRepositorySingleton getSingleton(){
		return UMLRepositorySingletonInstance;
	}
	
    /**
     * this method creates the concrete RuntimeObject for the resource : an UMLResource
     * @param emfRes
     * @param repRO
     * @param mmUriRO
     * @return
     */
    protected RuntimeObject createRuntimeObjectFromResource(Resource emfRes, RuntimeObject repRO, RuntimeObject mmUriRO)
    {
    	return repRO.getFactory().createRuntimeObjectFromResource(emfRes, repRO, mmUriRO, "kermeta::persistence::UMLResource");
    	
    }
}
