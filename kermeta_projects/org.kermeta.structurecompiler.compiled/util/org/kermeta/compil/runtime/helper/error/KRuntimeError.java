/* $Id: KRuntimeError.java,v 1.2 2008-09-11 12:35:04 cfaucher Exp $
* Project : org.kermeta.compil.runtime.helper
* File : KRuntimeException.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 27 jun. 2008
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compil.runtime.helper.error;

import org.eclipse.emf.ecore.EObject;

public class KRuntimeError extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1407928254182709051L;
	
	private EObject realException;

	public EObject getRealException() {
		return realException;
	}

	public void setRealException(EObject realException) {
		this.realException = realException;
	}

	public KRuntimeError (EObject eobj) {
		realException = eobj;
	}
	
	public KRuntimeError (String message) {
		
	}
}
