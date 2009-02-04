
package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.persistence.impl.EMFResourceImpl;

// Get the namespace
// ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI().
// If you're looking for hooks during parsing, XMLHandler.getPackageForURI is used to map a namespace to the right package.

/**
 * This class is intended to "wrap" the resource management from kermeta.
 */
public class ResourceUtil {
    
    /**
     * This methods computes the set of resources the contextual resource depends on
     * @param selfRO         - RO for the current resource
     * @param uriRO          - RO for the uri of the resource
     * @param mmUriRO        - RO for the metamodel uri of the resource
     * @param resourceTypeRO - RO for the string characterizing the type of te resource
     * @return               - RO for the returned set of dependent resources
     */
    public static kermeta.standard.Set<kermeta.persistence.Resource> getDependentResources(
			kermeta.persistence.Resource selfRO,
			java.lang.String uriRO,
			java.lang.String mmUriRO, 
			java.lang.String resourceTypeRO)
    {
    	return null;
    }

	public static Boolean save(EMFResourceImpl resourceImpl, String uri,
			String metaModelURI, String string, EMFResourceImpl resourceImpl2,
			boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void addUMLRuntimeUnitFactory() {
		//Do nothing
		//In compiled mode the behavior, the loader is "better" thanks to the cloner
	}
	
}
