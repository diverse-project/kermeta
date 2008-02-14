/* $Id: RequireScanner.java,v 1.2 2008-02-14 07:13:42 uid21732 Exp $
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
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author ftanguy
 */
public class RequireScanner extends BufferedRuleBasedScanner {

	public RequireScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE ) );
		setDefaultReturnToken(token);
		
		IToken tokenForRequire1 = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE) );
		IRule ruleForRequire1 = new EndOfLineRule("require ", tokenForRequire1);

		IToken tokenForRequire2 = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE) );
		IRule ruleForRequire2 = new EndOfLineRule("require\t", tokenForRequire2);
        
        setRules( new IRule[] {ruleForRequire1, ruleForRequire2} );
	}
	
}
