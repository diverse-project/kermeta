/*$Id: RefinesUCWFRException.java,v 1.1 2007-12-14 09:51:18 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	RefinesUCWFRException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 déc. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.exception;

import org.eclipse.core.resources.IFile;

public class RefinesUCWFRException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RefinesUCWFRException(IFile arg0) {
		System.err.println("The file: (" + arg0.getLocation().toString() + ") defining a \"refines\" relationship is not well-formness.\nA \"refines\" file is able to define only a unique \"refines\" relationship");
	}

}


