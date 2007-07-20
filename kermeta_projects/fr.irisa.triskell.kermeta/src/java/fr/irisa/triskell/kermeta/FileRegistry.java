

/*$Id: FileRegistry.java,v 1.2 2007-07-20 15:09:18 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	RegisterFile.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 mai 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class FileRegistry {

	private static String FILE_REGISTRATION_ID = "fr.irisa.triskell.kermeta.fileRegistration";
	
	static private Map<String, Resource> registry = new Hashtable<String, Resource> ();
	
	static public void registerAll() {
		
		IExtensionRegistry extensionRegistry = RegistryFactory.getRegistry();
		IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint( FILE_REGISTRATION_ID );
		
		if ( extensionPoint == null )
			return;
		
		IExtension[] extensions = extensionPoint.getExtensions();
		
		for ( int i = 0; i < extensions.length; i++ ) {
			
			IContributor contributor = extensions[i].getContributor();
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			
			for ( int j = 0; j< elements.length; j++ ) {
				
				String relativeFilePath = elements[j].getAttribute("File");
				String filePath = getFilePath(contributor, relativeFilePath);
				String uri = elements[j].getAttribute("URI");
				
				URI fileURI = URI.createURI(filePath);
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.createResource(fileURI);
				registry.put(uri, resource );
	
			}
			
		}
		
	}

	static private String getFilePath(IContributor contributor, String relativeFilePath) {
		return "platform:/plugin/" + contributor.getName() + "/" + relativeFilePath;
	}
	
	static public EPackage getPackage(String uri) throws IOException {
		
/*		Resource resource = registry.get(uri);
		if ( resource == null )
			return null;
		
		if ( ! resource.isLoaded() )
			resource.load(null);
		
		return (EPackage) resource.getContents().get(0);*/
		
		return null;
	}
	
}


