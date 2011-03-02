/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptProblem implements org.kermeta.kp.editor.IKptProblem {
	
	private String message;
	private org.kermeta.kp.editor.KptEProblemType type;
	private java.util.Collection<org.kermeta.kp.editor.IKptQuickFix> quickFixes;
	
	public KptProblem(String message, org.kermeta.kp.editor.KptEProblemType type) {
		this(message, type, java.util.Collections.<org.kermeta.kp.editor.IKptQuickFix>emptySet());
	}
	
	public KptProblem(String message, org.kermeta.kp.editor.KptEProblemType type, org.kermeta.kp.editor.IKptQuickFix quickFix) {
		this(message, type, java.util.Collections.singleton(quickFix));
	}
	
	public KptProblem(String message, org.kermeta.kp.editor.KptEProblemType type, java.util.Collection<org.kermeta.kp.editor.IKptQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.quickFixes = new java.util.LinkedHashSet<org.kermeta.kp.editor.IKptQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.kermeta.kp.editor.KptEProblemType getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKptQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
