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
public class KpTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.kermeta.kp.editor.IKpTextScanner lexer;
	private org.kermeta.kp.editor.IKpTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.kermeta.kp.editor.ui.KpColorManager colorManager;
	private org.kermeta.kp.editor.IKpTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public KpTokenScanner(org.kermeta.kp.editor.IKpTextResource resource, org.kermeta.kp.editor.ui.KpColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new org.kermeta.kp.editor.mopp.KpMetaInformation().createLexer();
		this.languageId = new org.kermeta.kp.editor.mopp.KpMetaInformation().getSyntaxName();
		this.store = org.kermeta.kp.editor.ui.KpUIPlugin.getDefault().getPreferenceStore();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		org.kermeta.kp.editor.mopp.KpDynamicTokenStyler dynamicTokenStyler = new org.kermeta.kp.editor.mopp.KpDynamicTokenStyler();
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.ENABLE);
			boolean enabled = store.getBoolean(enableKey);
			org.kermeta.kp.editor.IKpTokenStyle staticStyle = null;
			if (enabled) {
				String colorKey = org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
				org.eclipse.swt.graphics.RGB backgroundRGB = null;
				boolean bold = store.getBoolean(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.BOLD));
				boolean italic = store.getBoolean(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.ITALIC));
				boolean strikethrough = store.getBoolean(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
				boolean underline = store.getBoolean(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.UNDERLINE));
				// now call dynamic token styler to allow to apply modifications to the static
				// style
				staticStyle = new org.kermeta.kp.editor.mopp.KpTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
			}
			org.kermeta.kp.editor.IKpTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
			if (dynamicStyle != null) {
				int[] foregroundColorArray = dynamicStyle.getColorAsRGB();
				org.eclipse.swt.graphics.Color foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
				int[] backgroundColorArray = dynamicStyle.getBackgroundColorAsRGB();
				org.eclipse.swt.graphics.Color backgroundColor = null;
				if (backgroundColorArray != null) {
					org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
					backgroundColor = colorManager.getColor(backgroundRGB);
				}
				int style = org.eclipse.swt.SWT.NORMAL;
				if (dynamicStyle.isBold()) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (dynamicStyle.isItalic()) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (dynamicStyle.isStrikethrough()) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (dynamicStyle.isUnderline()) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
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
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
}
