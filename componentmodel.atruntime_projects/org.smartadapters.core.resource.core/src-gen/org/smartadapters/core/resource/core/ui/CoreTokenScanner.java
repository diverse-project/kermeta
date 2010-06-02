/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class CoreTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.smartadapters.core.resource.core.ICoreTextScanner lexer;
	private org.smartadapters.core.resource.core.ICoreTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.smartadapters.core.resource.core.ui.CoreColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public CoreTokenScanner(org.smartadapters.core.resource.core.ui.CoreColorManager colorManager) {
		this.lexer = new org.smartadapters.core.resource.core.mopp.CoreMetaInformation().createLexer();
		this.languageId = new org.smartadapters.core.resource.core.mopp.CoreMetaInformation().getSyntaxName();
		this.store = org.smartadapters.core.resource.core.mopp.CorePlugin.getDefault().getPreferenceStore();
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
			String enableKey = org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.smartadapters.core.resource.core.ui.CoreSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
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
