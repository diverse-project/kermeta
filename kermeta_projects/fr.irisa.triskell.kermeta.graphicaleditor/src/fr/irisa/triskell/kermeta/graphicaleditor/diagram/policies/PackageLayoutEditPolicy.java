package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy;
import org.topcased.modeler.utils.Utils;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageLayoutEditPolicy extends ModelerLayoutEditPolicy {
	/**
	 * Default contructor. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageLayoutEditPolicy() {
		super();
	}

	/**
	 * Extension of ModelerLayoutEditPolicy
	 * Returns the command for the GraphElement creation
	 * This is an almost exact copy of ModelerLayoutEditPolicy#getCreateCommand
	 * @param parent The container
	 * @param child The child to add
	 * @param loc The position
	 * @param dim The selected area
	 * @param pos Specify eventually the attachment of the GraphNode
	 * @param needModelUpdate <code>true</code> if the model must be updated
	 *        with this children, <code>false</code> if we only went to add
	 *        its graphical representation.
	 * @return The command
	 * *@see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#getCreateCommand(org.topcased.modeler.di.model.GraphNode, org.topcased.modeler.di.model.GraphNode, org.eclipse.draw2d.geometry.Point, org.eclipse.draw2d.geometry.Dimension, int, boolean)
	 */
	protected Command getCreateCommand(GraphNode parent, GraphNode child,
			Point loc, Dimension dim, int pos, boolean needModelUpdate) {

		if (parent != null && child != null) {
			EditDomain domain = getHost().getViewer().getEditDomain();

			// get the EObjects of the model
			EObject parentEObject = Utils.getElement(parent);
			EObject childEObject = Utils.getElement(child);

			// ----------------------------------
			// 1- Parent and Child cannot be null and must the child should be
			// contained by the parent (isValid checks that the two params are not null
			if (isValid(childEObject, parentEObject)) {

				// ----------------------------------
				// 2- Check if this object does not already belong to this
				// container
				GraphElement existingElement = Utils.getGraphElement(parent,
						childEObject);
				if (existingElement != null
						&& !isSeveralDisplayAllowed(parent, child,
								needModelUpdate)) {
					return UnexecutableCommand.INSTANCE;
				}
				// ----------------------------------

				// ----------------------------------
				// 3- Check if this object is external (only done if the model
				// is not modified)
				if (!needModelUpdate) {
					EObject existingContainer = childEObject.eContainer();
					if (!getParentContainerEObject(parent, child).equals(
							existingContainer)
							&& !isExternalObjectAllowed(parent, child)) {
						return UnexecutableCommand.INSTANCE;
					}
				}
				// ----------------------------------

				// Get the model object that should really contain the child (it
				// is not necessary the model object associated with the parent
				// GraphNode
				EObject containerEObject = getParentContainerEObject(parent,
						child);

				// ----------------------------------
				// 4- Check that a StructuralFeature can host this child
				// the List where we save the possible EStructuralFeatures
				List referencesList = new ArrayList();

				// we check all the EStructuralFeatures of type Containment
				// getEAllContainments
				for (Iterator i = containerEObject.eClass().getEAllReferences()
						.iterator(); i.hasNext();) {
					EReference eRef = (EReference) i.next();
					// Check if the Reference is of the expected type
					if (eRef.getEReferenceType().isInstance(childEObject)) {
						referencesList.add(eRef);
					}
				}
				if (!referencesList.isEmpty()) {
					// create the command associated with these parameters
					return getCreateCommand(domain, child, parent,
							containerEObject, loc, dim, pos, referencesList,
							needModelUpdate);
				}
			}
		}
		return UnexecutableCommand.INSTANCE;
	}

}