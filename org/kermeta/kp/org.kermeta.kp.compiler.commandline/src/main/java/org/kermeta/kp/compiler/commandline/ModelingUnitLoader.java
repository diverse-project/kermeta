package org.kermeta.kp.compiler.commandline;

import java.io.IOException;

import org.kermeta.language.util.ModelingUnit;


public interface ModelingUnitLoader {

	public ModelingUnit loadModelingUnitFromURL(String urlString) throws IOException;
	
	public String getLastLoadErrorMessage();
		
}
