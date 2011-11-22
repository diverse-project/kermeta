/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 26 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.helpers.eclipse;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.helpers.emf.EMFUriHelper;

public class LocalFileConverterForEclipse extends LocalFileConverter {

	public LocalFileConverterForEclipse(){
		
	}
	
	@Override
	public java.net.URI convertSpecialURItoFileURI(java.net.URI javaUri) {
		org.eclipse.emf.common.util.URI emfUri = EMFUriHelper.convertToEMFUri(javaUri);
		if(emfUri.isFile()){
			// already a file, nothing to do
			return javaUri;
		}
		if (emfUri.isPlatformResource()) {
			String platformString = emfUri.toPlatformString(true);
			IResource res =ResourcesPlugin.getWorkspace().getRoot().findMember(platformString); 
			if(res != null){
				if(res.getRawLocationURI()!=null)
					return java.net.URI.create(res.getRawLocationURI().toString());
				else if(res.getLocationURI()!=null)
					return java.net.URI.create(res.getLocationURI().toString());
			}
		}
		// deal with platformPlugin
		if(emfUri.isPlatformPlugin()){
			URL resolvedURL;
			try {
				resolvedURL = FileLocator.resolve(javaUri.toURL());
				//URL resolvedURL = Platform.resolve(new java.net.URL(key));
				return java.net.URI.create(resolvedURL.toString());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
