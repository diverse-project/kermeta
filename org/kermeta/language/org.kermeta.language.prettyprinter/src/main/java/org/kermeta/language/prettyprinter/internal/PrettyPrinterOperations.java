package org.kermeta.language.prettyprinter.internal;

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.prettyprinter.PrettyPrinter;

public class PrettyPrinterOperations {

	private PrettyPrinter thePrinter = null;
	
	public PrettyPrinterOperations(PrettyPrinter thePrinter) {
		this.thePrinter = thePrinter;
	}
	
	public String prettyPrint(ModelingUnit mu)  {
		return thePrinter.prettyPrint(mu);
	}
	
}
