/*******************************************************************************
 * $Id: PackageEditPart.java,v 1.3 2007-07-11 14:50:46 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.PackageRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.PackageFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.PackageLayoutEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * The Package object controller
 *
 * @generated
 */
public class PackageEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public PackageEditPart(GraphNode obj) {
		super(obj);
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
						return new PackageRestoreConnectionCommand(getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.LAYOUT_ROLE, new PackageLayoutEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new PackageFigure();
	}

	/**
	 * Get the Package model object
	 * 
	 * @return the model object
	 * @generated NOT
	 */
	protected Package getModelPackage() {
		return (Package) Utils.getElement(getGraphNode());
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

		PackageFigure fig = (PackageFigure) getFigure();
		ComposedLabel lbl = (ComposedLabel) fig.getLabel();

		// check if the package is not included in the EPackage of the current
		// diagram
		if (getModelPackage().getNestingPackage() != null
				&& getModelPackage().getNestingPackage() != Utils
						.getElement(((GraphElement) getParent().getModel())
								.getSemanticModel().getGraphElement())) {
			if (getModelPackage().getNestingPackage().getName() != null) {
				lbl.setSuffix("from "
						+ NamedElementHelper
								.getMangledQualifiedName(getModelPackage()
										.getNestingPackage()));
			}
		} else {
			lbl.setSuffix("");
		}
		lbl.getSuffix().setForegroundColor(ColorConstants.gray);
		//editLbl.setLabelAlignment(PositionConstants.LEFT);
		//lbl.setIcon(StructureImageRegistry.getImage("PACKAGE"));
	}
}