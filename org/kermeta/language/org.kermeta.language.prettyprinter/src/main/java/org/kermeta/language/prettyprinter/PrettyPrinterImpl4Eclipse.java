package org.kermeta.language.prettyprinter;

import org.kermeta.language.prettyprinter.internal.Activator;
import org.kermeta.language.prettyprinter.internal.PrettyPrinterOperations;
import org.kermeta.language.structure.ModelingUnit;

class PrettyPrinterImpl4Eclipse {
	
	PrettyPrinterOperations operations = null;
	
	public PrettyPrinterImpl4Eclipse(){   	
		org.kermeta.language.language.prettyprinterrunner.MainRunner.init4eclipse();
		Activator.getDefault().reflexivityLoaderContext();
		operations = new PrettyPrinterOperations(org.kermeta.language.prettyprinter.KerRichFactory.createPrettyPrinter());
	}
	
	public String prettyPrint(ModelingUnit mu) {
		return operations.prettyPrint(mu);
	}
	
}