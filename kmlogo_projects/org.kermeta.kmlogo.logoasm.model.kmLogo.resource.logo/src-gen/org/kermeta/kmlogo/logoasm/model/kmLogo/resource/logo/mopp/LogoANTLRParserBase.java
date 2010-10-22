/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public abstract class LogoANTLRParserBase extends org.antlr.runtime3_2_0.Parser implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextParser {
	
	public LogoANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input) {
		super(input);
	}
	
	public LogoANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input, org.antlr.runtime3_2_0.RecognizerSharedState state) {
		super(input, state);
	}
	
}
