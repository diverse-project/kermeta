/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.messagingsystem.api;

import java.net.URL;

public class FileReference extends Reference {
	protected URL fileURL;

	
	
	public FileReference(URL fileURL) {
		super();
		this.fileURL = fileURL;
	}

	// getters and setters
	public URL getFileURL() {
		return fileURL;
	}

	public void setFileURL(URL fileURL) {
		this.fileURL = fileURL;
	}
	
	
	
}
