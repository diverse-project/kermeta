/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class KptTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.kermeta.kp.editor.IKptTextScanner lexer;
	private org.kermeta.kp.editor.IKptTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.kermeta.kp.editor.ui.KptColorManager colorManager;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public KptTokenScanner(org.kermeta.kp.editor.ui.KptColorManager colorManager) {
		this.lexer = new org.kermeta.kp.editor.mopp.KptMetaInformation().createLexer();
		this.languageId = new org.kermeta.kp.editor.mopp.KptMetaInformation().getSyntaxName();
		this.store = org.kermeta.kp.editor.ui.KptUIPlugin.getDefault().getPreferenceStore();
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
			String enableKey = org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
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
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
