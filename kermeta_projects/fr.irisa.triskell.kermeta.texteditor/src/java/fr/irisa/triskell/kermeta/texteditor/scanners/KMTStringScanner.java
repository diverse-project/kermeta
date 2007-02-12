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
public class KMTStringScanner extends BufferedRuleBasedScanner {

	public KMTStringScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.STRING_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}
	
}
