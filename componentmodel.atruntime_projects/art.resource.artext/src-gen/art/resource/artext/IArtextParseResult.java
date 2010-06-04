/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

// An interface used to access the result of parsing a
// document.
public interface IArtextParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>> getPostParseCommands();
}
