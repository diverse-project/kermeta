/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;
public class ArtTextToken implements art.resource.art.IArtTextToken {
	
	private final art.resource.art.IArtMetaInformation metaInformation = new art.resource.art.mopp.ArtMetaInformation();
	private final org.antlr.runtime.Token antlrToken;
	
	public ArtTextToken(org.antlr.runtime.Token antlrToken) {
		super();
		this.antlrToken = antlrToken;
	}
	
	public java.lang.String getName() {
		return getTokenName(metaInformation.getTokenNames(), antlrToken.getType());
	}
	
	public int getOffset() {
		return ((org.antlr.runtime.CommonToken) antlrToken).getStartIndex();
	}
	
	public int getLength() {
		return ((org.antlr.runtime.CommonToken) antlrToken).getStopIndex() - ((org.antlr.runtime.CommonToken) antlrToken).getStartIndex() + 1;
	}
	
	public boolean canBeUsedForSyntaxHighlighting() {
		int tokenType = antlrToken.getType();
		if (tokenType == org.antlr.runtime.Token.EOF) {
			return false;
		}
		if (tokenType == org.antlr.runtime.Token.UP) {
			return false;
		}
		if (tokenType == org.antlr.runtime.Token.DOWN) {
			return false;
		}
		if (tokenType == org.antlr.runtime.Token.EOR_TOKEN_TYPE) {
			return false;
		}
		if (tokenType == org.antlr.runtime.Token.INVALID_TOKEN_TYPE) {
			return false;
		}
		return true;
	}
	
	public java.lang.String getText() {
		return antlrToken.getText();
	}
	
	public java.lang.String getTokenName(java.lang.String[] tokenNames, int index) {
		if (tokenNames == null) {
			return null;
		}
		java.lang.String tokenName = tokenNames[index];
		if (tokenName != null && tokenName.startsWith("'")) {
			tokenName = tokenName.substring(1, tokenName.length() - 1).trim();
		}
		return tokenName;
	}
	
}
