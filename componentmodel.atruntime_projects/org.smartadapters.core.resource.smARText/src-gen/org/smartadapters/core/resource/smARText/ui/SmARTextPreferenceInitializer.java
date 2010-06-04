/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.ui;

// Class used to initialize default preference values.
public class SmARTextPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.smartadapters.core.resource.smARText.ui.SmARTextAntlrTokenHelper tokenHelper = new org.smartadapters.core.resource.smARText.ui.SmARTextAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.smartadapters.core.resource.smARText.mopp.SmARTextPlugin.getDefault().getPreferenceStore();
		//Set default value for matching brackets
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		//Set default value for occurrences
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		//store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.smartadapters.core.resource.smARText.mopp.SmARTextPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.smartadapters.core.resource.smARText.mopp.SmARTextMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.smartadapters.core.resource.smARText.mopp.SmARTextPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.smartadapters.core.resource.smARText.mopp.SmARTextMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.smartadapters.core.resource.smARText.ISmARTextMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.smartadapters.core.resource.smARText.ui.SmARTextBracketSet bracketSet = new org.smartadapters.core.resource.smARText.ui.SmARTextBracketSet(null, languageId);
		final java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.smartadapters.core.resource.smARText.ISmARTextBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.smartadapters.core.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.smartadapters.core.resource.smARText.ISmARTextMetaInformation metaInformation) {
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
			org.smartadapters.core.resource.smARText.ISmARTextTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.smartadapters.core.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
