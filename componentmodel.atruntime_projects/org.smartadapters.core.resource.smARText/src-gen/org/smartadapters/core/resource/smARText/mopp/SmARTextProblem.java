/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextProblem implements org.smartadapters.core.resource.smARText.ISmARTextProblem {
	
	private java.lang.String message;
	private org.smartadapters.core.resource.smARText.SmARTextEProblemType type;
	
	public SmARTextProblem(java.lang.String message, org.smartadapters.core.resource.smARText.SmARTextEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.smartadapters.core.resource.smARText.SmARTextEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
