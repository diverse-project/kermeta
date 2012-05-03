package org.kermeta.language.prettyprinter;

public class KM2KMTPrettyPrinterImpl4Eclipse implements KM2KMTPrettyPrinter {
	
	public KM2KMTPrettyPrinterImpl4Eclipse(){
		org.kermeta.language.org.kermeta.language.prettyprinterrunner.MainRunner.init4eclipse();   	
    }
	
	@Override
	public void prettyPrintFile(String modelURI, String kmtURI) {
		
		org.kermeta.language.org.kermeta.language.prettyprinterrunner.MainRunner.init4eclipse();

		org.kermeta.language.prettyprinter.PrettyPrinter printer = org.kermeta.language.prettyprinter.KerRichFactory.createPrettyPrinter();
		printer.prettyPrintFile(modelURI, kmtURI);
	}

}
