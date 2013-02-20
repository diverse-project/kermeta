package org.kermeta.language.gendoc.km2html;


public class Km2HtmlImpl implements Km2Html {

	public Km2HtmlImpl(){
		kermeta_km2htmlrunner.DefaultRunner$.MODULE$.init();   	
    }
	
	@Override
	public void genHtmlDoc4File(String modelURI, String destFolderURI, String excludePackages, String documentName) {
		
		kermeta_km2htmlrunner.DefaultRunner$.MODULE$.init(); 

		kermeta_km2html.gendoc.HtmlGenerator printer = kermeta_km2html.gendoc.KerRichFactory.createHtmlGenerator();
        printer.generateHtml(modelURI, destFolderURI, excludePackages, documentName);
	}

}
