/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public abstract class ArtextANTLRParserBase extends org.antlr.runtime.Parser implements art.resource.artext.IArtextTextParser {
	
	public ArtextANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public ArtextANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
