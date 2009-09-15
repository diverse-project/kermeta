/*$Id: UnzipFile.java,v 1.1 2009-02-12 12:36:53 cfaucher Exp $
* Project : org.kermeta.compiler.common
* File : 	CreateFolder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 sept. 2009
* Authors :
* 			cfaucher <cyril.faucher@gmail.com>
*/

package org.kermeta.compiler.common.util;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;

public class CreateFolder {

	public static void createFinalFolder(IPath projectPath, String finalFolder) {
		createFinalFolder(projectPath.append(finalFolder));
	}
	
	public static void createFinalFolder(IPath pathPackage) {
		
		for( int i=0 ; i<(pathPackage.segments().length) ; i++ ) {
			if ( ResourcesPlugin.getWorkspace().getRoot().getFolder(pathPackage.removeLastSegments(i)).exists() ) {

				for( int j=i-1 ; j>=0 ; j-- ) {
					try {
						ResourcesPlugin.getWorkspace().getRoot().getFolder(pathPackage.removeLastSegments(j)).create(true, false, new NullProgressMonitor());
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				i=pathPackage.segments().length;
			}
		}

	}
	
}
