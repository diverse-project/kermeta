/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextAntlrScanner implements smartadapters4ART.resource.smARText.ISmARTextTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public SmARTextAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		smartadapters4ART.resource.smARText.ISmARTextTextToken result = new smartadapters4ART.resource.smARText.mopp.SmARTextTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
