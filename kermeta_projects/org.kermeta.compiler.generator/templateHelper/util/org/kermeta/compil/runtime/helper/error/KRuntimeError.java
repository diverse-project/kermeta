/* $Id: KRuntimeError.java,v 1.2 2008-10-21 11:36:32 cfaucher Exp $
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
		
		if(eobj instanceof kermeta.exceptions.Exception) {
			StackTraceElement[] ste = new StackTraceElement[this.getStackTrace().length+1];
			
			ste[0] = new StackTraceElement(((kermeta.exceptions.Exception) realException).getMessage(), "", "", 0);
			
			int i=1;
			for(StackTraceElement tmp_ste : this.getStackTrace()) {
				ste[i] = tmp_ste;
				i++;
			}
			
			this.setStackTrace(ste);
		}
	}
	
	public KRuntimeError (String message) {
		
	}
}
