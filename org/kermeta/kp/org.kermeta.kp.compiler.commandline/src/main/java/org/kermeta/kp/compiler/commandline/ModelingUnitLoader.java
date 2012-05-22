package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
import java.util.Collection;

import org.kermeta.language.structure.ModelingUnit;

public interface ModelingUnitLoader {

	public Collection<ModelingUnit> loadModelingUnitFromURL(String urlString) throws IOException;
	
	public String getLastLoadErrorMessage();
		
}
