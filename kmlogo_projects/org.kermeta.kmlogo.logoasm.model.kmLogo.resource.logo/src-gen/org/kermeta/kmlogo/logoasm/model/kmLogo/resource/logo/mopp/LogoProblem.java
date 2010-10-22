/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoProblem implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoProblem {
	
	private String message;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType type;
	private java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix> quickFixes;
	
	public LogoProblem(String message, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType type) {
		this(message, type, java.util.Collections.<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix>emptySet());
	}
	
	public LogoProblem(String message, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType type, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix quickFix) {
		this(message, type, java.util.Collections.singleton(quickFix));
	}
	
	public LogoProblem(String message, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType type, java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.quickFixes = new java.util.LinkedHashSet<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
