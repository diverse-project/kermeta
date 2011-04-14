package org.kermeta.language.loader.kmt.scala.api;

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.messagingsystem.api.MessagingSystem;

public interface KMTparser {
	
	public ModelingUnit load(String uri, String optionalContent, MessagingSystem logger);

}
