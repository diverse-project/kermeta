package org.kermeta.language.compiler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.kermeta.KmPackage;

import org.kermeta.language.structure.ModelingUnit;
 
public class LoadModelHelper { 

	public ModelingUnit loadKM(String fileName) {
		 
		 
		   
		ResourceSet rs = new ResourceSetImpl(); 
		Resource.Factory.Registry f = rs.getResourceFactoryRegistry();
		Map<String,Object> m = f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
		URI uri = URI.createFileURI(fileName);
		Resource resource = rs.getResource(uri, true);
		ModelingUnit mu = null;
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			mu = (ModelingUnit) resource.getContents().get(0);
		}
		return mu;
	}

	
	public EList<EObject> open(File file) throws IOException {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Initialize the FSML Package information (ie. URI)
		EcorePackageImpl.init();

		// Set OPTION_RECORD_UNKNOWN_FEATURE prior to calling getResource
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",
				new EcoreResourceFactoryImpl() {
			 		@Override
					public Resource createResource(URI uri) {
						XMIResourceImpl resource = (XMIResourceImpl) super
								.createResource(uri);
						
						resource.getDefaultLoadOptions().put(
								XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
								Boolean.TRUE);
				 		return resource;
					}
				});

		XMIResource resource = (XMIResource) resourceSet.getResource(URI
				.createFileURI(file.toString()), true);

		// Unknown elements will appear in this map
		System.out.println(resource.getEObjectToExtensionMap());

		resource.load(Collections.EMPTY_MAP);
		return resource.getContents();
	}

}


