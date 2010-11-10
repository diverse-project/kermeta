/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextMetaInformation implements smartadapters4ART.resource.smARText.ISmARTextMetaInformation {
	
	public String getSyntaxName() {
		return "smARText";
	}
	
	public String getURI() {
		return "http://SmartAdapters4ART";
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTextScanner createLexer() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextAntlrScanner(new smartadapters4ART.resource.smARText.mopp.SmARTextLexer());
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextParser().createInstance(inputStream, encoding);
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTextPrinter createPrinter(java.io.OutputStream outputStream, smartadapters4ART.resource.smARText.ISmARTextTextResource resource) {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextReferenceResolverSwitch getReferenceResolverSwitch() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextReferenceResolverSwitch();
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTokenResolverFactory getTokenResolverFactory() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.kermeta.art.model/model/aom/art_AOM_Framework.cs";
	}
	
	public String[] getTokenNames() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextParser(null).getTokenNames();
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTokenStyle getDefaultTokenStyle(String tokenName) {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextBracketPair> getBracketPairs() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextResourceFactory();
	}
	
	public smartadapters4ART.resource.smARText.mopp.SmARTextNewFileContentProvider getNewFileContentProvider() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextNewFileContentProvider();
	}
	
}
