/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 26 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.helpers.eclipse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.helpers.emf.EMFUriHelper;

public class LocalFileConverterForEclipse extends LocalFileConverter {

	public LocalFileConverterForEclipse(){
		
	}
	
	/**
	 * be careful java.net.URI uses RFC 2396 compliant string, which means that " " are enforced into "%20" for example
	 */
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
				try {
					if(res.getRawLocationURI()!=null)
						return java.net.URI.create(java.net.URLEncoder.encode(res.getRawLocationURI().toString(),"UTF-8"));
					else if(res.getLocationURI()!=null)						
						return java.net.URI.create(java.net.URLEncoder.encode(res.getLocationURI().toString(),"UTF-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// deal with platformPlugin
		if(emfUri.isPlatformPlugin()){
			URL resolvedURL;
			try {
				resolvedURL = FileLocator.resolve(javaUri.toURL());
				return java.net.URI.create(java.net.URLEncoder.encode(resolvedURL.toString(),"UTF-8"));
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
