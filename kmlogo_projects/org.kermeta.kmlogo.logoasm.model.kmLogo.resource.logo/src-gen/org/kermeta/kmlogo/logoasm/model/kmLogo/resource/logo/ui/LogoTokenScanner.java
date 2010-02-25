/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class LogoTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextScanner lexer;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public LogoTokenScanner(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager colorManager) {
		this.lexer = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation().createLexer();
		this.languageId = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation().getSyntaxName();
		this.store = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.getDefault().getPreferenceStore();
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
			String enableKey = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
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
