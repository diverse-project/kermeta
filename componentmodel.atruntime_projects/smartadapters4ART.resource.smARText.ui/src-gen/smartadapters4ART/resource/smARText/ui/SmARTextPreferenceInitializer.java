/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.ui;

/**
 * A class used to initialize default preference values.
 */
public class SmARTextPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static smartadapters4ART.resource.smARText.ui.SmARTextAntlrTokenHelper tokenHelper = new smartadapters4ART.resource.smARText.ui.SmARTextAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = smartadapters4ART.resource.smARText.ui.SmARTextUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = smartadapters4ART.resource.smARText.ui.SmARTextUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new smartadapters4ART.resource.smARText.mopp.SmARTextMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = smartadapters4ART.resource.smARText.ui.SmARTextUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new smartadapters4ART.resource.smARText.mopp.SmARTextMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, smartadapters4ART.resource.smARText.ISmARTextMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		smartadapters4ART.resource.smARText.ui.SmARTextBracketSet bracketSet = new smartadapters4ART.resource.smARText.ui.SmARTextBracketSet(null, null);
		final java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (smartadapters4ART.resource.smARText.ISmARTextBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + smartadapters4ART.resource.smARText.ui.SmARTextPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, smartadapters4ART.resource.smARText.ISmARTextMetaInformation metaInformation) {
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
			smartadapters4ART.resource.smARText.ISmARTextTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, smartadapters4ART.resource.smARText.ui.SmARTextSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
