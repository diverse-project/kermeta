/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *    Jacques Lescot (Anyware Technologies) - initial API and implementation
 *******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.topcased.modeler.editor.ModelerContextMenuProvider;

import fr.irisa.triskell.kermeta.graphicaleditor.actions.utils.KmActionConstants;

/**
 * Provide a Context Menu for the Ecore Editor with customized actions
 * 
 * Creation : 19 may 2006
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 */
public class KmContextMenuProvider extends ModelerContextMenuProvider
{
    /**
     * Constructs a context menu for the specified EditPartViewer and the
     * Actions registered in the ActionRegistry
     * 
     * @param viewer the EditPartViewer
     * @param registry the ActionRegistry
     */
    public KmContextMenuProvider(EditPartViewer viewer, ActionRegistry registry)
    {
        super(viewer, registry);
    }
    
    /**
     * Called when the menu is about to show. Construct the context menu by
     * adding actions common to all editparts.
     * 
     * @see org.eclipse.gef.ContextMenuProvider#buildContextMenu(org.eclipse.jface.action.IMenuManager)
     */
    public void buildContextMenu(IMenuManager manager)
    {
        super.buildContextMenu(manager);
        
        IAction action;
        
        action = getActionRegistry().getAction(KmActionConstants.DELETE_INHERITANCE_EDGE);
        if (action.isEnabled())
            manager.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
    }
    
}
