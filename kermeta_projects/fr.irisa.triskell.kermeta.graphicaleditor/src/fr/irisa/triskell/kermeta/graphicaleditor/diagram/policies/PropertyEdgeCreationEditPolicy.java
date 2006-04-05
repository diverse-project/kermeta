package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.topcased.modeler.commands.CreateGraphEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.NodeEditPolicy;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.PropertyEdgeCreationCommand;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * Property edge creation <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class PropertyEdgeCreationEditPolicy extends NodeEditPolicy {
	//AbstractEdgeCreationEditPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#createCommand(org.eclipse.gef.EditDomain, org.topcased.modeler.di.model.GraphEdge, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected CreateGraphEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphElement source) {
		return new PropertyEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		return Utils.getElement(edge) instanceof Property;
	}
 
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkSource(GraphElement source) {
		EObject object = Utils.getElement(source);
		if (object instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkTargetForSource(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkTargetForSource(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			if (sourceObject.equals(targetObject)) return false;
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkCommand(org.eclipse.gef.commands.Command)
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof PropertyEdgeCreationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#getSourceTargetData(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			return new SourceTargetData(
					false,
					true,
					1,
					"fr.irisa.triskell.kermeta.language.structure.ClassDefinition",
					"ownedAttribute", null, "owningClass", "ownedAttribute",
					null, null, null);
		}
		return null;
	}

	/*
	 * 
	 * Topcased 0.8.0
	 * 
	 */
	/**
	 * Return the command associated with the target element
	 * 
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCompleteCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		// check if the command created from the source node is an command to create an EReference
		if (request.getStartCommand() instanceof PropertyEdgeCreationCommand) {
			// get the targetNode of the connection
			GraphNode targetNode = (GraphNode) getHost().getModel();

			// check if the target EObject is an EModelElement
			if (Utils.getElement(targetNode) instanceof ClassDefinition) {
				PropertyEdgeCreationCommand command = (PropertyEdgeCreationCommand) request
						.getStartCommand();
				if (command != null)
					// set the target node
					command.setTarget(targetNode);

				return command;
			}
		}
		return null;
	}

	/**
	 * Changes the request with the source element of the command
	 * 
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCreateCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		Object newObject = request.getNewObject();
		if (newObject instanceof GraphEdge) {
			GraphEdge edge = (GraphEdge) newObject;
			if (Utils.getElement(edge) instanceof Property) {
				// get the sourceNode of the connection
				GraphNode sourceNode = (GraphNode) getHost().getModel();
				if (Utils.getElement(sourceNode) instanceof ClassDefinition) {
					// create the command associated with these parameters
					PropertyEdgeCreationCommand command = new PropertyEdgeCreationCommand(
							getHost().getViewer().getEditDomain(), edge,
							sourceNode, true);
					request.setStartCommand(command);
					return command;
				}
			}
		}
		return null;
	}

	/**
	 * not implemented
	 * 
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getReconnectSourceCommand(org.eclipse.gef.requests.ReconnectRequest)
	 */
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * not implemented
	 * 
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getReconnectTargetCommand(org.eclipse.gef.requests.ReconnectRequest)
	 */
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return UnexecutableCommand.INSTANCE;
	}
}