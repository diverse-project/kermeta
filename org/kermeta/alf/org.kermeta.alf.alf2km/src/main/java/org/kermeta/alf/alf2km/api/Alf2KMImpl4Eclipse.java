package org.kermeta.alf.alf2km.api;

import org.kermeta.language.structure.ModelingUnit;
import org3.kermeta.alf.CLASSSTRUCT;

public class Alf2KMImpl4Eclipse implements Alf2KM {
	 public Alf2KMImpl4Eclipse(){
		 my.group.org.kermeta.alf.alf2kmrunner.MainRunner.init4eclipse();    	
	 }
	@Override
	public ModelingUnit convertPackage(CLASSSTRUCT rootPackage) {
		my.group.org.kermeta.alf.alf2kmrunner.MainRunner.init4eclipse();    
	    org3.kermeta.alf.alf2km.ALF2KM converter = org3.kermeta.alf.alf2km.KerRichFactory.createALF2KM();
	    return converter.convert(rootPackage);
	}
}
