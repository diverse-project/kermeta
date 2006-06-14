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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmEditorPlugin;

/**
 * Generated Model editor
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmEditorEditor extends Modeler {

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.samples.fsm.provider.FsmItemProviderAdapterFactory());

		factories
				.add(new fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.providers.FsmEditorModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * Returns the Editor Id (used by the minibus)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the String that identifies the Editor
	 * @generated
	 */
	public static String getId() {
		return new String(
				"fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.editor.FsmEditorEditor");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IDocPage.class) {
			return new EAnnotationDocPage(getCommandStack());
		}
		return super.getAdapter(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore() {
		return FsmEditorPlugin.getDefault().getPreferenceStore();
	}

}
