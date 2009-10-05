/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of LogoCSM diagram
 * 
 * @generated
 */
public class LogoCSMDiagramTopcasedPreferenceInitializer implements ITopcasedPreferenceInitializer
{

	/**
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 * @generated
	 */
	public HashMap<String, String> getDefaultPreference()
	{
		HashMap<String, String> defaultLogoCSMPreference = new HashMap<String, String>();
		// Initialize the default value of the BACK_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.BACK_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the BACK_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.BACK_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the BACK_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.BACK_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the FORWARD_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.FORWARD_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the FORWARD_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.FORWARD_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the FORWARD_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.FORWARD_DEFAULT_FONT, StringConverter
				.asFontData("Sans-regular-10").toString());

		// Initialize the default value of the LEFT_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.LEFT_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the LEFT_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.LEFT_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the LEFT_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.LEFT_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the RIGHT_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.RIGHT_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the RIGHT_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.RIGHT_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the RIGHT_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.RIGHT_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the PENDOWN_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.PENDOWN_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the PENDOWN_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.PENDOWN_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the PENDOWN_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.PENDOWN_DEFAULT_FONT, StringConverter
				.asFontData("Sans-regular-10").toString());

		// Initialize the default value of the PENUP_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.PENUP_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the PENUP_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.PENUP_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the PENUP_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.PENUP_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the CLEAR_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.CLEAR_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the CLEAR_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.CLEAR_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the CLEAR_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.CLEAR_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the BLOCK_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.BLOCK_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the BLOCK_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.BLOCK_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the BLOCK_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.BLOCK_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the IF_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.IF_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the IF_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.IF_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the IF_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.IF_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the REPEAT_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.REPEAT_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the REPEAT_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.REPEAT_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the REPEAT_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.REPEAT_DEFAULT_FONT, StringConverter.asFontData(
			"Sans-regular-10").toString());

		// Initialize the default value of the SEQUENCE_EDGE_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.SEQUENCE_EDGE_DEFAULT_FONT, StringConverter
				.asFontData("Sans-regular-10").toString());

		// Initialize the default value of the SEQUENCE_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.SEQUENCE_EDGE_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the SEQUENCE_EDGE_DEFAULT_ROUTER property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.SEQUENCE_EDGE_DEFAULT_ROUTER, "ObliqueRouter");

		// Initialize the default value of the CONSTANT_DEFAULT_BACKGROUND_COLOR property
		defaultLogoCSMPreference
				.put(LogoCSMDiagramPreferenceConstants.CONSTANT_DEFAULT_BACKGROUND_COLOR, "255,255,255");

		// Initialize the default value of the CONSTANT_DEFAULT_FOREGROUND_COLOR property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.CONSTANT_DEFAULT_FOREGROUND_COLOR, "0,0,0");

		// Initialize the default value of the CONSTANT_DEFAULT_FONT property
		defaultLogoCSMPreference.put(LogoCSMDiagramPreferenceConstants.CONSTANT_DEFAULT_FONT, StringConverter
				.asFontData("Sans-regular-10").toString());

		return defaultLogoCSMPreference;
	}
}
