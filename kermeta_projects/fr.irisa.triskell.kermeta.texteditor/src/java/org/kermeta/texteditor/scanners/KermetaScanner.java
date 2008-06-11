/* $Id: KermetaScanner.java,v 1.3 2008-06-11 14:36:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KMTCommentScanner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package org.kermeta.texteditor.scanners;

import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.Token;

/**
 * @author ftanguy
 */
public class KermetaScanner extends BufferedRuleBasedScanner {

	public KermetaScanner() {
		IRule keywordRule = new KeywordRule();
		
		IToken stringLiteralToken = new Token( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.STRING_ATTRIBUTE ) );		
		IRule stringLiteralRule = new PatternRule("\"", "\"", stringLiteralToken, '\\', false, false, false);
				
		setRules( new IRule[] {keywordRule, stringLiteralRule} );
		
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.UNDEFINED_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}
	
}
