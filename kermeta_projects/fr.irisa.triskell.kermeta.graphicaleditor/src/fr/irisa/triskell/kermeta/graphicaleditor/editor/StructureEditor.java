/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.editor.ModelerGraphicalViewer;

import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.actions.DeleteInheritanceEdgeAction;
import fr.irisa.triskell.kermeta.graphicaleditor.actions.utils.StructureActionConstants;



/**
 * Generated Model editor
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureEditor extends Modeler {

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.language.structure.provider.StructureItemProviderAdapterFactory());

		factories
				.add(new fr.irisa.triskell.kermeta.graphicaleditor.providers.StructureModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * Returns the Editor Id (used by the minibus)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the String that identifies the Editor
	 * @generated
	 */
	public static String getId() {
		return new String(
				"fr.irisa.triskell.kermeta.graphicaleditor.editor.StructureEditor");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IDocPage.class) {
			return new EAnnotationDocPage(getCommandStack());
		}
		return super.getAdapter(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore() {
		return StructurePlugin.getDefault().getPreferenceStore();
	}

	/**
     * @see org.topcased.modeler.editor.Modeler#getContextMenuProvider(org.topcased.modeler.editor.ModelerGraphicalViewer)
     * @generated NOT
     */
    protected ContextMenuProvider getContextMenuProvider(ModelerGraphicalViewer viewer)
    {
        return new StructureContextMenuProvider(viewer, getActionRegistry());
    }
    
    /**
     * @see org.topcased.modeler.editor.Modeler#configureGraphicalViewer()
     * @generated NOT
     */
    protected void configureGraphicalViewer()
    {
        super.configureGraphicalViewer();
        
        IAction deleteImplementLinkAction = getActionRegistry().getAction(StructureActionConstants.DELETE_INHERITANCE_EDGE);
        getGraphicalViewer().addSelectionChangedListener((ISelectionChangedListener) deleteImplementLinkAction);
    }
    
    /**
     * @see org.topcased.modeler.editor.Modeler#createActions()
     * @generated NOT
     */
    protected void createActions()
    {
        super.createActions();
        
        ActionRegistry registry = getActionRegistry();
        IAction action;
        
        action = new DeleteInheritanceEdgeAction(this);
        registry.registerAction(action);
        getSelectionActions().add(action.getId());
    }
}
