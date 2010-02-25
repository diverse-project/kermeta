/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoAntlrScanner implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public LogoAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken result = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
