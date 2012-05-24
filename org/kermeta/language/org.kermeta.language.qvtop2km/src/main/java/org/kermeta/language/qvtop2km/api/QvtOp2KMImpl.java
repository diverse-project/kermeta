/**
 * 
 */
package org.kermeta.language.qvtop2km.api;

import org.kermeta.language.structure.ModelingUnit;

/**
 *
 */
public class QvtOp2KMImpl implements QvtOp2KM {

	public QvtOp2KMImpl(){
		theGroup.org.kermeta.language.qvtop2kmrunner.MainRunner.init();      	
	}
	@Override
	public ModelingUnit convert(String uri) {
		theGroup.org.kermeta.language.qvtop2kmrunner.MainRunner.init();      	
		root_package.Qvt2Kermeta converter = root_package.KerRichFactory.createQvt2Kermeta();
		return converter.main(uri);	  
	}

}
