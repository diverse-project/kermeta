package org.kermeta.language.builder.eclipse.internal;

import java.util.HashMap;

import org.kermeta.language.builder.eclipse.internal.executionner.KermetaExecutionner;

public class CompilerFromKP  extends KermetaExecutionner<HashMap<String,KPBuilder>, String> {

	@Override
	public void execute(HashMap<String,KPBuilder> concernedResource, String content) {
		concernedResource.get(content).compile();	
	}
}
