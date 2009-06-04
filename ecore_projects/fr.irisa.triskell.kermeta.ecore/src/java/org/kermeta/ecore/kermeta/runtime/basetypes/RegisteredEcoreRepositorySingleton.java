/*$Id: UMLRepositorySingleton.java,v 1.1 2008-02-25 16:53:36 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	UMLRespositorySingleton.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 13 f�vr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.ecore.kermeta.runtime.basetypes;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.EMFRepositorySingleton;

public class RegisteredEcoreRepositorySingleton extends EMFRepositorySingleton {

	/* singleton implementation */
	protected static RegisteredEcoreRepositorySingleton RegisteredEcoreRepositorySingletonInstance = new RegisteredEcoreRepositorySingleton();	
	protected RegisteredEcoreRepositorySingleton(){		
	}
	public static RegisteredEcoreRepositorySingleton getSingleton(){
		return RegisteredEcoreRepositorySingletonInstance;
	}
	
    /**
     * this method creates the concrete RuntimeObject for the resource : an RegisteredEcoreResource
     * @param emfRes
     * @param repRO
     * @param mmUriRO
     * @return
     */
    protected RuntimeObject createRuntimeObjectFromResource(Resource emfRes, RuntimeObject repRO, RuntimeObject mmUriRO)
    {
    	return repRO.getFactory().createRuntimeObjectFromResource(emfRes, repRO, mmUriRO, "kermeta::persistence::RegisteredEcoreResource");
    	
    }
}
