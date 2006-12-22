/*******************************************************************************
 * $Id: FsmDiagramsPage.java,v 1.4 2006-12-22 10:38:52 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.wizards;

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
public class FsmDiagramsPage extends DiagramsPage {
	/**
	 * @param pageName
	 * @param selection
	 * @generated
	 */
	public FsmDiagramsPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection, true);
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getEditorID()
	 * @generated
	 */
	public String getEditorID() {
		return "fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.editor.FsmEditor";
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getFileExtension()
	 * @generated
	 */
	public String getFileExtension() {
		return "fsm";
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getAdapterFactory()
	 * @generated
	 */
	public ComposedAdapterFactory getAdapterFactory() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.samples.fsm.provider.FsmItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());

		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getDefaultTemplateId()
	 * @return String
	 * @generated
	 */
	public String getDefaultTemplateId() {
		// ID of the default template
		return "fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.templates.diagram";

	}

}
