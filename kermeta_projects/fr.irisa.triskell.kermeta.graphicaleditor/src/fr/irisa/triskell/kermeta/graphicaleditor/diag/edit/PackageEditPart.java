/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.graphicaleditor.diag.edit;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.commands.PackageRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.figures.PackageFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.policies.PackageLayoutEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Package;

/**
 * The Package object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj the graph node
	 * @generated
	 */
	public PackageEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
						+ getModelPackage().getNestingPackage().getName());
			}
		} else {
			lbl.setSuffix("");
		}
		lbl.getSuffix().setForegroundColor(ColorConstants.gray);
	}
	
}