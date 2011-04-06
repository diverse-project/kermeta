/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpProblem implements org.kermeta.kp.editor.IKpProblem {
	
	private String message;
	private org.kermeta.kp.editor.KpEProblemType type;
	private java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> quickFixes;
	
	public KpProblem(String message, org.kermeta.kp.editor.KpEProblemType type) {
		this(message, type, java.util.Collections.<org.kermeta.kp.editor.IKpQuickFix>emptySet());
	}
	
	public KpProblem(String message, org.kermeta.kp.editor.KpEProblemType type, org.kermeta.kp.editor.IKpQuickFix quickFix) {
		this(message, type, java.util.Collections.singleton(quickFix));
	}
	
	public KpProblem(String message, org.kermeta.kp.editor.KpEProblemType type, java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.quickFixes = new java.util.LinkedHashSet<org.kermeta.kp.editor.IKpQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.kermeta.kp.editor.KpEProblemType getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
