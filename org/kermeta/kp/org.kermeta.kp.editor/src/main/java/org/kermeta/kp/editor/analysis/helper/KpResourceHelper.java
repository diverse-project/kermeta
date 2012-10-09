/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.editor.analysis.helper;

import java.net.MalformedURLException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.editor.IKpLocationMap;
import org.kermeta.kp.editor.mopp.KpResource;
import org.kermeta.utils.helpers.emf.EMFUriHelper;
import org.kermeta.utils.systemservices.api.reference.FileReference;
import org.kermeta.utils.systemservices.api.reference.TextReference;

public class KpResourceHelper {
	
	public static FileReference createFileReference( org.eclipse.emf.ecore.EObject element){
		FileReference result = null;
		
		if(element.eResource() instanceof KpResource){
			KpResource resource = (KpResource) element.eResource();
			IKpLocationMap locationMap = resource.getLocationMap();
			
			try {
				TextReference tref = new TextReference(EMFUriHelper.convertToJavaUri(resource.getURI()).toURL(),
						Math.max(0, locationMap.getCharStart(element)), 
						Math.max(0, locationMap.getCharEnd(element)));
				tref.setBeginLine(Math.max(0, locationMap.getLine(element)));
				result = tref;
			} catch (MalformedURLException e) {}
		}
		else{
			try {
				result = new FileReference(EMFUriHelper.convertToJavaUri(element.eResource().getURI()).toURL());
			} catch (MalformedURLException e) {}
	
		}
		return result;
	}
	
	public static KermetaProject findKermetaProject(String uriString, Resource resource) {
		if (resource == null) {
			return null;
		}
		ResourceSet rs = resource.getResourceSet();
		if (rs == null) {
			return null;
		}
		Resource kermetaProjectResource = null;
		URI uri = URI.createURI(uriString);
		
		URI resourceURI = resource.getURI();
		if (resourceURI.isRelative() || resourceURI.isHierarchical()) {
			uri = uri.resolve(resourceURI); // relative
		}
		try {
			kermetaProjectResource = rs.getResource(uri, true);
		} catch (Exception e) {
		}

		if (kermetaProjectResource == null ||
				kermetaProjectResource.getContents().isEmpty() || 
			!(kermetaProjectResource.getContents().get(0) instanceof KermetaProject)) {
			return null;
		}
		return (KermetaProject) kermetaProjectResource.getContents().get(0);
	}

}
