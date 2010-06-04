/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.ui;

// Class used to initialize default preference values.
public class ArtextPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static art.resource.artext.ui.ArtextAntlrTokenHelper tokenHelper = new art.resource.artext.ui.ArtextAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = art.resource.artext.mopp.ArtextPlugin.getDefault().getPreferenceStore();
		//Set default value for matching brackets
		store.setDefault(art.resource.artext.ui.ArtextPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(art.resource.artext.ui.ArtextPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		//Set default value for occurrences
		store.setDefault(art.resource.artext.ui.ArtextPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(art.resource.artext.ui.ArtextPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(art.resource.artext.ui.ArtextPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		//store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = art.resource.artext.mopp.ArtextPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new art.resource.artext.mopp.ArtextMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = art.resource.artext.mopp.ArtextPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new art.resource.artext.mopp.ArtextMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, art.resource.artext.IArtextMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		art.resource.artext.ui.ArtextBracketSet bracketSet = new art.resource.artext.ui.ArtextBracketSet(null, languageId);
		final java.util.Collection<art.resource.artext.IArtextBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (art.resource.artext.IArtextBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + art.resource.artext.ui.ArtextPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, art.resource.artext.IArtextMetaInformation metaInformation) {
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
			art.resource.artext.IArtextTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(art.resource.artext.ui.ArtextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, art.resource.artext.ui.ArtextSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
