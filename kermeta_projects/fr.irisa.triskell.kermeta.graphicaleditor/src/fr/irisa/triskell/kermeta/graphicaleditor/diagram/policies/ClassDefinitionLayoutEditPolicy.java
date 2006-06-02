package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.ClassLayoutEditPolicy;
import org.topcased.modeler.utils.Utils;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDefinitionLayoutEditPolicy extends ClassLayoutEditPolicy {
	/**
	 * Default contructor. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinitionLayoutEditPolicy() {
		super();
	}

	protected EditPolicy createChildEditPolicy(EditPart child) {
		return super.createChildEditPolicy(child);
	}

	protected Command getMoveChildrenCommand(Request request) {
		// TODO Auto-generated method stub

		return super.getMoveChildrenCommand(request);
	}

	/**
	 * This method is implemented for ModelerLayoutEditPolicy, but not ClassLayoutEditPolicy, so we do it.
	 * @see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#isSeveralDisplayAllowed(org.topcased.modeler.di.model.GraphNode, org.topcased.modeler.di.model.GraphNode, boolean)
	 */
	protected boolean isSeveralDisplayAllowed(GraphNode parent,
			GraphNode child, boolean needModelUpdate) {
		return false;
	}

	/**
	 * Since holding many objects is allowed, let's check if one of the holden objects is allowed to be added?
	 * @param parent
	 * @param children
	 * @param needModelUpdate
	 * @return
	 */
	protected boolean isSeveralDisplayAllowed(GraphNode parent,
			ArrayList children, boolean needModelUpdate) {
		return false;
	}

	// This should be...soon deprecated!
	protected boolean isValid(GraphNode parent, ArrayList children) {
		EObject parentEObject = Utils.getElement(parent);
		Iterator it = children.iterator();
		while (it.hasNext())
		{
			Object child = it.next();
			GraphElement childGraphElt = null;
			EObject childEObject = null;
			if (child instanceof GraphElement) {
				childEObject = Utils.getElement((GraphElement) child);
				childGraphElt = (GraphElement) child;
			} else // We are sure that it is an EObject
			{
				childEObject = (EObject) child;
				childGraphElt = Utils.getGraphElement(parent, childEObject);
			}

			GraphElement existingElement = Utils.getGraphElement(parent,
					childEObject, true);
			if (existingElement != null
					&& !isSeveralDisplayAllowed(parent,
							(GraphNode) childGraphElt, true)) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see org.topcased.modeler.edit.policies.ClassLayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
	 */
	@Override
	protected Command getCreateCommand(CreateRequest arg0) {
		// TODO Auto-generated method stub
		return super.getCreateCommand(arg0);
	}

	
	
}