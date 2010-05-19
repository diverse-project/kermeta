/**
 * <copyright>
 * </copyright>
 *
 * 
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
