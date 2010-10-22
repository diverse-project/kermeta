/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoAntlrScanner implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public LogoAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken result = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
