/*$Id : ILogoTokenResolveResult.java v 1.3 May 8, 2010 9:17:02 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoTokenResolveResult.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// Implementations of this interface are used store the result of
// resolving a token.
public interface ILogoTokenResolveResult {
	
	// Returns the error message that describes what went wrong while
	// resolving a token.
	public String getErrorMessage();
	
	// Sets the error message that describes what went wrong while
	// resolving a token. If a mapping for the token was
	// already found (i.e., setResult() was called before), the
	// call to this method is ignored. If setResult() is called
	// afterwards, the error message is also discarded.
	//
	// @param message the error that prevented resolving the token
	public void setErrorMessage(String message);
	
	// Sets the result of resolving a token.
	//
	// @param resolvedToken
	public void setResolvedToken(Object resolvedToken);
	
	// Returns the result of resolving a token or null if it
	// could not be resolved correctly.
	//
	// @param resolvedToken
	public Object getResolvedToken();
}
