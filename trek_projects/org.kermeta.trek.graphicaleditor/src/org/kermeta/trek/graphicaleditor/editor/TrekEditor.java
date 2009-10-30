/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.kermeta.trek.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.topcased.modeler.commands.GEFtoEMFCommandStackWrapper;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;
import org.kermeta.trek.graphicaleditor.TrekPlugin;

/**
 * Generated Model editor
 *
 * @generated
 */
public class TrekEditor extends Modeler {

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new org.kermeta.trek.provider.TrekItemProviderAdapterFactory());
		factories
				.add(new org.kermeta.trek.graphicaleditor.providers.TrekModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getId()
	 * @generated
	 */
	public String getId() {
		return "org.kermeta.trek.graphicaleditor.editor.TrekEditor";
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IDocPage.class) {
			GEFtoEMFCommandStackWrapper wrapper = new GEFtoEMFCommandStackWrapper(getCommandStack());
			return new EAnnotationDocPage(wrapper);
		}
		return super.getAdapter(type);		
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore() {
		return TrekPlugin.getDefault().getPreferenceStore();
	}

}
