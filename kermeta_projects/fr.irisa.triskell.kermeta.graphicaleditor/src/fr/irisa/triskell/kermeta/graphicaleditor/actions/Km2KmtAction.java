/* $Id: Km2KmtAction.java,v 1.2 2007-02-08 17:10:19 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ValidateAction.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 9, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 *    cfaucher <cfaucher@irisa.fr>
 * Contributors:
 *    Topcased <http://www.topcased.org> (see OpenParentDiagram.java :))	
 *    
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.graphicaleditor.KmActionConstants;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.tools.wizards.KmtPrinterWizard;

/**
 * Action that validates the constraints using ConstraintChecker
 * 
 * @see fr.irisa.triskell.kermeta.util.KermetaConstraintChecker
 */
public class Km2KmtAction extends WorkbenchPartAction {

	public Km2KmtAction(IWorkbenchPart part) {
		super(part);
	}

	/**
	 * Always return true
	 * 
	 * @return <code>true</code>
	 */
	protected boolean calculateEnabled() {
		return true;

	}

	/**
	 * Initializes the action
	 * 
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#init()
	 */
	protected void init() {
		setId(KmActionConstants.KM2KMT);
		setText(KmActionConstants.KM2KMT_TEXT);
	}

	/**
	 * @see org.eclipse.jface.action.IAction#run()
	 */
	public void run() {
		// Get the current diagram
		Diagram currentDiagram = this.getCurrentDiagram();
		// Get the root package in the current diagram.
		EObject modelObject = Utils.getElement(currentDiagram
				.getSemanticModel().getGraphElement());
		System.err.println("Active model ob : " + modelObject);
		// Get the model container
		System.err.println("Active model ob : " + this.getModelURI());

		// Please do not remove this comment -- it is a pense-bete
		// Display a warning/error dialog
		// KmPlugin.displayDialog("No parent Diagram", "There is no parent
		// diagram", IStatus.INFO);
		performAction();
	}

	/**
	 * 
	 * @return The URI (from emf) of the model that the diagram is linked to.
	 *         Returns an URI of the form
	 *         "platform:/resource/[projectpath/filename]"
	 */
	protected Diagram getCurrentDiagram() {
		return ((Modeler) getWorkbenchPart()).getActiveDiagram();
	}

	/**
	 * 
	 * @return The URI (from emf) of the model that the diagram is linked to.
	 *         Returns an URI of the form
	 *         "platform:/resource/[projectpath/filename]"
	 */
	protected URI getModelURI() {
		return ((Modeler) getWorkbenchPart()).getDiagrams().getModel()
				.eResource().getURI();
	}

	/**
	 * Perform the action! TODO : handle the case where underlying model is not
	 * stored yet (popup dialog with error)
	 */
	public void performAction() {
		Shell shell = new Shell();
		KMUnit kermeta_unit = (KMUnit) KermetaUnitFactory.getDefaultLoader()
				.createKermetaUnit(getModelURI().toString());

		Diagram currentDiagram = this.getCurrentDiagram();
		EObject modelObject = Utils.getElement(currentDiagram
				.getSemanticModel().getGraphElement());
		// Call the check constraint visitor on it!
		KmtPrinterWizard km2kmtWizard = new KmtPrinterWizard();

		IStructuredSelection currentSelection = createDummySelection();
		
		km2kmtWizard.init(PlatformUI.getWorkbench(), currentSelection);
		
		WizardDialog wizDialog = new org.eclipse.jface.wizard.WizardDialog(
				shell, km2kmtWizard);
		wizDialog.setTitle("PrettyPrint this km file into kmt file");
		wizDialog.open();

	}

	/**
	 * Create a dummy selection so that we can call easily the km2kmtWizard
	 * 
	 * @param unit_uri
	 * @return
	 */
	public IStructuredSelection createDummySelection() {
		IStructuredSelection selection = null;
		
		System.err.println("ModelURI : " + getModelURI());
		IFile file = ResourceHelper.getIFile(this.getModelURI().toString());
		System.err.println("file : " + file);
		if (file != null)
			selection = new StructuredSelection(file);
		System.err.println("file : " + file + "; selection : " + selection);
		return selection;
	}

}
