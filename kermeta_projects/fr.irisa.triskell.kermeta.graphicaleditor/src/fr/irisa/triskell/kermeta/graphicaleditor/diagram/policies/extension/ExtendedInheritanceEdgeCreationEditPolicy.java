/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : extendedInheritanceEdgeCreationEditPolicy.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 3, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.extension;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.InheritanceEdgeCreationCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.InheritanceEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * What to do with this class :
 * Instead of instanciating InheritanceEdgeCreationEditPolicy in ClassDefinitionEditPart, 
 * instanciate this one.
 * @author zdrey
 *
 */
public class ExtendedInheritanceEdgeCreationEditPolicy extends
		InheritanceEdgeCreationEditPolicy {
	
	/** The source of the edge that the user intends to create. */
	EObject sourceObject;

	public ExtendedInheritanceEdgeCreationEditPolicy() {
		super();
	}
	

	protected boolean checkTargetForSource(GraphNode source, GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			if (checkSuperTypeConstraints(sourceObject, targetObject)==false)
				return false;
			if (!sourceObject.equals(targetObject)
			) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Constraint : Inheritance relation between two classes must be Unique :
	 * a class can only inherit once from another.
	 * This constraint is defined in "fSuperType" property, as "isUnique=true" on it
	 * (in textual checking : see KMT2KMPass3 in fr.irisa.triskell.kermeta.io project.)
	 * 
	 * TODO This constraint should be generalizable to other properties. But yet it is very
	 * specific to SuperType
	 * @param sourceObject the inheriting classdefinition
	 * @param targetObject the inherited classdefinition
	 * @return true if targetObject is not yet a supertype of sourceObject, false otherwise. In particular, a "attribute"(reference,
	 * or property...) must be uniquely represented in the ownedAttributes properties of a class.
	 */
	protected boolean checkSuperTypeConstraints(EObject sourceObject, EObject targetObject)
	{
		Boolean isvalid = true;
		// we know here that we handle ClassDefinitions, so hard cast
		ClassDefinition src_cdef = (ClassDefinition)sourceObject;
		ClassDefinition tgt_cdef = (ClassDefinition)targetObject;
		// is the inheritance relation unique? 
		if (StructurePackage.eINSTANCE.getClassDefinition_SuperType().isUnique())
		{
			if (KermetaUtils.getDefault().isContainedSuperTypeInClassDefinition(src_cdef, tgt_cdef))
				isvalid = false;
		}
		return isvalid;
	}
	
	/**
	 * Return the command associated with the target element
	 * 
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCompleteCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		// check if the command created from the source node is an command to create an EReference
		if (request.getStartCommand() instanceof InheritanceEdgeCreationCommand) 
		{
			// get the targetNode of the connection
			GraphNode targetNode = (GraphNode) getHost().getModel();
			EObject targetObject = Utils.getElement(targetNode);
			// check if the target EObject is an EModelElement, &&
			// if the super type does not already exist between from source to target.
			if (targetObject instanceof ClassDefinition) {
				InheritanceEdgeCreationCommand command = (InheritanceEdgeCreationCommand) request
						.getStartCommand();
				if (command != null)
					// set the target node
					if (checkSuperTypeConstraints(Utils.getElement(command.getSource()), targetObject)==true)
						command.setTarget(targetNode);
					else 
						command = null;
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
			if (request.getSourceEditPart()!=null) System.err.println("edit part-> " + request.getSourceEditPart().getModel());
			GraphEdge edge = (GraphEdge) newObject;
			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement
				&& 
				StructureEditPolicyConstants.INHERITANCE_EDITPOLICY
			.equals(((SimpleSemanticModelElement) edge
					.getSemanticModel()).getTypeInfo()))
			{
				// get the sourceNode of the connection
				GraphNode sourceNode = (GraphNode) getHost().getModel();
				if (Utils.getElement(sourceNode) instanceof ClassDefinition) {
					sourceObject = Utils.getElement(sourceNode);
					// create the command associated with these parameters
					InheritanceEdgeCreationCommand command = new InheritanceEdgeCreationCommand(
							getHost().getViewer().getEditDomain(), edge,
							sourceNode, true);
					request.setStartCommand(command);
					return command;
				}
				else
				{
					sourceObject = null;
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
