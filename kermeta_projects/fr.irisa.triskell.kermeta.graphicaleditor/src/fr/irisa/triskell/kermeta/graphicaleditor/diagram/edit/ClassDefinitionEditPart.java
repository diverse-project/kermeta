package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.ClassDefinitionRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.ClassDefinitionFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.ClassDefinitionLayoutEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.InheritanceEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.PropertyEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.extension.ExtendedInheritanceEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.extension.ExtendedPropertyEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * The ClassDefinition object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDefinitionEditPart extends NamedElementEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj the graph node
	 * @generated
	 */
	public ClassDefinitionEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * <!-- begin-user-doc -->
	 * Create the policies for editing a ClassDefinition
	 * Note : this class is not intended to evolve. Since we put small modifications
	 * (to adapt the edit policies on InheritanceEdge and PropertyEdge so that it
	 * can be only created once between a given source and a given target --> see
	 * isUnique property on the related ecore model elements "superTypes" and "ownedAttributes")
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		extendedCreateEditPolicies();
		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new ClassDefinitionRestoreConnectionCommand(
								getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ClassDefinitionLayoutEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/** 
	 * Extensions 
	 * Developer note : put this method call at the end of the generated createEditPolicy,
	 * if it was not already modified
	 * */
	protected void extendedCreateEditPolicies() {

		installEditPolicy(StructureEditPolicyConstants.PROPERTY_EDITPOLICY,
				new ExtendedPropertyEdgeCreationEditPolicy());

		installEditPolicy(StructureEditPolicyConstants.INHERITANCE_EDITPOLICY,
				new ExtendedInheritanceEdgeCreationEditPolicy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * NOT generated since we do not need to regenerate this method
	 * @generated NOT 
	 */
	protected IFigure createFigure() {
		return new ClassDefinitionFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultWidth()
	 * @generated
	 */
	protected int getDefaultWidth() {
		return 70;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultHeight()
	 * @generated
	 */
	protected int getDefaultHeight() {
		return 20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getMinimumWidth()
	 * @generated
	 */
	public int getMinimumWidth() {
		return 50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getMinimumHeight()
	 * @generated
	 */
	public int getMinimumHeight() {
		return 20;
	}

	// 
	// (not generated yet by topcased : manually copied from ecore generated editor)
	//
	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultBackgroundColor()
	 */
	protected Color getDefaultBackgroundColor() {
		return ColorRegistry.getInstance().get("241,235,215");
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultFont()
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getModelClassDefinition()
				.isIsAbstract());
	}

	public ClassDefinition getModelClassDefinition() {
		return (ClassDefinition) getEObject();
	}

	/**
	 * Update the ComposedLabel with the correct Suffix label (if necessary) and
	 * the right icon and font for the Main EditableLabel
	 * 
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#refreshHeaderLabel()
	 */
	protected void refreshHeaderLabel() {
		super.refreshHeaderLabel();
		ClassDefinitionFigure fig = (ClassDefinitionFigure) getFigure();
		ComposedLabel lbl = (ComposedLabel) fig.getLabel();
//		EditableLabel lbl = (EditableLabel) fig.getLabel();
		if (getModelClassDefinition().getName() != null)
			lbl.setMain(getModelClassDefinition().getName());

		//    ((Label) lbl.getMain()).setIcon(EcoreImageRegistry.getImage("ECLASS"));
		// Get the class container (it is always a Package -- until we have the Model notion :p)
		Package owningPackage = (Package) getModelClassDefinition()
				.eContainer();

		// check if the class is not included in the EPackage of the current diagram
		if (getModelClassDefinition().eContainer() != null
				&& getModelClassDefinition().eContainer() != Utils
						.getElement(((Diagram) getParent().getModel())
								.getSemanticModel().getGraphElement())) {
			if (owningPackage.getName() != null) {
				//lbl.setSuffix("<<from "+getModelEClass().getEPackage().getName()+">>");
				String qname = KMTHelper
						.getQualifiedName(getModelClassDefinition());
				if (getModelClassDefinition().getName() != null)
					qname = qname.substring(0, qname.lastIndexOf(getModelClassDefinition().getName()));
				lbl.setSuffix(qname);
			}
		} else {
			lbl.setSuffix("");
		}
	}

}