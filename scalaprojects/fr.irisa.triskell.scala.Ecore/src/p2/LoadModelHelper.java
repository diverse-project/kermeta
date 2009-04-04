package p2;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
 
public class LoadModelHelper { 

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
