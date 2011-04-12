package org.kermeta.language.loader.kmt.scala.api;

import org.kermeta.language.structure.ModelingUnit;

public interface KMTparser {
	
	public ModelingUnit load(String uri, String optionalContent);

}
