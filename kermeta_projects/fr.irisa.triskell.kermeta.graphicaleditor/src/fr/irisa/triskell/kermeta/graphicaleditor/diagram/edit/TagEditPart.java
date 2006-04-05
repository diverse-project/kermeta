package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.TagRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.TagFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.ExtendedDeleteModelObjectEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.RemovableUncontainedElementEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.TagLinkEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Tag;

/**
 * The Tag object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TagEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj the graph node
	 * @generated
	 */
	public TagEditPart(GraphNode obj) {
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

		installEditPolicy(StructureEditPolicyConstants.TAGLINK_EDITPOLICY,
				new TagLinkEdgeCreationEditPolicy());
		
		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new TagRestoreConnectionCommand(getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(
				ModelerEditPolicyConstants.CHANGE_BACKGROUND_COLOR_EDITPOLICY,
				null);
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());

		// Special policy to remove elements with no container, namely, the Tags.
		//installEditPolicy(EditPolicy.COMPONENT_ROLE, new RemovableUncontainedElementEditPolicy());
        installEditPolicy(ModelerEditPolicyConstants.DELETE_MODEL_OBJECT_EDITPOLICY, new ExtendedDeleteModelObjectEditPolicy());

	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {
		return new TagFigure();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultBackgroundColor()
	 * @generated
	 */
	protected Color getDefaultBackgroundColor() {
		return ColorRegistry.getInstance().get("248,248,235");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultWidth()
	 * @generated
	 */
	protected int getDefaultWidth() {
		return 20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultHeight()
	 * @generated
	 */
	protected int getDefaultHeight() {
		return 10;
	}
	
	public Tag getTag() 
	{
		return (Tag) getEObject();
	}
	
	

}