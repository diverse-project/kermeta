/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis;

public class ProcCallDeclarationReferenceResolver implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolver<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration> {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultResolverDelegate<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration> delegate = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultResolverDelegate<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration>();
	
	public void resolve(String identifier, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolveResult<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration element, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
