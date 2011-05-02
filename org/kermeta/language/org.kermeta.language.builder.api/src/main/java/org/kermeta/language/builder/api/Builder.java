package org.kermeta.language.builder.api;

import org.eclipse.core.resources.IResource;
import org.kermeta.language.structure.ModelingUnit;

public abstract class Builder {
	
	protected Builder(){
		super();
	}

	public abstract ModelingUnit parseSpecificFile(IResource toParse, String content, boolean inModification);

}
