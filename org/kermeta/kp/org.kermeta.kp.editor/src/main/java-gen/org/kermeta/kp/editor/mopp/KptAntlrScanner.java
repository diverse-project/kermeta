/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptAntlrScanner implements org.kermeta.kp.editor.IKptTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public KptAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.kp.editor.IKptTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		org.kermeta.kp.editor.IKptTextToken result = new org.kermeta.kp.editor.mopp.KptTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
