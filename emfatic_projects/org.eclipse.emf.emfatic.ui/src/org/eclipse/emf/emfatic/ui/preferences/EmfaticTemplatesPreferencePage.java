package org.eclipse.emf.emfatic.ui.preferences;

import org.eclipse.emf.emfatic.ui.EmfaticUIPlugin;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.texteditor.templates.TemplatePreferencePage;

public class EmfaticTemplatesPreferencePage extends TemplatePreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Constructor
	 */
	public EmfaticTemplatesPreferencePage() {
		setPreferenceStore(EmfaticUIPlugin.getDefault().getPreferenceStore());
		setTemplateStore(EmfaticUIPlugin.getDefault().getEmfaticTemplateStore());
		setContextTypeRegistry(EmfaticUIPlugin.getDefault().getEmfaticContextTypeRegistry());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.texteditor.templates.TemplatePreferencePage#isShowFormatterSetting()
	 */
	protected boolean isShowFormatterSetting() {
		return true;
	}

	/**
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	public boolean performOk() {
		boolean ok = super.performOk();

		if (ok)
			EmfaticUIPlugin.getDefault().savePluginPreferences();

		return ok;
	}
}
