package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.TagLinkEdgeCreationCommand;

/**
 * TagLink edge creation <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TagLinkEdgeCreationEditPolicy extends
		AbstractEdgeCreationEditPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphNode source) {
		return new TagLinkEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
			return (StructureEditPolicyConstants.TAGLINK_EDITPOLICY
					.equals(((SimpleSemanticModelElement) edge
							.getSemanticModel()).getTypeInfo()));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkSource(GraphNode source) {
		EObject object = Utils.getElement(source);
		if (object instanceof fr.irisa.triskell.kermeta.structure.FTag) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkTargetForSource(GraphNode source, GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.structure.FTag
				&& targetObject instanceof fr.irisa.triskell.kermeta.structure.FNamedElement) {
			if (!sourceObject.equals(targetObject)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof TagLinkEdgeCreationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphNode source,
			GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.structure.FTag
				&& targetObject instanceof fr.irisa.triskell.kermeta.structure.FNamedElement) {
			return new SourceTargetData(false, false, 0, null, null, null,
					null, null, null, null, null);
		}
		return null;
	}

}