/* $Id: KermetaCommentScanner.java,v 1.3 2008-05-28 09:25:06 ftanguy Exp $
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
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.Token;

/**
 * @author ftanguy
 */
public class KermetaCommentScanner extends BufferedRuleBasedScanner {

	public KermetaCommentScanner() {
		IToken singleLineCommentToken = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE ) );
		IRule singleLineCommentRule = new EndOfLineRule("//", singleLineCommentToken);

		IToken multiLineCommentToken = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE ) );
		IRule multiLineCommentRule = new MultiLineRule("/*", "*/", multiLineCommentToken);

		//IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.UNDEFINED_ATTRIBUTE ) );
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE ) );
		setDefaultReturnToken(token);
		
		setRules( new IRule[] {singleLineCommentRule, multiLineCommentRule} );
	}
	
}
