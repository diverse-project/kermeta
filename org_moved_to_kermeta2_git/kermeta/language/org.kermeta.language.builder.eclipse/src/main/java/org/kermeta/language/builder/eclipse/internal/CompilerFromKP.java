package org.kermeta.language.builder.eclipse.internal;

import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaExecutionner;

public class CompilerFromKP  extends KermetaExecutionner<HashMap<String,KPBuilder>, String> {
	
	public boolean checkEnabled = true;
	
	public CompilerFromKP(){
		checkEnabled = true;
	}
	
	public CompilerFromKP(boolean checkEnabled){
		this.checkEnabled = checkEnabled;
	}
	@Override
	public void execute(HashMap<String,KPBuilder> concernedResource, String content, IProgressMonitor monitor) {
		concernedResource.get(content).compile(checkEnabled, monitor);	
	}
}
