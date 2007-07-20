/*******************************************************************************
 * $Id: KmEditor.java,v 1.7 2007-07-20 15:34:04 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;

import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;

/**
 * Generated Model editor
 *
 * @generated
 */
public class KmEditor extends Modeler {

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.provider.KmItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.graphicaleditor.providers.KmModelerProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.language.provider.LanguageItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.graphicaleditor.providers.LanguageModelerProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.language.behavior.provider.BehaviorItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.graphicaleditor.providers.BehaviorModelerProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.language.structure.provider.StructureItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.graphicaleditor.providers.StructureModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * Returns the Editor Id
	 *
	 * @return the String that identifies the Editor
	 * @generated
	 */
	public String getId() {
		return new String(
				"fr.irisa.triskell.kermeta.graphicaleditor.editor.KmEditor");
	}

	/**
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
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore() {
		return KmPlugin.getDefault().getPreferenceStore();
	}

}
