/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextMetaInformation implements org.smartadapters.core.resource.smARText.ISmARTextMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "smARText";
	}
	
	public java.lang.String getURI() {
		return "http://SmartAdapters4ART/smartadapters/core";
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTextScanner createLexer() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextAntlrScanner(new org.smartadapters.core.resource.smARText.mopp.SmARTextLexer());
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextParser().createInstance(inputStream, encoding);
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTextPrinter createPrinter(java.io.OutputStream outputStream, org.smartadapters.core.resource.smARText.ISmARTextTextResource resource) {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextReferenceResolverSwitch();
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTokenResolverFactory getTokenResolverFactory() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.art.adapter/model/runtime_AOM_Framework1.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextParser(null).getTokenNames();
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextBracketPair> getBracketPairs() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextHoverTextProvider getHoverTextProvider() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextHoverTextProvider();
	}
	
	public org.smartadapters.core.resource.smARText.ui.SmARTextColorManager createColorManager() {
		return new org.smartadapters.core.resource.smARText.ui.SmARTextColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(org.smartadapters.core.resource.smARText.ui.SmARTextColorManager colorManager) {
		return new org.smartadapters.core.resource.smARText.ui.SmARTextTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextResourceFactory();
	}
	
	public org.smartadapters.core.resource.smARText.mopp.SmARTextNewFileContentProvider getNewFileContentProvider() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextNewFileContentProvider();
	}
	
	public org.smartadapters.core.resource.smARText.mopp.SmARTextCodeCompletionHelper createCodeCompletionHelper() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextCodeCompletionHelper();
	}
	
}
