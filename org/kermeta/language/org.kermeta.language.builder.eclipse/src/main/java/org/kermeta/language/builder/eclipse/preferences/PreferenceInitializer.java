package org.kermeta.language.builder.eclipse.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.kermeta.language.builder.eclipse.internal.Activator;
import org.kermeta.utils.systemservices.eclipse.api.ConsoleLogLevel;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_SAVE_BUILD_INTERMEDIATE_FILES_BOOLEAN, true);
		store.setDefault(PreferenceConstants.P_BUILDER_CONSOLE_LOG_LEVEL_CHOICE, ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_DEBUG));
		store.setDefault(PreferenceConstants.P_RUNNER_CONSOLE_LOG_LEVEL_CHOICE, ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_DEBUG));
		/*store.setDefault(PreferenceConstants.P_STRING,
				"Default value");*/
	}

}
