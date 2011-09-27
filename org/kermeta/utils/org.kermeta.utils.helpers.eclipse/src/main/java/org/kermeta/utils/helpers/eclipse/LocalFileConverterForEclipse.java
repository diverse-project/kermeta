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
			return java.net.URI.create(res.getRawLocationURI().toString());
		}
		// TODO deal with platformPlugin
		return null;
	}

}
