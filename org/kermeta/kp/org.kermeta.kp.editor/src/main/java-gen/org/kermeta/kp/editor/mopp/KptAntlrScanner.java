/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptAntlrScanner implements org.kermeta.kp.editor.IKptTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public KptAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.kp.editor.IKptTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		org.kermeta.kp.editor.IKptTextToken result = new org.kermeta.kp.editor.mopp.KptTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
