/*******************************************************************************
 * $Id: KmDiagramsPage.java,v 1.3 2007-07-23 09:21:25 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.topcased.modeler.wizards.DiagramsPage;

/**
 * @generated
 */
public class KmDiagramsPage extends DiagramsPage {
	/**
	 * @param pageName
	 * @param selection
	 * @generated
	 */
	public KmDiagramsPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection, true);
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getEditorID()
	 * @generated
	 */
	public String getEditorID() {
		return "fr.irisa.triskell.kermeta.graphicaleditor.editor.KmEditor";
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getFileExtension()
	 * @generated
	 */
	public String getFileExtension() {
		return "km";
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getAdapterFactory()
	 * @generated
	 */
	public ComposedAdapterFactory getAdapterFactory() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.provider.KmItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.language.provider.LanguageItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.language.behavior.provider.BehaviorItemProviderAdapterFactory());
		factories
				.add(new fr.irisa.triskell.kermeta.language.structure.provider.StructureItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());

		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getDefaultTemplateId()
	 * @return String
	 * @generated NOT
	 * setted the id of templates
	 */
	public String getDefaultTemplateId() {
		// TODO return the corresponding ID of the default template
		return "fr.irisa.triskell.kermeta.graphicaleditor.templates.cd";

	}

}
