
package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.persistence.Resource;
import kermeta.persistence.impl.EMFRepositoryImpl;

/**
 * This class is intended to "wrap" the repository management from kermeta.
 */
public class RepositoryUtil {
    

    /**
     * @param selfRO - RO for respository
     * @return       - RO for the created resource
     */
    public static void initRepository(kermeta.persistence.Repository self) {
    }

    
    /**
     * Allows to obtain a valid URI from various URI forms
     * It takes into account relative path and tronsfor them into plaform:/plugin or platform:/resource path
     * @param uriRO
     * @return
     */
    public static java.lang.String normalizeUri(java.lang.String uri) {    	
    	return null;
    }


	public static Resource createResource(EMFRepositoryImpl repositoryImpl,
			String uri, String mm_uri) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
