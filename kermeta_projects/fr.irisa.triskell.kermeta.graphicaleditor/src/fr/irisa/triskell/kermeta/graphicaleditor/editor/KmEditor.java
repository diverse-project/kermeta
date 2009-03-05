/*******************************************************************************
 * $Id: KmEditor.java,v 1.9.2.1 2008-10-22 12:04:23 vmahe Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.topcased.modeler.commands.GEFtoEMFCommandStackWrapper;
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
	protected List<AdapterFactory> getAdapterFactories() {
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
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
		return "fr.irisa.triskell.kermeta.graphicaleditor.editor.KmEditor";
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IDocPage.class) {
			GEFtoEMFCommandStackWrapper wrapper = new
			GEFtoEMFCommandStackWrapper(getCommandStack());
			            return new EAnnotationDocPage(wrapper);
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
