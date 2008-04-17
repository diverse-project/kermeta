/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Bjorn Freeman-Benson - initial API and implementation
 *******************************************************************************/
package org.kermeta.runner.launching;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.ISourcePathComputerDelegate;
import org.eclipse.debug.core.sourcelookup.containers.DirectorySourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.FolderSourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.WorkspaceSourceContainer;

/**
 * Computes the default source lookup path for a Kermeta launch configuration.
 * The default source lookup path is the folder or project containing 
 * the Kermeta program being launched. If the program is not specified, the workspace
 * is searched by default.
 */
public class KSourcePathComputerDelegate implements ISourcePathComputerDelegate {
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourcePathComputerDelegate#computeSourceContainers(org.eclipse.debug.core.ILaunchConfiguration, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public ISourceContainer[] computeSourceContainers(ILaunchConfiguration configuration, IProgressMonitor monitor) throws CoreException {
		String path = configuration.getAttribute(KConstants.KM_FILENAME, (String)null);
		ISourceContainer sourceContainer = null;
		DirectorySourceContainer frameworkContainer = null;
		
		if (path != null) {
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
			if (resource != null) {
				IProject container = resource.getProject();
				sourceContainer = new FolderSourceContainer(container, true);

				URL ioPluginURL = Platform.getBundle("fr.irisa.triskell.kermeta.framework").getEntry("/src/kermeta");
				try {
					URL resolvedURL = FileLocator.resolve(ioPluginURL);
					String ioPluginLocation = resolvedURL.toString().replace("file:", "");
					frameworkContainer = new DirectorySourceContainer( new Path(ioPluginLocation), true );
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				/*IContainer container = resource.getParent();
				if (container.getType() == IResource.PROJECT) {
					sourceContainer = new ProjectSourceContainer((IProject)container, false);
				} else if (container.getType() == IResource.FOLDER) {
					sourceContainer = new FolderSourceContainer(container, false);
				}*/
			}
		}
		if (sourceContainer == null) {
			sourceContainer = new WorkspaceSourceContainer();
		}
		return new ISourceContainer[]{sourceContainer, frameworkContainer};
	}
}
