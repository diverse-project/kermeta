/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ISmARTextParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextCommand<smartadapters4ART.resource.smARText.ISmARTextTextResource>> getPostParseCommands();
	
}
