

/*$Id: UndefinedEntryPointException.java,v 1.1 2007-05-30 11:29:49 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	UndefinedEntryPointException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.launcher;

public class UndefinedEntryPointException extends Throwable {
	
	public UndefinedEntryPointException(String message) {
		super( message );
	}
	
}


