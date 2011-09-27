/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.helpers.emf;

public class EMFUriHelper {

		public static org.eclipse.emf.common.util.URI convertToEMFUri(java.net.URI javaUri){
			// current implementation is trivial, but may be enhanced if necessary
			return org.eclipse.emf.common.util.URI.createURI(javaUri.toString());
		}
		public static java.net.URI convertToJavaUri(org.eclipse.emf.common.util.URI emfUri){
			// current implementation is trivial, but may be enhanced if necessary
			return java.net.URI.create(emfUri.toString());
		}
}
