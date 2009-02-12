

/*$Id: UnzipFile.java,v 1.1 2009-02-12 12:36:53 cfaucher Exp $
* Project : org.kermeta.compiler.common
* File : 	UnzipFile.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 févr. 2009
* Authors : cfaucher
*/

package org.kermeta.compiler.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;

public class UnzipFile {
	
	public static void unzipFile (URL zip_location, IPath destination_folder_location) {
		URL url = zip_location;
		ZipInputStream zipFileStream;
		try {
			zipFileStream = new ZipInputStream(url.openStream());
			ZipEntry zipEntry = zipFileStream.getNextEntry();
			
			if( !ResourcesPlugin.getWorkspace().getRoot().getFolder(destination_folder_location).exists() ) {
				ResourcesPlugin.getWorkspace().getRoot().getFolder(destination_folder_location).create(true, true, new NullProgressMonitor());
			}
		
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getFolder(destination_folder_location).getProject();
			
			String project_location = project.getLocation().toString();
			
			String destination_folder_relative_location = destination_folder_location.toString().replace(project.getName() + "/", "");
			
			while (zipEntry != null) {
				File file = new File( project_location + destination_folder_relative_location /*destination_folder_location.toString()*/, zipEntry.getName());
				if ( ! zipEntry.isDirectory() ) {
					/*
					 * Copy files (and make sure parent directory exist)
					 */	
					File parentFile = file.getParentFile();
					if ( null != parentFile && ! parentFile.exists() )
						parentFile.mkdirs();

					OutputStream os = null;
					try {
						os = new FileOutputStream(file);
						byte[] buffer = new byte[102400];
						while (true) {
							int len = zipFileStream.read(buffer);
							if (zipFileStream.available() == 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != os) {
							os.close();
						}
					}
				}
				zipFileStream.closeEntry();
				zipEntry = zipFileStream.getNextEntry();
			}

			project.refreshLocal(IFile.DEPTH_INFINITE, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}


