/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoProblem implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoProblem {
	
	private java.lang.String message;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType type;
	
	public LogoProblem(java.lang.String message, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
