package org.kermeta.language.builder.eclipse.internal.executionner;

import org.eclipse.core.resources.IResource;

public abstract class KermetaExecutionner<G>{
	
	public abstract void execute(IResource concernedResource, G content);

}
