package org.kermeta.language.builder.eclipse.internal.executionner;

import org.eclipse.core.runtime.IProgressMonitor;

public abstract class KermetaExecutionner<G,H>{
	
	public abstract void execute(G concernedResource, H content, IProgressMonitor monitor);

}
