package org.kermeta.language.prettyprinter;

public class KM2KMTPrettyPrinterImpl implements KM2KMTPrettyPrinter {

	public KM2KMTPrettyPrinterImpl(){
		org.kermeta.language.org.kermeta.language.prettyprinterrunner.MainRunner.init();   	
    }
	
	@Override
	public void prettyPrint(String modelURI) {
		
		org.kermeta.language.org.kermeta.language.prettyprinterrunner.MainRunner.init();

		org.kermeta.language.prettyprinter.PrettyPrinter printer = org.kermeta.language.prettyprinter.KerRichFactory.createPrettyPrinter();
        printer.prettyPrintFile(modelURI, modelURI+".kmt");
	}

}
