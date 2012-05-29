package org.kermeta.language.gendoc.km2html;


public class Km2HtmlImpl implements Km2Html {

	public Km2HtmlImpl(){
		org.kermeta.language.gendoc.org.kermeta.language.gendoc.km2htmlrunner.MainRunner.init();   	
    }
	
	@Override
	public void genHtmlDoc4File(String modelURI, String destFolderURI, String excludePackages, String documentName) {
		
		org.kermeta.language.gendoc.org.kermeta.language.gendoc.km2htmlrunner.MainRunner.init(); 

		gendoc.HtmlGenerator printer = gendoc.KerRichFactory.createHtmlGenerator();
        printer.generateHtml(modelURI, destFolderURI, excludePackages, documentName);
	}

}
