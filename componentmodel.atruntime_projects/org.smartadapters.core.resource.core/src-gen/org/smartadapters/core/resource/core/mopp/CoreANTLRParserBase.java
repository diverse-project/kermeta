/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public abstract class CoreANTLRParserBase extends org.antlr.runtime.Parser implements org.smartadapters.core.resource.core.ICoreTextParser {
	
	public CoreANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public CoreANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
