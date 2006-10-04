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

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.commands.ClassDefinitionRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.figures.ClassDefinitionFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.policies.ClassDefinitionLayoutEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.policies.InheritanceEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.policies.PropertyEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;

/**
 * The ClassDefinition object controller
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ClassDefinitionEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param obj the graph node
	 * @generated
	 */
	public ClassDefinitionEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(StructureEditPolicyConstants.INHERITANCE_EDITPOLICY,
				new InheritanceEdgeCreationEditPolicy());

		installEditPolicy(StructureEditPolicyConstants.PROPERTY_EDITPOLICY,
				new PropertyEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new ClassDefinitionRestoreConnectionCommand(
								getHost());
					}
				});

		ResizableEditPolicy resizableEditPolicy = new ResizableEditPolicy();
		resizableEditPolicy.setResizeDirections(PositionConstants.EAST_WEST);

		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ClassDefinitionLayoutEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new ClassDefinitionFigure();
	}

	/**
	 * @return the model object
	 * @generated NOT
	 */
	public ClassDefinition getClassDefinition() {
		return (ClassDefinition) getEObject();
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultFont()
	 * @generated NOT
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getClassDefinition()
				.isIsAbstract());
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

		ClassDefinitionFigure fig = (ClassDefinitionFigure) getFigure();
		ComposedLabel lbl = (ComposedLabel) fig.getLabel();

		if (getClassDefinition() != null
				&& getClassDefinition().getName() != null)
			lbl.setMain(getClassDefinition().getName());

		String imageLabel = "";
		if(getClassDefinition().isIsAbstract()){
			imageLabel = "CLASSDEFINITION_ABSTRACT";
		}
		else{
			imageLabel = "CLASSDEFINITION";
		}
		
		Label hoverLbl = new Label("");
		if( lbl.getText()==null || lbl.getText().equals("")){
			imageLabel = "ERROR";
			lbl.setText("name");
			hoverLbl.setText("The ClassDefinition name must be set");
			
		}
		//hoverLbl.setParent(lbl);
		lbl.setToolTip(hoverLbl);
		
		((EditableLabel) lbl.getMain()).setIcon(StructureImageRegistry
				.getImage(imageLabel));

		// check if the class is not included in the EPackage of the current
		// diagram
		if (getClassDefinition() != null
				&& getClassDefinition().eContainer() != null
				&& getClassDefinition().eContainer() instanceof Package) {
			Package owningPackage = (Package) getClassDefinition()
					.eContainer();

			if (owningPackage != null
					&& owningPackage != Utils
							.getElement(((GraphElement) getParent().getModel())
									.getSemanticModel().getGraphElement())) {
				if (owningPackage.getName() != null) {
					lbl.setSuffix("<<from " + owningPackage.getName() + ">>");
				}
				//String qname = KMTHelper.getQualifiedName(getModelClassDefinition());
				/*if (getModelClassDefinition().getName() != null)
				 qname = qname.substring(0,
				 qname.lastIndexOf(getModelClassDefinition()
				 .getName()) - 2);
				 lbl.setSuffix(qname);*/
			} else {
				lbl.setSuffix("");
			}
			lbl.getSuffix().setForegroundColor(ColorConstants.gray);
		}
	}
	
	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultBackgroundColor()
	 * @generated NOT
	 */
	protected Color getDefaultBackgroundColor() {
		return ColorRegistry.getInstance().get("241,235,215");
	}

	@Override
	protected int getDefaultHeight() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	protected int getDefaultWidth() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	

}