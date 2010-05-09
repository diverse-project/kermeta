/*$Id : ILogoTokenStyle.java v 1.3 May 8, 2010 9:17:05 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoTokenStyle.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// A common interface for token styles. Text resources must
// return style information using object implementing this
// interface.
public interface ILogoTokenStyle {
	
	// Returns the color of the token as array of length 3.
	public int[] getColorAsRGB();
	
	// Returns true if the token must be displayed in bold face.
	public boolean isBold();
	
	// Returns true if the token must be displayed in italic face.
	public boolean isItalic();
	
	// Returns true if the token must be displayed in strike through style.
	public boolean isStrikethrough();
	
	// Returns true if the token must be displayed underline.
	public boolean isUnderline();
}
