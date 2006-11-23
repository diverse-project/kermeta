/*
 * Created on 1 June 2005
 *
 * Contributor : michel Hassenforder
 * 
 */
package fr.irisa.triskell.sintaks.ui;


import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import fr.irisa.triskell.sintaks.OptionManager;
import fr.irisa.triskell.sintaks.SintaksPlugin;

/**
 * Option settings for Java_Cup compiler.
 * 
 * @author michel Hassenforder
 * 
 */
public class Preferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public Preferences() {
		super(FieldEditorPreferencePage.GRID);
		setPreferenceStore(SintaksPlugin.getDefault().getPreferenceStore());
        setDescription(SintaksPlugin.getResourceString("Preferences.description"));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	protected void createFieldEditors() {
	    addField(new BooleanFieldEditor(
	    		OptionManager.DEBUG_PROCESS,
	    		SintaksPlugin.getResourceString(OptionManager.DEBUG_PROCESS),
	            getFieldEditorParent())
	    	);
	    addField(new BooleanFieldEditor(
	    		OptionManager.DEBUG_PARSER,
	    		SintaksPlugin.getResourceString(OptionManager.DEBUG_PARSER),
	            getFieldEditorParent())
	    	);
	    addField(new BooleanFieldEditor(
	    		OptionManager.DEBUG_PRINTER,
	    		SintaksPlugin.getResourceString(OptionManager.DEBUG_PRINTER),
	            getFieldEditorParent())
	    	);
	    addField(new BooleanFieldEditor(
	    		OptionManager.DEBUG_MODEL,
	    		SintaksPlugin.getResourceString(OptionManager.DEBUG_MODEL),
	            getFieldEditorParent())
	    	);
	    addField(new StringFieldEditor(
	    		OptionManager.DEBUG_OUTPUT_FILE,
	    		SintaksPlugin.getResourceString(OptionManager.DEBUG_OUTPUT_FILE),
	            getFieldEditorParent())
	    	);
    }

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench aWorkbench) {
	}

    /* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	public boolean performOk() {
        boolean value = super.performOk();
        SintaksPlugin.getDefault().savePluginPreferences();
        return value;
    }
}
