/*$Id$
* Project : org.kermeta.utils.provisionner.eclipse
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.provisionner.eclipse.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.kermeta.utilities.eclipse.jface.preference.HelpfulTextFieldEditor;
import org.kermeta.utils.provisionner.eclipse.Activator;
import org.kermeta.utils.provisionner.eclipse.Provisionner;

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

public class BundleProvisionnerPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public BundleProvisionnerPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Additional Eclipse platform provisionning system (Experimental): \n"+"" +
				"This adds bundles from external sources."	+
				"Note: in this experimental version, removed entries won't be unloaded dynamically, "+
				"a restart of Eclipse is required for that.");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		HelpfulTextFieldEditor headerFE = new HelpfulTextFieldEditor(PreferenceConstants.P_BUNDLE_URI_LIST, 
				"&Bundle URI List (one per line):\n", 
				getFieldEditorParent());		
		Font font = new Font(this.getShell().getDisplay(), "Courier", 8, SWT.NORMAL);;
		headerFE.getTextControl(getFieldEditorParent()).setFont(font);
		headerFE.setToolTipText("Add these bundles to your current Eclipse installation.\n");
		addField(headerFE);
		//addField(
		//	new StringFieldEditor(PreferenceConstants.P_BUNDLE_URI_LIST, "Bundle URI List:", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void performApply() {
		super.performApply();
		new Provisionner().provisionFromPreferences();
	}
	
}