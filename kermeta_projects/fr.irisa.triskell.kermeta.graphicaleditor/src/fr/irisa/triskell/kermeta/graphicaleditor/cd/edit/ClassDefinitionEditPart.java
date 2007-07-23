/*******************************************************************************
 * $Id: ClassDefinitionEditPart.java,v 1.5 2007-07-23 09:21:25 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.Font;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.ClassDefinitionRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.ClassDefinitionFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.ClassDefinitionLayoutEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.InheritanceEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.PropertyBiDirecEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.PropertyEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * The ClassDefinition object controller
 *
 * @generated
 */
public class ClassDefinitionEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public ClassDefinitionEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(KmEditPolicyConstants.INHERITANCE_EDITPOLICY,
				new InheritanceEdgeCreationEditPolicy());

		installEditPolicy(KmEditPolicyConstants.PROPERTY_EDITPOLICY,
				new PropertyEdgeCreationEditPolicy());

		installEditPolicy(KmEditPolicyConstants.PROPERTYBIDIREC_EDITPOLICY,
				new PropertyBiDirecEdgeCreationEditPolicy());

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
		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				resizableEditPolicy);

		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ClassDefinitionLayoutEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
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
		return EditPartUtils.changeFont(getClassDefinition().isIsAbstract());
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
				&& getClassDefinition().getName() != null) {
			ClassDefinition cd = getClassDefinition();
			String typeParameterString = "";
			if (!cd.getTypeParameter().isEmpty()) {
				typeParameterString = "<";
				Iterator it = cd.getTypeParameter().iterator();
				while (it.hasNext()) {
					typeParameterString += KermetaUtils.getDefault()
							.getLabelForType((Type) it.next());
					if (it.hasNext())
						typeParameterString += ", ";
				}
				typeParameterString += ">";
			}
			lbl.setMain(cd.getName() + typeParameterString);
		}
		String imageLabel = "";
		if (getClassDefinition().isIsAbstract()) {
			imageLabel = "CLASSDEFINITION_ABSTRACT";
		} else {
			imageLabel = "CLASSDEFINITION";
		}

		Label hoverLbl = new Label("");
		if (lbl.getText() == null || lbl.getText().equals("")) {
			imageLabel = "ERROR";
			lbl.setText("name");
			hoverLbl.setText("The ClassDefinition name must be set");

		}
		// hoverLbl.setParent(lbl);
		lbl.setToolTip(hoverLbl);

		((EditableLabel) lbl.getMain()).setIcon(KmImageRegistry
				.getImage(imageLabel));

		// check if the class is not included in the EPackage of the current
		// diagram
		if (getClassDefinition() != null
				&& getClassDefinition().eContainer() != null
				&& getClassDefinition().eContainer() instanceof Package) {
			Package owningPackage = (Package) getClassDefinition().eContainer();

			if (owningPackage != null
					&& owningPackage != Utils
							.getElement(((GraphElement) getParent().getModel())
									.getSemanticModel().getGraphElement())) {
				if (owningPackage.getName() != null) {
					lbl.setSuffix("from "
							+ NamedElementHelper
									.getMangledQualifiedName(owningPackage));
				}

			} else {
				lbl.setSuffix("");
			}
			lbl.getSuffix().setForegroundColor(ColorConstants.gray);
		}
	}
}