/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText;

public interface ISmARTextProblem {
	public String getMessage();
	public smartadapters4ART.resource.smARText.SmARTextEProblemType getType();
	public java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextQuickFix> getQuickFixes();
}
