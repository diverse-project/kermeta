/*$Id : LogoTerminateParsingException.java v 1.3 May 8, 2010 9:17:58 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoTerminateParsingException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// This exception is used to terminate generated parsers. Depending on
// the state of a stop flag the parser throw this exception to break
// the control flow and allow users of the parser to stop parsing.
public class LogoTerminateParsingException extends java.lang.RuntimeException {
	
	private static final long serialVersionUID = 117529647036954724L;
	
}
