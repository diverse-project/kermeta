/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreProblem implements org.smartadapters.core.resource.core.ICoreProblem {
	
	private java.lang.String message;
	private org.smartadapters.core.resource.core.CoreEProblemType type;
	
	public CoreProblem(java.lang.String message, org.smartadapters.core.resource.core.CoreEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.smartadapters.core.resource.core.CoreEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
