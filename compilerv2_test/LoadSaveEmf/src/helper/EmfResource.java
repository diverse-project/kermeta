package helper;

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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

 
public class EmfResource <T extends EPackage>{ 

	private ResourceSet rs;
	private Resource resource;

	public static EList<EObject> loadEcore(File file) throws IOException {

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
	
	public EmfResource(T pack) {
		rs = new ResourceSetImpl(); 
		Resource.Factory.Registry f = rs.getResourceFactoryRegistry();
		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		m.put("xmi",new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(pack.getNsURI(), pack);
		
	}
	
	

	public EList<EObject> getResourceContents(String fileName) {
		URI uri = URI.createFileURI(fileName);
		resource = rs.getResource(uri, true);
		return resource.getContents();
	}
	public Resource getResource(String fileName) {
		URI uri = URI.createFileURI(fileName);
		
		resource = rs.getResource(uri, false);
		return resource;
	}

	public Resource createResource(String fileName) {
		URI uri = URI.createFileURI(fileName);
		
		resource = rs.createResource(uri);
		return resource;
	}

	public void save() {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}
	
	public void saveWithNewURI(String fileName) {
		URI uri = URI.createFileURI(fileName);
		Resource newResource = rs.getResource(uri, true);
		newResource.getContents().addAll(resource.getContents());
		
		try {
			newResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
