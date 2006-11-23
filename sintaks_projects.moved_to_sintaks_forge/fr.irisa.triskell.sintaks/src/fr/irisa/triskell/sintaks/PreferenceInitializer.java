package fr.irisa.triskell.sintaks;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

import fr.irisa.triskell.sintaks.SintaksPlugin;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		SintaksPlugin.getDefault().getOptionManager().initializeDefaults();
	}

}
