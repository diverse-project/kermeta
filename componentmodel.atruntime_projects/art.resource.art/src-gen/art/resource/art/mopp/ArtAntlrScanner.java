/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

public class ArtAntlrScanner implements art.resource.art.IArtTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public ArtAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public art.resource.art.IArtTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		art.resource.art.IArtTextToken result = new art.resource.art.mopp.ArtTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
