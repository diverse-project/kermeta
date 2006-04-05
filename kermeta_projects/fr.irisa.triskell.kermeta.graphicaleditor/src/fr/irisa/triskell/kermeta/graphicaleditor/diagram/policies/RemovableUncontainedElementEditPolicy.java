/* $Id: RemovableUncontainedElementEditPolicy.java,v 1.1 2006-04-05 18:58:53 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : RemovableUncontainedElementEditPolicy.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 3, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.topcased.modeler.commands.DeleteGraphElementCommand;
import org.topcased.modeler.di.model.GraphElement;

public class RemovableUncontainedElementEditPolicy extends ComponentEditPolicy {




    /**
     * @see org.eclipse.gef.editpolicies.ComponentEditPolicy#createDeleteCommand(org.eclipse.gef.requests.GroupRequest)
     */
    protected Command createDeleteCommand(GroupRequest deleteRequest)
    {
        Object model = getHost().getModel();
        if (model instanceof GraphElement)
        {
            return new DeleteGraphElementCommand((GraphElement) model, true);
        }

        return UnexecutableCommand.INSTANCE;
    }

}
