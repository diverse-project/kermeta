/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptProblem implements org.kermeta.kp.editor.IKptProblem {
	
	private java.lang.String message;
	private org.kermeta.kp.editor.KptEProblemType type;
	
	public KptProblem(java.lang.String message, org.kermeta.kp.editor.KptEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.kermeta.kp.editor.KptEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
