/*$Id: KSourcePathComputerDelegate.java,v 1.5 2008-06-24 11:43:27 ftanguy Exp $
* Project : org.kermeta.runner
* File : 	KSourcePathComputerDelegate.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

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
		Map<String, ISourceContainer> containers = new HashMap<String, ISourceContainer>();
		
		KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit( "platform:/resource" + path );
		if ( kermetaUnit != null ) {
			List<KermetaUnit> l = new ArrayList<KermetaUnit>();
			l.add(kermetaUnit);
			l.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
			for ( KermetaUnit importedUnit : l ) {
				if ( importedUnit.isFramework() ) {
					String bundleName = "fr.irisa.triskell.kermeta.framework";
					String entry = "src/kermeta";
					if ( ! containers.containsKey(bundleName) ) {
						URL ioPluginURL = Platform.getBundle(bundleName).getEntry(entry);					
						try {
							URL resolvedURL = FileLocator.resolve(ioPluginURL);
							String ioPluginLocation = resolvedURL.toString().replace("file:", "");
							containers.put(bundleName, new DirectorySourceContainer( new Path(ioPluginLocation), true ) );
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				} else if ( importedUnit.getUri().matches("platform:/resource.+") ) {
					String s = importedUnit.getUri().replace("platform:/resource", "");
					IResource resource = ResourcesPlugin.getWorkspace().getRoot().getFile( new Path(s) );
					IProject project = resource.getProject();
					if ( ! containers.containsKey(project.getName()) )
						containers.put(project.getName(), new FolderSourceContainer(project, true));
				} else if ( importedUnit.getUri().matches("platform:/plugin/.+") ) {
					String s = importedUnit.getUri().replace("platform:/plugin/", "");
					int lower = s.indexOf('/');
					int upper = s.lastIndexOf('/');
					String bundleName = s.substring(0, lower);
					String entry = s.substring(lower+1, upper);
					if ( ! containers.containsKey(bundleName) ) {
						URL ioPluginURL = Platform.getBundle(bundleName).getEntry(entry);					
						try {
							URL resolvedURL = FileLocator.resolve(ioPluginURL);
							String ioPluginLocation = resolvedURL.toString().replace("file:", "");
							containers.put(bundleName, new DirectorySourceContainer( new Path(ioPluginLocation), true ) );
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
		ISourceContainer[] result = new ISourceContainer[containers.size()];
		containers.values().toArray(result);
		return result;

	}
}
