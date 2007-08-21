

/*$Id: UndefinedEntryPointException.java,v 1.2 2007-08-21 14:30:44 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	UndefinedEntryPointException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.launcher;

@SuppressWarnings("serial")
public class UndefinedEntryPointException extends Throwable {
	
	public UndefinedEntryPointException(String message) {
		super( message );
	}
	
}


