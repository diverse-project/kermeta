/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

// Converts a tree of <code>org.eclipse.emf.ecore.EObject</code>s into a plain text.
public interface IArtextTextPrinter extends art.resource.artext.IArtextConfigurable {
	
	// Prints the given <code>org.eclipse.emf.ecore.EObject</code> and its content to some
	// underlying output stream.
	//
	// @param element The element to print.
	// @throws java.io.IOException if printing to an underlying stream or device fails.
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException;
}
