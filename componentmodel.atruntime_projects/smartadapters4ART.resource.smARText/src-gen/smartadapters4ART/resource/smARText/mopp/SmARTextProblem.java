/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextProblem implements smartadapters4ART.resource.smARText.ISmARTextProblem {
	
	private String message;
	private smartadapters4ART.resource.smARText.SmARTextEProblemType type;
	private java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextQuickFix> quickFixes;
	
	public SmARTextProblem(String message, smartadapters4ART.resource.smARText.SmARTextEProblemType type) {
		this(message, type, java.util.Collections.<smartadapters4ART.resource.smARText.ISmARTextQuickFix>emptySet());
	}
	
	public SmARTextProblem(String message, smartadapters4ART.resource.smARText.SmARTextEProblemType type, smartadapters4ART.resource.smARText.ISmARTextQuickFix quickFix) {
		this(message, type, java.util.Collections.singleton(quickFix));
	}
	
	public SmARTextProblem(String message, smartadapters4ART.resource.smARText.SmARTextEProblemType type, java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.quickFixes = new java.util.LinkedHashSet<smartadapters4ART.resource.smARText.ISmARTextQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public smartadapters4ART.resource.smARText.SmARTextEProblemType getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
