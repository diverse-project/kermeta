/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

public interface IKptProblem {
	public String getMessage();
	public org.kermeta.kp.editor.KptEProblemType getType();
	public java.util.Collection<org.kermeta.kp.editor.IKptQuickFix> getQuickFixes();
}
