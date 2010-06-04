/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class ArtextTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private art.resource.artext.IArtextTextScanner lexer;
	private art.resource.artext.IArtextTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private art.resource.artext.ui.ArtextColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public ArtextTokenScanner(art.resource.artext.ui.ArtextColorManager colorManager) {
		this.lexer = new art.resource.artext.mopp.ArtextMetaInformation().createLexer();
		this.languageId = new art.resource.artext.mopp.ArtextMetaInformation().getSyntaxName();
		this.store = art.resource.artext.mopp.ArtextPlugin.getDefault().getPreferenceStore();
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
			String enableKey = art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
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
