package org.kermeta.language.loader.km;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.loader.km.api.KmLoader;

public class KmLoaderImpl implements KmLoader {
    public ModelingUnit load(final String uriKmModel) {
    	enforceInitPackage();
    	ResourceSet resourceSet 		  = new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m 		= f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());
		
		URI uri = URI.createURI(uriKmModel);
		Resource resource		= resourceSet.getResource(uri, true);

		for(EObject o : resource.getContents())
			if(o instanceof ModelingUnit)
				return (ModelingUnit)o;
		return null;
    }
    
    protected void enforceInitPackage(){
    	org.OrgPackage p1 = org.OrgPackage.eINSTANCE;
    	org.kermeta.KmPackage p2 = org.kermeta.KmPackage.eINSTANCE;
    	org.kermeta.language.LanguagePackage p3 = org.kermeta.language.LanguagePackage.eINSTANCE;
    	org.kermeta.language.behavior.BehaviorPackage p4 = org.kermeta.language.behavior.BehaviorPackage.eINSTANCE;
    	org.kermeta.language.structure.StructurePackage p5 = org.kermeta.language.structure.StructurePackage.eINSTANCE;
    }
}

