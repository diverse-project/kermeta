/*******************************************************************************
 * $Id: PropertyNodeEditPart.java,v 1.6 2008-09-26 14:11:07 dvojtise Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.window.Window;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.exceptions.BoundsFormatException;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.PropertyNodeRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.PropertyNodeUpdateCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.dialogs.PropertyEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.PropertyNodeFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;

/**
 * The PropertyNode object controller
 *
 * @generated
 */
public class PropertyNodeEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated NOT
	 */
	public PropertyNodeEditPart(GraphNode obj) {
		super(obj);
		multiplicityInitialization();
		typeInitialization();
	}

	/**
	 * Initialize the multiplicities and mainly the upper_bound to 1
	 * 
	 * @generated NOT
	 */
	private void multiplicityInitialization() {
		if (getProperty().getUpper() == 0) {
			getProperty().setUpper(1);
		}
	}

	/**
	 * Initialize the type
	 * 
	 * @generated NOT
	 */
	private void typeInitialization() {
		if (getProperty().getType() == null) {
			getProperty().setType(StructureFactory.eINSTANCE.createVoidType());
			KermetaUtils.getDefault().getTypeFixer().accept(getProperty());
		}
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new PropertyNodeRestoreConnectionCommand(
								getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new PropertyNodeFigure();
	}

	/**
	 * Update the ComposedLabel with the correct Suffix label (if necessary) and
	 * the right icon and font for the Main EditableLabel
	 * 
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#refreshHeaderLabel()
	 * @generated NOT
	 */
	protected void refreshHeaderLabel() {
		super.refreshHeaderLabel();

		PropertyNodeFigure fig = (PropertyNodeFigure) getFigure();
		EditableLabel lbl = (EditableLabel) fig.getLabel();

		//  DVK temporarily disabled in 1.2.0 
		// lbl.setAlignment(PositionConstants.LEFT);

		// Setting of the icon fornt of the property label
		if (getProperty().isIsComposite()) {
			lbl.setIcon(KmImageRegistry.getImage("PROPERTY_CONTAINED"));
		} else {
			lbl.setIcon(KmImageRegistry.getImage("PROPERTYNODE"));
		}

		updateLabel(lbl);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PropertyEditPartCommonInterface#performRequest(org.eclipse.gef.Request)
	 * @generated NOT
	 */
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			PropertyEditDialog propertyDlg = new PropertyEditDialog(
					getProperty(), KmPlugin.getActiveWorkbenchShell());
			int isOk = propertyDlg.open();
			if (isOk == Window.OK) {
				PropertyNodeUpdateCommand command = new PropertyNodeUpdateCommand(
						getProperty(), propertyDlg.getData());
				getViewer().getEditDomain().getCommandStack().execute(command);
			}
		} else {
			super.performRequest(request);
		}
	}

	/**
	 * Thanks to topcased source code
	 * 
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#performRequest(Request)
	 * @generated NOT
	 */
	protected void updateLabel(EditableLabel label) {
		String text = "";

		// Add the prefix '/' for marking the derived property
		if (getProperty().getName() != null
				&& !"".equals(getProperty().getName())) {
			if (getProperty().isIsDerived()) {
				text = "/" + text;
			}
			text += getProperty().getName();
		} else {
			text = "null";
		}

		// The property type
		if (getProperty().getType() != null) {
			text += " : " + TypeHelper.getLabelForType(getProperty().getType());
		}

		// The multiplicity
		String mult = "";
		try {
			mult = createCountString(getProperty());
			// label.setIcon(null); Don't uncommment
		} catch (BoundsFormatException e) {
			Label hoverLbl = new Label(e.getMessage());
			mult = ("error mult");
			label.setToolTip(hoverLbl);
			//label.setIcon(StructureImageRegistry.getImage("ERROR"));

			IStatus status = new Status(IStatus.ERROR, KmPlugin.getDefault()
					.getBundle().getSymbolicName(), IStatus.ERROR, e
					.getMessage(), null);
			ResourcesPlugin.getPlugin().getLog().log(status);
		}

		text += "[" + mult + "]";

		label.setText(text);
	}

	/**
	 * Calculate the String corresponding to the bounds
	 * 
	 * @param ref
	 *            the EReference object
	 * @return the String to display at the endPoint of the connection
	 * @throws BoundsFormatException
	 * @generated NOT
	 */
	private String createCountString(Property ref) throws BoundsFormatException {
		int lower = ref.getLower();
		int upper = ref.getUpper();

		if (lower < 0)
			throw new BoundsFormatException("LowerBound must be [0..*]");
		if (upper < -1)
			throw new BoundsFormatException("UpperBound must be [-1..*]");
		if (upper != -1 && lower > upper)
			throw new BoundsFormatException(
					"UpperBound must be higher than LowerBound");
		if (upper != -1 && upper <= 0)
			throw new BoundsFormatException(
					"UpperBound must be at least equal to 1");

		if (lower == upper)
			return "" + lower;
		return lower + ".." + (upper == -1 ? "*" : "" + upper);
	}

	/**
	 * Get the EReference model object
	 * 
	 * @return the model object
	 * @generated NOT
	 */
	protected Property getProperty() {
		return (Property) Utils.getElement(getGraphNode());
	}
}