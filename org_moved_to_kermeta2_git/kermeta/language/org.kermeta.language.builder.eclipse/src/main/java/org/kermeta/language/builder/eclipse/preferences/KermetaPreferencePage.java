package org.kermeta.language.builder.eclipse.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.kermeta.language.builder.eclipse.Activator;
import org.kermeta.utils.systemservices.eclipse.api.ConsoleLogLevel;
import org.kermeta.utils.systemservices.eclipse.api.EclipseMessagingSystem;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class KermetaPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public KermetaPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Kermeta general preferences");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		/*addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
				"&Directory preference:", getFieldEditorParent()));*/
		
		addField(
			new BooleanFieldEditor(
				PreferenceConstants.P_SAVE_BUILD_INTERMEDIATE_FILES_BOOLEAN,
				"&Save intermediate build files",
				getFieldEditorParent()));
		
		addField(
				new BooleanFieldEditor(
					PreferenceConstants.P_IGNORE_BUILD_ERROR_BOOLEAN,
					"Ignore build error (NOT recommanded)",
					getFieldEditorParent()));
		
		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_BUILDER_CONSOLE_LOG_LEVEL_CHOICE,
			"Builder console default log level",
			2,
			new String[][] { { "&Developper Debug", ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_DEBUG)}, 
						 { "Developper Info", ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_INFO) },
						 { "Developper Warning", ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_WARNING)},
						 { "Developper Error",   ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_ERROR)}, 
						 { "&User Info", ConsoleLogLevel.level2String(ConsoleLogLevel.USER_INFO) },
						 { "User &Warning", ConsoleLogLevel.level2String(ConsoleLogLevel.USER_WARNING)},
						 { "User &Error",   ConsoleLogLevel.level2String(ConsoleLogLevel.USER_ERROR)}}, 
			getFieldEditorParent(), 
			true));
		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_RUNNER_CONSOLE_LOG_LEVEL_CHOICE,
			"Runner console default log level",
			2,
			new String[][] { { "&Developper Debug", ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_DEBUG)}, 
						 { "Developper Info", ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_INFO) },
						 { "Developper Warning", ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_WARNING)},
						 { "Developper Error",   ConsoleLogLevel.level2String(ConsoleLogLevel.DEV_ERROR)}, 
						 { "&User Info", ConsoleLogLevel.level2String(ConsoleLogLevel.USER_INFO) },
						 { "User &Warning", ConsoleLogLevel.level2String(ConsoleLogLevel.USER_WARNING)},
						 { "User &Error",   ConsoleLogLevel.level2String(ConsoleLogLevel.USER_ERROR)}}, 
			getFieldEditorParent(), 
			true));
		
		
		addField(new ComboFieldEditor(
					PreferenceConstants.P_KMT_EDITOR_ONKEYSTRIKE_STRING, 
					"KMT editor on key strike action", 
					new String[][] { { "None", PreferenceToBuildAction.NONE},
							 { "Parse only", PreferenceToBuildAction.PARSE_KMT },
							 { "Unchecked Generate KM (minimum required by completion)", PreferenceToBuildAction.UNCHECKED_GENERATE_KM }, 
							 { "Generate KM",  PreferenceToBuildAction.GENERATE_KM }}, 
					getFieldEditorParent()));
		addField(new ComboFieldEditor(
				PreferenceConstants.P_KMT_EDITOR_ONSAVE_STRING, 
				"KMT editor on save action",  
				new String[][] { { "None", PreferenceToBuildAction.NONE}, 
						 { "Unchecked Generate KM", PreferenceToBuildAction.UNCHECKED_GENERATE_KM },
						 { "Generate KM (recommanded)", PreferenceToBuildAction.GENERATE_KM },
						 { "Generate bytecode", PreferenceToBuildAction.GENERATE_BYTECODE}}, 
				getFieldEditorParent()));
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_KP_EDITOR_ONSAVE_STRING, 
				"KP editor on save action",  
				new String[][] { { "None", PreferenceToBuildAction.NONE}, 
						 { "Generate KM", PreferenceToBuildAction.GENERATE_KM },
						 /*{ "Generate bytecode", PreferenceToBuildAction.GENERATE_BYTECODE}*/}, 
				getFieldEditorParent()));
		addField(new ComboFieldEditor(
				PreferenceConstants.P_PROJECT_ONOPEN_STRING, 
				"project on open action",  
				new String[][] { { "None", PreferenceToBuildAction.NONE}, 
						 { "Generate KM", PreferenceToBuildAction.GENERATE_KM },
						 /*{ "Generate bytecode", PreferenceToBuildAction.GENERATE_BYTECODE}*/}, 
				getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	public boolean performOk() {
		boolean result = super.performOk();
		
		// apply the changes on current Messagingsystem
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		EclipseMessagingSystem ms = ((EclipseMessagingSystem)Activator.getDefault().getMessaggingSystem());
		ms.setConsoleLogLevel(ConsoleLogLevel.String2Level(store.getString(PreferenceConstants.P_BUILDER_CONSOLE_LOG_LEVEL_CHOICE)));
		ms = ((EclipseMessagingSystem)Activator.getDefault().getMessaggingSystem4Runner(Activator.PLUGIN_ID+".runner"));
		ms.setConsoleLogLevel(ConsoleLogLevel.String2Level(store.getString(PreferenceConstants.P_RUNNER_CONSOLE_LOG_LEVEL_CHOICE)));
		return result;
	}
	
	
	
	
	
}