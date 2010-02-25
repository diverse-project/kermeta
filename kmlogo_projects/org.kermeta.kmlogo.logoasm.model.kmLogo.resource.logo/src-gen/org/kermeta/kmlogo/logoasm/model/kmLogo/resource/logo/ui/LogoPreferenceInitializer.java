/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

// Class used to initialize default preference values.
public class LogoPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoAntlrTokenHelper tokenHelper = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.getDefault().getPreferenceStore();
		//Set default value for matching brackets
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		//Set default value for occurrences
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		//store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoBracketSet bracketSet = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoBracketSet(null, languageId);
		final java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoMetaInformation metaInformation) {
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
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
