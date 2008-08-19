
package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.persistence.EMFRepository;
import kermeta.persistence.PersistenceFactory;
import kermeta.persistence.Resource;

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


	public static Resource createResource(EMFRepository self,
			String uri, String mm_uri) {
		Resource resource = PersistenceFactory.eINSTANCE.createEMFResource();
		resource.setUri(uri);
		resource.setMetaModelURI(mm_uri);
		self.getResources().add( resource );
		return resource;
	}
    
}
