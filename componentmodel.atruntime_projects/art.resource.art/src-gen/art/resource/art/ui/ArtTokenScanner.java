/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class ArtTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private art.resource.art.IArtTextScanner lexer;
	private art.resource.art.IArtTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private art.resource.art.ui.ArtColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public ArtTokenScanner(art.resource.art.ui.ArtColorManager colorManager) {
		this.lexer = new art.resource.art.mopp.ArtMetaInformation().createLexer();
		this.languageId = new art.resource.art.mopp.ArtMetaInformation().getSyntaxName();
		this.store = art.resource.art.mopp.ArtPlugin.getDefault().getPreferenceStore();
		this.colorManager = colorManager;
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = art.resource.art.ui.ArtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.art.ui.ArtSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = art.resource.art.ui.ArtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.art.ui.ArtSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(art.resource.art.ui.ArtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.art.ui.ArtSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(art.resource.art.ui.ArtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.art.ui.ArtSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(art.resource.art.ui.ArtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.art.ui.ArtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(art.resource.art.ui.ArtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.art.ui.ArtSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(color, null, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			//ignore this error. It might occur during editing when locations are outdated quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
