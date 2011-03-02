/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptMetaInformation implements org.kermeta.kp.editor.IKptMetaInformation {
	
	public String getSyntaxName() {
		return "kpt";
	}
	
	public String getURI() {
		return "http://www.kermeta.org/kp/1.0.0";
	}
	
	public org.kermeta.kp.editor.IKptTextScanner createLexer() {
		return new org.kermeta.kp.editor.mopp.KptAntlrScanner(new org.kermeta.kp.editor.mopp.KptLexer());
	}
	
	public org.kermeta.kp.editor.IKptTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.kermeta.kp.editor.mopp.KptParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.kp.editor.IKptTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.kp.editor.IKptTextResource resource) {
		return new org.kermeta.kp.editor.mopp.KptPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kermeta.kp.editor.mopp.KptSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kermeta.kp.editor.mopp.KptSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kermeta.kp.editor.IKptReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch();
	}
	
	public org.kermeta.kp.editor.IKptTokenResolverFactory getTokenResolverFactory() {
		return new org.kermeta.kp.editor.mopp.KptTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.kermeta.kp.model/src/metamodel/KermetaProject.cs";
	}
	
	public String[] getTokenNames() {
		return new org.kermeta.kp.editor.mopp.KptParser(null).getTokenNames();
	}
	
	public org.kermeta.kp.editor.IKptTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.kermeta.kp.editor.mopp.KptTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKptBracketPair> getBracketPairs() {
		return new org.kermeta.kp.editor.mopp.KptBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.kp.editor.mopp.KptFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.kp.editor.mopp.KptResourceFactory();
	}
	
	public org.kermeta.kp.editor.mopp.KptNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.kp.editor.mopp.KptNewFileContentProvider();
	}
	
}
