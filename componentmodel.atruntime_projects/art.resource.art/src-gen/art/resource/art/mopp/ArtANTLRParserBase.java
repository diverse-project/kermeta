/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

public abstract class ArtANTLRParserBase extends org.antlr.runtime.Parser implements art.resource.art.IArtTextParser {
	
	public ArtANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public ArtANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
