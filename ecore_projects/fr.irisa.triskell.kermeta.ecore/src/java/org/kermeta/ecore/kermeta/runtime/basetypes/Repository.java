/*$Id: Repository.java,v 1.3 2008-02-25 16:53:36 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	Repository.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 f�vr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.ecore.kermeta.runtime.basetypes;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * This class is intended to "wrap" the repository management from kermeta.
 * by default it reuse operations defined in fr.irisa.triskell.kermeta.runtime.basetypes.Repository
 */
public class Repository extends fr.irisa.triskell.kermeta.runtime.basetypes.Repository {

    /**
     * @param selfRO  - RO for repository
     * @param uriRO   - RO for the uri of the resource to be created
     * @param mmUriRO - RO for the uri of the metamodel of the resource to be created
     * @return        - RO for the created resource, or void RO if creation failed
     */
    public static RuntimeObject createResource(RuntimeObject selfRO, RuntimeObject uriRO, RuntimeObject mmUriRO) {
    	
    	// default implemetation use EMF and the default singleton        
    	return RegisteredEcoreRepositorySingleton.getSingleton().createResource(selfRO, uriRO, mmUriRO);
    }
    

}
