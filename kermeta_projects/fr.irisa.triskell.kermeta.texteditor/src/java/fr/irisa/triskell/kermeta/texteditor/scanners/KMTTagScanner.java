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
public class KMTTagScanner extends BufferedRuleBasedScanner {

	public KMTTagScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.TAG_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}
	
}
