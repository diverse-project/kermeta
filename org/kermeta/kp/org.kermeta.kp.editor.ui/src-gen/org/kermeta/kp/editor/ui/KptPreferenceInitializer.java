/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

/**
 * A class used to initialize default preference values.
 */
public class KptPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.kermeta.kp.editor.ui.KptAntlrTokenHelper tokenHelper = new org.kermeta.kp.editor.ui.KptAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kp.editor.ui.KptUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.kermeta.kp.editor.ui.KptPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.kermeta.kp.editor.ui.KptPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		// Set default value for occurrences
		store.setDefault(org.kermeta.kp.editor.ui.KptPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(org.kermeta.kp.editor.ui.KptPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(org.kermeta.kp.editor.ui.KptPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		// store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_
		// RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kp.editor.ui.KptUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.kermeta.kp.editor.mopp.KptMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kp.editor.ui.KptUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.kermeta.kp.editor.mopp.KptMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.kp.editor.IKptMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.kermeta.kp.editor.ui.KptBracketSet bracketSet = new org.kermeta.kp.editor.ui.KptBracketSet(null, null);
		final java.util.Collection<org.kermeta.kp.editor.IKptBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.kermeta.kp.editor.IKptBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.kermeta.kp.editor.ui.KptPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.kp.editor.IKptMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			org.kermeta.kp.editor.IKptTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KptSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
