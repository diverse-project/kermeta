/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.modeler.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.openembedd.logo.csm.modeler.LogoCSMPlugin;
import org.topcased.modeler.preferences.ModelerPreferenceConstants;

/**
 * A preference page to configure all preferences of the LogoCSM editor.
 * 
 * @generated
 */
public class LogoCSMPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{
	/**
	 * @generated
	 */
	private IPreferenceStore	ps	= LogoCSMPlugin.getDefault().getPreferenceStore();

	/**
	 * @generated
	 */
	private BooleanFieldEditor	deleteGraphElements;

	/**
	 * @generated
	 */
	private BooleanFieldEditor	deleteModelElements;

	/**
	 * Creates this preference page contents.
	 * 
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	protected Control createContents(Composite parent)
	{
		// Create the container composite
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout containerLayout = new GridLayout();
		containerLayout.marginWidth = 0;
		containerLayout.marginHeight = 0;
		container.setLayout(containerLayout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		createHeader(container);

		createDeleteActionsGroup(container);

		loadPreferences();

		return container;
	}

	/**
	 * Initializes the HMI with preference values.
	 * 
	 * @generated
	 */
	private void loadPreferences()
	{
		deleteGraphElements.load();
		deleteModelElements.load();
	}

	/**
	 * Stores the HMI values into the preference store.
	 * 
	 * @generated
	 */
	private void storePreferences()
	{
		deleteGraphElements.store();
		deleteModelElements.store();
	}

	/**
	 * Initializes the HMI with default preference values.
	 * 
	 * @generated
	 */
	private void loadDefaultPreferences()
	{
		deleteGraphElements.loadDefault();
		deleteModelElements.loadDefault();
	}

	/**
	 * Creates this preference page header.
	 * 
	 * @param parent
	 *        the parent composite
	 * @generated
	 */
	private void createHeader(Composite parent)
	{
		new Label(parent, SWT.WRAP).setText("LogoCSM editor preference page");
	}

	/**
	 * Creates the group to configure the delete actions preferences.
	 * 
	 * @param parent
	 *        the parent composite
	 * @generated
	 */
	private void createDeleteActionsGroup(Composite parent)
	{
		Group group = new Group(parent, SWT.SHADOW_ETCHED_OUT);
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Delete actions");

		Composite fieldsContainer = new Composite(group, SWT.NONE);
		fieldsContainer.setLayout(new GridLayout());
		fieldsContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		deleteGraphElements = new BooleanFieldEditor(ModelerPreferenceConstants.DELETE_ACTION_CONFIRM,
			"Do not ask for confirmation before deleting graphical elements.", fieldsContainer);
		deleteGraphElements.setPreferenceStore(ps);

		deleteModelElements = new BooleanFieldEditor(ModelerPreferenceConstants.DELETE_MODEL_ACTION_CONFIRM,
			"Do not ask for confirmation before deleting model elements.", fieldsContainer);
		deleteModelElements.setPreferenceStore(ps);
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 * @generated
	 */
	public void init(IWorkbench workbench)
	{
	// Do nothing
	}

	/**
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 * @generated
	 */
	public boolean performOk()
	{
		storePreferences();
		return super.performOk();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 * @generated
	 */
	protected void performDefaults()
	{
		loadDefaultPreferences();
		super.performDefaults();
	}
}
