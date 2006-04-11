/* $Id: UniqueEListLayoutEditPolicy.java,v 1.1 2006-04-11 17:29:35 zdrey Exp $
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.CreateRequest;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.EListLayoutEditPolicy;
import org.topcased.modeler.utils.Utils;

/**
 * This class simply extends the topcased EListLayoutEditPolicy to disallow duplicate
 * operations and properties graphnodes.
 *
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
            EditDomain domain = editPart.getViewer().getEditDomain();

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



}
