package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class KermetaNature implements IProjectNature {
	
	static public final String NATURE_ID = "org.kermeta.language.texteditor.eclipse.internal.KermetaNatureID"; 

	@Override
	public void configure() throws CoreException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProject(IProject arg0) {
		// TODO Auto-generated method stub
		
	}

}
