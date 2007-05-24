

/*$Id: RegisteringHelper.java,v 1.1 2007-05-24 08:52:03 ftanguy Exp $
* Project : fr.irisa.triskell.sintaks
* File : 	RegisteringHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 23 mai 07
* Authors : paco
*/

package fr.irisa.triskell.sintaks.registering;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;

public class RegisteringHelper {

	static public String getRuleFile(String fileExtension) {
		
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		
		/*
		 * 
		 * Getting all extensions of sintaks files registration.
		 * 
		 */
		IExtensionPoint extensionPoint = registry.getExtensionPoint("fr.irisa.triskell.sintaks.stsFilesRegistration");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		/*
		 * 
		 * For all extensions, generate an editor for all ConfigurationElement.
		 * An extension can have one or more registration (one registration corresponds to one ConfigurationElement).
		 * 
		 */
		for ( int i = 0; i < extensions.length; i++ ) {
			
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for ( int j = 0; j < elements.length; j++ ) {
				
				if ( elements[j].getAttribute("Extension").equals(fileExtension) )
					return "platform:/plugin/" + extensions[i].getContributor().getName() + "/" + elements[j].getAttribute("File");			
			
			}
			
		}
		
		return "";
	}
	
}


