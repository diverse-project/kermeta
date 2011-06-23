package org.kermeta.language.builder.eclipse.internal.executionner;

public abstract class KermetaExecutionner<G,H>{
	
	public abstract void execute(G concernedResource, H content);

}
