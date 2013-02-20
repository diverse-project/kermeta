/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

public interface IKpProblem {
	public String getMessage();
	public org.kermeta.kp.editor.KpEProblemSeverity getSeverity();
	public org.kermeta.kp.editor.KpEProblemType getType();
	public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes();
}
