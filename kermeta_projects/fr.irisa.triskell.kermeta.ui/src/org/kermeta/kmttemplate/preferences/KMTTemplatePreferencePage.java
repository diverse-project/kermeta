/* $Id: KMTTemplatePreferencePage.java,v 1.3 2008-09-23 14:26:20 dvojtise Exp $
 * Project: Kermeta (First iteration)
 * File: KMTTemplatePreferencePage.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2008
 * Authors: dvojtise
 */
package org.kermeta.kmttemplate.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.kermeta.jface.preference.HelpfulTextFieldEditor;



import org.eclipse.swt.*;
import org.eclipse.swt.graphics.*;

import fr.irisa.triskell.kermeta.ui.KermetaUIPlugin;

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

public class KMTTemplatePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public KMTTemplatePreferencePage() {
		super(GRID);
		setPreferenceStore(KermetaUIPlugin.getDefault().getPreferenceStore());
		setDescription("Template preferences for new KMT files. \n   Available variables : ${date}, ${user}");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		HelpfulTextFieldEditor headerFE = new HelpfulTextFieldEditor(PreferenceConstants.P_KMT_HEADER_TEMPLATESTRING, "&Header template:", getFieldEditorParent());		
		Font font = new Font(this.getShell().getDisplay(), "Courier", 8, SWT.NORMAL);;
		headerFE.getTextControl(getFieldEditorParent()).setFont(font);
		headerFE.setToolTipText("This text will be added as a header of the newly created KMT files");
		addField(headerFE);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}