/* $Id: KermetaScanner.java,v 1.1 2007-12-17 14:05:07 ftanguy Exp $
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

import fr.irisa.triskell.kermeta.texteditor.scanners.KMTTextAttributeProvider;
import fr.irisa.triskell.kermeta.texteditor.scanners.KeywordRule;

/**
 * @author ftanguy
 */
public class KermetaScanner extends BufferedRuleBasedScanner {

	public KermetaScanner() {
		
		IToken stringToken = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.STRING_ATTRIBUTE ) );
		IRule stringRule = new PatternRule("\"", "\"", stringToken, '\\', false, false, true);
		
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.UNDEFINED_ATTRIBUTE ) );
		setDefaultReturnToken(token);
		
		IRule rule = new KeywordRule();
		
		setRules( new IRule[] {stringRule, rule} );
		
	}
	
}
