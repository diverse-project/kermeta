/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 3 janv. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

public class TracedURL{
	EObject source;
	URL url;
	/**
	 * @param source
	 * @param url
	 */
	public TracedURL(EObject source, URL url) {
		super();
		this.source = source;
		this.url = url;
	}
	public EObject getSource() {
		return source;
	}
	public void setSource(EObject source) {
		this.source = source;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	
}
