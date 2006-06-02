/* $Id: UniqueEListLayoutEditPolicy.java,v 1.3 2006-06-02 09:02:50 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : UniqueEListLayoutEditPolicy.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 11, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.CreateRequest;
import org.topcased.modeler.commands.CreateGraphNodeCommand;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.EListLayoutEditPolicy;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.ExtendedCreateGraphNodeCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.UniqueEListEditPart;

/**
 * This class simply extends the topcased EListLayoutEditPolicy to disallow duplicate
 * operations and properties graphnodes. Secondarily, it modifies the initial getCreateCommand
 * method so that the new initial name associated to the GraphNodes (entities of the EList linked
 * to this edit policy) is no more "Property1" or "Operation1" but the lowercase equivalences (just
 * to keep conform to our code conventions..)
 */
public class UniqueEListLayoutEditPolicy extends EListLayoutEditPolicy {
	
	public UniqueEListLayoutEditPolicy(EStructuralFeature arg0) {
		super(arg0);
	}
	
    /**
     * Check if the current EObject is a valid child for the parent EObject.
     * 
     * @param child the child EObject
     * @param parent the parent EObject
     * @return true if the child can be added
     */
    protected boolean isValid(EObject child, EObject parent)
    {
    	boolean  isValid = false;
        if (super.isValid(child, parent))
        {
        	 // get the EditPart associated with the parent object
            EditPart editPart = getHost();
            
            // get the GraphNodes associated in the diagram model
            GraphNode parentGraphNode = (GraphNode) editPart.getModel();
            // does a graphnode already exists for our child?
            GraphElement existingElement = Utils.getGraphElement(parentGraphNode,
					child, true);
			if (existingElement != null)
				isValid = false;
			else isValid = true;
        }
        return isValid;
    }

    
    /**
     * We should redefine this method to adapt it to a customized Creation Command...
     * It is a bit laborious for just changing a name....
     * This method is a quite perfect copy of its overridden super method : use of our ExtendedCreateGraphNodeCommand
     * instead of the provided CreateGraphNodeCommand.
     * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
     */
    protected Command getCreateCommand(CreateRequest request)
    {
        // get the child object to create
        Object newObject = request.getNewObject();

        List referencesList = new ArrayList();
        // We *know* that the host is UniqueEListLayoutEditPart
        referencesList.add(((UniqueEListEditPart)getHost()).getEStructuralFeature());

        if (newObject instanceof GraphNode)
        {
            // get the EditPart associated with the parent object
            EditPart editPart = getHost();
            EditDomain domain = editPart.getViewer().getEditDomain();

            // get the GraphNodes associated in the diagram model
            GraphNode parentGraphNode = (GraphNode) editPart.getModel();
            GraphNode childGraphNode = (GraphNode) newObject;

            // get the EObjects of the model
            EObject parentEObject = Utils.getElement(parentGraphNode);
            EObject childEObject = Utils.getElement(childGraphNode);

            if (isValid(childEObject, parentEObject))
            {
                // create the command associated with these parameters
                return new ExtendedCreateGraphNodeCommand(domain, childGraphNode, parentGraphNode, new Point(),
                        new Dimension(), referencesList, true);
            }
        }
        else if (newObject instanceof List)
        {
            List objects = (List) request.getNewObject();

            if (objects.isEmpty())
            {
                return UnexecutableCommand.INSTANCE;
            }

            CompoundCommand command = new CompoundCommand("Drag from Outline");
            for (int i = 0; i < objects.size(); i++)
            {
                Object element = objects.get(i);
                if (element instanceof GraphNode)
                {
                    // get the EditPart associated with the parent object
                    EditPart editPart = getHost();
                    EditDomain domain = editPart.getViewer().getEditDomain();

                    // get the GraphNodes associated in the diagram model
                    GraphNode parentGraphNode = (GraphNode) editPart.getModel();
                    GraphNode childGraphNode = (GraphNode) element;

                    // get the EObjects of the model
                    EObject parentEObject = Utils.getElement(parentGraphNode);
                    EObject childEObject = Utils.getElement(childGraphNode);

                    if (isValid(childEObject, parentEObject))
                    {
                        // create the command associated with these parameters
                        command.add(new ExtendedCreateGraphNodeCommand(domain, childGraphNode, parentGraphNode, new Point(),
                                new Dimension(), referencesList, false));
                    }
                }
            }
            return command;
        }
        return UnexecutableCommand.INSTANCE;
    }




}
