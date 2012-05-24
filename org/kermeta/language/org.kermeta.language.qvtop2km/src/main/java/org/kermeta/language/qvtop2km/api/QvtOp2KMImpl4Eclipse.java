package org.kermeta.language.qvtop2km.api;

import org.kermeta.language.structure.ModelingUnit;

public class QvtOp2KMImpl4Eclipse implements QvtOp2KM {
	 
	public QvtOp2KMImpl4Eclipse(){
		theGroup.org.kermeta.language.qvtop2kmrunner.MainRunner.init4eclipse();    	
	 }
	 
	@Override
	public ModelingUnit convert(String uri) {
		theGroup.org.kermeta.language.qvtop2kmrunner.MainRunner.init4eclipse();    	
		root_package.Qvt2Kermeta converter = root_package.KerRichFactory.createQvt2Kermeta();
		return converter.main(uri);	  
	}
}
