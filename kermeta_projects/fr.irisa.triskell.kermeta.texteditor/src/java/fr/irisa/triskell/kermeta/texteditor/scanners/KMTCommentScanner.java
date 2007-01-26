/**
 * 
 */
package fr.irisa.triskell.kermeta.texteditor.scanners;

import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author ftanguy
 *
 */
public class KMTCommentScanner extends BufferedRuleBasedScanner {

	public KMTCommentScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}
	
}
