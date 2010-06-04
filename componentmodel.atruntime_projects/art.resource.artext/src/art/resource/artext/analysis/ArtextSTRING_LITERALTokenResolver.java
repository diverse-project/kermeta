package art.resource.artext.analysis;

import art.resource.artext.analysis.helper.CharacterEscaper;

public class ArtextSTRING_LITERALTokenResolver implements art.resource.artext.IArtextTokenResolver {
	
	private art.resource.artext.analysis.ArtextDefaultTokenResolver defaultTokenResolver = new art.resource.artext.analysis.ArtextDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = defaultTokenResolver.deResolve(value, feature, container);
		
		//escape escapes
		result = CharacterEscaper.escapeEscapedCharacters(result);
		
		result = '"' + result + '"';
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.IArtextTokenResolveResult result) {
		// remove double quotes
		assert lexem.charAt(0) == '"';
		assert lexem.charAt(lexem.length() - 1) == '"';
		lexem = lexem.substring(1, lexem.length() - 1);

		lexem = CharacterEscaper.unescapeEscapedCharacters(lexem);
		
		result.setResolvedToken(lexem);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
