/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public abstract class KptANTLRParserBase extends org.antlr.runtime.Parser implements org.kermeta.kp.editor.IKptTextParser {
	
	public KptANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public KptANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
