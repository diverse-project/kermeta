/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware
 * Technologies), Jacques Lescot (Anyware Technologies) - initial API and
 * implementation
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.topcased.modeler.di.model.GraphElement;

import fr.irisa.triskell.kermeta.graphicaleditor.KmRequestConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.InheritanceEdgeDeleteCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.InheritanceEditPart;

/**
 * The EditPolicy that handle the DeleteInheritanceLink policy in the Ecore
 * editor
 * 
 * Creation : 19 may 2006
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 */
public class InheritanceEdgeDeleteEditPolicy extends AbstractEditPolicy
{
    /**
     * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#getCommand(org.eclipse.gef.Request)
     */
    public Command getCommand(Request request)
    {
        if (KmRequestConstants.REQ_DELETE_INHERITANCE_EDGE.equals(request.getType()))
        {
            if (getHost() instanceof InheritanceEditPart)
            {
                Object obj = getHost().getModel();
                if (obj instanceof GraphElement)
                {
                    InheritanceEdgeDeleteCommand deleteCmd = new InheritanceEdgeDeleteCommand();
                    deleteCmd.setPartToBeDeleted(obj);
                    
                    return deleteCmd;
                }
            }
        }
        
        return null;
    }
    
    /**
     * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#understandsRequest(org.eclipse.gef.Request)
     */
    public boolean understandsRequest(Request req)
    {
        return KmRequestConstants.REQ_DELETE_INHERITANCE_EDGE.equals(req.getType());
    }
    
}
