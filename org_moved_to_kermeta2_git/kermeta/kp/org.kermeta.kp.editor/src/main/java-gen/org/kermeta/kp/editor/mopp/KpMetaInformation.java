/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpMetaInformation implements org.kermeta.kp.editor.IKpMetaInformation {
	
	public String getSyntaxName() {
		return "kp";
	}
	
	public String getURI() {
		return "http://www.kermeta.org/kp/1.0.0";
	}
	
	public org.kermeta.kp.editor.IKpTextScanner createLexer() {
		return new org.kermeta.kp.editor.mopp.KpAntlrScanner(new org.kermeta.kp.editor.mopp.KpLexer());
	}
	
	public org.kermeta.kp.editor.IKpTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.kermeta.kp.editor.mopp.KpParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.kp.editor.IKpTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.kp.editor.IKpTextResource resource) {
		return new org.kermeta.kp.editor.mopp.KpPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kermeta.kp.editor.mopp.KpSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kermeta.kp.editor.mopp.KpSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kermeta.kp.editor.IKpReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch();
	}
	
	public org.kermeta.kp.editor.IKpTokenResolverFactory getTokenResolverFactory() {
		return new org.kermeta.kp.editor.mopp.KpTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.kermeta.kp.model/src/metamodel/KermetaProject.cs";
	}
	
	public String[] getTokenNames() {
		return new org.kermeta.kp.editor.mopp.KpParser(null).getTokenNames();
	}
	
	public org.kermeta.kp.editor.IKpTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.kermeta.kp.editor.mopp.KpTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKpBracketPair> getBracketPairs() {
		return new org.kermeta.kp.editor.mopp.KpBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.kp.editor.mopp.KpFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.kp.editor.mopp.KpResourceFactory();
	}
	
	public org.kermeta.kp.editor.mopp.KpNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.kp.editor.mopp.KpNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.kermeta.kp.editor.mopp.KpResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.kermeta.kp.editor.ui.launchConfigurationType";
	}
	
}
