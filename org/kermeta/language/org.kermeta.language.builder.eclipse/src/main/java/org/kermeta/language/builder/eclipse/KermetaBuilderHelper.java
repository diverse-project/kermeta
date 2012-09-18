/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 18 sept. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.builder.eclipse;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class KermetaBuilderHelper {
	public static IFile findRootKPinProject(IContainer aProject) throws CoreException {
		for (IResource aMember : aProject.members()) {
			if (aMember instanceof IFile) {
				if (((IFile) aMember).getFileExtension() != null) {
					if (((IFile) aMember).getFileExtension().equals(KermetaBuilder.KP_FILE_EXTENSION)) {
						return (IFile) aMember;
					}
				}
			}
		}
		return null;
	}
}
