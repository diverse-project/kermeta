package fr.irisa.triskell.kermeta.graphicaleditor.actions;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.actions.RetargetAction;
import org.topcased.modeler.actions.ModelerActionBarContributor;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureActionConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;

/**
 * Generated Actions to be applied on the diagram(s) or on the underlying model(s)
 * <!-- begin-user-doc -->
 * Added a GUI-action to validate the model (check constraints) :
 * StructureValidateAction.
 * To add specific new actions that you want to appear in the tool bar, please
 * complete this class
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class StructureEditorActionBarContributor extends
		ModelerActionBarContributor {

	/**
	 * This method builds the graphical elements and associate the corresponding actions 
	 * in the toolbar related to the [Kermeta] diagram editor
	 * @see org.topcased.modeler.actions.ModelerActionBarContributor#buildActions()
	 */
	protected void buildActions() {
		super.buildActions();
		// Add an action for validation --> see super.buildAction
		RetargetAction action = new RetargetAction(
				StructureActionConstants.VALIDATE, "VALIDATE");
		action.setImageDescriptor(StructureImageRegistry
				.getImageDescriptor("VALIDATE"));
		action.setToolTipText(StructureActionConstants.VALIDATE_TEXT);
		addRetargetAction(action);

		// Now initialize this action
		action.setEnabled(true);

		// Add an action for conversion
		action = new RetargetAction(StructureActionConstants.KM2KMT, "KM2KMT");
		action.setImageDescriptor(StructureImageRegistry
				.getImageDescriptor("KM2KMT"));
		action.setToolTipText(StructureActionConstants.KM2KMT_TEXT);
		addRetargetAction(action);

		action.setEnabled(true);
	}

	/**
	 * @see org.topcased.modeler.actions.ModelerActionBarContributor#contributeToToolBar(org.eclipse.jface.action.IToolBarManager)
	 */
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
		// Validation actions
		toolBarManager.add(new Separator());
		toolBarManager.add(getAction(StructureActionConstants.VALIDATE));
		// Convert KM2KMT action
		toolBarManager.add(getAction(StructureActionConstants.KM2KMT));
	}

	/**
	 * Nothing added in this method
	 * @see org.topcased.modeler.actions.ModelerActionBarContributor#declareGlobalActionKeys()
	 */
	protected void declareGlobalActionKeys() {
		super.declareGlobalActionKeys();
	}

}