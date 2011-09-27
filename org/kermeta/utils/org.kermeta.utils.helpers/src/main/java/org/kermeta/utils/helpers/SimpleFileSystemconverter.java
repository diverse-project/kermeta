/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 26 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.helpers;

import org.kermeta.utils.helpers.emf.EMFUriHelper;


/**
 * Simple URI to Physical converter : no conversion if unsure
 *
 */
public class SimpleFileSystemconverter extends LocalFileConverter {


	@Override
	public java.net.URI  convertSpecialURItoFileURI(java.net.URI javaUri) {
		if( EMFUriHelper.convertToEMFUri(javaUri).isFile())
			return javaUri;
		else
			return null;
	}

}
