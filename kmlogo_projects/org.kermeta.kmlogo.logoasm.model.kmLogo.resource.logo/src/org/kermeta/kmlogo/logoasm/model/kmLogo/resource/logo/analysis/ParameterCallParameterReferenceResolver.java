/*$Id : ParameterCallParameterReferenceResolver.java v 1.3 May 8, 2010 9:16:33 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ParameterCallParameterReferenceResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis;

public class ParameterCallParameterReferenceResolver implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolver<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter> {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultResolverDelegate<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter> delegate = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultResolverDelegate<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter>();
	
	public void resolve(java.lang.String identifier, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolveResult<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter element, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
