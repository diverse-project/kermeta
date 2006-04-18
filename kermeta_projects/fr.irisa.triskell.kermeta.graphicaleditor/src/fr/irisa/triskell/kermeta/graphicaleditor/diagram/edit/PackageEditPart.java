package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.PackageRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.ClassDefinitionFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.PackageFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.PackageLayoutEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * The Package object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageEditPart extends NamedElementEditPart {
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

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultBackgroundColor()
	 */
	protected Color getDefaultBackgroundColor() {
		return ColorRegistry.getInstance().get("241,241,241");
	}
	
	protected Package getPackage() { return (Package) getEObject();}
	/**
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#refreshHeaderLabel()
	 */
	protected void refreshHeaderLabel() {
		super.refreshHeaderLabel();
		PackageFigure fig = (PackageFigure) getFigure();
		ComposedLabel lbl = (ComposedLabel) fig.getLabel();
//		EditableLabel lbl = (EditableLabel) fig.getLabel();
		if (getPackage().getName() != null)
			lbl.setMain(getPackage().getName());

		//    ((Label) lbl.getMain()).setIcon(EcoreImageRegistry.getImage("ECLASS"));
		// Get the class container (it is always a Package -- until we have the Model notion :p)
		Package owningPackage = (Package) getPackage()
				.eContainer();
		//System.out.println("Parent? : " +((Diagram) getParent()));
				//.getSemanticModel());
		// check if the class is not included in the EPackage of the current diagram
		if (getPackage().eContainer() != null
				&& getPackage().eContainer() != Utils
						.getElement(((Diagram) getParent().getModel())
								.getSemanticModel().getGraphElement())) {
			if (owningPackage.getName() != null) {
				//lbl.setSuffix("<<from "+getModelEClass().getEPackage().getName()+">>");
				String qname = KMTHelper
						.getQualifiedName(getPackage());
				if (getPackage().getName() != null)
					qname = qname.substring(0, qname.lastIndexOf(getPackage().getName())-2);
				lbl.setSuffix(qname);
			}
		} else {
			lbl.setSuffix("");
		}
		lbl.getSuffix().setForegroundColor(ColorConstants.gray);
	}

}