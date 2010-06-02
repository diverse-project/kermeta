/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreAntlrScanner implements org.smartadapters.core.resource.core.ICoreTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public CoreAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.smartadapters.core.resource.core.ICoreTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		org.smartadapters.core.resource.core.ICoreTextToken result = new org.smartadapters.core.resource.core.mopp.CoreTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
