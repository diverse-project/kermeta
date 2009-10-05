/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.modeler.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.openembedd.logo.csm.modeler.LogoCSMPlugin;
import org.topcased.modeler.commands.GEFtoEMFCommandStackWrapper;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;

/**
 * Generated Model editor
 * 
 * @generated
 */
public class LogoCSMEditor extends Modeler
{

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * @generated
	 */
	protected List getAdapterFactories()
	{
		List factories = new ArrayList();
		factories.add(new org.openembedd.logo.csm.logoCSM.provider.LogoCSMItemProviderAdapterFactory());
		factories.add(new org.openembedd.logo.csm.modeler.providers.LogoCSMModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getId()
	 * @generated
	 */
	public String getId()
	{
		return "org.openembedd.logo.csm.modeler.editor.LogoCSMEditor";
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type)
	{
		if (type == IDocPage.class)
		{
			GEFtoEMFCommandStackWrapper wrapper = new GEFtoEMFCommandStackWrapper(getCommandStack());
			return new EAnnotationDocPage(wrapper);
		}
		return super.getAdapter(type);
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore()
	{
		return LogoCSMPlugin.getDefault().getPreferenceStore();
	}

}
