/*$Id : LogoPreferenceConstants.java v 1.3 May 8, 2010 9:18:18 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoPreferenceConstants.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui;

// An interface that defines some constants used to create
// the keys for preferences.
public interface LogoPreferenceConstants {
	
	//Constants for syntax highlighting
	//
	// Preference key suffix to enable syntax highlighting for
	// a token type.
	public static final String EDITOR_ENABLE_SUFFIX = "_enable";
	public static final String EDITOR_COLOR_SUFFIX = "_color";
	
	//Constants for brackets
	public static final String EDITOR_MATCHING_BRACKETS_COLOR = "_matchingBracketsColor";
	public static final String EDITOR_MATCHING_BRACKETS_CHECKBOX = "_matchingBracketsCheckbox";
	public static final String EDITOR_BRACKETS_SUFFIX = "_brackets";
	
	//Constants for occurrence highlighting
	public static final String EDITOR_OCCURRENCE_CHECKBOX = "_occurrenceHighlightingCheckbox";
	public static final String EDITOR_DEFINITION_COLOR = "_definition_color";
	public static final String EDITOR_PROXY_COLOR = "_proxy_color";
	
}
