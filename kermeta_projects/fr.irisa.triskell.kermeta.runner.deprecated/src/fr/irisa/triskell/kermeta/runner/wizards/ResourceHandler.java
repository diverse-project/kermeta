/* $Id: ResourceHandler.java,v 1.1 2005-05-30 10:08:43 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : ResourceHandler.java
 * License : GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : May 30, 2005
 * Authors : zdrey
 */
package fr.irisa.triskell.kermeta.runner.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.misc.ResourceAndContainerGroup;

/**
 * This class proposes a set of methods that help the validation of the creation,
 * modification, refactoring, of a resource. It takes a set of methods initialy defined
 * in the IBM eclipse available class called ResourceAndContainerGroup (used by the 
 * file creation wizard page WizardNewFileCreationPage)
 */
public class ResourceHandler {

    //  problem indicator
	private String problemMessage = "";//$NON-NLS-1$
	private int problemType = ResourceAndContainerGroup.PROBLEM_NONE;

	// resource type (file, folder, project)
	private String resourceType = IDEWorkbenchMessages.getString("ResourceGroup.resource"); //$NON-NLS-1$

    
    /**
     * Constructor
     */
    public ResourceHandler() {
        super();
    }
    
    /**
     * Validates the values for each of the group's controls.  If an invalid
     * value is found then a descriptive error message is stored for later
     * reference.  Returns a boolean indicating the validity of all of the
     * controls in the group.
     */
    protected boolean validateControls(Composite containerGroup, String resourceNameString, IPath containerPath) {
    	// don't attempt to validate controls until they have been created
    	if (containerGroup == null) {
    		return false;
    	}
    	problemType = ResourceAndContainerGroup.PROBLEM_NONE;
    	problemMessage = "";//$NON-NLS-1$

    	if (!validateContainer(containerPath) || !validateResourceName(resourceNameString))
    		return false;

    	IPath path = containerPath.append(resourceNameString);
    	return validateFullResourcePath(path);
    }


    /**
     * Returns a <code>boolean</code> indicating whether a container name represents
     * a valid container resource in the workbench.  An error message is stored for
     * future reference if the name does not represent a valid container.
     *
     * @return <code>boolean</code> indicating validity of the container name
     */
    protected boolean validateContainer(IPath containerPath) {
    	if (containerPath == null) {
    		problemType = ResourceAndContainerGroup.PROBLEM_CONTAINER_EMPTY;
    		problemMessage = IDEWorkbenchMessages.getString("ResourceGroup.folderEmpty"); //$NON-NLS-1$
    		return false;
    	}
    	IWorkspace workspace = ResourcesPlugin.getWorkspace();
    	String projectName = containerPath.segment(0);
    	if (projectName == null || !workspace.getRoot().getProject(projectName).exists()) {
    		problemType = ResourceAndContainerGroup.PROBLEM_PROJECT_DOES_NOT_EXIST;
    		problemMessage = IDEWorkbenchMessages.getString("ResourceGroup.noProject"); //$NON-NLS-1$
    		return false;
    	}
    	return true;
    }
	
	/**
	 * 
	 * Returns a <code>boolean</code> indicating whether the specified resource
	 * path represents a valid new resource in the workbench.  An error message
	 * is stored for future reference if the path  does not represent a valid
	 * new resource path.
	 * Note : Picked from ResourceAndContainerGroup.java
	 * @param resourcePath the path to validate
	 * @return <code>boolean</code> indicating validity of the resource path
	 */
	protected boolean validateFullResourcePath(IPath resourcePath) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IStatus result = workspace.validatePath(resourcePath.toString(),IResource.FOLDER);
		if (!result.isOK()) {
			problemType = ResourceAndContainerGroup.PROBLEM_PATH_INVALID;
			problemMessage = result.getMessage();
			return false;
		}

		if (workspace.getRoot().getFolder(resourcePath).exists() || workspace.getRoot().getFile(resourcePath).exists()) {
			problemType = ResourceAndContainerGroup.PROBLEM_RESOURCE_EXIST;
			problemMessage = IDEWorkbenchMessages.getString("ResourceGroup.nameExists"); //$NON-NLS-1$
			return false;
		} 
		return true;
	}
	
	
	/**
	 * Returns a <code>boolean</code> indicating whether the resource name rep-
	 * resents a valid resource name in the workbench.  An error message is stored
	 * for future reference if the name does not represent a valid resource name.
	 *
	 * @return <code>boolean</code> indicating validity of the resource name
	 */
	protected boolean validateResourceName(String resourceName) {

	    if (resourceName.equals("")) {//$NON-NLS-1$
	        problemType = ResourceAndContainerGroup.PROBLEM_RESOURCE_EMPTY;
	        problemMessage = IDEWorkbenchMessages.format("ResourceGroup.emptyName", new Object[] {resourceType}); //$NON-NLS-1$
	        return false;
	    }
	    
	    if(!(new Path("")).isValidSegment(resourceName)){ //$NON-NLS-1$
			problemType = ResourceAndContainerGroup.PROBLEM_NAME_INVALID;
			problemMessage = IDEWorkbenchMessages.format("ResourceGroup.invalidFilename", new String[] {resourceName}); //$NON-NLS-1$
			return false;
		}
		
	    return true;
	}

}
