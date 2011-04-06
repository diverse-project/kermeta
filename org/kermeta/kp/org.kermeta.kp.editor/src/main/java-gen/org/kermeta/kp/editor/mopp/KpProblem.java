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
	private org.kermeta.kp.editor.KpEProblemSeverity severity;
	private java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> quickFixes;
	
	public KpProblem(String message, org.kermeta.kp.editor.KpEProblemType type, org.kermeta.kp.editor.KpEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.kermeta.kp.editor.IKpQuickFix>emptySet());
	}
	
	public KpProblem(String message, org.kermeta.kp.editor.KpEProblemType type, org.kermeta.kp.editor.KpEProblemSeverity severity, org.kermeta.kp.editor.IKpQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public KpProblem(String message, org.kermeta.kp.editor.KpEProblemType type, org.kermeta.kp.editor.KpEProblemSeverity severity, java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.kermeta.kp.editor.IKpQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.kermeta.kp.editor.KpEProblemType getType() {
		return type;
	}
	
	public org.kermeta.kp.editor.KpEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
