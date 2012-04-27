/**
 * 
 */
package org.kermeta.alf.alf2km;

import org.kermeta.alf.alf2km.api.Alf2KM;
import org.kermeta.language.structure.ModelingUnit;
import org3.kermeta.alf.CLASSSTRUCT;

/**
 * @author suresh
 *
 */
public class Alf2KMImpl implements Alf2KM {

	public Alf2KMImpl(){
		my.group.org.kermeta.alf.alf2kmrunner.MainRunner.init();      	
	}
	@Override
	public ModelingUnit convertPackage(CLASSSTRUCT rootPackage) {
		my.group.org.kermeta.alf.alf2kmrunner.MainRunner.init(); 
		org3.kermeta.alf.alf2km.ALF2KM converter = org3.kermeta.alf.alf2km.KerRichFactory.createALF2KM();
		return converter.convert(rootPackage);	  
	}

}
