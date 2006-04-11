/* $Id: UniqueEListEditPart.java,v 1.1 2006-04-11 17:29:35 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : UniqueEListEditPart.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 11, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EListEditPart;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.UniqueEListLayoutEditPolicy;

/**
 * Micro-extension of EListEditPart so that we can display only once each element of an EList. 
 */
public class UniqueEListEditPart extends EListEditPart {

	public UniqueEListEditPart(GraphNode arg0, EStructuralFeature arg1) {
		super(arg0, arg1);
	}
	
	/**
     * Creates edit policies and associates these with roles 
     * @see org.topcased.modeler.edit.EListEditPart#createEditPolicies()
     */
    protected void createEditPolicies()
    {
        super.createEditPolicies();
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new UniqueEListLayoutEditPolicy(getEStructuralFeature()));
    }

}
