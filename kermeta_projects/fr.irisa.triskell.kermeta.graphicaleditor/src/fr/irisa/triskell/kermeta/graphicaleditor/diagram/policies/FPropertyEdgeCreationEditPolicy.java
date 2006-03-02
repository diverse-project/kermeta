package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.FPropertyEdgeCreationCommand;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * FProperty edge creation <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPropertyEdgeCreationEditPolicy extends
		AbstractEdgeCreationEditPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphNode source) {
		return new FPropertyEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		return Utils.getElement(edge) instanceof FProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkSource(GraphNode source) {
		EObject object = Utils.getElement(source);
		if (object instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition) {
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

		if (sourceObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof FPropertyEdgeCreationCommand;
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

		if (sourceObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition) {
			return new SourceTargetData(false, true, 1,
					"fr.irisa.triskell.kermeta.structure.FClassDefinition",
					"fOwnedAttributes", null, "fOwningClass",
					"fOwnedAttributes", null, null, null);
		}
		return null;
	}

}