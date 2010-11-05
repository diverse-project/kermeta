/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

/**
 * A basic interface to convert parsed tokens to the attribute type in the meta
 * model. All generated TokenResolvers per default delegate requests to an
 * instance of ArtextDefaultTokenResolver which performs a standard conversion
 * based on the EMF type conversion. This includes conversion of registered
 * EDataTypes.
 * 
 * @see art.resource.artext.analysis.ArtextDefaultTokenResolver
 */
public interface IArtextTokenResolver extends art.resource.artext.IArtextConfigurable {
	
	/**
	 * Converts a token into an java.lang.Object (the value of the attribute).
	 * 
	 * @param lexem the text of the parsed token
	 * @param feature the corresponding feature in the meta model
	 * @param result the result of resolving the lexem, can be used to add processing
	 * errors
	 */
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.IArtextTokenResolveResult result);
	
	/**
	 * Converts an java.lang.Object (the value of an attribute) to a string which can
	 * be printed. This is the inverse of resolving a token with a call to resolve().
	 * 
	 * @param value the java.lang.Object to be printed as String
	 * @param feature the corresponding feature (EAttribute)
	 * @param container the container of the object
	 * 
	 * @return the String representation or null if a problem occurred
	 */
	public String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container);
	
}
