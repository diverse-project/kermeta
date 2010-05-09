/*$Id : ILogoTextToken.java v 1.3 May 8, 2010 9:17:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoTextToken.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// A token that is returned by ITextLexer instances. Each token
// has a name, a length and is found at a certain offset in a
// document.
public interface ILogoTextToken {
	
	// Returns the name of this token.
	public String getName();
	
	// Returns the offset at which the token was found in the document.
	public int getOffset();
	
	// Returns the length of this token.
	public int getLength();
	
	// Returns false if the token is not usable for syntax highlighting.
	public boolean canBeUsedForSyntaxHighlighting();
	
	public String getText();
}
