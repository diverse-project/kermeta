package org.kermeta.language.prettyprinter;

import org.kermeta.language.prettyprinter.internal.PrettyPrinterOperations;
import org.kermeta.language.structure.ModelingUnit;

class PrettyPrinterImpl {
	
	PrettyPrinterOperations operations = null;
	
	public PrettyPrinterImpl(){   	
		org.kermeta.language.language.prettyprinterrunner.MainRunner.init();
		operations = new PrettyPrinterOperations(org.kermeta.language.prettyprinter.KerRichFactory.createPrettyPrinter());
	}
	
	public String prettyPrint(ModelingUnit mu) {
		return operations.prettyPrint(mu);
	}
	
}