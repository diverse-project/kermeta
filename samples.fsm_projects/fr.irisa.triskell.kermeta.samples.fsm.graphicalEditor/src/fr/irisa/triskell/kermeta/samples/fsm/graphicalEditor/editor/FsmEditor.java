/*******************************************************************************
 * $Id: FsmEditor.java,v 1.4 2007-07-11 16:13:15 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.topcased.modeler.commands.GEFtoEMFCommandStackWrapper;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmPlugin;

/**
 * Generated Model editor
 *
 * @generated
 */
public class FsmEditor extends Modeler {

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.samples.fsm.provider.FsmItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.providers.FsmModelerProviderAdapterFactory());

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
		return "fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.editor.FsmEditor";
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
		return FsmPlugin.getDefault().getPreferenceStore();
	}

}
