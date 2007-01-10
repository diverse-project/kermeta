/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package fr.irisa.triskell.kermeta.tools.wizards.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Provides content for a tree viewer that shows only containers if attribute 
 * "showOnlyContainers" is set to true. Show only files containing the
 */
public class CustomContentProvider implements ITreeContentProvider {
    private boolean showClosedProjects = true;
    private boolean showOnlyContainers = true;
    private String  showOnlyFileTypesString = "";
    /**
     * Creates a new ContainerContentProvider.
     */
    public CustomContentProvider() {
    }

    /**
     * The visual part that is using this content provider is about
     * to be disposed. Deallocate all allocated SWT resources.
     */
    public void dispose() {
    }

    /*
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
     */
    public Object[] getChildren(Object element) {
        if (element instanceof IWorkspace) {
            // check if closed projects should be shown
            IProject[] allProjects = ((IWorkspace) element).getRoot()
                    .getProjects();
            if (showClosedProjects)
                return allProjects;

            ArrayList <IProject> accessibleProjects = new ArrayList <IProject> ();
            for (int i = 0; i < allProjects.length; i++) {
                if (allProjects[i].isOpen()) {
                    accessibleProjects.add(allProjects[i]);
                }
            }
            return accessibleProjects.toArray();
        } else if (element instanceof IContainer) {
            IContainer container = (IContainer) element;
            if (container.isAccessible()) {
                try {
                    List <IResource> children = new ArrayList <IResource> ();
                    IResource[] members = container.members();
                    for (int i = 0; i < members.length; i++) {
                    	// Here, show files if showOnlyContainers is set to FALSE
                    	if (showOnlyContainers==true)
                    	{
                    		if (members[i].getType() != IResource.FILE) {
                    			children.add(members[i]);}
                    	}
                    	else
                    	{
                    		if ((showOnlyFileTypesString.length()==0 || members[i].getName().endsWith(showOnlyFileTypesString))
                    				|| members[i].getType() != IResource.FILE)
                    			children.add(members[i]);
                    	}
                    }
                    return children.toArray();
                } catch (CoreException e) {
                    // this should never happen because we call #isAccessible before invoking #members
                }
            }
        }
        return new Object[0];
    }

    /*
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
     */
    public Object[] getElements(Object element) {
        return getChildren(element);
    }

    /*
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
     */
    public Object getParent(Object element) {
        if (element instanceof IResource)
            return ((IResource) element).getParent();
        return null;
    }

    /*
     * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
     */
    public boolean hasChildren(Object element) {
        return getChildren(element).length > 0;
    }

    /*
     * @see org.eclipse.jface.viewers.IContentProvider#inputChanged
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

    /**
     * Specify whether or not to show closed projects in the tree 
     * viewer.  Default is to show closed projects.
     * 
     * @param show boolean if false, do not show closed projects in the tree
     */
    public void showClosedProjects(boolean show) {
        showClosedProjects = show;
    }

    /**
     * Specify whether or not to show only container or also files in the tree 
     * viewer.  Default is to show closed projects.
     * 
     * @param show boolean if false, do not show closed projects in the tree
     */
    public void showOnlyContainers(boolean show) {
        showOnlyContainers = show;
    }

	/**
	 * @param ext the file extension to filter
	 */
	public void showOnlyFileTypesString(String ext) {
		this.showOnlyFileTypesString = ext==null?"":ext;
	}
    
    
}
