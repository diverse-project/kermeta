/*$Id : LogoANTLRParserBase.java v 1.3 May 8, 2010 9:17:55 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoANTLRParserBase.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public abstract class LogoANTLRParserBase extends org.antlr.runtime.Parser implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextParser {
	
	public LogoANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public LogoANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
