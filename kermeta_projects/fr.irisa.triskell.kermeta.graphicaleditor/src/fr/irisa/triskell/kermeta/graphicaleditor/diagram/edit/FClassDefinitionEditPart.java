package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.FClassDefinitionRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.FClassDefinitionFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.FClassDefinitionLayoutEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.FPropertyEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;

/**
 * The FClassDefinition object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FClassDefinitionEditPart extends FNamedElementEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj
	 * @generated
	 */
	public FClassDefinitionEditPart(GraphNode obj) {
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

		installEditPolicy(StructureEditPolicyConstants.FPROPERTY_EDITPOLICY,
				new FPropertyEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new FClassDefinitionRestoreConnectionCommand(
								getHost());
					}
				});

		ResizableEditPolicy resizableEditPolicy = new ResizableEditPolicy();
		resizableEditPolicy.setResizeDirections(PositionConstants.EAST_WEST);
		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				resizableEditPolicy);

		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FClassDefinitionLayoutEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * NOT generated since we do not need to regenerate this method
	 * @generated NOT 
	 */
	protected IFigure createFigure() {
		return new FClassDefinitionFigure();
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
		return 10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getMinimumWidth()
	 * @generated
	 */
	public int getMinimumWidth() {
		return 10;
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
        return EditPartUtils.changeFont(getModelFClassDefinition().isFIsAbstract());
	}

	
    /**
     * <!-- begin-user-doc -->
     * (It was not generated actually...)
     * <!-- end-user-doc -->
     * 
     * @return the model object
     * @generated 
     */
    protected FClassDefinition getModelFClassDefinition()
    {
        return (FClassDefinition) getEObject();
    }
}