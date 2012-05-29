package org.kermeta.language.gendoc.km2html;


public class Km2HtmlImpl4Eclipse implements Km2Html {
	
	public Km2HtmlImpl4Eclipse(){
		org.kermeta.language.gendoc.org.kermeta.language.gendoc.km2htmlrunner.MainRunner.init4eclipse();   	
    }
	
	@Override
	public void genHtmlDoc4File(String modelURI, String destFolderURI, String excludePackages, String documentName) {
		
		org.kermeta.language.gendoc.org.kermeta.language.gendoc.km2htmlrunner.MainRunner.init4eclipse();

		gendoc.HtmlGenerator printer = gendoc.KerRichFactory.createHtmlGenerator();
		printer.generateHtml(modelURI, destFolderURI, excludePackages, documentName);
	}

}
