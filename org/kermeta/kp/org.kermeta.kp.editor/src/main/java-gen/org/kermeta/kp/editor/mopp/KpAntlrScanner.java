/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpAntlrScanner implements org.kermeta.kp.editor.IKpTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public KpAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.kp.editor.IKpTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		org.kermeta.kp.editor.IKpTextToken result = new org.kermeta.kp.editor.mopp.KpTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
