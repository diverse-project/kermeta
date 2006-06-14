/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.preferences;

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
import org.topcased.modeler.preferences.ModelerPreferenceConstants;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmEditorPlugin;

/**
 * A preference page to configure all preferences of the FsmEditor editor.<br>
 *
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FsmEditorPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {
	private IPreferenceStore ps = FsmEditorPlugin.getDefault()
			.getPreferenceStore();

	private BooleanFieldEditor deleteGraphElements;

	private BooleanFieldEditor deleteModelElements;

	/**
	 * Creates this preference page contents.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param parent the parent composite
	 * @return the created Control element
	 * @generated
	 */
	protected Control createContents(Composite parent) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private void loadPreferences() {
		deleteGraphElements.load();
		deleteModelElements.load();
	}

	/**
	 * Stores the HMI values into the preference store.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private void storePreferences() {
		deleteGraphElements.store();
		deleteModelElements.store();
	}

	/**
	 * Initializes the HMI with default preference values.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private void loadDefaultPreferences() {
		deleteGraphElements.loadDefault();
		deleteModelElements.loadDefault();
	}

	/**
	 * Creates this preference page header.
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param parent the parent composite
	 * @generated
	 */
	private void createHeader(Composite parent) {
		new Label(parent, SWT.WRAP).setText("FsmEditor editor preference page");
	}

	/**
	 * Creates the group to configure the delete actions preferences.
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param parent the parent composite
	 * @generated
	 */
	private void createDeleteActionsGroup(Composite parent) {
		Group group = new Group(parent, SWT.SHADOW_ETCHED_OUT);
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Delete actions");

		Composite fieldsContainer = new Composite(group, SWT.NONE);
		fieldsContainer.setLayout(new GridLayout());
		fieldsContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		deleteGraphElements = new BooleanFieldEditor(
				ModelerPreferenceConstants.DELETE_ACTION_CONFIRM,
				"Do not ask for confirmation before deleting graphical elements.",
				fieldsContainer);
		deleteGraphElements.setPreferenceStore(ps);

		deleteModelElements = new BooleanFieldEditor(
				ModelerPreferenceConstants.DELETE_MODEL_ACTION_CONFIRM,
				"Do not ask for confirmation before deleting model elements.",
				fieldsContainer);
		deleteModelElements.setPreferenceStore(ps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void init(IWorkbench workbench) {
		// Do nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 * @generated
	 */
	public boolean performOk() {
		storePreferences();
		return super.performOk();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 * @generated
	 */
	protected void performDefaults() {
		loadDefaultPreferences();
		super.performDefaults();
	}
}
