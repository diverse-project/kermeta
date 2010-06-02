/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreMetaInformation implements org.smartadapters.core.resource.core.ICoreMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "core";
	}
	
	public java.lang.String getURI() {
		return "http://SmartAdapters4ART/smartadapters/core";
	}
	
	public org.smartadapters.core.resource.core.ICoreTextScanner createLexer() {
		return new org.smartadapters.core.resource.core.mopp.CoreAntlrScanner(new org.smartadapters.core.resource.core.mopp.CoreLexer());
	}
	
	public org.smartadapters.core.resource.core.ICoreTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.smartadapters.core.resource.core.mopp.CoreParser().createInstance(inputStream, encoding);
	}
	
	public org.smartadapters.core.resource.core.ICoreTextPrinter createPrinter(java.io.OutputStream outputStream, org.smartadapters.core.resource.core.ICoreTextResource resource) {
		return new org.smartadapters.core.resource.core.mopp.CorePrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.smartadapters.core.resource.core.mopp.CoreSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.smartadapters.core.resource.core.mopp.CoreSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.smartadapters.core.resource.core.ICoreReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.smartadapters.core.resource.core.mopp.CoreReferenceResolverSwitch();
	}
	
	public org.smartadapters.core.resource.core.ICoreTokenResolverFactory getTokenResolverFactory() {
		return new org.smartadapters.core.resource.core.mopp.CoreTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.art.adapter/model/runtime_AOM_Framework1.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.smartadapters.core.resource.core.mopp.CoreParser(null).getTokenNames();
	}
	
	public org.smartadapters.core.resource.core.ICoreTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.smartadapters.core.resource.core.mopp.CoreTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.smartadapters.core.resource.core.ICoreBracketPair> getBracketPairs() {
		return new org.smartadapters.core.resource.core.mopp.CoreBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.smartadapters.core.resource.core.mopp.CoreFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.smartadapters.core.resource.core.ICoreHoverTextProvider getHoverTextProvider() {
		return new org.smartadapters.core.resource.core.mopp.CoreHoverTextProvider();
	}
	
	public org.smartadapters.core.resource.core.ui.CoreColorManager createColorManager() {
		return new org.smartadapters.core.resource.core.ui.CoreColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(org.smartadapters.core.resource.core.ui.CoreColorManager colorManager) {
		return new org.smartadapters.core.resource.core.ui.CoreTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.smartadapters.core.resource.core.mopp.CoreResourceFactory();
	}
	
	public org.smartadapters.core.resource.core.mopp.CoreNewFileContentProvider getNewFileContentProvider() {
		return new org.smartadapters.core.resource.core.mopp.CoreNewFileContentProvider();
	}
	
	public org.smartadapters.core.resource.core.mopp.CoreCodeCompletionHelper createCodeCompletionHelper() {
		return new org.smartadapters.core.resource.core.mopp.CoreCodeCompletionHelper();
	}
	
}
