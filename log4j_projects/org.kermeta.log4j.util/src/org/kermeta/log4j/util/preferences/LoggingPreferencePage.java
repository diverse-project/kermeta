/* $Id: LoggingPreferencePage.java,v 1.2 2008-05-30 14:39:12 dvojtise Exp $
 * Project    : .kermeta.log4j
 * File       : LoggingPreferencePage.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 may. 2008
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 */
package org.kermeta.log4j.util.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.log4j.util.plugin.Activator;

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

public class LoggingPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public LoggingPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for logging with kermeta");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_LOGGERCHOICE,
			"Logger: (logger change will be active only after restarting eclipse)",
			2,
			new String[][] { { "&Log4j", PreferenceConstants.P_LOGGERCHOICE_LOG4J},
							{"&JDK14", PreferenceConstants.P_LOGGERCHOICE_JDK14 },
							{"&SimpleLog", PreferenceConstants.P_LOGGERCHOICE_SIMPLE},
							{"Use &Apache.commons.logging default", PreferenceConstants.P_LOGGERCHOICE_APACHEDEFAULT}
		}, getFieldEditorParent()));
		addField(new FileFieldEditor(PreferenceConstants.P_LOG4JXMLPATH, 
				"Log4j configuration xml file:", getFieldEditorParent()));		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		boolean result = super.performOk();
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String preferredLogger = store.getString(PreferenceConstants.P_LOGGERCHOICE); 
		if(preferredLogger.equals(PreferenceConstants.P_LOGGERCHOICE_LOG4J) ||
			preferredLogger.equals(PreferenceConstants.P_LOGGERCHOICE_APACHEDEFAULT) ){
			LogConfigurationHelper.configureLog4JLogger("");
		}
		return result;
	}
	
}