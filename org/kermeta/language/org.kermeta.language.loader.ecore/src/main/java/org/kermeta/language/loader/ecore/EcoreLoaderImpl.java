package org.kermeta.language.loader.ecore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.kermeta.language.loader.ecore.api.EcoreLoader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EcoreLoaderImpl implements EcoreLoader {
    public List<EPackage> load(final String uriEcoreModel) {
    	ResourceSet resourceSet 	= new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m 		= f.getExtensionToFactoryMap();
		m.put("ecore",new XMIResourceFactoryImpl());
		
		URI uri 			= URI.createURI(uriEcoreModel);
		Resource resource	= resourceSet.getResource(uri, true);
		List<EPackage> pkgs = new ArrayList<EPackage>();
		
		for(EObject o : resource.getContents())
			if(o instanceof EPackage)
				pkgs.add((EPackage)o);

		return pkgs;
    }
}
