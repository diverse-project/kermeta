/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextAntlrScanner implements org.smartadapters.core.resource.smARText.ISmARTextTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public SmARTextAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		org.smartadapters.core.resource.smARText.ISmARTextTextToken result = new org.smartadapters.core.resource.smARText.mopp.SmARTextTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
