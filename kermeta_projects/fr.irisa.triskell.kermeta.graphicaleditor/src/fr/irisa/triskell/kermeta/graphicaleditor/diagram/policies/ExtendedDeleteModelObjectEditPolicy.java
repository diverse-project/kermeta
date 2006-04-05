/* $Id: ExtendedDeleteModelObjectEditPolicy.java,v 1.1 2006-04-05 18:58:53 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ExtendedDeleteModelObjectEditPolicy.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 3, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.topcased.modeler.ModelerRequestConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.diagrams.model.Diagrams;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.DeleteModelObjectEditPolicy;
import org.topcased.modeler.editor.MixedEditDomain;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.ExtendedDeleteModelCommand;

public class ExtendedDeleteModelObjectEditPolicy extends
		DeleteModelObjectEditPolicy implements EditPolicy {
	
    /**
     * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#getCommand(org.eclipse.gef.Request)
     */
    public Command getCommand(Request request)
    {

        if (ModelerRequestConstants.REQ_DELETE_MODEL_OBJECT.equals(request.getType()))
        {
            EObject model = null;
            if (getHost() instanceof EMFGraphNodeEditPart || getHost() instanceof EMFGraphEdgeEditPart)
            {
                GraphElement element = (GraphElement) getHost().getModel();
                model = Utils.getElement(element);
            }

            if (model != null)
            {

                if (getHost().getViewer().getEditDomain() instanceof MixedEditDomain)
                {
                    MixedEditDomain domain = ((MixedEditDomain) getHost().getViewer().getEditDomain());
                    System.err.println("Domain in getCommand of ExtendedDeleteModelObjectEditPolicy: " + domain);
                    Diagrams diagrams = ((Modeler) domain.getEditorPart()).getDiagrams();
                    if (domain != null && diagrams != null)
                    {
                        ExtendedDeleteModelCommand command = new ExtendedDeleteModelCommand(domain, diagrams, model);
                        return command;
                    }

                }
            }
        }
        return null;
    }

}
