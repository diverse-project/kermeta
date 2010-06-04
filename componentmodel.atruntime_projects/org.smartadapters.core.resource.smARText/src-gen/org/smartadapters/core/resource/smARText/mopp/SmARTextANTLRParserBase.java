/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public abstract class SmARTextANTLRParserBase extends org.antlr.runtime.Parser implements org.smartadapters.core.resource.smARText.ISmARTextTextParser {
	
	public SmARTextANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public SmARTextANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
