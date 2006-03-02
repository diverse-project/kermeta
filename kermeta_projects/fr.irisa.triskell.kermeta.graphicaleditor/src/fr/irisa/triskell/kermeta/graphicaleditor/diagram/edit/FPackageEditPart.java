package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.FPackageRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.FPackageFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.FPackageLayoutEditPolicy;

/**
 * The FPackage object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPackageEditPart extends FNamedElementEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj
	 * @generated
	 */
	public FPackageEditPart(GraphNode obj) {
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
						return new FPackageRestoreConnectionCommand(getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FPackageLayoutEditPolicy());
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

		return new FPackageFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultWidth()
	 * @generated
	 */
	protected int getDefaultWidth() {
		return 12;
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
		return 10;
	}
}