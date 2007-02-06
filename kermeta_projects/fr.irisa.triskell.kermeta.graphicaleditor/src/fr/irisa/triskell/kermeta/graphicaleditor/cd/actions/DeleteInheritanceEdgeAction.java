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
package fr.irisa.triskell.kermeta.graphicaleditor.cd.actions;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.kermeta.graphicaleditor.KmRequestConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.actions.utils.KmActionConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;

/**
 * Add an action to the contextual menu to allow the user to delete the
 * Inheritance Edge between two EClass model objects
 * 
 * Creation : 19 may 2006
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 */
public class DeleteInheritanceEdgeAction extends WorkbenchPartAction implements ISelectionChangedListener
{
    /**
     * The EditPart object
     */
    private AbstractEditPart template;
    
    /**
     * @param part
     */
    public DeleteInheritanceEdgeAction(IWorkbenchPart part)
    {
        super(part);
    }
    
    /**
     * Delete the Inheritance Edge and the reference in the EClass object
     * 
     * @see org.eclipse.jface.action.IAction#run()
     */
    public void run()
    {
        // construct the DeleteInheritanceEdgeRequest
        Request request = new Request(KmRequestConstants.REQ_DELETE_INHERITANCE_EDGE);
        Command actionCommand = template.getCommand(request);
        getCommandStack().execute(actionCommand);
    }
    
    /**
     * Determine if the action must appear in the context menu
     * 
     * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
     */
    protected boolean calculateEnabled()
    {
        if (template == null)
        {
            return false;
        }
        
        // construct the Request
        Request request = new Request(KmRequestConstants.REQ_DELETE_INHERITANCE_EDGE);
        
        // return true if the EditPart can understand the Request
        return template.understandsRequest(request);
    }
    
    /**
     * Initializes the action
     * 
     * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#init()
     */
    protected void init()
    {
        setId(KmActionConstants.DELETE_INHERITANCE_EDGE);
        setText("Delete inheritance edge");
        setImageDescriptor(KmImageRegistry.getImageDescriptor("PROPERTYEDGE"));
    }
    
    /**
     * Sets the selected EditPart and refreshes the enabled state of this
     * action.
     * 
     * @param event
     * 
     * @see ISelectionChangedListener#selectionChanged(SelectionChangedEvent)
     */
    public void selectionChanged(SelectionChangedEvent event)
    {
        ISelection s = event.getSelection();
        if (!(s instanceof IStructuredSelection))
            return;
        IStructuredSelection selection = (IStructuredSelection) s;
        template = null;
        
        if (selection != null && selection.size() == 1)
        {
            Object obj = selection.getFirstElement();
            if (obj instanceof AbstractEditPart)
            {
                template = ((AbstractEditPart) obj);
            }
        }
        
        refresh();
    }
    
}
