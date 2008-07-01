/* $Id: KRuntimeException.java,v 1.1 2008-07-01 08:51:45 cfaucher Exp $
* Project : org.kermeta.compil.runtime.helper
* File : KRuntimeException.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 27 jun. 2008
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compil.runtime.helper.exception;

import org.eclipse.emf.ecore.EObject;

public class KRuntimeException extends Exception {

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

	public KRuntimeException (EObject eobj) {
		realException = eobj;
	}
}
